package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dit0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dit0 f6152a;
    private static final ugi0 descriptor;

    static {
        dit0 dit0Var = new dit0();
        f6152a = dit0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.UpdateCouponMultiSingleRequest", dit0Var, 3);
        zna0Var.j("Coupons", false);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{fit0.d[0].getValue(), s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fit0.d;
        int i = 0;
        List list = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new fit0(i, list, jR, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fit0 fit0Var = (fit0) obj;
        fit0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) fit0.d[0].getValue(), fit0Var.f9604a);
        cldVarA.n(ugi0Var, 1, fit0Var.b);
        cldVarA.n(ugi0Var, 2, fit0Var.c);
        cldVarA.c(ugi0Var);
    }
}
