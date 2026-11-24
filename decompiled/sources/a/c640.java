package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c640 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c640 f3802a;
    private static final ugi0 descriptor;

    static {
        c640 c640Var = new c640();
        f3802a = c640Var;
        zna0 zna0Var = new zna0("org.xplatform.messages.data.models.MessageReadResponse", c640Var, 1);
        zna0Var.j("result", true);
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
        return new e640(i, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e640 e640Var = (e640) obj;
        e640Var.getClass();
        Boolean bool = e640Var.f7263a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
