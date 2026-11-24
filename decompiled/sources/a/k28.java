package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k28 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k28 f17560a;
    private static final ugi0 descriptor;

    static {
        k28 k28Var = new k28();
        f17560a = k28Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.email.BindEmailRequest", k28Var, 3);
        zna0Var.j("Data", false);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("ImageText", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{m28.f21043a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        o28 o28Var = null;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                o28Var = (o28) bldVarA.m(ugi0Var, 0, m28.f21043a, o28Var);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new p28(i, o28Var, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p28 p28Var = (p28) obj;
        p28Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, m28.f21043a, p28Var.f26238a);
        cldVarA.z(ugi0Var, 1, p28Var.b);
        cldVarA.z(ugi0Var, 2, p28Var.c);
        cldVarA.c(ugi0Var);
    }
}
