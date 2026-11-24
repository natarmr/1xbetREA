package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gof0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gof0 f11629a;
    private static final ugi0 descriptor;

    static {
        gof0 gof0Var = new gof0();
        f11629a = gof0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.security.ResetSessionRequest", gof0Var, 1);
        zna0Var.j("SessionId", false);
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
        return new iof0(i, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iof0 iof0Var = (iof0) obj;
        iof0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, iof0Var.f15115a);
        cldVarA.c(ugi0Var);
    }
}
