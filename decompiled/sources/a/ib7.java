package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ib7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ib7 f14472a;
    private static final ugi0 descriptor;

    static {
        ib7 ib7Var = new ib7();
        f14472a = ib7Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.core.data.model.BetInfoHistoryWithSummaryByGlobalChampWithBetTypesRequest", ib7Var, 12);
        zna0Var.j("Language", false);
        zna0Var.j("CfView", false);
        zna0Var.j("BonusUserId", false);
        zna0Var.j("Count", false);
        zna0Var.j("BetStatuses", false);
        zna0Var.j("LastBetId", true);
        zna0Var.j("CalculateSaleInfo", false);
        zna0Var.j("OnlyBetsForSale", false);
        zna0Var.j("PartnerId", true);
        zna0Var.j("CalculateSummaryInfo", false);
        zna0Var.j("GlobalChampId", false);
        zna0Var.j("BetTypes", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kb7.m;
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        s710 s710Var = s710.f31729a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{ysm0Var, okxVar, s710Var, okxVar, a8zVarArr[4].getValue(), mrv.j0(s710Var), sm8Var, sm8Var, okxVar, sm8Var, ysm0Var, a8zVarArr[11].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kb7.m;
        Object obj = null;
        List list = null;
        String strX = null;
        List list2 = null;
        String strX2 = null;
        long jR = 0;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        boolean zB = false;
        boolean zB2 = false;
        int iJ3 = 0;
        boolean zB3 = false;
        boolean z = true;
        Long l = null;
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
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ2 = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) bldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    zB = bldVarA.B(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zB2 = bldVarA.B(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    iJ3 = bldVarA.j(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    zB3 = bldVarA.B(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strX2 = bldVarA.x(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    list = (List) bldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new kb7(i, strX, iJ, jR, iJ2, list2, l, zB, zB2, iJ3, zB3, strX2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kb7 kb7Var = (kb7) obj;
        kb7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kb7.m;
        String str = kb7Var.f17998a;
        int i = kb7Var.i;
        Long l = kb7Var.f;
        cldVarA.z(ugi0Var, 0, str);
        cldVarA.i(1, kb7Var.b, ugi0Var);
        cldVarA.n(ugi0Var, 2, kb7Var.c);
        cldVarA.i(3, kb7Var.d, ugi0Var);
        cldVarA.m(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), kb7Var.e);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        cldVarA.x(ugi0Var, 6, kb7Var.g);
        cldVarA.x(ugi0Var, 7, kb7Var.h);
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(8, i, ugi0Var);
        }
        cldVarA.x(ugi0Var, 9, kb7Var.j);
        cldVarA.z(ugi0Var, 10, kb7Var.k);
        cldVarA.m(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), kb7Var.l);
        cldVarA.c(ugi0Var);
    }
}
