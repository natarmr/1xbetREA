package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rq3 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rq3 f30911a;
    private static final ugi0 descriptor;

    static {
        rq3 rq3Var = new rq3();
        f30911a = rq3Var;
        zna0 zna0Var = new zna0("org.xplatform.apple_fortune.data.models.requests.AppleFortuneRequest", rq3Var, 7);
        zna0Var.j("UI", false);
        zna0Var.j("BINF", true);
        zna0Var.j("BAC", false);
        zna0Var.j("BS", true);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        zna0Var.j("VU", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = tq3.h;
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(zf8.f44290a), mrv.j0(s710Var), mrv.j0(tbl.f33669a), mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[6].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tq3.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        bg8 bg8Var = null;
        Long l2 = null;
        Double d = null;
        Integer num = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    bg8Var = (bg8) bldVarA.e(ugi0Var, 1, zf8.f44290a, bg8Var);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    str = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str);
                    i |= 32;
                    break;
                case 6:
                    list = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new tq3(i, l, bg8Var, l2, d, num, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tq3 tq3Var = (tq3) obj;
        tq3Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tq3.h;
        s710 s710Var = s710.f31729a;
        Long l = tq3Var.f34361a;
        Double d = tq3Var.d;
        bg8 bg8Var = tq3Var.b;
        cldVarA.p(ugi0Var, 0, s710Var, l);
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 1, zf8.f44290a, bg8Var);
        }
        cldVarA.p(ugi0Var, 2, s710Var, tq3Var.c);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        cldVarA.p(ugi0Var, 4, okx.f25427a, tq3Var.e);
        cldVarA.p(ugi0Var, 5, ysm0.f43175a, tq3Var.f);
        cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), tq3Var.g);
        cldVarA.c(ugi0Var);
    }
}
