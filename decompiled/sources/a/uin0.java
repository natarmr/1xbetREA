package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uin0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uin0 f35741a;
    private static final ugi0 descriptor;

    static {
        uin0 uin0Var = new uin0();
        f35741a = uin0Var;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.request.SupportCallbackRequest", uin0Var, 3);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("ImageText", false);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, win0.f39224a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        yin0 yin0Var = null;
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
                yin0Var = (yin0) bldVarA.m(ugi0Var, 2, win0.f39224a, yin0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zin0(i, strX, strX2, yin0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zin0 zin0Var = (zin0) obj;
        zin0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, zin0Var.f44449a);
        cldVarA.z(ugi0Var, 1, zin0Var.b);
        cldVarA.m(ugi0Var, 2, win0.f39224a, zin0Var.c);
        cldVarA.c(ugi0Var);
    }
}
