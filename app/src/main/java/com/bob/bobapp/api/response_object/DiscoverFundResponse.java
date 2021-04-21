package com.bob.bobapp.api.response_object;

import java.util.ArrayList;

public class DiscoverFundResponse {
    public ArrayList<LstRecommandationDebt> getLstRecommandationDebt() {
        return lstRecommandationDebt;
    }

    public void setLstRecommandationDebt(ArrayList<LstRecommandationDebt> lstRecommandationDebt) {
        this.lstRecommandationDebt = lstRecommandationDebt;
    }

    public ArrayList<LstRecommandationDebt>lstRecommandationDebt;

    public ArrayList<lstRecommandationEquity> getLstRecommandationEquity() {
        return lstRecommandationEquity;
    }

    public void setLstRecommandationEquity(ArrayList<lstRecommandationEquity> lstRecommandationEquity) {
        this.lstRecommandationEquity = lstRecommandationEquity;
    }

    private ArrayList<lstRecommandationEquity>lstRecommandationEquity;

    public ArrayList<lstRecommandationCash> getLstRecommandationCash() {
        return lstRecommandationCash;
    }

    public void setLstRecommandationCash(ArrayList<lstRecommandationCash> lstRecommandationCash) {
        this.lstRecommandationCash = lstRecommandationCash;
    }

    private ArrayList<lstRecommandationCash>lstRecommandationCash;
}
