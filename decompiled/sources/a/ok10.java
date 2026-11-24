package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ok10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ok10 f25385a;
    private static final ugi0 descriptor;

    static {
        ok10 ok10Var = new ok10();
        f25385a = ok10Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.LuckyWheelBonus", ok10Var, 7);
        zna0Var.j("BNTID", true);
        byte b = 23;
        zna0Var.k(new iy(new String[]{"BT", "BNTP"}, b));
        zna0Var.j("BNC", true);
        zna0Var.k(new iy(new String[]{"BC"}, b));
        zna0Var.j("GID", true);
        zna0Var.j(TokenNames.E, true);
        zna0Var.j("CNT", true);
        zna0Var.j("TLM", true);
        zna0Var.j("FBSE", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(vk10.f37554a);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, s710Var, mrv.j0(ee8.f7658a), s710Var, mrv.j0(s710Var), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        Double d = null;
        uk10 uk10Var = null;
        String str = null;
        de8 de8Var = null;
        long jR = 0;
        long jR2 = 0;
        int i = 0;
        boolean z = true;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    uk10Var = (uk10) bldVarA.e(ugi0Var, 0, vk10.f37554a, uk10Var);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    jR = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    de8Var = (de8) bldVarA.e(ugi0Var, 3, ee8.f7658a, de8Var);
                    i |= 8;
                    break;
                case 4:
                    jR2 = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    d = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new rk10(i, uk10Var, str, jR, de8Var, jR2, l, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rk10 rk10Var = (rk10) obj;
        rk10Var.getClass();
        Double d = rk10Var.g;
        Long l = rk10Var.f;
        long j = rk10Var.e;
        de8 de8Var = rk10Var.d;
        long j2 = rk10Var.c;
        String str = rk10Var.b;
        uk10 uk10Var = rk10Var.f30625a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || uk10Var != null) {
            cldVarA.p(ugi0Var, 0, vk10.f37554a, uk10Var);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str, "")) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || j2 != 0) {
            cldVarA.n(ugi0Var, 2, j2);
        }
        if (cldVarA.u(ugi0Var) || de8Var != null) {
            cldVarA.p(ugi0Var, 3, ee8.f7658a, de8Var);
        }
        if (cldVarA.u(ugi0Var) || j != 0) {
            cldVarA.n(ugi0Var, 4, j);
        }
        if (cldVarA.u(ugi0Var) || l == null || l.longValue() != 0) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
