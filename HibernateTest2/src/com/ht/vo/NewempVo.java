package com.ht.vo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2019/10/23.
 */
@Entity
@Table(name = "NEWEMP", schema = "SCOTT", catalog = "")
public class NewempVo {
    private long empno;
    private String ename;
    private String job;
    private Long mgr;
    private Date hiredate;
    private Long sal;
    private Long comm;
    private Long deptno;

    @Id
    @Column(name = "EMPNO")
    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ENAME")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "MGR")
    public Long getMgr() {
        return mgr;
    }

    public void setMgr(Long mgr) {
        this.mgr = mgr;
    }

    @Basic
    @Column(name = "HIREDATE")
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Basic
    @Column(name = "SAL")
    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    @Basic
    @Column(name = "COMM")
    public Long getComm() {
        return comm;
    }

    public void setComm(Long comm) {
        this.comm = comm;
    }

    @Basic
    @Column(name = "DEPTNO")
    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewempVo newempVo = (NewempVo) o;

        if (empno != newempVo.empno) return false;
        if (ename != null ? !ename.equals(newempVo.ename) : newempVo.ename != null) return false;
        if (job != null ? !job.equals(newempVo.job) : newempVo.job != null) return false;
        if (mgr != null ? !mgr.equals(newempVo.mgr) : newempVo.mgr != null) return false;
        if (hiredate != null ? !hiredate.equals(newempVo.hiredate) : newempVo.hiredate != null) return false;
        if (sal != null ? !sal.equals(newempVo.sal) : newempVo.sal != null) return false;
        if (comm != null ? !comm.equals(newempVo.comm) : newempVo.comm != null) return false;
        if (deptno != null ? !deptno.equals(newempVo.deptno) : newempVo.deptno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (empno ^ (empno >>> 32));
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (mgr != null ? mgr.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        result = 31 * result + (deptno != null ? deptno.hashCode() : 0);
        return result;
    }
}
