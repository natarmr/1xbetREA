package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nkq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nkq0 f23693a;
    private static final ugi0 descriptor;

    static {
        nkq0 nkq0Var = new nkq0();
        f23693a = nkq0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.requests.TimeLimitsValue", nkq0Var, 3);
        zna0Var.j("limitValue", false);
        zna0Var.j("limitType", false);
        zna0Var.j("limitMeasure", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new tkq0(i, iJ, iJ2, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tkq0 tkq0Var = (tkq0) obj;
        tkq0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, tkq0Var.f34109a, ugi0Var);
        cldVarA.i(1, tkq0Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, tkq0Var.c);
        cldVarA.c(ugi0Var);
    }
}
