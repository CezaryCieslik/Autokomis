package com.company.interfaces;

import com.company.databases.ClientBase;

public interface Sale {
    void sale(ClientBase clientBase, int client, int car) throws Exception;
}
