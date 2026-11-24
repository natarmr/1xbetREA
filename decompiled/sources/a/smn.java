package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class smn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final smn f32455a;
    private static final ugi0 descriptor;

    static {
        smn smnVar = new smn();
        f32455a = smnVar;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.edit_coupon.data.model.EditCouponRequest", smnVar, 3);
        zna0Var.j("CfView", false);
        zna0Var.j("BonusUserId", false);
        zna0Var.j("BetIds", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, mrv.j0(s710.f31729a), umn.d[2].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = umn.d;
        boolean z = true;
        int i = 0;
        int iJ = 0;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new umn(i, iJ, l, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        umn umnVar = (umn) obj;
        umnVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = umn.d;
        cldVarA.i(0, umnVar.f35925a, ugi0Var);
        cldVarA.p(ugi0Var, 1, s710.f31729a, umnVar.b);
        cldVarA.m(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), umnVar.c);
        cldVarA.c(ugi0Var);
    }
}
