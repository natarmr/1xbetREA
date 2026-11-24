package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w3c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3c f38495a;
    private static final ugi0 descriptor;

    static {
        w3c w3cVar = new w3c();
        f38495a = w3cVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.CheckPasswordRegistrationRequest", w3cVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{y3c.f41944a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        a4c a4cVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                a4cVar = (a4c) bldVarA.m(ugi0Var, 0, y3c.f41944a, a4cVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new b4c(i, a4cVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b4c b4cVar = (b4c) obj;
        b4cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, y3c.f41944a, b4cVar.f1951a);
        cldVarA.c(ugi0Var);
    }
}
