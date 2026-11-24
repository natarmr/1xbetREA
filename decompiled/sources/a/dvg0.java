package a;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dvg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dvg0 f6742a;
    private static final ugi0 descriptor;

    static {
        dvg0 dvg0Var = new dvg0();
        f6742a = dvg0Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.core.data.models.response.SaleInfoResponse", dvg0Var, 12);
        zna0Var.j("AvailableBetSum", true);
        zna0Var.j("ElevateInfo", true);
        zna0Var.j("Balance", true);
        zna0Var.j("HasOrder", true);
        zna0Var.j("LimitSumPartSale", true);
        zna0Var.j("MaxAutoSaleOrder", true);
        zna0Var.j("MaxSaleSum", true);
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
        return new jiy[]{mrv.j0(tblVar), mrv.j0(vrn.f37907a), mrv.j0(tblVar), mrv.j0(sm8.f32432a), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l = null;
        String str = null;
        Double d = null;
        boolean z = true;
        Double d2 = null;
        int i = 0;
        Double d3 = null;
        zrn zrnVar = null;
        Double d4 = null;
        Boolean bool = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    l = l;
                    break;
                case 0:
                    d3 = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d3);
                    i |= 1;
                    z = z;
                    l = l;
                    break;
                case 1:
                    zrnVar = (zrn) bldVarA.e(ugi0Var, 1, vrn.f37907a, zrnVar);
                    i |= 2;
                    z = z;
                    d3 = d3;
                    break;
                case 2:
                    d4 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d4);
                    i |= 4;
                    z = z;
                    d3 = d3;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    z = z;
                    d3 = d3;
                    break;
                case 4:
                    d5 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d5);
                    i |= 16;
                    z = z;
                    d3 = d3;
                    break;
                case 5:
                    d6 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d6);
                    i |= 32;
                    z = z;
                    d3 = d3;
                    break;
                case 6:
                    d7 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d7);
                    i |= 64;
                    z = z;
                    d3 = d3;
                    break;
                case 7:
                    d8 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d8);
                    i |= 128;
                    z = z;
                    d3 = d3;
                    break;
                case 8:
                    d2 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d2);
                    i |= 256;
                    z = z;
                    d3 = d3;
                    break;
                case 9:
                    d = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d);
                    i |= 512;
                    z = z;
                    d3 = d3;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    z = z;
                    d3 = d3;
                    break;
                case 11:
                    l = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l);
                    i |= 2048;
                    z = z;
                    d3 = d3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new hvg0(i, d3, zrnVar, d4, bool, d5, d6, d7, d8, d2, d, str, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hvg0 hvg0Var = (hvg0) obj;
        hvg0Var.getClass();
        Long l = hvg0Var.l;
        String str = hvg0Var.k;
        Double d = hvg0Var.j;
        Double d2 = hvg0Var.i;
        Double d3 = hvg0Var.h;
        Double d4 = hvg0Var.g;
        Double d5 = hvg0Var.f;
        Double d6 = hvg0Var.e;
        Boolean bool = hvg0Var.d;
        Double d7 = hvg0Var.c;
        zrn zrnVar = hvg0Var.b;
        Double d8 = hvg0Var.f13725a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d8 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d8);
        }
        if (cldVarA.u(ugi0Var) || zrnVar != null) {
            cldVarA.p(ugi0Var, 1, vrn.f37907a, zrnVar);
        }
        if (cldVarA.u(ugi0Var) || d7 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d7);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
