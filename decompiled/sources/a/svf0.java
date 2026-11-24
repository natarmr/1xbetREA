package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class svf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final svf0 f32863a;
    private static final ugi0 descriptor;

    static {
        svf0 svf0Var = new svf0();
        f32863a = svf0Var;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.response.rules.ResponsibleRulesMainResponse", svf0Var, 1);
        zna0Var.j("main", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(pvf0.f27661a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        rvf0 rvf0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                rvf0Var = (rvf0) bldVarA.e(ugi0Var, 0, pvf0.f27661a, rvf0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new uvf0(i, rvf0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uvf0 uvf0Var = (uvf0) obj;
        uvf0Var.getClass();
        rvf0 rvf0Var = uvf0Var.f36347a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || rvf0Var != null) {
            cldVarA.p(ugi0Var, 0, pvf0.f27661a, rvf0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
