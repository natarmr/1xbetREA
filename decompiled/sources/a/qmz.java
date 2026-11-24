package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qmz implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qmz f29009a;
    private static final ugi0 descriptor;

    static {
        qmz qmzVar = new qmz();
        f29009a = qmzVar;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.requests.LimitActionRequest", qmzVar, 2);
        zna0Var.j("limitGroup", false);
        zna0Var.j("action", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new wmz(i, iJ, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wmz wmzVar = (wmz) obj;
        wmzVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, wmzVar.f39424a, ugi0Var);
        cldVarA.i(1, wmzVar.b, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
