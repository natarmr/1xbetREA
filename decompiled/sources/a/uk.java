package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uk implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uk f35802a;
    private static final ugi0 descriptor;

    static {
        uk ukVar = new uk();
        f35802a = ukVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.phone.ActivationChangePhoneRequest.PhoneDataRequest", ukVar, 2);
        zna0Var.j("Phone", false);
        zna0Var.j("CountryId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
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
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new wk(i, iJ, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wk wkVar = (wk) obj;
        wkVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, wkVar.f39286a);
        cldVarA.i(1, wkVar.b, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
