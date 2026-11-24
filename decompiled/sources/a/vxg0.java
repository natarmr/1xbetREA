package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vxg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vxg0 f38198a;
    private static final ugi0 descriptor;

    static {
        vxg0 vxg0Var = new vxg0();
        f38198a = vxg0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.SaveCouponWithUserIdRequest", vxg0Var, 14);
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
        a8z[] a8zVarArr = xxg0.o;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710Var, ysm0Var, ysm0Var, a8zVarArr[3].getValue(), okxVar, okxVar, s710Var, okxVar, okxVar, okxVar, tbl.f33669a, sm8.f32432a, a8zVarArr[12].getValue(), a8zVarArr[13].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xxg0.o;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        int iJ5 = 0;
        boolean zB = false;
        long jR = 0;
        long jR2 = 0;
        List list = null;
        String strX = null;
        String strX2 = null;
        double dT = 0.0d;
        boolean z = true;
        List list2 = null;
        List list3 = null;
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
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    iJ = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ2 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    jR2 = bldVarA.r(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iJ3 = bldVarA.j(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    iJ4 = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iJ5 = bldVarA.j(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    dT = bldVarA.t(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    zB = bldVarA.B(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    list2 = (List) bldVarA.m(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i |= 4096;
                    break;
                case 13:
                    list3 = (List) bldVarA.m(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list3);
                    i |= 8192;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new xxg0(i, jR, strX, strX2, list, iJ, iJ2, jR2, iJ3, iJ4, iJ5, dT, zB, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xxg0 xxg0Var = (xxg0) obj;
        xxg0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xxg0.o;
        cldVarA.n(ugi0Var, 0, xxg0Var.f41657a);
        cldVarA.z(ugi0Var, 1, xxg0Var.b);
        cldVarA.z(ugi0Var, 2, xxg0Var.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), xxg0Var.d);
        cldVarA.i(4, xxg0Var.e, ugi0Var);
        cldVarA.i(5, xxg0Var.f, ugi0Var);
        cldVarA.n(ugi0Var, 6, xxg0Var.g);
        cldVarA.i(7, xxg0Var.h, ugi0Var);
        cldVarA.i(8, xxg0Var.i, ugi0Var);
        cldVarA.i(9, xxg0Var.j, ugi0Var);
        cldVarA.j(ugi0Var, 10, xxg0Var.k);
        cldVarA.x(ugi0Var, 11, xxg0Var.l);
        cldVarA.m(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), xxg0Var.m);
        cldVarA.m(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), xxg0Var.n);
        cldVarA.c(ugi0Var);
    }
}
