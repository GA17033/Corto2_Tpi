/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.especialistajee.jbib.model;

import java.io.Serializable;

/**
 *
 * @author FUJITSU
 */
public abstract class DomainObject implements Serializable {

    private static final long serialVersionUID = 1L;

    public abstract boolean equals(Object object);

    public abstract int hashCode();
}
