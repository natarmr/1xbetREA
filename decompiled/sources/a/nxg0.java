package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nxg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nxg0 f24283a;
    private static final ugi0 descriptor;

    static {
        nxg0 nxg0Var = new nxg0();
        f24283a = nxg0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.SaveBetsRequest", nxg0Var, 15);
        zna0Var.j("BetId", false);
        zna0Var.j("UserId", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Lng", false);
        zna0Var.j("Events", false);
        zna0Var.j("partner", false);
        zna0Var.j("Source", false);
        zna0Var.j("expressNum", false);
        zna0Var.j("Vid", false);
        zna0Var.j("CfView", false);
        zna0Var.j("CheckCf", false);
        zna0Var.j("AntiExpressCoef", false);
        zna0Var.j("WithLobby", false);
        zna0Var.j("EventsIndexes", false);
        zna0Var.j("MinBetSystems", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pxg0.p;
        ysm0 ysm0Var = ysm0.f43175a;
        s710 s710Var = s710.f31729a;
        okx okxVar = okx.f25427a;
        return new jiy[]{ysm0Var, s710Var, ysm0Var, ysm0Var, a8zVarArr[4].getValue(), okxVar, okxVar, s710Var, okxVar, okxVar, okxVar, tbl.f33669a, sm8.f32432a, a8zVarArr[13].getValue(), a8zVarArr[14].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pxg0.p;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        boolean zB = false;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        long jR = 0;
        long jR2 = 0;
        double dT = 0.0d;
        boolean z = true;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX3 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    iJ = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ2 = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jR2 = bldVarA.r(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    iJ3 = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iJ4 = bldVarA.j(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iJ5 = bldVarA.j(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    dT = bldVarA.t(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    zB = bldVarA.B(ugi0Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    list2 = (List) bldVarA.m(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
                    i |= 8192;
                    break;
                case 14:
                    list3 = (List) bldVarA.m(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list3);
                    i |= 16384;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new pxg0(i, strX, jR, strX2, strX3, list, iJ, iJ2, jR2, iJ3, iJ4, iJ5, dT, zB, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pxg0 pxg0Var = (pxg0) obj;
        pxg0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pxg0.p;
        cldVarA.z(ugi0Var, 0, pxg0Var.f27752a);
        cldVarA.n(ugi0Var, 1, pxg0Var.b);
        cldVarA.z(ugi0Var, 2, pxg0Var.c);
        cldVarA.z(ugi0Var, 3, pxg0Var.d);
        cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), pxg0Var.e);
        cldVarA.i(5, pxg0Var.f, ugi0Var);
        cldVarA.i(6, pxg0Var.g, ugi0Var);
        cldVarA.n(ugi0Var, 7, pxg0Var.h);
        cldVarA.i(8, pxg0Var.i, ugi0Var);
        cldVarA.i(9, pxg0Var.j, ugi0Var);
        cldVarA.i(10, pxg0Var.k, ugi0Var);
        cldVarA.j(ugi0Var, 11, pxg0Var.l);
        cldVarA.x(ugi0Var, 12, pxg0Var.m);
        cldVarA.m(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), pxg0Var.n);
        cldVarA.m(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), pxg0Var.o);
        cldVarA.c(ugi0Var);
    }
}
