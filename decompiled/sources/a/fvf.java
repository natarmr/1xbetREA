package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fvf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fvf f10212a;
    private static final ugi0 descriptor;

    static {
        fvf fvfVar = new fvf();
        f10212a = fvfVar;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.CurrencyResponse", fvfVar, 14);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("code", true);
        zna0Var.j("currencyName", true);
        zna0Var.j("top", true);
        zna0Var.j("baseRate", true);
        zna0Var.j("symbol", true);
        zna0Var.j("minOutDeposit", true);
        zna0Var.j("minOutElectronDeposit", true);
        zna0Var.j("minSumBets", true);
        zna0Var.j("round", true);
        zna0Var.j("hide", true);
        zna0Var.j("crypto", true);
        zna0Var.j("initialBet", true);
        zna0Var.j("betStep", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(okx.f25427a), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(tblVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Double d = null;
        Double d2 = null;
        int i = 0;
        Double d3 = null;
        String str = null;
        String str2 = null;
        Boolean bool3 = null;
        Double d4 = null;
        String str3 = null;
        Double d5 = null;
        Double d6 = null;
        boolean z = true;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l2;
                    z = false;
                    bool2 = bool2;
                    str2 = str2;
                    l2 = l;
                    bool = bool;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i |= 1;
                    str = str;
                    bool2 = bool2;
                    str2 = str2;
                    l2 = l;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    str2 = str2;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    str = str;
                    bool = bool;
                    break;
                case 3:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool3);
                    i |= 8;
                    str = str;
                    str2 = str2;
                    break;
                case 4:
                    d4 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d4);
                    i |= 16;
                    str = str;
                    str2 = str2;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    str = str;
                    str2 = str2;
                    break;
                case 6:
                    d5 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d5);
                    i |= 64;
                    str = str;
                    str2 = str2;
                    break;
                case 7:
                    d6 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d6);
                    i |= 128;
                    str = str;
                    str2 = str2;
                    break;
                case 8:
                    d2 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d2);
                    i |= 256;
                    str = str;
                    str2 = str2;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    str = str;
                    str2 = str2;
                    break;
                case 10:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool2);
                    i |= 1024;
                    str = str;
                    str2 = str2;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    str = str;
                    str2 = str2;
                    break;
                case 12:
                    d = (Double) bldVarA.e(ugi0Var, 12, tbl.f33669a, d);
                    i |= 4096;
                    str = str;
                    str2 = str2;
                    break;
                case 13:
                    d3 = (Double) bldVarA.e(ugi0Var, 13, tbl.f33669a, d3);
                    i |= 8192;
                    str = str;
                    str2 = str2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool4 = bool;
        Long l3 = l2;
        bldVarA.c(ugi0Var);
        return new jvf(i, l3, str, str2, bool3, d4, str3, d5, d6, d2, num, bool2, bool4, d, d3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jvf jvfVar = (jvf) obj;
        jvfVar.getClass();
        Double d = jvfVar.n;
        Double d2 = jvfVar.m;
        Boolean bool = jvfVar.l;
        Boolean bool2 = jvfVar.k;
        Integer num = jvfVar.j;
        Double d3 = jvfVar.i;
        Double d4 = jvfVar.h;
        Double d5 = jvfVar.g;
        String str = jvfVar.f;
        Double d6 = jvfVar.e;
        Boolean bool3 = jvfVar.d;
        String str2 = jvfVar.c;
        String str3 = jvfVar.b;
        Long l = jvfVar.f17201a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || d2 != 0) {
            cldVarA.p(ugi0Var, 12, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != 0) {
            cldVarA.p(ugi0Var, 13, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
