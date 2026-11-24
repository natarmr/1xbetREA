package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dj30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dj30 f6164a;
    private static final ugi0 descriptor;

    static {
        dj30 dj30Var = new dj30();
        f6164a = dj30Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.makebet.data.model.request.MaxBetRequest", dj30Var, 13);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("promo", false);
        zna0Var.j("Vid", false);
        zna0Var.j("Summ", false);
        zna0Var.j("Source", false);
        zna0Var.j("partner", false);
        zna0Var.j("CheckCf", false);
        zna0Var.j("Lng", false);
        zna0Var.j("Sport", false);
        zna0Var.j("Groups", false);
        zna0Var.j("Events", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = fj30.n;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710Var, s710Var, ysm0Var, mrv.j0(ysm0Var), ysm0Var, tbl.f33669a, okxVar, okxVar, okxVar, ysm0Var, s710Var, a8zVarArr[11].getValue(), a8zVarArr[12].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fj30.n;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        String str = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        double dT = 0.0d;
        boolean z = true;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    strX2 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    dT = bldVarA.t(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iJ2 = bldVarA.j(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    iJ3 = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strX3 = bldVarA.x(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    jR3 = bldVarA.r(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    list = (List) bldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    break;
                case 12:
                    list2 = (List) bldVarA.m(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i |= 4096;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new fj30(i, jR, jR2, strX, str, strX2, dT, iJ, iJ2, iJ3, strX3, jR3, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fj30 fj30Var = (fj30) obj;
        fj30Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fj30.n;
        cldVarA.n(ugi0Var, 0, fj30Var.f9617a);
        cldVarA.n(ugi0Var, 1, fj30Var.b);
        cldVarA.z(ugi0Var, 2, fj30Var.c);
        cldVarA.p(ugi0Var, 3, ysm0.f43175a, fj30Var.d);
        cldVarA.z(ugi0Var, 4, fj30Var.e);
        cldVarA.j(ugi0Var, 5, fj30Var.f);
        cldVarA.i(6, fj30Var.g, ugi0Var);
        cldVarA.i(7, fj30Var.h, ugi0Var);
        cldVarA.i(8, fj30Var.i, ugi0Var);
        cldVarA.z(ugi0Var, 9, fj30Var.j);
        cldVarA.n(ugi0Var, 10, fj30Var.k);
        cldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), fj30Var.l);
        cldVarA.m(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), fj30Var.m);
        cldVarA.c(ugi0Var);
    }
}
