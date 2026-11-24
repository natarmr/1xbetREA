package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k16 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k16 f17504a;
    private static final ugi0 descriptor;

    static {
        k16 k16Var = new k16();
        f17504a = k16Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.BaseRequest", k16Var, 2);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new m16(i, iJ, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m16 m16Var = (m16) obj;
        m16Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, m16Var.f20990a);
        cldVarA.i(1, m16Var.b, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
