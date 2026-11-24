package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ob9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ob9 f24967a;
    private static final ugi0 descriptor;

    static {
        ob9 ob9Var = new ob9();
        f24967a = ob9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderCouponGameKeyResponse", ob9Var, 3);
        zna0Var.j("GameType", true);
        zna0Var.j("Period", true);
        zna0Var.j("GameVid", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new qb9(i, num, num2, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qb9 qb9Var = (qb9) obj;
        qb9Var.getClass();
        Integer num = qb9Var.c;
        Integer num2 = qb9Var.b;
        Integer num3 = qb9Var.f28437a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
