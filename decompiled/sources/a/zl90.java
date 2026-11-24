package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zl90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zl90 f44570a;
    private static final ugi0 descriptor;

    static {
        zl90 zl90Var = new zl90();
        f44570a = zl90Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.phone.PhoneMask", zl90Var, 4);
        zna0Var.j("countryId", false);
        zna0Var.j("minLength", false);
        zna0Var.j("maxLength", false);
        zna0Var.j("mask", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar, okxVar, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ3 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new cm90(i, iJ, iJ2, iJ3, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cm90 cm90Var = (cm90) obj;
        cm90Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, cm90Var.f4593a, ugi0Var);
        cldVarA.i(1, cm90Var.b, ugi0Var);
        cldVarA.i(2, cm90Var.c, ugi0Var);
        cldVarA.z(ugi0Var, 3, cm90Var.d);
        cldVarA.c(ugi0Var);
    }
}
