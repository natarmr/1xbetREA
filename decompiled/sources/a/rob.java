package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rob implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rob f30828a;
    private static final ugi0 descriptor;

    static {
        rob robVar = new rob();
        f30828a = robVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.registerbonuses.ChangeBonusRequest", robVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new tob(i, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tob tobVar = (tob) obj;
        tobVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, tobVar.f34275a, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
