package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wff0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wff0 f39068a;
    private static final ugi0 descriptor;

    static {
        wff0 wff0Var = new wff0();
        f39068a = wff0Var;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.RemoteConfigResponse", wff0Var, 1);
        zna0Var.j("configKeys", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(xrd.f41364a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        wrd wrdVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                wrdVar = (wrd) bldVarA.e(ugi0Var, 0, xrd.f41364a, wrdVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new yff0(i, wrdVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yff0 yff0Var = (yff0) obj;
        yff0Var.getClass();
        wrd wrdVar = yff0Var.f42540a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || wrdVar != null) {
            cldVarA.p(ugi0Var, 0, xrd.f41364a, wrdVar);
        }
        cldVarA.c(ugi0Var);
    }
}
