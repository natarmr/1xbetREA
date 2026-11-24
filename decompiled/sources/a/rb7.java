package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rb7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rb7 f30169a;
    private static final ugi0 descriptor;

    static {
        rb7 rb7Var = new rb7();
        f30169a = rb7Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.edit_coupon.data.model.BetInfoResponse", rb7Var, 14);
        zna0Var.j("BetDate", true);
        zna0Var.j("BetId", true);
        zna0Var.j("BetStatus", true);
        zna0Var.j("BetSum", true);
        zna0Var.j("BetSystemType", true);
        zna0Var.j("BetTypeId", true);
        zna0Var.j("BetTypeName", true);
        zna0Var.j("Coef", true);
        zna0Var.j("CoefView", true);
        zna0Var.j("CurrencyCode", true);
        zna0Var.j("Events", true);
        zna0Var.j("PossiblePayoutSum", true);
        zna0Var.j("PossibleWinSum", true);
        zna0Var.j("UnixGameStartDate", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = tb7.o;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tb7.o;
        Double d = null;
        List list = null;
        String str = null;
        String str2 = null;
        Double d2 = null;
        Double d3 = null;
        int i = 0;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        Double d4 = null;
        Integer num4 = null;
        Long l2 = null;
        String str3 = null;
        boolean z = true;
        Integer num5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num5;
                    z = false;
                    list = list;
                    num3 = num3;
                    num5 = num;
                    d = d;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num5);
                    i |= 1;
                    l = l;
                    list = list;
                    num3 = num3;
                    num5 = num;
                    d = d;
                    break;
                case 1:
                    d = d;
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    num3 = num3;
                    d = d;
                    break;
                case 2:
                    d = d;
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    l = l;
                    d = d;
                    break;
                case 3:
                    d4 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d4);
                    i |= 8;
                    l = l;
                    num3 = num3;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    l = l;
                    num3 = num3;
                    break;
                case 5:
                    l2 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l2);
                    i |= 32;
                    l = l;
                    num3 = num3;
                    break;
                case 6:
                    str3 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str3);
                    i |= 64;
                    l = l;
                    num3 = num3;
                    break;
                case 7:
                    d3 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d3);
                    i |= 128;
                    l = l;
                    num3 = num3;
                    break;
                case 8:
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    l = l;
                    num3 = num3;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    l = l;
                    num3 = num3;
                    break;
                case 10:
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    l = l;
                    num3 = num3;
                    break;
                case 11:
                    d = (Double) bldVarA.e(ugi0Var, 11, tbl.f33669a, d);
                    i |= 2048;
                    l = l;
                    num3 = num3;
                    break;
                case 12:
                    d2 = (Double) bldVarA.e(ugi0Var, 12, tbl.f33669a, d2);
                    i |= 4096;
                    l = l;
                    num3 = num3;
                    break;
                case 13:
                    num2 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num2);
                    i |= 8192;
                    l = l;
                    num3 = num3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Double d5 = d;
        Integer num6 = num5;
        bldVarA.c(ugi0Var);
        return new tb7(i, num6, l, num3, d4, num4, l2, str3, d3, str2, str, list, d5, d2, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tb7 tb7Var = (tb7) obj;
        tb7Var.getClass();
        Integer num = tb7Var.n;
        Double d = tb7Var.m;
        Double d2 = tb7Var.l;
        List list = tb7Var.k;
        String str = tb7Var.j;
        String str2 = tb7Var.i;
        Double d3 = tb7Var.h;
        String str3 = tb7Var.g;
        Long l = tb7Var.f;
        Integer num2 = tb7Var.e;
        Double d4 = tb7Var.d;
        Integer num3 = tb7Var.c;
        Long l2 = tb7Var.b;
        Integer num4 = tb7Var.f33648a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tb7.o;
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 11, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != 0) {
            cldVarA.p(ugi0Var, 12, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
