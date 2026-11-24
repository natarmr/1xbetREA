package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rwf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rwf0 f31215a;
    private static final ugi0 descriptor;

    static {
        rwf0 rwf0Var = new rwf0();
        f31215a = rwf0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.restore.RestoreByEmailRequest", rwf0Var, 1);
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
        return new twf0(i, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        twf0 twf0Var = (twf0) obj;
        twf0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, twf0Var.f34648a);
        cldVarA.c(ugi0Var);
    }
}
