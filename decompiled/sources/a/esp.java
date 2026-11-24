package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class esp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final esp f8340a;
    private static final ugi0 descriptor;

    static {
        esp espVar = new esp();
        f8340a = espVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.fight_statistic.data.models.FightCardResponse", espVar, 14);
        zna0Var.j("opponent", true);
        zna0Var.j("nickname", true);
        zna0Var.j("image", true);
        zna0Var.j("country", true);
        zna0Var.j("record", true);
        zna0Var.j("koTko", true);
        zna0Var.j("sub", true);
        zna0Var.j("dec", true);
        zna0Var.j("height", true);
        zna0Var.j("weight", true);
        zna0Var.j("reach", true);
        zna0Var.j("legReach", true);
        zna0Var.j("significantStrikes", true);
        zna0Var.j("grappling", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(fre.f10015a), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(juj0.f17156a), mrv.j0(ofv.f25186a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        luj0 luj0Var = null;
        String str5 = null;
        int i = 0;
        qfv qfvVar = null;
        String str6 = null;
        String str7 = null;
        lre lreVar = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = true;
        String str12 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str12;
                    z = false;
                    str3 = str3;
                    str7 = str7;
                    str12 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str12);
                    i |= 1;
                    str6 = str6;
                    str3 = str3;
                    str7 = str7;
                    str12 = str;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    str6 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str6);
                    i |= 2;
                    str7 = str7;
                    str2 = str2;
                    break;
                case 2:
                    str2 = str2;
                    str7 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str7);
                    i |= 4;
                    str6 = str6;
                    str2 = str2;
                    break;
                case 3:
                    lreVar = (lre) bldVarA.e(ugi0Var, 3, fre.f10015a, lreVar);
                    i |= 8;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 4:
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    i |= 16;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 5:
                    str9 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str9);
                    i |= 32;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 6:
                    str10 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str10);
                    i |= 64;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 7:
                    str11 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str11);
                    i |= 128;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 8:
                    str5 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str5);
                    i |= 256;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 9:
                    str4 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str4);
                    i |= 512;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 10:
                    str3 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str3);
                    i |= 1024;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 11:
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i |= 2048;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 12:
                    luj0Var = (luj0) bldVarA.e(ugi0Var, 12, juj0.f17156a, luj0Var);
                    i |= 4096;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 13:
                    qfvVar = (qfv) bldVarA.e(ugi0Var, 13, ofv.f25186a, qfvVar);
                    i |= 8192;
                    str6 = str6;
                    str7 = str7;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str13 = str2;
        String str14 = str12;
        bldVarA.c(ugi0Var);
        return new gsp(i, str14, str6, str7, lreVar, str8, str9, str10, str11, str5, str4, str3, str13, luj0Var, qfvVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gsp gspVar = (gsp) obj;
        gspVar.getClass();
        qfv qfvVar = gspVar.n;
        luj0 luj0Var = gspVar.m;
        String str = gspVar.l;
        String str2 = gspVar.k;
        String str3 = gspVar.j;
        String str4 = gspVar.i;
        String str5 = gspVar.h;
        String str6 = gspVar.g;
        String str7 = gspVar.f;
        String str8 = gspVar.e;
        lre lreVar = gspVar.d;
        String str9 = gspVar.c;
        String str10 = gspVar.b;
        String str11 = gspVar.f11840a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || lreVar != null) {
            cldVarA.p(ugi0Var, 3, fre.f10015a, lreVar);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || luj0Var != 0) {
            cldVarA.p(ugi0Var, 12, juj0.f17156a, luj0Var);
        }
        if (cldVarA.u(ugi0Var) || qfvVar != 0) {
            cldVarA.p(ugi0Var, 13, ofv.f25186a, qfvVar);
        }
        cldVarA.c(ugi0Var);
    }
}
