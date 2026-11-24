package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gqf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gqf0 f11731a;
    private static final ugi0 descriptor;

    static {
        gqf0 gqf0Var = new gqf0();
        f11731a = gqf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.request.ResidentGetWinRequest", gqf0Var, 3);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        zna0Var.j("GI", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okx.f25427a, ysm0Var, ysm0Var};
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
        return new iqf0(i, strX, iJ, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iqf0 iqf0Var = (iqf0) obj;
        iqf0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, iqf0Var.f15209a, ugi0Var);
        cldVarA.z(ugi0Var, 1, iqf0Var.b);
        cldVarA.z(ugi0Var, 2, iqf0Var.c);
        cldVarA.c(ugi0Var);
    }
}
