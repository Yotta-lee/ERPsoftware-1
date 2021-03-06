package server.hibernate;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "GOODS", schema = "PIS", catalog = "")
public class GoodsEntity {
    private String keyno;
    private String keyname;
    private String keymodel;
    private Long num;
    private Long inprice;
    private Long outprice;
    private Long receprice;
    private Long receoutprice;
    private String keybatch;
    private Long batchno;
    private Time dat;
    private String kinds;

    @Id
    @Column(name = "KEYNO", nullable = false, length = 20)
    public String getKeyno() {
        return keyno;
    }

    public void setKeyno(String keyno) {
        this.keyno = keyno;
    }

    @Basic
    @Column(name = "KEYNAME", nullable = true, length = 20)
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    @Basic
    @Column(name = "KEYMODEL", nullable = true, length = 20)
    public String getKeymodel() {
        return keymodel;
    }

    public void setKeymodel(String keymodel) {
        this.keymodel = keymodel;
    }

    @Basic
    @Column(name = "NUM", nullable = true, precision = 0)
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Basic
    @Column(name = "INPRICE", nullable = true, precision = 0)
    public Long getInprice() {
        return inprice;
    }

    public void setInprice(Long inprice) {
        this.inprice = inprice;
    }

    @Basic
    @Column(name = "OUTPRICE", nullable = true, precision = 0)
    public Long getOutprice() {
        return outprice;
    }

    public void setOutprice(Long outprice) {
        this.outprice = outprice;
    }

    @Basic
    @Column(name = "RECEPRICE", nullable = true, precision = 0)
    public Long getReceprice() {
        return receprice;
    }

    public void setReceprice(Long receprice) {
        this.receprice = receprice;
    }

    @Basic
    @Column(name = "RECEOUTPRICE", nullable = true, precision = 0)
    public Long getReceoutprice() {
        return receoutprice;
    }

    public void setReceoutprice(Long receoutprice) {
        this.receoutprice = receoutprice;
    }

    @Basic
    @Column(name = "KEYBATCH", nullable = true, length = 20)
    public String getKeybatch() {
        return keybatch;
    }

    public void setKeybatch(String keybatch) {
        this.keybatch = keybatch;
    }

    @Basic
    @Column(name = "BATCHNO", nullable = true, precision = 0)
    public Long getBatchno() {
        return batchno;
    }

    public void setBatchno(Long batchno) {
        this.batchno = batchno;
    }

    @Basic
    @Column(name = "DAT", nullable = true)
    public Time getDat() {
        return dat;
    }

    public void setDat(Time dat) {
        this.dat = dat;
    }

    @Basic
    @Column(name = "KINDS", nullable = true, length = 20)
    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (keyno != null ? !keyno.equals(that.keyno) : that.keyno != null) return false;
        if (keyname != null ? !keyname.equals(that.keyname) : that.keyname != null) return false;
        if (keymodel != null ? !keymodel.equals(that.keymodel) : that.keymodel != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (inprice != null ? !inprice.equals(that.inprice) : that.inprice != null) return false;
        if (outprice != null ? !outprice.equals(that.outprice) : that.outprice != null) return false;
        if (receprice != null ? !receprice.equals(that.receprice) : that.receprice != null) return false;
        if (keybatch != null ? !keybatch.equals(that.keybatch) : that.keybatch != null) return false;
        if (batchno != null ? !batchno.equals(that.batchno) : that.batchno != null) return false;
        if (dat != null ? !dat.equals(that.dat) : that.dat != null) return false;
        if (kinds != null ? !kinds.equals(that.kinds) : that.kinds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keyno != null ? keyno.hashCode() : 0;
        result = 31 * result + (keyname != null ? keyname.hashCode() : 0);
        result = 31 * result + (keymodel != null ? keymodel.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (inprice != null ? inprice.hashCode() : 0);
        result = 31 * result + (outprice != null ? outprice.hashCode() : 0);
        result = 31 * result + (receprice != null ? receprice.hashCode() : 0);
        result = 31 * result + (keybatch != null ? keybatch.hashCode() : 0);
        result = 31 * result + (batchno != null ? batchno.hashCode() : 0);
        result = 31 * result + (dat != null ? dat.hashCode() : 0);
        result = 31 * result + (kinds != null ? kinds.hashCode() : 0);
        return result;
    }
}
