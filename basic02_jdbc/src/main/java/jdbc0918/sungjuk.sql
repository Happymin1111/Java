

※ 참조 d:\java202307\database\section0818\06_성적테이블.sql


--sqlplus 사용자 추천
--오라클 콘솔창 예쁘게 출력
set linesize 1000;
col uname for a10; --col 칼럼명 for 20자
col addr  for a10;

 --sungjuk 테이블 성적 삭제
 drop table sungjuk;

 --sungjuk테이블 생성
 create table sungjuk(
     sno    int         not null   -- 일련번호
     ,uname varchar(50) not null
     ,kor   int         not null
     ,eng   int         not null
     ,mat   int
     ,tot   int
     ,aver  int
     ,addr  varchar(20)            -- 주소
     ,wdate date                   -- 작성일 (년월일시분초)
);

-- sungjuk테이블에서 사용할 시퀀스 생성  
create sequence sungjuk_seq;

-- sungjuk_seq 시퀀스 삭제
drop sequence sungjuk_seq;


-- 전체 행 갯수
select count(*) from sungjuk;
select count(*) as cnt from sungjuk;

-- 전체 행에 대해서 총점과 평균 구하기.
update sungjuk set tot=kor+eng+mat, aver =(kor+eng+mat)/3;
commit;