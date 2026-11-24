package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class att implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final att f1448a;
    private static final ugi0 descriptor;

    static {
        att attVar = new att();
        f1448a = attVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.history.GetBetInfoNewHistoryByBetIdsRequest", attVar, 4);
        zna0Var.j("CfView", false);
        zna0Var.j("BonusUserId", false);
        zna0Var.j("BetIds", false);
        zna0Var.j("CalculateSaleInfo", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, mrv.j0(s710.f31729a), ctt.e[2].getValue(), sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ctt.e;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        Long l = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ctt(i, iJ, l, list, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ctt cttVar = (ctt) obj;
        cttVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ctt.e;
        cldVarA.i(0, cttVar.f4958a, ugi0Var);
        cldVarA.p(ugi0Var, 1, s710.f31729a, cttVar.b);
        cldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), cttVar.c);
        cldVarA.x(ugi0Var, 3, cttVar.d);
        cldVarA.c(ugi0Var);
    }
}
