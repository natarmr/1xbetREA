package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jzn0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jzn0 f17424a;
    private static final ugi0 descriptor;

    static {
        jzn0 jzn0Var = new jzn0();
        f17424a = jzn0Var;
        zna0 zna0Var = new zna0("org.xplatform.authqr.impl.qr.data.models.SwitchQrRequest", jzn0Var, 3);
        zna0Var.j("Data", false);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("ImageText", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{gzn0.f12188a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        izn0 izn0Var = null;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                izn0Var = (izn0) bldVarA.m(ugi0Var, 0, gzn0.f12188a, izn0Var);
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
        return new lzn0(i, izn0Var, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lzn0 lzn0Var = (lzn0) obj;
        lzn0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, gzn0.f12188a, lzn0Var.f20916a);
        cldVarA.z(ugi0Var, 1, lzn0Var.b);
        cldVarA.z(ugi0Var, 2, lzn0Var.c);
        cldVarA.c(ugi0Var);
    }
}
