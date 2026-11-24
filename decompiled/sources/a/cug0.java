package a;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cug0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cug0 f4985a;
    private static final ugi0 descriptor;

    static {
        cug0 cug0Var = new cug0();
        f4985a = cug0Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.sale.SaleBetSumResponse", cug0Var, 12);
        zna0Var.j("AvailableBetSum", true);
        zna0Var.j("Balance", true);
        zna0Var.j("LimitSumPartSale", true);
        zna0Var.j("MaxSaleSum", true);
        zna0Var.j("MinSaleSum", true);
        zna0Var.j("MinAutoSaleOrder", true);
        zna0Var.j("MaxAutoSaleOrder", true);
        zna0Var.j("MinBetSum", true);
        zna0Var.j("betGUID", true);
        zna0Var.j(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, true);
        zna0Var.j("HasOrder", true);
        zna0Var.j("UserId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l = null;
        Boolean bool = null;
        Integer num = null;
        boolean z = true;
        String str = null;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
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
                    d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                    i |= 1;
                    z = z;
                    l = l;
                    break;
                case 1:
                    d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                    i |= 2;
                    z = z;
                    d = d;
                    break;
                case 2:
                    d3 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d3);
                    i |= 4;
                    z = z;
                    d = d;
                    break;
                case 3:
                    d4 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d4);
                    i |= 8;
                    z = z;
                    d = d;
                    break;
                case 4:
                    d5 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d5);
                    i |= 16;
                    z = z;
                    d = d;
                    break;
                case 5:
                    d6 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d6);
                    i |= 32;
                    z = z;
                    d = d;
                    break;
                case 6:
                    d7 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d7);
                    i |= 64;
                    z = z;
                    d = d;
                    break;
                case 7:
                    d8 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d8);
                    i |= 128;
                    z = z;
                    d = d;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    z = z;
                    d = d;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    z = z;
                    d = d;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    z = z;
                    d = d;
                    break;
                case 11:
                    l = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l);
                    i |= 2048;
                    z = z;
                    d = d;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new eug0(i, d, d2, d3, d4, d5, d6, d7, d8, str, num, bool, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eug0 eug0Var = (eug0) obj;
        eug0Var.getClass();
        Long l = eug0Var.l;
        Boolean bool = eug0Var.k;
        Integer num = eug0Var.j;
        String str = eug0Var.i;
        Double d = eug0Var.h;
        Double d2 = eug0Var.g;
        Double d3 = eug0Var.f;
        Double d4 = eug0Var.e;
        Double d5 = eug0Var.d;
        Double d6 = eug0Var.c;
        Double d7 = eug0Var.b;
        Double d8 = eug0Var.f8419a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d8 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d8);
        }
        if (cldVarA.u(ugi0Var) || d7 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d7);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num == null || num.intValue() != 0) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l == null || l.longValue() != 0) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
