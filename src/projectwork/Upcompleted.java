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
@Table(name = "upcompleted", catalog = "tasty", schema = "")
@NamedQueries({
    @NamedQuery(name = "Upcompleted.findAll", query = "SELECT u FROM Upcompleted u")
    , @NamedQuery(name = "Upcompleted.findBySerial", query = "SELECT u FROM Upcompleted u WHERE u.serial = :serial")
    , @NamedQuery(name = "Upcompleted.findByName", query = "SELECT u FROM Upcompleted u WHERE u.name = :name")
    , @NamedQuery(name = "Upcompleted.findByType", query = "SELECT u FROM Upcompleted u WHERE u.type = :type")
    , @NamedQuery(name = "Upcompleted.findByStarting", query = "SELECT u FROM Upcompleted u WHERE u.starting = :starting")
    , @NamedQuery(name = "Upcompleted.findByEnding", query = "SELECT u FROM Upcompleted u WHERE u.ending = :ending")
    , @NamedQuery(name = "Upcompleted.findByTeammates", query = "SELECT u FROM Upcompleted u WHERE u.teammates = :teammates")})
public class Upcompleted implements Serializable {

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
    @Column(name = "starting")
    private String starting;
    @Column(name = "ending")
    private String ending;
    @Column(name = "teammates")
    private String teammates;

    public Upcompleted() {
    }

    public Upcompleted(Integer serial) {
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

    public String getStarting() {
        return starting;
    }

    public void setStarting(String starting) {
        String oldStarting = this.starting;
        this.starting = starting;
        changeSupport.firePropertyChange("starting", oldStarting, starting);
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        String oldEnding = this.ending;
        this.ending = ending;
        changeSupport.firePropertyChange("ending", oldEnding, ending);
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
        if (!(object instanceof Upcompleted)) {
            return false;
        }
        Upcompleted other = (Upcompleted) object;
        if ((this.serial == null && other.serial != null) || (this.serial != null && !this.serial.equals(other.serial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projectwork.Upcompleted[ serial=" + serial + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
