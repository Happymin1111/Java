
select kor, eng, mat
from sungjuk
where addr='Seoul';

select round(avg(kor),2) AS avg_kor 
      ,round(avg(eng),2) AS avg_eng
      ,round(avg(mat),2) AS avg_mat
from sungjuk
where addr='Seoul';

SELECT sno,uname,kor,eng,mat,tot,aver,addr,wdate
FROM sungjuk
WHERE uname like '%나%';

update sungjuk set tot=kor+eng+mat;

set linesize 1000;
col uname for a10;
col addr for a10;

-- 페이징
문제) sungjuk 테이블에서 이름순으로 정렬후 행번호 4~6만 조회하시오.

select sno, uname, aver, addr
from sungjuk
order by uname;

--줄번호 rownum 추가
select sno, uname, aver, addr, rownum
from (
		select sno, uname, aver, addr
		from sungjuk
		order by uname
     )AA;
     
--rownum 칼럼명 변경
select sno, uname, aver, addr, rownum as rnum
from(
		select sno, uname, aver, addr
		from sungjuk
		order by uname
	)AA;
	
--위의 결과값을 BB케이블로 정의
select *
from (
	select sno, uname, aver, addr, rownum as rnum
	from(
		select sno, uname, aver, addr
		from sungjuk
		order by uname
		)AA
	)BB;
	
-- AA, BB 이름 생략
select *
from (
	select sno, uname, aver, addr, rownum as rnum
	from(
		select sno, uname, aver, addr
		from sungjuk
		order by uname
		)
	);
	
-- 행번호 4~6 조회
select *
from (
	select sno, uname, aver, addr, rownum as rnum
	from(
		select sno, uname, aver, addr
		from sungjuk
		order by uname
		)
	)
where rnum>=4 and rnum<=6;