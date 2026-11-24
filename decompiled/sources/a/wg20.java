package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wg20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wg20 f39092a;
    private static final ugi0 descriptor;

    static {
        wg20 wg20Var = new wg20();
        f39092a = wg20Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.MakeBetViaConstructorRequest", wg20Var, 17);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("ApprovedBet", false);
        zna0Var.j("promo", false);
        zna0Var.j("Vid", false);
        zna0Var.j("Summ", false);
        zna0Var.j("Source", false);
        zna0Var.j("partner", false);
        zna0Var.j("CheckCf", false);
        zna0Var.j("CfView", false);
        zna0Var.j("Lng", false);
        zna0Var.j("Sport", false);
        zna0Var.j("IsNewAlterBuilder", true);
        zna0Var.j("Groups", false);
        zna0Var.j("Events", false);
        zna0Var.j("OneClickBet", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = yg20.r;
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710Var, s710Var, ysm0Var, sm8Var, mrv.j0(ysm0Var), ysm0Var, tbl.f33669a, okxVar, okxVar, okxVar, okxVar, ysm0Var, s710Var, sm8Var, a8zVarArr[14].getValue(), a8zVarArr[15].getValue(), okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = yg20.r;
        Object obj = null;
        int i = 0;
        boolean zB = false;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        int iJ4 = 0;
        boolean zB2 = false;
        int iJ5 = 0;
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
                    zB = bldVarA.B(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    strX2 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    dT = bldVarA.t(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iJ = bldVarA.j(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    iJ2 = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iJ3 = bldVarA.j(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iJ4 = bldVarA.j(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strX3 = bldVarA.x(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    jR3 = bldVarA.r(ugi0Var, 12);
                    i |= 4096;
                    break;
                case 13:
                    zB2 = bldVarA.B(ugi0Var, 13);
                    i |= 8192;
                    break;
                case 14:
                    list = (List) bldVarA.m(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
                    i |= 16384;
                    break;
                case 15:
                    list2 = (List) bldVarA.m(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list2);
                    i |= 32768;
                    break;
                case 16:
                    iJ5 = bldVarA.j(ugi0Var, 16);
                    i |= 65536;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new yg20(i, jR, jR2, strX, zB, str, strX2, dT, iJ, iJ2, iJ3, iJ4, strX3, jR3, zB2, list, list2, iJ5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yg20 yg20Var = (yg20) obj;
        yg20Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = yg20.r;
        long j = yg20Var.f42566a;
        boolean z = yg20Var.n;
        cldVarA.n(ugi0Var, 0, j);
        cldVarA.n(ugi0Var, 1, yg20Var.b);
        cldVarA.z(ugi0Var, 2, yg20Var.c);
        cldVarA.x(ugi0Var, 3, yg20Var.d);
        cldVarA.p(ugi0Var, 4, ysm0.f43175a, yg20Var.e);
        cldVarA.z(ugi0Var, 5, yg20Var.f);
        cldVarA.j(ugi0Var, 6, yg20Var.g);
        cldVarA.i(7, yg20Var.h, ugi0Var);
        cldVarA.i(8, yg20Var.i, ugi0Var);
        cldVarA.i(9, yg20Var.j, ugi0Var);
        cldVarA.i(10, yg20Var.k, ugi0Var);
        cldVarA.z(ugi0Var, 11, yg20Var.l);
        cldVarA.n(ugi0Var, 12, yg20Var.m);
        if (cldVarA.u(ugi0Var) || !z) {
            cldVarA.x(ugi0Var, 13, z);
        }
        cldVarA.m(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), yg20Var.o);
        cldVarA.m(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), yg20Var.p);
        cldVarA.i(16, yg20Var.q, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
