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
@Table(name = "completed", catalog = "tasty", schema = "")
@NamedQueries({
    @NamedQuery(name = "Completed.findAll", query = "SELECT c FROM Completed c")
    , @NamedQuery(name = "Completed.findBySerial", query = "SELECT c FROM Completed c WHERE c.serial = :serial")
    , @NamedQuery(name = "Completed.findByName", query = "SELECT c FROM Completed c WHERE c.name = :name")
    , @NamedQuery(name = "Completed.findByType", query = "SELECT c FROM Completed c WHERE c.type = :type")
    , @NamedQuery(name = "Completed.findByStartsat", query = "SELECT c FROM Completed c WHERE c.startsat = :startsat")
    , @NamedQuery(name = "Completed.findByEndsat", query = "SELECT c FROM Completed c WHERE c.endsat = :endsat")
    , @NamedQuery(name = "Completed.findByTeammates", query = "SELECT c FROM Completed c WHERE c.teammates = :teammates")})
public class Completed implements Serializable {

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
    @Column(name = "startsat")
    private String startsat;
    @Column(name = "endsat")
    private String endsat;
    @Column(name = "teammates")
    private String teammates;

    public Completed() {
    }

    public Completed(Integer serial) {
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

    public String getStartsat() {
        return startsat;
    }

    public void setStartsat(String startsat) {
        String oldStartsat = this.startsat;
        this.startsat = startsat;
        changeSupport.firePropertyChange("startsat", oldStartsat, startsat);
    }

    public String getEndsat() {
        return endsat;
    }

    public void setEndsat(String endsat) {
        String oldEndsat = this.endsat;
        this.endsat = endsat;
        changeSupport.firePropertyChange("endsat", oldEndsat, endsat);
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
        if (!(object instanceof Completed)) {
            return false;
        }
        Completed other = (Completed) object;
        if ((this.serial == null && other.serial != null) || (this.serial != null && !this.serial.equals(other.serial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LoginSql.Completed[ serial=" + serial + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
