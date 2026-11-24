package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class npw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final npw f23931a;
    private static final ugi0 descriptor;

    static {
        npw npwVar = new npw();
        f23931a = npwVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.horses_race_menu.data.model.HorsesMenuResponse", npwVar, 2);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(lrw.f20550a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        nrw nrwVar = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                nrwVar = (nrw) bldVarA.e(ugi0Var, 0, lrw.f20550a, nrwVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ppw(i, nrwVar, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ppw ppwVar = (ppw) obj;
        ppwVar.getClass();
        Integer num = ppwVar.b;
        nrw nrwVar = ppwVar.f27391a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || nrwVar != null) {
            cldVarA.p(ugi0Var, 0, lrw.f20550a, nrwVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
