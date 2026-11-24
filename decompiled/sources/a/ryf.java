package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ryf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ryf f31311a;
    private static final ugi0 descriptor;

    static {
        ryf ryfVar = new ryf();
        f31311a = ryfVar;
        zna0 zna0Var = new zna0("org.xplatform.customer_io.impl.data.request.CustomerIOEventRequest", ryfVar, 4);
        zna0Var.j("delivery_id", false);
        zna0Var.j("metric", false);
        zna0Var.j("recipient", false);
        zna0Var.j("timestamp", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        long jR = 0;
        boolean z = true;
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
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new tyf(i, jR, strX, strX2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tyf tyfVar = (tyf) obj;
        tyfVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, tyfVar.f34751a);
        cldVarA.z(ugi0Var, 1, tyfVar.b);
        cldVarA.z(ugi0Var, 2, tyfVar.c);
        cldVarA.n(ugi0Var, 3, tyfVar.d);
        cldVarA.c(ugi0Var);
    }
}
