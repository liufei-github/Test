package com.ht.vo;

import javax.persistence.*;

/**
 * Created by Administrator on 2019/10/23.
 */
@Entity
@Table(name = "DEPT", schema = "SCOTT", catalog = "")
public class DeptVo {
    private long deptno;
    private String dname;
    private String loc;

    @Id
    @Column(name = "DEPTNO")
    public long getDeptno() {
        return deptno;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    @Basic
    @Column(name = "DNAME")
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "LOC")
    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptVo deptVo = (DeptVo) o;

        if (deptno != deptVo.deptno) return false;
        if (dname != null ? !dname.equals(deptVo.dname) : deptVo.dname != null) return false;
        if (loc != null ? !loc.equals(deptVo.loc) : deptVo.loc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (deptno ^ (deptno >>> 32));
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }
}
