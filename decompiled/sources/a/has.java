package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class has implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final has f12739a;
    private static final ugi0 descriptor;

    static {
        has hasVar = new has();
        f12739a = hasVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.game_events.data.model.GameEventKabaddiInfoResponse", hasVar, 1);
        zna0Var.j("isImportant", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new jas(i, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jas jasVar = (jas) obj;
        jasVar.getClass();
        Boolean bool = jasVar.f16206a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
