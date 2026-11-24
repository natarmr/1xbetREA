package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z9v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z9v0 f44041a;
    private static final ugi0 descriptor;

    static {
        z9v0 z9v0Var = new z9v0();
        f44041a = z9v0Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_wheel.data.responses.WheelInfoResponse", z9v0Var, 7);
        zna0Var.j("SC", true);
        zna0Var.j("FB", true);
        zna0Var.j("FBC", true);
        zna0Var.j("UI", true);
        zna0Var.j("BINF", true);
        zna0Var.j("AB", true);
        zna0Var.j("BAC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) bav0.h[0].getValue());
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(q9v0.f28367a), mrv.j0(tbl.f33669a), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bav0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        s9v0 s9v0Var = null;
        Double d = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    s9v0Var = (s9v0) bldVarA.e(ugi0Var, 4, q9v0.f28367a, s9v0Var);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new bav0(i, list, l, num, num2, s9v0Var, d, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bav0 bav0Var = (bav0) obj;
        bav0Var.getClass();
        Long l = bav0Var.g;
        Double d = bav0Var.f;
        s9v0 s9v0Var = bav0Var.e;
        Integer num = bav0Var.d;
        Integer num2 = bav0Var.c;
        Long l2 = bav0Var.b;
        List list = bav0Var.f2278a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bav0.h;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || s9v0Var != null) {
            cldVarA.p(ugi0Var, 4, q9v0.f28367a, s9v0Var);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
