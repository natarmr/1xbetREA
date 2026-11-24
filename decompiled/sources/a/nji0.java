package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nji0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nji0 f23639a;
    private static final ugi0 descriptor;

    static {
        nji0 nji0Var = new nji0();
        f23639a = nji0Var;
        zna0 zna0Var = new zna0("com.google.firebase.sessions.SessionDetails", nji0Var, 4);
        zna0Var.j("sessionId", false);
        zna0Var.j("firstSessionId", false);
        zna0Var.j("sessionIndex", false);
        zna0Var.j("sessionStartTimestampUs", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, okx.f25427a, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        String strX = null;
        String strX2 = null;
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
                iJ = bldVarA.j(ugi0Var, 2);
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
        return new pji0(i, iJ, jR, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pji0 pji0Var = (pji0) obj;
        pji0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, pji0Var.f27093a);
        cldVarA.z(ugi0Var, 1, pji0Var.b);
        cldVarA.i(2, pji0Var.c, ugi0Var);
        cldVarA.n(ugi0Var, 3, pji0Var.d);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
