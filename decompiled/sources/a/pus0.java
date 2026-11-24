package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pus0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pus0 f27633a;
    private static final ugi0 descriptor;

    static {
        pus0 pus0Var = new pus0();
        f27633a = pus0Var;
        zna0 zna0Var = new zna0("org.xplatform.auth.process.impl.data.models.TwoFactorAnswerRequest", pus0Var, 3);
        zna0Var.j("Answer", false);
        zna0Var.j("Token", false);
        zna0Var.j("Language", false);
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
        return new rus0(strX, i, strX2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rus0 rus0Var = (rus0) obj;
        rus0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, rus0Var.f31141a);
        cldVarA.z(ugi0Var, 1, rus0Var.b);
        cldVarA.z(ugi0Var, 2, rus0Var.c);
        cldVarA.c(ugi0Var);
    }
}
