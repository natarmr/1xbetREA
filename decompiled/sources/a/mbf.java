package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mbf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mbf f21504a;
    private static final ugi0 descriptor;

    static {
        mbf mbfVar = new mbf();
        f21504a = mbfVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.game.data.models.CreateNickRequest", mbfVar, 2);
        zna0Var.j("providerId", false);
        zna0Var.j("nick", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new obf(strX, i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        obf obfVar = (obf) obj;
        obfVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, obfVar.f24975a);
        cldVarA.z(ugi0Var, 1, obfVar.b);
        cldVarA.c(ugi0Var);
    }
}
