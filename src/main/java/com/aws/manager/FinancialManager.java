/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aws.manager;

import com.aws.datamanager.FinancialDataManager;
import com.aws.model.PrivateFinancial;
import com.aws.model.FinancialModel;
import com.aws.model.PublicFinancial;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Siddharaj Atodaria
 */
public class FinancialManager {

    public static String insertFinancialRecManager(String finData, String sfid, String cmptype) throws ParseException, SQLException, ClassNotFoundException {
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(finData);
        String retunStr;
        FinancialModel finObj = new FinancialModel();
        List<PrivateFinancial> priFinList = new ArrayList<PrivateFinancial>();
        List<PublicFinancial> pubFinList = new ArrayList<PublicFinancial>();
        if (cmptype.equalsIgnoreCase("private")) {
            PrivateFinancial fobj = new PrivateFinancial();
            for (int i = 0; i < 8; i++) {
                fobj = new PrivateFinancial();
                fobj.setCmptype(cmptype);
                fobj.setSfid(sfid);
                fobj.setYear((String) json.get("year_" + i));
                fobj.setQtr((String) json.get("qtr_" + i));
                fobj.setRev((String) json.get("rev_" + i));
                fobj.setGm((String) json.get("gm_" + i));
                fobj.setEbitba((String) json.get("ebitba_" + i));
                fobj.setCor((String) json.get("cor_" + i));
                fobj.setGp((String) json.get("gp_" + i));
                fobj.setRd((String) json.get("rd_" + i));
                fobj.setSm((String) json.get("sm_" + i));
                fobj.setGa((String) json.get("ga_" + i));
                fobj.setOe((String) json.get("oe_" + i));
                fobj.setToe((String) json.get("toe_" + i));
                fobj.setEbitbam((String) json.get("ebitbam_" + i));
                fobj.setOien((String) json.get("oien_" + i));
                fobj.setIt((String) json.get("it_" + i));
                fobj.setNl((String) json.get("nl_" + i));
                fobj.setCash((String) json.get("cash_" + i));
                fobj.setTca((String) json.get("tca_" + i));
                fobj.setTcl((String) json.get("tcl_" + i));
                fobj.setCae((String) json.get("cae_" + i));
                fobj.setRc((String) json.get("rc_" + i));
                fobj.setSti((String) json.get("sti_" + i));
                fobj.setInvtry((String) json.get("invtry_" + i));
                fobj.setAr((String) json.get("ar_" + i));
                fobj.setPe((String) json.get("pe_" + i));
                fobj.setOca((String) json.get("oca_" + i));
                fobj.setPpe((String) json.get("ppe_" + i));
                fobj.setAda((String) json.get("ada_" + i));
                fobj.setIntg((String) json.get("intg_" + i));
                fobj.setOnca((String) json.get("onca_" + i));
                fobj.setTotass((String) json.get("totass_" + i));
                fobj.setStd((String) json.get("std_" + i));
                fobj.setAp((String) json.get("ap_" + i));
                fobj.setDr((String) json.get("dr_" + i));
                fobj.setAl((String) json.get("al_" + i));
                fobj.setOcl((String) json.get("ocl_" + i));
                fobj.setLtd((String) json.get("ltd_" + i));
                fobj.setOncl((String) json.get("oncl_" + i));
                fobj.setTotlia((String) json.get("totlia_" + i));
                fobj.setCs((String) json.get("cs_" + i));
                fobj.setRe((String) json.get("re_" + i));
                fobj.setToteq((String) json.get("toteq_" + i));
                fobj.setTle((String) json.get("tle_" + i));
                fobj.setFet((String) json.get("fet_" + i));
                fobj.setLtv((String) json.get("ltv_" + i));
                fobj.setCac((String) json.get("cac_" + i));
                fobj.setLtvac((String) json.get("ltvac_" + i));
                priFinList.add(fobj);
            }
            finObj.setPrivatelst(priFinList);
            retunStr = FinancialDataManager.insertPrivateFinancialDataManager(finObj);
        } else {
            PublicFinancial pobj = new PublicFinancial();
            for (int i = 0; i < 8; i++) {
                pobj = new PublicFinancial();
                pobj.setCmptype(cmptype);
                pobj.setSfid(sfid);
                pobj.setPuyear((String) json.get("puyear_" + i));
                pobj.setPuqtr((String) json.get("puqtr_" + i));
                pobj.setPurev((String) json.get("purev_" + i));
                pobj.setPugm((String) json.get("pugm_" + i));
                pobj.setPuebitba((String) json.get("puebitba_" + i));
                pobj.setPucor((String) json.get("pucor_" + i));
                pobj.setPugp((String) json.get("pugp_" + i));
                pobj.setPurd((String) json.get("purd_" + i));
                pobj.setPusga((String) json.get("pusga_" + i));
                pobj.setPunr((String) json.get("punr_" + i));
                pobj.setPungw((String) json.get("pungw_" + i));
                pobj.setPutotlia((String) json.get("putotlia_" + i));
                pobj.setPumsow((String) json.get("pumsow_" + i));
                pobj.setPurps((String) json.get("purps_" + i));
                pobj.setPups((String) json.get("pups_" + i));
                pobj.setPucs((String) json.get("pucs_" + i));
                pobj.setPuts((String) json.get("puts_" + i));
                pobj.setPucas((String) json.get("pucas_" + i));
                pobj.setPuose((String) json.get("puose_" + i));
                pobj.setPutote((String) json.get("putote_" + i));
                pobj.setPutle((String) json.get("putle_" + i));
                pobj.setPuoe((String) json.get("puoe_" + i));
                pobj.setPutoe((String) json.get("putoe_" + i));
                pobj.setPutoien((String) json.get("putoien_" + i));
                pobj.setPuebit((String) json.get("puebit_" + i));
                pobj.setPuit((String) json.get("puit_" + i));
                pobj.setPuibt((String) json.get("puibt_" + i));
                pobj.setPuite((String) json.get("puite_" + i));
                pobj.setPumi((String) json.get("pumi_" + i));
                pobj.setPudo((String) json.get("pudo_" + i));
                pobj.setPuei((String) json.get("puei_" + i));
                pobj.setPueoac((String) json.get("pueoac_" + i));
                pobj.setPuoi((String) json.get("puoi_" + i));
                pobj.setPunil((String) json.get("punil_" + i));
                pobj.setPucash((String) json.get("pucash_" + i));
                pobj.setPutca((String) json.get("putca_" + i));
                pobj.setPutcl((String) json.get("putcl_" + i));
                pobj.setPucae((String) json.get("pucae_" + i));
                pobj.setPusti((String) json.get("pusti_" + i));
                pobj.setPunre((String) json.get("punre_" + i));
                pobj.setPuinvtry((String) json.get("puinvtry_" + i));
                pobj.setPuoca((String) json.get("puoca_" + i));
                pobj.setPutcass((String) json.get("putcass_" + i));
                pobj.setPulti((String) json.get("pulti_" + i));
                pobj.setPuppe((String) json.get("puppe_" + i));
                pobj.setPugw((String) json.get("pugw_" + i));
                pobj.setPuia((String) json.get("puia" + i));
                pobj.setPuaa((String) json.get("puaa_" + i));
                pobj.setPuoa((String) json.get("puoa_" + i));
                pobj.setPudltac((String) json.get("pudltac_" + i));
                pobj.setPuta((String) json.get("puta_" + i));
                pobj.setPuscltd((String) json.get("puscltd_" + i));
                pobj.setPuap((String) json.get("puap_" + i));
                pobj.setPuocl((String) json.get("puocl_" + i));
                pobj.setPultd((String) json.get("pultd_" + i));
                pobj.setPuolia((String) json.get("puolia_" + i));
                pobj.setPudltlc((String) json.get("pudltlc_" + i));
                pobj.setPumino((String) json.get("pumino_" + i));
                pobj.setPufet((String) json.get("pufet_" + i));
                pobj.setPultv((String) json.get("pultv_" + i));
                pobj.setPucac((String) json.get("pucac_" + i));
                pobj.setPultvac((String) json.get("pultvac_" + i));

                pubFinList.add(pobj);
            }
            finObj.setPubliclst(pubFinList);
            retunStr = FinancialDataManager.insertPublicFinancialDataManager(finObj);
        }

        return retunStr;
    }

}
