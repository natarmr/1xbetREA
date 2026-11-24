package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zxs implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zxs f45176a;
    private static final ugi0 descriptor;

    static {
        zxs zxsVar = new zxs();
        f45176a = zxsVar;
        zna0 zna0Var = new zna0("org.xplatform.game_broadcasting.impl.data.model.GameVideoUrlRequest", zxsVar, 5);
        zna0Var.j("AppVer", false);
        zna0Var.j("OS", false);
        zna0Var.j("VideoId", false);
        zna0Var.j("Language", false);
        zna0Var.j("AppId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
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
            } else if (iF == 2) {
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                strX4 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new bys(i, iJ, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bys bysVar = (bys) obj;
        bysVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, bysVar.f3434a);
        cldVarA.z(ugi0Var, 1, bysVar.b);
        cldVarA.z(ugi0Var, 2, bysVar.c);
        cldVarA.z(ugi0Var, 3, bysVar.d);
        cldVarA.i(4, bysVar.e, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
