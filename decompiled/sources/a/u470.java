package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u470 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u470 f35031a;
    private static final ugi0 descriptor;

    static {
        u470 u470Var = new u470();
        f35031a = u470Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.configs.OneXGamesTypeCommon.OneXGamesTypeNative", u470Var, 1);
        zna0Var.j("gameType", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{c570.f3758a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        s470 s470Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                s470Var = (s470) bldVarA.m(ugi0Var, 0, c570.f3758a, s470Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new w470(i, s470Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w470 w470Var = (w470) obj;
        w470Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, c570.f3758a, w470Var.f38531a);
        cldVarA.c(ugi0Var);
    }
}
