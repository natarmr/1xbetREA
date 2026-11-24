package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n1h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1h0 f22750a;
    private static final ugi0 descriptor;

    static {
        n1h0 n1h0Var = new n1h0();
        f22750a = n1h0Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.response.ScannerCouponBetInfoResponse", n1h0Var, 11);
        zna0Var.j("BetId", true);
        zna0Var.j("BetDate", true);
        zna0Var.j("Coef", true);
        zna0Var.j("CoefView", true);
        zna0Var.j("BetTypeName", true);
        zna0Var.j("UnixGameStartDate", true);
        zna0Var.j("BetSettlingDate", true);
        zna0Var.j("BetStatus", true);
        zna0Var.j("CurrencyCode", true);
        zna0Var.j("BonusUserId", true);
        zna0Var.j("Events", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = p1h0.l;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(tbl.f33669a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[10].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = p1h0.l;
        List list = null;
        Long l = null;
        String str = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Long l2 = null;
        Long l3 = null;
        Double d = null;
        String str2 = null;
        String str3 = null;
        Long l4 = null;
        Long l5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    l2 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    l3 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l3);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    l4 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l4);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    l5 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l5);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    break;
                case 10:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new p1h0(i, l2, l3, d, str2, str3, l4, l5, num, str, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p1h0 p1h0Var = (p1h0) obj;
        p1h0Var.getClass();
        List list = p1h0Var.k;
        Long l = p1h0Var.j;
        String str = p1h0Var.i;
        Integer num = p1h0Var.h;
        Long l2 = p1h0Var.g;
        Long l3 = p1h0Var.f;
        String str2 = p1h0Var.e;
        String str3 = p1h0Var.d;
        Double d = p1h0Var.c;
        Long l4 = p1h0Var.b;
        Long l5 = p1h0Var.f26202a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = p1h0.l;
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
