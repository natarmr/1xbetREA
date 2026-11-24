package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qs30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qs30 f29241a;
    private static final ugi0 descriptor;

    static {
        qs30 qs30Var = new qs30();
        f29241a = qs30Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.memories.data.models.MemoryGetActiveGameRequest", qs30Var, 3);
        zna0Var.j("BAC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ss30(strX, i, iJ, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ss30 ss30Var = (ss30) obj;
        ss30Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, ss30Var.f32708a);
        cldVarA.z(ugi0Var, 1, ss30Var.b);
        cldVarA.i(2, ss30Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
