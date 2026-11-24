package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vs30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vs30 f37930a;
    private static final ugi0 descriptor;

    static {
        vs30 vs30Var = new vs30();
        f37930a = vs30Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.memories.data.models.MemoryMakeStepRequest", vs30Var, 4);
        zna0Var.j("AN", false);
        zna0Var.j("IC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar, ysm0.f43175a, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                iJ3 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new xs30(i, iJ, iJ2, iJ3, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xs30 xs30Var = (xs30) obj;
        xs30Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, xs30Var.f41396a, ugi0Var);
        cldVarA.i(1, xs30Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, xs30Var.c);
        cldVarA.i(3, xs30Var.d, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
