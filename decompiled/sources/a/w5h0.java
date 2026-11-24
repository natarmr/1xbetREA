package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w5h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w5h0 f38585a;
    private static final ugi0 descriptor;

    static {
        w5h0 w5h0Var = new w5h0();
        f38585a = w5h0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.bets_on_favorite.ScoresResponse", w5h0Var, 5);
        zna0Var.j("fullScore", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        zna0Var.j("timer", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(enq0.f8107a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        onq0 onq0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                onq0Var = (onq0) bldVarA.e(ugi0Var, 4, enq0.f8107a, onq0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new e6h0(i, str, str2, num, num2, onq0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e6h0 e6h0Var = (e6h0) obj;
        e6h0Var.getClass();
        onq0 onq0Var = e6h0Var.e;
        Integer num = e6h0Var.d;
        Integer num2 = e6h0Var.c;
        String str = e6h0Var.b;
        String str2 = e6h0Var.f7284a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || onq0Var != null) {
            cldVarA.p(ugi0Var, 4, enq0.f8107a, onq0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
