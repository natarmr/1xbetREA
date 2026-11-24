package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hyo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hyo f13867a;
    private static final ugi0 descriptor;

    static {
        hyo hyoVar = new hyo();
        f13867a = hyoVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.fast_change_password.models.FastChangePasswordRequest.Data", hyoVar, 3);
        zna0Var.j("Date", false);
        zna0Var.j("NewPassword", false);
        zna0Var.j("OldPassword", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new jyo(strX, i, strX2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jyo jyoVar = (jyo) obj;
        jyoVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, jyoVar.f17369a);
        cldVarA.z(ugi0Var, 1, jyoVar.b);
        cldVarA.z(ugi0Var, 2, jyoVar.c);
        cldVarA.c(ugi0Var);
    }
}
