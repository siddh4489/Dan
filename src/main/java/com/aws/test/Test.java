/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aws.test;

import com.aws.connection.AwsConnection;
import com.aws.manager.CompanyManager;
import com.aws.manager.FinancialManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Siddharaj Atodaria
 */
public class Test {

    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
        String privateCmp="{\"year_0\":\"2015\",\"qtr_0\":\"Q1\",\"rev_0\":\"\",\"gm_0\":\"\",\"ebitba_0\":\"\",\"cor_0\":\"\",\"gp_0\":\"\",\"rd_0\":\"\",\"sm_0\":\"\",\"ga_0\":\"\",\"oe_0\":\"\",\"toe_0\":\"\",\"ebitbam_0\":\"\",\"oien_0\":\"\",\"it_0\":\"\",\"nl_0\":\"\",\"cash_0\":\"\",\"tca_0\":\"\",\"tcl_0\":\"\",\"cae_0\":\"\",\"rc_0\":\"\",\"sti_0\":\"\",\"invtry_0\":\"\",\"ar_0\":\"\",\"pe_0\":\"\",\"oca_0\":\"\",\"ppe_0\":\"\",\"ada_0\":\"\",\"intg_0\":\"\",\"onca_0\":\"\",\"totass_0\":\"\",\"std_0\":\"\",\"ap_0\":\"\",\"dr_0\":\"\",\"al_0\":\"\",\"ocl_0\":\"\",\"ltd_0\":\"\",\"oncl_0\":\"\",\"totlia_0\":\"\",\"cs_0\":\"\",\"re_0\":\"\",\"toteq_0\":\"\",\"tle_0\":\"\",\"fet_0\":\"\",\"ltv_0\":\"\",\"cac_0\":\"\",\"ltvac_0\":\"\",\"year_1\":\"2015\",\"qtr_1\":\"Q1\",\"rev_1\":\"\",\"gm_1\":\"\",\"ebitba_1\":\"\",\"cor_1\":\"\",\"gp_1\":\"\",\"rd_1\":\"\",\"sm_1\":\"\",\"ga_1\":\"\",\"oe_1\":\"\",\"toe_1\":\"\",\"ebitbam_1\":\"\",\"oien_1\":\"\",\"it_1\":\"\",\"nl_1\":\"\",\"cash_1\":\"\",\"tca_1\":\"\",\"tcl_1\":\"\",\"cae_1\":\"\",\"rc_1\":\"\",\"sti_1\":\"\",\"invtry_1\":\"\",\"ar_1\":\"\",\"pe_1\":\"\",\"oca_1\":\"\",\"ppe_1\":\"\",\"ada_1\":\"\",\"intg_1\":\"\",\"onca_1\":\"\",\"totass_1\":\"\",\"std_1\":\"\",\"ap_1\":\"\",\"dr_1\":\"\",\"al_1\":\"\",\"ocl_1\":\"\",\"ltd_1\":\"\",\"oncl_1\":\"\",\"totlia_1\":\"\",\"cs_1\":\"\",\"re_1\":\"\",\"toteq_1\":\"\",\"tle_1\":\"\",\"fet_1\":\"\",\"ltv_1\":\"\",\"cac_1\":\"\",\"ltvac_1\":\"\",\"year_2\":\"2015\",\"qtr_2\":\"Q1\",\"rev_2\":\"\",\"gm_2\":\"\",\"ebitba_2\":\"\",\"cor_2\":\"\",\"gp_2\":\"\",\"rd_2\":\"\",\"sm_2\":\"\",\"ga_2\":\"\",\"oe_2\":\"\",\"toe_2\":\"\",\"ebitbam_2\":\"\",\"oien_2\":\"\",\"it_2\":\"\",\"nl_2\":\"\",\"cash_2\":\"\",\"tca_2\":\"\",\"tcl_2\":\"\",\"cae_2\":\"\",\"rc_2\":\"\",\"sti_2\":\"\",\"invtry_2\":\"\",\"ar_2\":\"\",\"pe_2\":\"\",\"oca_2\":\"\",\"ppe_2\":\"\",\"ada_2\":\"\",\"intg_2\":\"\",\"onca_2\":\"\",\"totass_2\":\"\",\"std_2\":\"\",\"ap_2\":\"\",\"dr_2\":\"\",\"al_2\":\"\",\"ocl_2\":\"\",\"ltd_2\":\"\",\"oncl_2\":\"\",\"totlia_2\":\"\",\"cs_2\":\"\",\"re_2\":\"\",\"toteq_2\":\"\",\"tle_2\":\"\",\"fet_2\":\"\",\"ltv_2\":\"\",\"cac_2\":\"\",\"ltvac_2\":\"\",\"year_3\":\"2015\",\"qtr_3\":\"Q1\",\"rev_3\":\"\",\"gm_3\":\"\",\"ebitba_3\":\"\",\"cor_3\":\"\",\"gp_3\":\"\",\"rd_3\":\"\",\"sm_3\":\"\",\"ga_3\":\"\",\"oe_3\":\"\",\"toe_3\":\"\",\"ebitbam_3\":\"\",\"oien_3\":\"\",\"it_3\":\"\",\"nl_3\":\"\",\"cash_3\":\"\",\"tca_3\":\"\",\"tcl_3\":\"\",\"cae_3\":\"\",\"rc_3\":\"\",\"sti_3\":\"\",\"invtry_3\":\"\",\"ar_3\":\"\",\"pe_3\":\"\",\"oca_3\":\"\",\"ppe_3\":\"\",\"ada_3\":\"\",\"intg_3\":\"\",\"onca_3\":\"\",\"totass_3\":\"\",\"std_3\":\"\",\"ap_3\":\"\",\"dr_3\":\"\",\"al_3\":\"\",\"ocl_3\":\"\",\"ltd_3\":\"\",\"oncl_3\":\"\",\"totlia_3\":\"\",\"cs_3\":\"\",\"re_3\":\"\",\"toteq_3\":\"\",\"tle_3\":\"\",\"fet_3\":\"\",\"ltv_3\":\"\",\"cac_3\":\"\",\"ltvac_3\":\"\",\"year_4\":\"2015\",\"qtr_4\":\"Q1\",\"rev_4\":\"\",\"gm_4\":\"\",\"ebitba_4\":\"\",\"cor_4\":\"\",\"gp_4\":\"\",\"rd_4\":\"\",\"sm_4\":\"\",\"ga_4\":\"\",\"oe_4\":\"\",\"toe_4\":\"\",\"ebitbam_4\":\"\",\"oien_4\":\"\",\"it_4\":\"\",\"nl_4\":\"\",\"cash_4\":\"\",\"tca_4\":\"\",\"tcl_4\":\"\",\"cae_4\":\"\",\"rc_4\":\"\",\"sti_4\":\"\",\"invtry_4\":\"\",\"ar_4\":\"\",\"pe_4\":\"\",\"oca_4\":\"\",\"ppe_4\":\"\",\"ada_4\":\"\",\"intg_4\":\"\",\"onca_4\":\"\",\"totass_4\":\"\",\"std_4\":\"\",\"ap_4\":\"\",\"dr_4\":\"\",\"al_4\":\"\",\"ocl_4\":\"\",\"ltd_4\":\"\",\"oncl_4\":\"\",\"totlia_4\":\"\",\"cs_4\":\"\",\"re_4\":\"\",\"toteq_4\":\"\",\"tle_4\":\"\",\"fet_4\":\"\",\"ltv_4\":\"\",\"cac_4\":\"\",\"ltvac_4\":\"\",\"year_5\":\"2015\",\"qtr_5\":\"Q1\",\"rev_5\":\"\",\"gm_5\":\"\",\"ebitba_5\":\"\",\"cor_5\":\"\",\"gp_5\":\"\",\"rd_5\":\"\",\"sm_5\":\"\",\"ga_5\":\"\",\"oe_5\":\"\",\"toe_5\":\"\",\"ebitbam_5\":\"\",\"oien_5\":\"\",\"it_5\":\"\",\"nl_5\":\"\",\"cash_5\":\"\",\"tca_5\":\"\",\"tcl_5\":\"\",\"cae_5\":\"\",\"rc_5\":\"\",\"sti_5\":\"\",\"invtry_5\":\"\",\"ar_5\":\"\",\"pe_5\":\"\",\"oca_5\":\"\",\"ppe_5\":\"\",\"ada_5\":\"\",\"intg_5\":\"\",\"onca_5\":\"\",\"totass_5\":\"\",\"std_5\":\"\",\"ap_5\":\"\",\"dr_5\":\"\",\"al_5\":\"\",\"ocl_5\":\"\",\"ltd_5\":\"\",\"oncl_5\":\"\",\"totlia_5\":\"\",\"cs_5\":\"\",\"re_5\":\"\",\"toteq_5\":\"\",\"tle_5\":\"\",\"fet_5\":\"\",\"ltv_5\":\"\",\"cac_5\":\"\",\"ltvac_5\":\"\",\"year_6\":\"2015\",\"qtr_6\":\"Q1\",\"rev_6\":\"\",\"gm_6\":\"\",\"ebitba_6\":\"\",\"cor_6\":\"\",\"gp_6\":\"\",\"rd_6\":\"\",\"sm_6\":\"\",\"ga_6\":\"\",\"oe_6\":\"\",\"toe_6\":\"\",\"ebitbam_6\":\"\",\"oien_6\":\"\",\"it_6\":\"\",\"nl_6\":\"\",\"cash_6\":\"\",\"tca_6\":\"\",\"tcl_6\":\"\",\"cae_6\":\"\",\"rc_6\":\"\",\"sti_6\":\"\",\"invtry_6\":\"\",\"ar_6\":\"\",\"pe_6\":\"\",\"oca_6\":\"\",\"ppe_6\":\"\",\"ada_6\":\"\",\"intg_6\":\"\",\"onca_6\":\"\",\"totass_6\":\"\",\"std_6\":\"\",\"ap_6\":\"\",\"dr_6\":\"\",\"al_6\":\"\",\"ocl_6\":\"\",\"ltd_6\":\"\",\"oncl_6\":\"\",\"totlia_6\":\"\",\"cs_6\":\"\",\"re_6\":\"\",\"toteq_6\":\"\",\"tle_6\":\"\",\"fet_6\":\"\",\"ltv_6\":\"\",\"cac_6\":\"\",\"ltvac_6\":\"\",\"year_7\":\"2015\",\"qtr_7\":\"Q1\",\"rev_7\":\"\",\"gm_7\":\"\",\"ebitba_7\":\"\",\"cor_7\":\"\",\"gp_7\":\"\",\"rd_7\":\"\",\"sm_7\":\"\",\"ga_7\":\"\",\"oe_7\":\"\",\"toe_7\":\"\",\"ebitbam_7\":\"\",\"oien_7\":\"\",\"it_7\":\"\",\"nl_7\":\"\",\"cash_7\":\"\",\"tca_7\":\"\",\"tcl_7\":\"\",\"cae_7\":\"\",\"rc_7\":\"\",\"sti_7\":\"\",\"invtry_7\":\"\",\"ar_7\":\"\",\"pe_7\":\"\",\"oca_7\":\"\",\"ppe_7\":\"\",\"ada_7\":\"\",\"intg_7\":\"\",\"onca_7\":\"\",\"totass_7\":\"\",\"std_7\":\"\",\"ap_7\":\"\",\"dr_7\":\"\",\"al_7\":\"\",\"ocl_7\":\"\",\"ltd_7\":\"\",\"oncl_7\":\"\",\"totlia_7\":\"\",\"cs_7\":\"\",\"re_7\":\"\",\"toteq_7\":\"\",\"tle_7\":\"\",\"fet_7\":\"\",\"ltv_7\":\"\",\"cac_7\":\"\",\"ltvac_7\":\"\"}";
        String publicCmp="{\"puyear_0\":\"2015\",\"puqtr_0\":\"Q1\",\"purev_0\":\"1\",\"pugm_0\":\"1\",\"puebitba_0\":\"1\",\"pucor_0\":\"1\",\"pugp_0\":\"1\",\"purd_0\":\"1\",\"pusga_0\":\"1\",\"punr_0\":\"1\",\"pungw_0\":\"1\",\"putotlia_0\":\"1\",\"pumsow_0\":\"1\",\"purps_0\":\"1\",\"pups_0\":\"1\",\"pucs_0\":\"1\",\"puts_0\":\"11\",\"pucas_0\":\"1\",\"puose_0\":\"1\",\"putote_0\":\"1\",\"putle_0\":\"1\",\"puoe_0\":\"1\",\"putoe_0\":\"1\",\"putoien_0\":\"1\",\"puebit_0\":\"11\",\"puit_0\":\"1\",\"puibt_0\":\"1\",\"puite_0\":\"1\",\"pumi_0\":\"1\",\"pudo_0\":\"1\",\"puei_0\":\"1\",\"pueoac_0\":\"1\",\"puoi_0\":\"1\",\"punil_0\":\"1\",\"pucash_0\":\"1\",\"putca_0\":\"1\",\"putcl_0\":\"1\",\"pucae_0\":\"1\",\"pusti_0\":\"1\",\"punre_0\":\"1\",\"puinvtry_0\":\"1\",\"puoca_0\":\"1\",\"putcass_0\":\"1\",\"pulti_0\":\"1\",\"puppe_0\":\"11\",\"pugw_0\":\"1\",\"puia_0\":\"1\",\"puaa_0\":\"1\",\"puoa_0\":\"1\",\"pudltac_0\":\"1\",\"puta_0\":\"1\",\"puscltd_0\":\"1\",\"puap_0\":\"1\",\"puocl_0\":\"1\",\"pultd_0\":\"1\",\"puolia_0\":\"1\",\"pudltlc_0\":\"1\",\"pumino_0\":\"1\",\"pufet_0\":\"1\",\"pultv_0\":\"1\",\"pucac_0\":\"1\",\"pultvac_0\":\"1\",\"puyear_1\":\"2015\",\"puqtr_1\":\"Q1\",\"purev_1\":\"\",\"pugm_1\":\"\",\"puebitba_1\":\"\",\"pucor_1\":\"\",\"pugp_1\":\"\",\"purd_1\":\"\",\"pusga_1\":\"\",\"punr_1\":\"\",\"pungw_1\":\"\",\"putotlia_1\":\"\",\"pumsow_1\":\"\",\"purps_1\":\"\",\"pups_1\":\"\",\"pucs_1\":\"\",\"puts_1\":\"\",\"pucas_1\":\"\",\"puose_1\":\"\",\"putote_1\":\"\",\"putle_1\":\"\",\"puoe_1\":\"\",\"putoe_1\":\"\",\"putoien_1\":\"\",\"puebit_1\":\"\",\"puit_1\":\"\",\"puibt_1\":\"\",\"puite_1\":\"\",\"pumi_1\":\"\",\"pudo_1\":\"\",\"puei_1\":\"\",\"pueoac_1\":\"\",\"puoi_1\":\"\",\"punil_1\":\"\",\"pucash_1\":\"\",\"putca_1\":\"\",\"putcl_1\":\"\",\"pucae_1\":\"\",\"pusti_1\":\"\",\"punre_1\":\"\",\"puinvtry_1\":\"\",\"puoca_1\":\"\",\"putcass_1\":\"\",\"pulti_1\":\"\",\"puppe_1\":\"\",\"pugw_1\":\"\",\"puia_1\":\"\",\"puaa_1\":\"\",\"puoa_1\":\"\",\"pudltac_1\":\"\",\"puta_1\":\"\",\"puscltd_1\":\"\",\"puap_1\":\"\",\"puocl_1\":\"\",\"pultd_1\":\"\",\"puolia_1\":\"\",\"pudltlc_1\":\"\",\"pumino_1\":\"\",\"pufet_1\":\"\",\"pultv_1\":\"\",\"pucac_1\":\"\",\"pultvac_1\":\"\",\"puyear_2\":\"2015\",\"puqtr_2\":\"Q1\",\"purev_2\":\"\",\"pugm_2\":\"\",\"puebitba_2\":\"\",\"pucor_2\":\"\",\"pugp_2\":\"\",\"purd_2\":\"\",\"pusga_2\":\"\",\"punr_2\":\"\",\"pungw_2\":\"\",\"putotlia_2\":\"\",\"pumsow_2\":\"\",\"purps_2\":\"\",\"pups_2\":\"\",\"pucs_2\":\"\",\"puts_2\":\"\",\"pucas_2\":\"\",\"puose_2\":\"\",\"putote_2\":\"\",\"putle_2\":\"\",\"puoe_2\":\"\",\"putoe_2\":\"\",\"putoien_2\":\"\",\"puebit_2\":\"\",\"puit_2\":\"\",\"puibt_2\":\"\",\"puite_2\":\"\",\"pumi_2\":\"\",\"pudo_2\":\"\",\"puei_2\":\"\",\"pueoac_2\":\"\",\"puoi_2\":\"\",\"punil_2\":\"\",\"pucash_2\":\"\",\"putca_2\":\"\",\"putcl_2\":\"\",\"pucae_2\":\"\",\"pusti_2\":\"\",\"punre_2\":\"\",\"puinvtry_2\":\"\",\"puoca_2\":\"\",\"putcass_2\":\"\",\"pulti_2\":\"\",\"puppe_2\":\"\",\"pugw_2\":\"\",\"puia_2\":\"\",\"puaa_2\":\"\",\"puoa_2\":\"\",\"pudltac_2\":\"\",\"puta_2\":\"\",\"puscltd_2\":\"\",\"puap_2\":\"\",\"puocl_2\":\"\",\"pultd_2\":\"\",\"puolia_2\":\"\",\"pudltlc_2\":\"\",\"pumino_2\":\"\",\"pufet_2\":\"\",\"pultv_2\":\"\",\"pucac_2\":\"\",\"pultvac_2\":\"\",\"puyear_3\":\"2015\",\"puqtr_3\":\"Q1\",\"purev_3\":\"\",\"pugm_3\":\"\",\"puebitba_3\":\"\",\"pucor_3\":\"\",\"pugp_3\":\"\",\"purd_3\":\"\",\"pusga_3\":\"\",\"punr_3\":\"\",\"pungw_3\":\"\",\"putotlia_3\":\"\",\"pumsow_3\":\"\",\"purps_3\":\"\",\"pups_3\":\"\",\"pucs_3\":\"\",\"puts_3\":\"\",\"pucas_3\":\"\",\"puose_3\":\"\",\"putote_3\":\"\",\"putle_3\":\"\",\"puoe_3\":\"\",\"putoe_3\":\"\",\"putoien_3\":\"\",\"puebit_3\":\"\",\"puit_3\":\"\",\"puibt_3\":\"\",\"puite_3\":\"\",\"pumi_3\":\"\",\"pudo_3\":\"\",\"puei_3\":\"\",\"pueoac_3\":\"\",\"puoi_3\":\"\",\"punil_3\":\"\",\"pucash_3\":\"\",\"putca_3\":\"\",\"putcl_3\":\"\",\"pucae_3\":\"\",\"pusti_3\":\"\",\"punre_3\":\"\",\"puinvtry_3\":\"\",\"puoca_3\":\"\",\"putcass_3\":\"\",\"pulti_3\":\"\",\"puppe_3\":\"\",\"pugw_3\":\"\",\"puia_3\":\"\",\"puaa_3\":\"\",\"puoa_3\":\"\",\"pudltac_3\":\"\",\"puta_3\":\"\",\"puscltd_3\":\"\",\"puap_3\":\"\",\"puocl_3\":\"\",\"pultd_3\":\"\",\"puolia_3\":\"\",\"pudltlc_3\":\"\",\"pumino_3\":\"\",\"pufet_3\":\"\",\"pultv_3\":\"\",\"pucac_3\":\"\",\"pultvac_3\":\"\",\"puyear_4\":\"2015\",\"puqtr_4\":\"Q1\",\"purev_4\":\"\",\"pugm_4\":\"\",\"puebitba_4\":\"\",\"pucor_4\":\"\",\"pugp_4\":\"\",\"purd_4\":\"\",\"pusga_4\":\"\",\"punr_4\":\"\",\"pungw_4\":\"\",\"putotlia_4\":\"\",\"pumsow_4\":\"\",\"purps_4\":\"\",\"pups_4\":\"\",\"pucs_4\":\"\",\"puts_4\":\"\",\"pucas_4\":\"\",\"puose_4\":\"\",\"putote_4\":\"\",\"putle_4\":\"\",\"puoe_4\":\"\",\"putoe_4\":\"\",\"putoien_4\":\"\",\"puebit_4\":\"\",\"puit_4\":\"\",\"puibt_4\":\"\",\"puite_4\":\"\",\"pumi_4\":\"\",\"pudo_4\":\"\",\"puei_4\":\"\",\"pueoac_4\":\"\",\"puoi_4\":\"\",\"punil_4\":\"\",\"pucash_4\":\"\",\"putca_4\":\"\",\"putcl_4\":\"\",\"pucae_4\":\"\",\"pusti_4\":\"\",\"punre_4\":\"\",\"puinvtry_4\":\"\",\"puoca_4\":\"\",\"putcass_4\":\"\",\"pulti_4\":\"\",\"puppe_4\":\"\",\"pugw_4\":\"\",\"puia_4\":\"\",\"puaa_4\":\"\",\"puoa_4\":\"\",\"pudltac_4\":\"\",\"puta_4\":\"\",\"puscltd_4\":\"\",\"puap_4\":\"\",\"puocl_4\":\"\",\"pultd_4\":\"\",\"puolia_4\":\"\",\"pudltlc_4\":\"\",\"pumino_4\":\"\",\"pufet_4\":\"\",\"pultv_4\":\"\",\"pucac_4\":\"\",\"pultvac_4\":\"\",\"puyear_5\":\"2015\",\"puqtr_5\":\"Q1\",\"purev_5\":\"\",\"pugm_5\":\"\",\"puebitba_5\":\"\",\"pucor_5\":\"\",\"pugp_5\":\"\",\"purd_5\":\"\",\"pusga_5\":\"\",\"punr_5\":\"\",\"pungw_5\":\"\",\"putotlia_5\":\"\",\"pumsow_5\":\"\",\"purps_5\":\"\",\"pups_5\":\"\",\"pucs_5\":\"\",\"puts_5\":\"\",\"pucas_5\":\"\",\"puose_5\":\"\",\"putote_5\":\"\",\"putle_5\":\"\",\"puoe_5\":\"\",\"putoe_5\":\"\",\"putoien_5\":\"\",\"puebit_5\":\"\",\"puit_5\":\"\",\"puibt_5\":\"\",\"puite_5\":\"\",\"pumi_5\":\"\",\"pudo_5\":\"\",\"puei_5\":\"\",\"pueoac_5\":\"\",\"puoi_5\":\"\",\"punil_5\":\"\",\"pucash_5\":\"\",\"putca_5\":\"\",\"putcl_5\":\"\",\"pucae_5\":\"\",\"pusti_5\":\"\",\"punre_5\":\"\",\"puinvtry_5\":\"\",\"puoca_5\":\"\",\"putcass_5\":\"\",\"pulti_5\":\"\",\"puppe_5\":\"\",\"pugw_5\":\"\",\"puia_5\":\"\",\"puaa_5\":\"\",\"puoa_5\":\"\",\"pudltac_5\":\"\",\"puta_5\":\"\",\"puscltd_5\":\"\",\"puap_5\":\"\",\"puocl_5\":\"\",\"pultd_5\":\"\",\"puolia_5\":\"\",\"pudltlc_5\":\"\",\"pumino_5\":\"\",\"pufet_5\":\"\",\"pultv_5\":\"\",\"pucac_5\":\"\",\"pultvac_5\":\"\",\"puyear_6\":\"2015\",\"puqtr_6\":\"Q1\",\"purev_6\":\"\",\"pugm_6\":\"\",\"puebitba_6\":\"\",\"pucor_6\":\"\",\"pugp_6\":\"\",\"purd_6\":\"\",\"pusga_6\":\"\",\"punr_6\":\"\",\"pungw_6\":\"\",\"putotlia_6\":\"\",\"pumsow_6\":\"\",\"purps_6\":\"\",\"pups_6\":\"\",\"pucs_6\":\"\",\"puts_6\":\"\",\"pucas_6\":\"\",\"puose_6\":\"\",\"putote_6\":\"\",\"putle_6\":\"\",\"puoe_6\":\"\",\"putoe_6\":\"\",\"putoien_6\":\"\",\"puebit_6\":\"\",\"puit_6\":\"\",\"puibt_6\":\"\",\"puite_6\":\"\",\"pumi_6\":\"\",\"pudo_6\":\"\",\"puei_6\":\"\",\"pueoac_6\":\"\",\"puoi_6\":\"\",\"punil_6\":\"\",\"pucash_6\":\"\",\"putca_6\":\"\",\"putcl_6\":\"\",\"pucae_6\":\"\",\"pusti_6\":\"\",\"punre_6\":\"\",\"puinvtry_6\":\"\",\"puoca_6\":\"\",\"putcass_6\":\"\",\"pulti_6\":\"\",\"puppe_6\":\"\",\"pugw_6\":\"\",\"puia_6\":\"\",\"puaa_6\":\"\",\"puoa_6\":\"\",\"pudltac_6\":\"\",\"puta_6\":\"\",\"puscltd_6\":\"\",\"puap_6\":\"\",\"puocl_6\":\"\",\"pultd_6\":\"\",\"puolia_6\":\"\",\"pudltlc_6\":\"\",\"pumino_6\":\"\",\"pufet_6\":\"\",\"pultv_6\":\"\",\"pucac_6\":\"\",\"pultvac_6\":\"\",\"puyear_7\":\"2015\",\"puqtr_7\":\"Q1\",\"purev_7\":\"\",\"pugm_7\":\"\",\"puebitba_7\":\"\",\"pucor_7\":\"\",\"pugp_7\":\"\",\"purd_7\":\"\",\"pusga_7\":\"\",\"punr_7\":\"\",\"pungw_7\":\"\",\"putotlia_7\":\"\",\"pumsow_7\":\"\",\"purps_7\":\"\",\"pups_7\":\"\",\"pucs_7\":\"\",\"puts_7\":\"\",\"pucas_7\":\"\",\"puose_7\":\"\",\"putote_7\":\"\",\"putle_7\":\"\",\"puoe_7\":\"\",\"putoe_7\":\"\",\"putoien_7\":\"\",\"puebit_7\":\"\",\"puit_7\":\"\",\"puibt_7\":\"\",\"puite_7\":\"\",\"pumi_7\":\"\",\"pudo_7\":\"\",\"puei_7\":\"\",\"pueoac_7\":\"\",\"puoi_7\":\"\",\"punil_7\":\"\",\"pucash_7\":\"\",\"putca_7\":\"\",\"putcl_7\":\"\",\"pucae_7\":\"\",\"pusti_7\":\"\",\"punre_7\":\"\",\"puinvtry_7\":\"\",\"puoca_7\":\"\",\"putcass_7\":\"\",\"pulti_7\":\"\",\"puppe_7\":\"\",\"pugw_7\":\"\",\"puia_7\":\"\",\"puaa_7\":\"\",\"puoa_7\":\"\",\"pudltac_7\":\"\",\"puta_7\":\"\",\"puscltd_7\":\"\",\"puap_7\":\"\",\"puocl_7\":\"\",\"pultd_7\":\"\",\"puolia_7\":\"\",\"pudltlc_7\":\"\",\"pumino_7\":\"\",\"pufet_7\":\"\",\"pultv_7\":\"\",\"pucac_7\":\"\",\"pultvac_7\":\"\"}";

        //System.out.println("private--result---"+FinancialManager.insertFinancialRecManager(privateCmp,"2221112","private"));
        System.out.println("public--result---"+FinancialManager.insertFinancialRecManager(publicCmp,"48975255","public"));
       
    }
}
