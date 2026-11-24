package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z7d implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z7d f43913a;
    private static final ugi0 descriptor;

    static {
        z7d z7dVar = new z7d();
        f43913a = z7dVar;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.CommandDataModel", z7dVar, 2);
        zna0Var.j("$type", false);
        zna0Var.j("variantId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
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
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new b8d(i, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b8d b8dVar = (b8d) obj;
        b8dVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, b8dVar.f2150a);
        cldVarA.z(ugi0Var, 1, b8dVar.b);
        cldVarA.c(ugi0Var);
    }
}
