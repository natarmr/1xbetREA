package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xnz implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xnz f41191a;
    private static final ugi0 descriptor;

    static {
        xnz xnzVar = new xnz();
        f41191a = xnzVar;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.limits.models.LimitRequest", xnzVar, 2);
        zna0Var.j("limitValue", false);
        zna0Var.j("limitType", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new znz(i, iJ, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        znz znzVar = (znz) obj;
        znzVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, znzVar.f44695a, ugi0Var);
        cldVarA.i(1, znzVar.b, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
