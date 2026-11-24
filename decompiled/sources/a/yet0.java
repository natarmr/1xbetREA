package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yet0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yet0 f42507a;
    private static final ugi0 descriptor;

    static {
        yet0 yet0Var = new yet0();
        f42507a = yet0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.registration.UnregisterVerifyRequest", yet0Var, 2);
        zna0Var.j("unregistrationGuid", false);
        zna0Var.j("signedSecret", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
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
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new aft0(i, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        aft0 aft0Var = (aft0) obj;
        aft0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, aft0Var.f795a);
        cldVarA.z(ugi0Var, 1, aft0Var.b);
        cldVarA.c(ugi0Var);
    }
}
