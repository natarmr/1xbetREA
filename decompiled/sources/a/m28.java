package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m28 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m28 f21043a;
    private static final ugi0 descriptor;

    static {
        m28 m28Var = new m28();
        f21043a = m28Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.email.BindEmailRequest.EmailDataRequest", m28Var, 1);
        zna0Var.j("Email", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new o28(i, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o28 o28Var = (o28) obj;
        o28Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, o28Var.f24520a);
        cldVarA.c(ugi0Var);
    }
}
