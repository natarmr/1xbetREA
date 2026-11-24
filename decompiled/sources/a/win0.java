package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class win0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final win0 f39224a;
    private static final ugi0 descriptor;

    static {
        win0 win0Var = new win0();
        f39224a = win0Var;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.request.SupportCallbackRequest.DataRequest", win0Var, 4);
        zna0Var.j("CountryId", false);
        zna0Var.j("Phone", false);
        zna0Var.j("Comment", false);
        zna0Var.j("Type", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okxVar, ysm0Var, ysm0Var, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new yin0(strX, i, iJ, iJ2, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yin0 yin0Var = (yin0) obj;
        yin0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, yin0Var.f42702a, ugi0Var);
        cldVarA.z(ugi0Var, 1, yin0Var.b);
        cldVarA.z(ugi0Var, 2, yin0Var.c);
        cldVarA.i(3, yin0Var.d, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
