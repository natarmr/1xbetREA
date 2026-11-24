package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ote0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ote0 f25826a;
    private static final ugi0 descriptor;

    static {
        ote0 ote0Var = new ote0();
        f25826a = ote0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.registration.RegisterSendSmsRequest", ote0Var, 2);
        zna0Var.j("registrationGuid", false);
        zna0Var.j("Captcha", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, e6a.f7271a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        g6a g6aVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                g6aVar = (g6a) bldVarA.m(ugi0Var, 1, e6a.f7271a, g6aVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new qte0(i, strX, g6aVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qte0 qte0Var = (qte0) obj;
        qte0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, qte0Var.f29297a);
        cldVarA.m(ugi0Var, 1, e6a.f7271a, qte0Var.b);
        cldVarA.c(ugi0Var);
    }
}
