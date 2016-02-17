/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divudi.data.dataStructure;

import com.divudi.entity.BillItem;
import com.divudi.entity.Item;
import java.util.List;

/**
 *
 * @author Buddhika
 */
public class InvestigationSummeryData {
    Item investigation;
    List<BillItem> billItems;
    long count;
    double total;
    double turnOverValue;
    boolean b;

    public Item getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Item investigation) {
        this.investigation = investigation;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

    public List<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(List<BillItem> billItems) {
        this.billItems = billItems;
    }

    public double getTurnOverValue() {
        return turnOverValue;
    }

    public void setTurnOverValue(double turnOverValue) {
        this.turnOverValue = turnOverValue;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
    
}
