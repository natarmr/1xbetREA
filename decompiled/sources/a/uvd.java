package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uvd implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uvd f36343a;
    private static final ugi0 descriptor;

    static {
        uvd uvdVar = new uvd();
        f36343a = uvdVar;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.notifications.ConfirmByCodeRequest", uvdVar, 1);
        zna0Var.j("code", false);
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
        return new wvd(i, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wvd wvdVar = (wvd) obj;
        wvdVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, wvdVar.f39832a);
        cldVarA.c(ugi0Var);
    }
}
