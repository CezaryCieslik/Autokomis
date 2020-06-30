package com.company.interfaces;

import com.company.databases.CarBase;

public interface Purchase {
    void purchase(CarBase carBase, int number) throws Exception;
}
