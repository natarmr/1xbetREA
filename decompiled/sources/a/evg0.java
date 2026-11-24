package a;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class evg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evg0 f8466a;
    private static final ugi0 descriptor;

    static {
        evg0 evg0Var = new evg0();
        f8466a = evg0Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.bethistory.SaleInfoResponse", evg0Var, 13);
        zna0Var.j("AvailableBetSum", true);
        zna0Var.j("ElevateInfo", true);
        zna0Var.j("Balance", true);
        zna0Var.j("HasOrder", true);
        zna0Var.j("LimitSumPartSale", true);
        zna0Var.j("MaxAutoSaleOrder", true);
        zna0Var.j("MaxSaleSum", true);
        zna0Var.j("PartSaleLimitSum", true);
        zna0Var.j("MinAutoSaleOrder", true);
        zna0Var.j("MinBetSum", true);
        zna0Var.j("MinSaleSum", true);
        zna0Var.j("betGUID", true);
        zna0Var.j(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(wrn.f39651a), mrv.j0(tblVar), mrv.j0(sm8.f32432a), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        Double d = null;
        Double d2 = null;
        Long l = null;
        Double d3 = null;
        int i = 0;
        Double d4 = null;
        asn asnVar = null;
        Double d5 = null;
        Boolean bool = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    d = d;
                    str = str;
                    break;
                case 0:
                    d4 = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d4);
                    i |= 1;
                    d = d;
                    str = str;
                    break;
                case 1:
                    str = str;
                    asnVar = (asn) bldVarA.e(ugi0Var, 1, wrn.f39651a, asnVar);
                    i |= 2;
                    d4 = d4;
                    str = str;
                    break;
                case 2:
                    d5 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d5);
                    i |= 4;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 4:
                    d6 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d6);
                    i |= 16;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 5:
                    d7 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d7);
                    i |= 32;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 6:
                    d8 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d8);
                    i |= 64;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 7:
                    d9 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d9);
                    i |= 128;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 8:
                    d3 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d3);
                    i |= 256;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 9:
                    d2 = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d2);
                    i |= 512;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 10:
                    d = (Double) bldVarA.e(ugi0Var, 10, tbl.f33669a, d);
                    i |= 1024;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                case 12:
                    l = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l);
                    i |= 4096;
                    d4 = d4;
                    asnVar = asnVar;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Double d10 = d;
        bldVarA.c(ugi0Var);
        return new ivg0(i, d4, asnVar, d5, bool, d6, d7, d8, d9, d3, d2, d10, str, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ivg0 ivg0Var = (ivg0) obj;
        ivg0Var.getClass();
        Long l = ivg0Var.m;
        String str = ivg0Var.l;
        Double d = ivg0Var.k;
        Double d2 = ivg0Var.j;
        Double d3 = ivg0Var.i;
        Double d4 = ivg0Var.h;
        Double d5 = ivg0Var.g;
        Double d6 = ivg0Var.f;
        Double d7 = ivg0Var.e;
        Boolean bool = ivg0Var.d;
        Double d8 = ivg0Var.c;
        asn asnVar = ivg0Var.b;
        Double d9 = ivg0Var.f15445a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d9 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d9);
        }
        if (cldVarA.u(ugi0Var) || asnVar != null) {
            cldVarA.p(ugi0Var, 1, wrn.f39651a, asnVar);
        }
        if (cldVarA.u(ugi0Var) || d8 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d8);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || d7 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d7);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d6);
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
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 10, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
