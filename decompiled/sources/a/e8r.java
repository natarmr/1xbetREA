package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e8r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8r f7387a;
    private static final ugi0 descriptor;

    static {
        e8r e8rVar = new e8r();
        f7387a = e8rVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.daily_tasks.impl.data.model.FreeSpinsPrizeResponse", e8rVar, 3);
        zna0Var.j("game", true);
        zna0Var.j("product", true);
        zna0Var.j("count", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(mxb0.f22546a), mrv.j0(ozb0.f26096a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        oxb0 oxb0Var = null;
        szb0 szb0Var = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                oxb0Var = (oxb0) bldVarA.e(ugi0Var, 0, mxb0.f22546a, oxb0Var);
                i |= 1;
            } else if (iF == 1) {
                szb0Var = (szb0) bldVarA.e(ugi0Var, 1, ozb0.f26096a, szb0Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new g8r(i, oxb0Var, szb0Var, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g8r g8rVar = (g8r) obj;
        g8rVar.getClass();
        Integer num = g8rVar.c;
        szb0 szb0Var = g8rVar.b;
        oxb0 oxb0Var = g8rVar.f10880a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || oxb0Var != null) {
            cldVarA.p(ugi0Var, 0, mxb0.f22546a, oxb0Var);
        }
        if (cldVarA.u(ugi0Var) || szb0Var != null) {
            cldVarA.p(ugi0Var, 1, ozb0.f26096a, szb0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
