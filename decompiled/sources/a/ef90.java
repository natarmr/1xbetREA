package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ef90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef90 f7711a;
    private static final ugi0 descriptor;

    static {
        ef90 ef90Var = new ef90();
        f7711a = ef90Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.data.model.PeriodScoreZipResponse", ef90Var, 2);
        zna0Var.j("Key", true);
        zna0Var.j("Value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(uf90.f35567a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        wf90 wf90Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                wf90Var = (wf90) bldVarA.e(ugi0Var, 1, uf90.f35567a, wf90Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new gf90(i, num, wf90Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gf90 gf90Var = (gf90) obj;
        gf90Var.getClass();
        wf90 wf90Var = gf90Var.b;
        Integer num = gf90Var.f11198a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || wf90Var != null) {
            cldVarA.p(ugi0Var, 1, uf90.f35567a, wf90Var);
        }
        cldVarA.c(ugi0Var);
    }
}
