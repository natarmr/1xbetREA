package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x470 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x470 f40251a;
    private static final ugi0 descriptor;

    static {
        x470 x470Var = new x470();
        f40251a = x470Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.configs.OneXGamesTypeCommon.OneXGamesTypeWeb", x470Var, 1);
        zna0Var.j("gameTypeId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new z470(i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z470 z470Var = (z470) obj;
        z470Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, z470Var.f43755a);
        cldVarA.c(ugi0Var);
    }
}
