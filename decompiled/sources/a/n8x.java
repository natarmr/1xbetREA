package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n8x implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n8x f23111a;
    private static final ugi0 descriptor;

    static {
        n8x n8xVar = new n8x();
        f23111a = n8xVar;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.InfoConfig", n8xVar, 33);
        zna0Var.j("hasSectionInfo", true);
        zna0Var.j("hasInfoAboutUs", true);
        zna0Var.j("hasInfoSocials", true);
        zna0Var.j("hasInfoContacts", true);
        zna0Var.j("hasInfoRules", true);
        zna0Var.j("infoPartnersProgram", true);
        zna0Var.j("infoAgentsProgram", true);
        zna0Var.j("linkToRules", true);
        zna0Var.j("hasInfoLicense", true);
        zna0Var.j("hasInfoAwards", true);
        zna0Var.j("hasInfoPayments", true);
        zna0Var.j("hasInfoHowBet", true);
        zna0Var.j("hasInfoPartners", true);
        zna0Var.j("hasInfoProcedures", true);
        zna0Var.j("linkToProcedures", true);
        zna0Var.j("hasInfoComplaints", true);
        zna0Var.j("linkToComplaints", true);
        zna0Var.j("linkToNews", true);
        zna0Var.j("hasInfoPrivacy", true);
        zna0Var.j("linkToPrivacy", true);
        zna0Var.j("hasInfoStopList", true);
        zna0Var.j("linkToStopList", true);
        zna0Var.j("hasInfoGDPR", true);
        zna0Var.j("linkToGDPR", true);
        zna0Var.j("hasInfoMarkets", true);
        zna0Var.j("hasInfoContactsNew", true);
        zna0Var.j("hasInfoContactsNew2", true);
        zna0Var.j("infoGamblingProblemOrg", true);
        zna0Var.j("hasInfoCardFraud", true);
        zna0Var.j("linkToCardFraud", true);
        zna0Var.j("hasInfoPEPRules", true);
        zna0Var.j("linkToPEPRules", true);
        zna0Var.j("hasHistoryRulesAgreement", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ0 = mrv.j0(sm8Var);
        jiy jiyVarJ1 = mrv.j0(sm8Var);
        jiy jiyVarJ2 = mrv.j0(sm8Var);
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ?? r1;
        Boolean bool;
        int i;
        String str;
        int i2;
        int i3;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        Boolean bool3 = null;
        String str4 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str5 = null;
        Boolean bool7 = null;
        String str6 = null;
        Boolean bool8 = null;
        String str7 = null;
        Boolean bool9 = null;
        boolean z = true;
        boolean z2 = false;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool15 = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        Boolean bool19 = null;
        Boolean bool20 = null;
        int i4 = 0;
        String str11 = null;
        Boolean bool21 = null;
        String str12 = null;
        String str13 = null;
        Boolean bool22 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    bool7 = bool7;
                    String str14 = str6;
                    Boolean bool23 = bool8;
                    str10 = str10;
                    Boolean bool24 = bool15;
                    Boolean bool25 = bool16;
                    Boolean bool26 = bool19;
                    str13 = str13;
                    Boolean bool27 = bool22;
                    bool2 = bool2;
                    bool6 = bool6;
                    str5 = str5;
                    str8 = str8;
                    str9 = str9;
                    bool21 = bool21;
                    str12 = str12;
                    str4 = str4;
                    Boolean bool28 = bool5;
                    Boolean bool29 = bool13;
                    bool14 = bool14;
                    Boolean bool30 = bool20;
                    str11 = str11;
                    String str15 = str2;
                    Boolean bool31 = bool10;
                    Boolean bool32 = bool18;
                    String str16 = str3;
                    bool10 = bool31;
                    str2 = str15;
                    bool19 = bool26;
                    bool11 = bool11;
                    bool9 = bool9;
                    bool17 = bool17;
                    str3 = str16;
                    bool18 = bool32;
                    z = false;
                    bool = bool27;
                    bool4 = bool4;
                    bool3 = bool3;
                    bool15 = bool24;
                    i = i4;
                    bool20 = bool30;
                    str7 = str7;
                    str6 = str14;
                    bool13 = bool29;
                    bool16 = bool25;
                    bool5 = bool28;
                    bool8 = bool23;
                    str11 = str11;
                    bool14 = bool14;
                    str4 = str4;
                    bool21 = bool21;
                    str8 = str8;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 0:
                    Boolean bool33 = bool8;
                    Boolean bool34 = bool16;
                    String str17 = str7;
                    Boolean bool35 = bool18;
                    int i5 = i4;
                    String str18 = str3;
                    Boolean bool36 = bool4;
                    int i6 = i5 | 1;
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool10);
                    str2 = str2;
                    bool19 = bool19;
                    bool11 = bool11;
                    bool9 = bool9;
                    bool17 = bool17;
                    str3 = str18;
                    bool18 = bool35;
                    bool = bool22;
                    str7 = str17;
                    bool3 = bool3;
                    i = i6;
                    bool15 = bool15;
                    bool16 = bool34;
                    bool4 = bool36;
                    str6 = str6;
                    bool8 = bool33;
                    bool20 = bool20;
                    bool13 = bool13;
                    bool5 = bool5;
                    str11 = str11;
                    bool14 = bool14;
                    str4 = str4;
                    bool21 = bool21;
                    str8 = str8;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 1:
                    Boolean bool37 = bool8;
                    Boolean bool38 = bool16;
                    String str19 = str7;
                    int i7 = i4;
                    Boolean bool39 = bool18;
                    String str20 = str3;
                    bool = bool22;
                    bool9 = bool9;
                    str2 = str2;
                    bool3 = bool3;
                    bool17 = bool17;
                    bool15 = bool15;
                    i = i7 | 2;
                    bool19 = bool19;
                    str7 = str19;
                    str3 = str20;
                    str6 = str6;
                    bool18 = bool39;
                    bool11 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool11);
                    bool16 = bool38;
                    bool4 = bool4;
                    bool8 = bool37;
                    bool20 = bool20;
                    bool13 = bool13;
                    bool5 = bool5;
                    str11 = str11;
                    bool14 = bool14;
                    str4 = str4;
                    bool21 = bool21;
                    str8 = str8;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 2:
                    bool7 = bool7;
                    String str21 = str6;
                    Boolean bool40 = bool8;
                    str10 = str10;
                    Boolean bool41 = bool15;
                    Boolean bool42 = bool16;
                    str13 = str13;
                    Boolean bool43 = bool22;
                    bool6 = bool6;
                    str5 = str5;
                    String str22 = str7;
                    str8 = str8;
                    str9 = str9;
                    int i8 = i4;
                    bool21 = bool21;
                    str12 = str12;
                    str4 = str4;
                    Boolean bool44 = bool4;
                    bool5 = bool5;
                    bool13 = bool13;
                    bool14 = bool14;
                    str11 = str11;
                    Boolean bool45 = bool3;
                    Boolean bool46 = bool20;
                    String str23 = str2;
                    Boolean bool47 = bool19;
                    bool2 = bool2;
                    Boolean bool48 = bool18;
                    int i9 = i8 | 4;
                    bool19 = bool47;
                    str2 = str23;
                    bool12 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool12);
                    bool11 = bool11;
                    bool = bool43;
                    str7 = str22;
                    bool9 = bool9;
                    bool3 = bool45;
                    bool17 = bool17;
                    i = i9;
                    bool15 = bool41;
                    bool16 = bool42;
                    str3 = str3;
                    bool4 = bool44;
                    str6 = str21;
                    bool8 = bool40;
                    bool18 = bool48;
                    bool20 = bool46;
                    bool13 = bool13;
                    bool5 = bool5;
                    str11 = str11;
                    bool14 = bool14;
                    str4 = str4;
                    bool21 = bool21;
                    str8 = str8;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 3:
                    bool7 = bool7;
                    String str24 = str6;
                    Boolean bool49 = bool8;
                    str10 = str10;
                    Boolean bool50 = bool15;
                    Boolean bool51 = bool16;
                    str13 = str13;
                    Boolean bool52 = bool22;
                    bool6 = bool6;
                    str5 = str5;
                    String str25 = str7;
                    str8 = str8;
                    str9 = str9;
                    int i10 = i4;
                    bool21 = bool21;
                    str12 = str12;
                    str4 = str4;
                    Boolean bool53 = bool5;
                    bool14 = bool14;
                    String str26 = str11;
                    Boolean bool54 = bool3;
                    Boolean bool55 = bool20;
                    String str27 = str2;
                    Boolean bool56 = bool19;
                    bool2 = bool2;
                    Boolean bool57 = bool18;
                    String str28 = str3;
                    str11 = str26;
                    int i11 = i10 | 8;
                    bool19 = bool56;
                    str2 = str27;
                    bool13 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool13);
                    bool11 = bool11;
                    bool = bool52;
                    str7 = str25;
                    bool9 = bool9;
                    bool4 = bool4;
                    bool17 = bool17;
                    bool20 = bool55;
                    bool15 = bool50;
                    bool16 = bool51;
                    str3 = str28;
                    bool3 = bool54;
                    str6 = str24;
                    bool8 = bool49;
                    bool18 = bool57;
                    i = i11;
                    bool5 = bool53;
                    str11 = str11;
                    bool14 = bool14;
                    str4 = str4;
                    bool21 = bool21;
                    str8 = str8;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 4:
                    Boolean bool58 = bool8;
                    Boolean bool59 = bool16;
                    String str29 = str7;
                    int i12 = i4;
                    str12 = str12;
                    String str30 = str4;
                    Boolean bool60 = bool21;
                    Boolean bool61 = bool5;
                    String str31 = str11;
                    Boolean bool62 = bool3;
                    Boolean bool63 = bool20;
                    Boolean bool64 = bool18;
                    bool19 = bool19;
                    str2 = str2;
                    bool20 = bool63;
                    bool3 = bool62;
                    i = i12 | 16;
                    bool4 = bool4;
                    str11 = str31;
                    bool5 = bool61;
                    bool14 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool14);
                    bool = bool22;
                    str7 = str29;
                    bool9 = bool9;
                    str4 = str30;
                    bool17 = bool17;
                    bool15 = bool15;
                    bool16 = bool59;
                    bool21 = bool60;
                    str3 = str3;
                    str6 = str6;
                    bool8 = bool58;
                    bool18 = bool64;
                    str8 = str8;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 5:
                    Boolean bool65 = bool8;
                    Boolean bool66 = bool16;
                    String str32 = str7;
                    int i13 = i4;
                    String str33 = str12;
                    String str34 = str4;
                    Boolean bool67 = bool21;
                    Boolean bool68 = bool5;
                    String str35 = str11;
                    Boolean bool69 = bool3;
                    Boolean bool70 = bool20;
                    Boolean bool71 = bool18;
                    String str36 = str3;
                    str12 = str33;
                    int i14 = i13 | 32;
                    bool19 = bool19;
                    str2 = str2;
                    bool21 = bool67;
                    str4 = str34;
                    str11 = str35;
                    bool5 = bool68;
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    bool = bool22;
                    str7 = str32;
                    bool9 = bool9;
                    bool4 = bool4;
                    bool17 = bool17;
                    bool20 = bool70;
                    bool15 = bool15;
                    bool16 = bool66;
                    str3 = str36;
                    bool3 = bool69;
                    str6 = str6;
                    bool8 = bool65;
                    bool18 = bool71;
                    i = i14;
                    bool6 = bool6;
                    str12 = str12;
                    str9 = str9;
                    str5 = str5;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 6:
                    bool7 = bool7;
                    String str37 = str6;
                    Boolean bool72 = bool8;
                    str10 = str10;
                    Boolean bool73 = bool15;
                    Boolean bool74 = bool16;
                    Boolean bool75 = bool22;
                    String str38 = str5;
                    String str39 = str7;
                    int i15 = i4;
                    String str40 = str13;
                    Boolean bool76 = bool6;
                    String str41 = str12;
                    String str42 = str4;
                    Boolean bool77 = bool21;
                    Boolean bool78 = bool5;
                    String str43 = str11;
                    Boolean bool79 = bool3;
                    Boolean bool80 = bool20;
                    String str44 = str2;
                    Boolean bool81 = bool19;
                    bool2 = bool2;
                    Boolean bool82 = bool18;
                    String str45 = str3;
                    str13 = str40;
                    int i16 = i15 | 64;
                    bool19 = bool81;
                    str2 = str44;
                    bool21 = bool77;
                    str4 = str42;
                    str11 = str43;
                    bool5 = bool78;
                    str12 = str41;
                    bool6 = bool76;
                    str9 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str9);
                    bool11 = bool11;
                    bool = bool75;
                    str7 = str39;
                    bool9 = bool9;
                    bool4 = bool4;
                    bool17 = bool17;
                    bool20 = bool80;
                    bool15 = bool73;
                    bool16 = bool74;
                    str3 = str45;
                    bool3 = bool79;
                    str6 = str37;
                    bool8 = bool72;
                    bool18 = bool82;
                    i = i16;
                    str5 = str38;
                    str = str13;
                    str10 = str10;
                    bool7 = bool7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 7:
                    Boolean bool83 = bool7;
                    Boolean bool84 = bool16;
                    Boolean bool85 = bool22;
                    String str46 = str5;
                    String str47 = str7;
                    int i17 = i4;
                    String str48 = str13;
                    Boolean bool86 = bool6;
                    String str49 = str12;
                    String str50 = str4;
                    Boolean bool87 = bool21;
                    Boolean bool88 = bool5;
                    String str51 = str11;
                    Boolean bool89 = bool3;
                    Boolean bool90 = bool20;
                    String str52 = str3;
                    Boolean bool91 = bool17;
                    bool19 = bool19;
                    str2 = str2;
                    bool20 = bool90;
                    bool3 = bool89;
                    i = i17 | 128;
                    bool4 = bool4;
                    bool21 = bool87;
                    str4 = str50;
                    str11 = str51;
                    bool5 = bool88;
                    str12 = str49;
                    bool6 = bool86;
                    str = str48;
                    str5 = str46;
                    str10 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str10);
                    bool = bool85;
                    str7 = str47;
                    bool9 = bool9;
                    bool7 = bool83;
                    bool17 = bool91;
                    bool15 = bool15;
                    bool16 = bool84;
                    str3 = str52;
                    str6 = str6;
                    bool8 = bool8;
                    bool18 = bool18;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 8:
                    Boolean bool92 = bool7;
                    String str53 = str7;
                    int i18 = i4;
                    Boolean bool93 = bool22;
                    String str54 = str5;
                    String str55 = str13;
                    Boolean bool94 = bool6;
                    String str56 = str12;
                    String str57 = str4;
                    Boolean bool95 = bool21;
                    Boolean bool96 = bool5;
                    String str58 = str11;
                    Boolean bool97 = bool3;
                    Boolean bool98 = bool20;
                    Boolean bool99 = bool18;
                    int i19 = i18 | 256;
                    bool19 = bool19;
                    str2 = str2;
                    bool21 = bool95;
                    str4 = str57;
                    str11 = str58;
                    bool5 = bool96;
                    str12 = str56;
                    bool6 = bool94;
                    str = str55;
                    str5 = str54;
                    bool15 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool15);
                    bool = bool93;
                    str7 = str53;
                    bool9 = bool9;
                    bool4 = bool4;
                    bool7 = bool92;
                    bool17 = bool17;
                    bool20 = bool98;
                    bool16 = bool16;
                    str3 = str3;
                    bool3 = bool97;
                    bool8 = bool8;
                    bool18 = bool99;
                    i = i19;
                    str6 = str6;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 9:
                    Boolean bool100 = bool7;
                    String str59 = str6;
                    bool8 = bool8;
                    String str60 = str7;
                    int i20 = i4;
                    Boolean bool101 = bool22;
                    String str61 = str5;
                    String str62 = str13;
                    Boolean bool102 = bool6;
                    String str63 = str12;
                    String str64 = str4;
                    Boolean bool103 = bool21;
                    Boolean bool104 = bool5;
                    String str65 = str11;
                    Boolean bool105 = bool3;
                    Boolean bool106 = bool20;
                    String str66 = str2;
                    Boolean bool107 = bool19;
                    bool2 = bool2;
                    int i21 = i20 | 512;
                    bool19 = bool107;
                    str2 = str66;
                    bool21 = bool103;
                    str4 = str64;
                    str11 = str65;
                    bool5 = bool104;
                    str12 = str63;
                    bool6 = bool102;
                    str = str62;
                    str5 = str61;
                    bool16 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool16);
                    bool = bool101;
                    str7 = str60;
                    bool9 = bool9;
                    bool4 = bool4;
                    bool7 = bool100;
                    str6 = str59;
                    bool17 = bool17;
                    bool20 = bool106;
                    str3 = str3;
                    bool3 = bool105;
                    bool18 = bool18;
                    i = i21;
                    bool8 = bool8;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 10:
                    Boolean bool108 = bool7;
                    String str67 = str7;
                    int i22 = i4;
                    Boolean bool109 = bool22;
                    String str68 = str5;
                    String str69 = str13;
                    Boolean bool110 = bool6;
                    String str70 = str12;
                    String str71 = str4;
                    Boolean bool111 = bool21;
                    Boolean bool112 = bool5;
                    String str72 = str11;
                    Boolean bool113 = bool3;
                    Boolean bool114 = bool20;
                    bool19 = bool19;
                    str2 = str2;
                    bool20 = bool114;
                    bool3 = bool113;
                    i = i22 | 1024;
                    bool4 = bool4;
                    bool21 = bool111;
                    str4 = str71;
                    str11 = str72;
                    bool5 = bool112;
                    str12 = str70;
                    bool6 = bool110;
                    str = str69;
                    str5 = str68;
                    bool17 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool17);
                    bool = bool109;
                    str7 = str67;
                    bool9 = bool9;
                    str3 = str3;
                    bool7 = bool108;
                    str6 = str6;
                    bool8 = bool8;
                    bool18 = bool18;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 11:
                    int i23 = i4;
                    String str73 = str5;
                    String str74 = str13;
                    Boolean bool115 = bool6;
                    String str75 = str12;
                    String str76 = str4;
                    Boolean bool116 = bool21;
                    Boolean bool117 = bool5;
                    String str77 = str11;
                    Boolean bool118 = bool3;
                    Boolean bool119 = bool20;
                    bool19 = bool19;
                    str2 = str2;
                    bool20 = bool119;
                    bool3 = bool118;
                    i = i23 | 2048;
                    bool4 = bool4;
                    bool21 = bool116;
                    str4 = str76;
                    str11 = str77;
                    bool5 = bool117;
                    str12 = str75;
                    bool6 = bool115;
                    str = str74;
                    str5 = str73;
                    bool18 = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool18);
                    bool = bool22;
                    str7 = str7;
                    bool9 = bool9;
                    bool7 = bool7;
                    str6 = str6;
                    bool8 = bool8;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 12:
                    int i24 = i4;
                    String str78 = str5;
                    String str79 = str13;
                    Boolean bool120 = bool6;
                    String str80 = str12;
                    String str81 = str4;
                    Boolean bool121 = bool21;
                    Boolean bool122 = bool5;
                    String str82 = str11;
                    Boolean bool123 = bool3;
                    Boolean bool124 = bool20;
                    i = i24 | 4096;
                    str2 = str2;
                    bool19 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool19);
                    bool4 = bool4;
                    bool20 = bool124;
                    bool3 = bool123;
                    bool21 = bool121;
                    str4 = str81;
                    str11 = str82;
                    bool5 = bool122;
                    str12 = str80;
                    bool6 = bool120;
                    str = str79;
                    str5 = str78;
                    bool = bool22;
                    str7 = str7;
                    bool9 = bool9;
                    bool7 = bool7;
                    str6 = str6;
                    bool8 = bool8;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 13:
                    Boolean bool125 = bool7;
                    String str83 = str6;
                    String str84 = str7;
                    int i25 = i4;
                    Boolean bool126 = bool22;
                    String str85 = str5;
                    String str86 = str13;
                    Boolean bool127 = bool6;
                    String str87 = str12;
                    String str88 = str4;
                    Boolean bool128 = bool21;
                    Boolean bool129 = bool5;
                    String str89 = str11;
                    bool20 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool20);
                    bool3 = bool3;
                    i = i25 | 8192;
                    bool4 = bool4;
                    bool21 = bool128;
                    str4 = str88;
                    str11 = str89;
                    bool5 = bool129;
                    str12 = str87;
                    bool6 = bool127;
                    str = str86;
                    str5 = str85;
                    bool = bool126;
                    str7 = str84;
                    bool9 = bool9;
                    bool7 = bool125;
                    str6 = str83;
                    bool8 = bool8;
                    bool2 = bool2;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 14:
                    Boolean bool130 = bool7;
                    Boolean bool131 = bool22;
                    String str90 = str5;
                    String str91 = str13;
                    Boolean bool132 = bool6;
                    String str92 = str12;
                    String str93 = str4;
                    bool21 = bool21;
                    str4 = str93;
                    str11 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str11);
                    bool5 = bool5;
                    str12 = str92;
                    bool6 = bool132;
                    str = str91;
                    str5 = str90;
                    bool = bool131;
                    bool9 = bool9;
                    i = i4 | 16384;
                    bool20 = bool20;
                    bool7 = bool130;
                    bool8 = bool8;
                    str7 = str7;
                    str6 = str6;
                    bool2 = bool2;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 15:
                    Boolean bool133 = bool7;
                    String str94 = str7;
                    Boolean bool134 = bool22;
                    String str95 = str5;
                    String str96 = str13;
                    Boolean bool135 = bool6;
                    String str97 = str12;
                    int i26 = i4 | 32768;
                    bool21 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool21);
                    str4 = str4;
                    str12 = str97;
                    bool6 = bool135;
                    str = str96;
                    str5 = str95;
                    bool = bool134;
                    bool9 = bool9;
                    bool20 = bool20;
                    str11 = str11;
                    bool7 = bool133;
                    bool8 = bool8;
                    i = i26;
                    bool19 = bool19;
                    str7 = str94;
                    str6 = str6;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 16:
                    Boolean bool136 = bool7;
                    str6 = str6;
                    str7 = str7;
                    Boolean bool137 = bool22;
                    String str98 = str5;
                    String str99 = str13;
                    int i27 = i4 | 65536;
                    str12 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str12);
                    bool6 = bool6;
                    str = str99;
                    str5 = str98;
                    bool = bool137;
                    bool9 = bool9;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool21 = bool21;
                    bool7 = bool136;
                    bool8 = bool8;
                    bool19 = bool19;
                    str11 = str11;
                    bool2 = bool2;
                    i = i27;
                    str7 = str7;
                    str6 = str6;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 17:
                    Boolean bool138 = bool7;
                    Boolean bool139 = bool22;
                    i2 = i4 | 131072;
                    str = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str13);
                    str5 = str5;
                    bool = bool139;
                    bool9 = bool9;
                    bool7 = bool138;
                    bool8 = bool8;
                    i = i2;
                    str7 = str7;
                    str6 = str6;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 18:
                    i2 = i4 | 262144;
                    bool = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool22);
                    bool9 = bool9;
                    str = str13;
                    bool7 = bool7;
                    bool8 = bool8;
                    i = i2;
                    str7 = str7;
                    str6 = str6;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    Boolean bool140 = bool8;
                    str6 = str6;
                    str7 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str7);
                    int i28 = i4 | 524288;
                    bool9 = bool9;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool8 = bool140;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i28;
                    str6 = str6;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 20:
                    Boolean bool141 = bool8;
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool9);
                    int i29 = i4 | 1048576;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    str7 = str7;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i29;
                    bool8 = bool141;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 21:
                    str3 = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str3);
                    i3 = i4 | 2097152;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 22:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 22, sm8.f32432a, bool2);
                    i3 = i4 | 4194304;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 23:
                    str2 = (String) bldVarA.e(ugi0Var, 23, ysm0.f43175a, str2);
                    i3 = i4 | 8388608;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 24:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 24, sm8.f32432a, bool3);
                    i3 = i4 | 16777216;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 25, sm8.f32432a, bool4);
                    i3 = i4 | 33554432;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 26, sm8.f32432a, bool5);
                    i3 = i4 | 67108864;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    str4 = (String) bldVarA.e(ugi0Var, 27, ysm0.f43175a, str4);
                    i3 = i4 | 134217728;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 28, sm8.f32432a, bool6);
                    i3 = i4 | 268435456;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    str5 = (String) bldVarA.e(ugi0Var, 29, ysm0.f43175a, str5);
                    i3 = i4 | 536870912;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 30, sm8.f32432a, bool7);
                    i3 = i4 | 1073741824;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    str6 = (String) bldVarA.e(ugi0Var, 31, ysm0.f43175a, str6);
                    i3 = i4 | Integer.MIN_VALUE;
                    bool11 = bool11;
                    bool20 = bool20;
                    bool = bool22;
                    bool9 = bool9;
                    bool19 = bool19;
                    str = str13;
                    bool2 = bool2;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i3;
                    str7 = str7;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                case 32:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 32, sm8.f32432a, bool8);
                    bool = bool22;
                    str7 = str7;
                    bool9 = bool9;
                    z2 = true;
                    str = str13;
                    str12 = str12;
                    bool21 = bool21;
                    str11 = str11;
                    i = i4;
                    bool20 = bool20;
                    bool2 = bool2;
                    bool11 = bool11;
                    bool2 = bool2;
                    bool19 = bool19;
                    bool20 = bool20;
                    i4 = i;
                    str11 = str11;
                    bool21 = bool21;
                    str12 = str12;
                    str13 = str;
                    bool22 = bool;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool142 = bool7;
        String str100 = str6;
        Boolean bool143 = bool8;
        String str101 = str10;
        Boolean bool144 = bool15;
        Boolean bool145 = bool16;
        Boolean bool146 = bool19;
        String str102 = str13;
        Boolean bool147 = bool22;
        Boolean bool148 = bool2;
        Boolean bool149 = bool6;
        String str103 = str5;
        String str104 = str7;
        String str105 = str8;
        String str106 = str9;
        int i30 = i4;
        Boolean bool150 = bool21;
        String str107 = str12;
        String str108 = str4;
        Boolean bool151 = bool4;
        Boolean bool152 = bool5;
        Boolean bool153 = bool13;
        Boolean bool154 = bool14;
        Boolean bool155 = bool20;
        String str109 = str11;
        String str110 = str2;
        Boolean bool156 = bool3;
        Boolean bool157 = bool10;
        Boolean bool158 = bool12;
        Boolean bool159 = bool18;
        String str111 = str3;
        Boolean bool160 = bool17;
        Boolean bool161 = bool9;
        Boolean bool162 = bool11;
        bldVarA.c(ugi0Var);
        p8x p8xVar = new p8x();
        if ((i30 & 1) == 0) {
            r1 = 0;
            p8xVar.f26581a = null;
        } else {
            r1 = 0;
            p8xVar.f26581a = bool157;
        }
        if ((i30 & 2) == 0) {
            p8xVar.b = r1;
        } else {
            p8xVar.b = bool162;
        }
        if ((i30 & 4) == 0) {
            p8xVar.c = r1;
        } else {
            p8xVar.c = bool158;
        }
        if ((i30 & 8) == 0) {
            p8xVar.d = r1;
        } else {
            p8xVar.d = bool153;
        }
        if ((i30 & 16) == 0) {
            p8xVar.e = r1;
        } else {
            p8xVar.e = bool154;
        }
        if ((i30 & 32) == 0) {
            p8xVar.f = r1;
        } else {
            p8xVar.f = str105;
        }
        if ((i30 & 64) == 0) {
            p8xVar.g = r1;
        } else {
            p8xVar.g = str106;
        }
        if ((i30 & 128) == 0) {
            p8xVar.h = r1;
        } else {
            p8xVar.h = str101;
        }
        if ((i30 & 256) == 0) {
            p8xVar.i = r1;
        } else {
            p8xVar.i = bool144;
        }
        if ((i30 & 512) == 0) {
            p8xVar.j = r1;
        } else {
            p8xVar.j = bool145;
        }
        if ((i30 & 1024) == 0) {
            p8xVar.k = r1;
        } else {
            p8xVar.k = bool160;
        }
        if ((i30 & 2048) == 0) {
            p8xVar.l = r1;
        } else {
            p8xVar.l = bool159;
        }
        if ((i30 & 4096) == 0) {
            p8xVar.m = r1;
        } else {
            p8xVar.m = bool146;
        }
        if ((i30 & 8192) == 0) {
            p8xVar.n = r1;
        } else {
            p8xVar.n = bool155;
        }
        if ((i30 & 16384) == 0) {
            p8xVar.o = r1;
        } else {
            p8xVar.o = str109;
        }
        if ((i30 & 32768) == 0) {
            p8xVar.p = r1;
        } else {
            p8xVar.p = bool150;
        }
        if ((i30 & 65536) == 0) {
            p8xVar.q = r1;
        } else {
            p8xVar.q = str107;
        }
        if ((i30 & 131072) == 0) {
            p8xVar.r = r1;
        } else {
            p8xVar.r = str102;
        }
        if ((i30 & 262144) == 0) {
            p8xVar.s = r1;
        } else {
            p8xVar.s = bool147;
        }
        if ((i30 & 524288) == 0) {
            p8xVar.t = r1;
        } else {
            p8xVar.t = str104;
        }
        if ((i30 & 1048576) == 0) {
            p8xVar.u = r1;
        } else {
            p8xVar.u = bool161;
        }
        if ((i30 & 2097152) == 0) {
            p8xVar.v = r1;
        } else {
            p8xVar.v = str111;
        }
        if ((i30 & 4194304) == 0) {
            p8xVar.w = r1;
        } else {
            p8xVar.w = bool148;
        }
        if ((i30 & 8388608) == 0) {
            p8xVar.x = r1;
        } else {
            p8xVar.x = str110;
        }
        if ((i30 & 16777216) == 0) {
            p8xVar.y = r1;
        } else {
            p8xVar.y = bool156;
        }
        if ((i30 & 33554432) == 0) {
            p8xVar.z = r1;
        } else {
            p8xVar.z = bool151;
        }
        if ((i30 & 67108864) == 0) {
            p8xVar.A = r1;
        } else {
            p8xVar.A = bool152;
        }
        if ((i30 & 134217728) == 0) {
            p8xVar.B = r1;
        } else {
            p8xVar.B = str108;
        }
        if ((i30 & 268435456) == 0) {
            p8xVar.C = r1;
        } else {
            p8xVar.C = bool149;
        }
        if ((i30 & 536870912) == 0) {
            p8xVar.D = r1;
        } else {
            p8xVar.D = str103;
        }
        if ((i30 & 1073741824) == 0) {
            p8xVar.E = r1;
        } else {
            p8xVar.E = bool142;
        }
        if ((i30 & Integer.MIN_VALUE) == 0) {
            p8xVar.F = r1;
        } else {
            p8xVar.F = str100;
        }
        if (z2) {
            p8xVar.G = bool143;
            return p8xVar;
        }
        p8xVar.G = r1;
        return p8xVar;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p8x p8xVar = (p8x) obj;
        p8xVar.getClass();
        Boolean bool = p8xVar.G;
        String str = p8xVar.F;
        Boolean bool2 = p8xVar.E;
        String str2 = p8xVar.D;
        Boolean bool3 = p8xVar.C;
        String str3 = p8xVar.B;
        Boolean bool4 = p8xVar.A;
        Boolean bool5 = p8xVar.z;
        Boolean bool6 = p8xVar.y;
        String str4 = p8xVar.x;
        Boolean bool7 = p8xVar.w;
        String str5 = p8xVar.v;
        Boolean bool8 = p8xVar.u;
        String str6 = p8xVar.t;
        Boolean bool9 = p8xVar.s;
        String str7 = p8xVar.r;
        String str8 = p8xVar.q;
        Boolean bool10 = p8xVar.p;
        String str9 = p8xVar.o;
        Boolean bool11 = p8xVar.n;
        Boolean bool12 = p8xVar.m;
        Boolean bool13 = p8xVar.l;
        Boolean bool14 = p8xVar.k;
        Boolean bool15 = p8xVar.j;
        Boolean bool16 = p8xVar.i;
        String str10 = p8xVar.h;
        String str11 = p8xVar.g;
        String str12 = p8xVar.f;
        Boolean bool17 = p8xVar.e;
        Boolean bool18 = p8xVar.d;
        Boolean bool19 = p8xVar.c;
        Boolean bool20 = p8xVar.b;
        Boolean bool21 = p8xVar.f26581a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool21 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool21);
        }
        if (cldVarA.u(ugi0Var) || bool20 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool20);
        }
        if (cldVarA.u(ugi0Var) || bool19 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool19);
        }
        if (cldVarA.u(ugi0Var) || bool18 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool18);
        }
        if (cldVarA.u(ugi0Var) || bool17 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool17);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || bool16 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool16);
        }
        if (cldVarA.u(ugi0Var) || bool15 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool15);
        }
        if (cldVarA.u(ugi0Var) || bool14 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool14);
        }
        if (cldVarA.u(ugi0Var) || bool13 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool13);
        }
        if (cldVarA.u(ugi0Var) || bool12 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool12);
        }
        if (cldVarA.u(ugi0Var) || bool11 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool11);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || bool10 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool10);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 17, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || bool9 != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool9);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 21, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 22, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 23, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 24, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 25, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 26, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 27, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 28, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 29, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 30, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 31, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 32, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
