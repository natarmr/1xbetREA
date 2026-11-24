package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bb7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bb7 f2294a;
    private static final ugi0 descriptor;

    static {
        bb7 bb7Var = new bb7();
        f2294a = bb7Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.core.data.model.BetInfoHistoryWithSummaryByDatesWithBetTypesRequest", bb7Var, 12);
        zna0Var.j("Language", false);
        zna0Var.j("CfView", false);
        zna0Var.j("BonusUserId", false);
        zna0Var.j("DateFrom", false);
        zna0Var.j("DateTo", false);
        zna0Var.j("Count", false);
        zna0Var.j("BetStatuses", false);
        zna0Var.j("LastBetId", true);
        zna0Var.j("CalculateSaleInfo", false);
        zna0Var.j("OnlyBetsForSale", false);
        zna0Var.j("CalculateSummaryInfo", false);
        zna0Var.j("BetTypes", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = db7.m;
        okx okxVar = okx.f25427a;
        s710 s710Var = s710.f31729a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{ysm0.f43175a, okxVar, s710Var, s710Var, s710Var, okxVar, a8zVarArr[6].getValue(), mrv.j0(s710Var), sm8Var, sm8Var, sm8Var, a8zVarArr[11].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = db7.m;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        List list = null;
        boolean z = true;
        List list2 = null;
        Long l = null;
        int i = 0;
        String strX = null;
        int iJ = 0;
        int iJ2 = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jR2 = bldVarA.r(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jR3 = bldVarA.r(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ2 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) bldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l);
                    i |= 128;
                    break;
                case 8:
                    zB = bldVarA.B(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    zB2 = bldVarA.B(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    zB3 = bldVarA.B(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    list = (List) bldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new db7(i, strX, iJ, jR, jR2, jR3, iJ2, list2, l, zB, zB2, zB3, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        db7 db7Var = (db7) obj;
        db7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = db7.m;
        String str = db7Var.f5788a;
        Long l = db7Var.h;
        cldVarA.z(ugi0Var, 0, str);
        cldVarA.i(1, db7Var.b, ugi0Var);
        cldVarA.n(ugi0Var, 2, db7Var.c);
        cldVarA.n(ugi0Var, 3, db7Var.d);
        cldVarA.n(ugi0Var, 4, db7Var.e);
        cldVarA.i(5, db7Var.f, ugi0Var);
        cldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), db7Var.g);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        cldVarA.x(ugi0Var, 8, db7Var.i);
        cldVarA.x(ugi0Var, 9, db7Var.j);
        cldVarA.x(ugi0Var, 10, db7Var.k);
        cldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), db7Var.l);
        cldVarA.c(ugi0Var);
    }
}
