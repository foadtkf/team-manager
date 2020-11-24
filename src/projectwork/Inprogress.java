/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectwork;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Fuad
 */
@Entity
@Table(name = "inprogress", catalog = "tasty", schema = "")
@NamedQueries({
    @NamedQuery(name = "Inprogress.findAll", query = "SELECT i FROM Inprogress i")
    , @NamedQuery(name = "Inprogress.findBySerial", query = "SELECT i FROM Inprogress i WHERE i.serial = :serial")
    , @NamedQuery(name = "Inprogress.findByName", query = "SELECT i FROM Inprogress i WHERE i.name = :name")
    , @NamedQuery(name = "Inprogress.findByType", query = "SELECT i FROM Inprogress i WHERE i.type = :type")
    , @NamedQuery(name = "Inprogress.findByStartsAt", query = "SELECT i FROM Inprogress i WHERE i.startsAt = :startsAt")
    , @NamedQuery(name = "Inprogress.findByEndsAt", query = "SELECT i FROM Inprogress i WHERE i.endsAt = :endsAt")
    , @NamedQuery(name = "Inprogress.findByTeammates", query = "SELECT i FROM Inprogress i WHERE i.teammates = :teammates")})
public class Inprogress implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "serial")
    private Integer serial;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "startsAt")
    private String startsAt;
    @Column(name = "endsAt")
    private String endsAt;
    @Column(name = "teammates")
    private String teammates;

    public Inprogress() {
    }

    public Inprogress(Integer serial) {
        this.serial = serial;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        Integer oldSerial = this.serial;
        this.serial = serial;
        changeSupport.firePropertyChange("serial", oldSerial, serial);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(String startsAt) {
        String oldStartsAt = this.startsAt;
        this.startsAt = startsAt;
        changeSupport.firePropertyChange("startsAt", oldStartsAt, startsAt);
    }

    public String getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(String endsAt) {
        String oldEndsAt = this.endsAt;
        this.endsAt = endsAt;
        changeSupport.firePropertyChange("endsAt", oldEndsAt, endsAt);
    }

    public String getTeammates() {
        return teammates;
    }

    public void setTeammates(String teammates) {
        String oldTeammates = this.teammates;
        this.teammates = teammates;
        changeSupport.firePropertyChange("teammates", oldTeammates, teammates);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serial != null ? serial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inprogress)) {
            return false;
        }
        Inprogress other = (Inprogress) object;
        if ((this.serial == null && other.serial != null) || (this.serial != null && !this.serial.equals(other.serial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LoginSql.Inprogress[ serial=" + serial + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
