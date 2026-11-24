package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bn50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn50 f2866a;
    private static final ugi0 descriptor;

    static {
        bn50 bn50Var = new bn50();
        f2866a = bn50Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.NewPlaceAuthRequest.RequestPayload", bn50Var, 1);
        zna0Var.j("UserId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new dn50(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dn50 dn50Var = (dn50) obj;
        dn50Var.getClass();
        String str = dn50Var.f6352a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
