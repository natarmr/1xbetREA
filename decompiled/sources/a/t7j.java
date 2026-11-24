package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t7j implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t7j f33469a;
    private static final ugi0 descriptor;

    static {
        t7j t7jVar = new t7j();
        f33469a = t7jVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.daily_tournament.data.model.DailyWinnerRequest", t7jVar, 3);
        zna0Var.j("RI", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, ysm0.f43175a, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new v7j(i, iJ, iJ2, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v7j v7jVar = (v7j) obj;
        v7jVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, v7jVar.f36927a, ugi0Var);
        cldVarA.z(ugi0Var, 1, v7jVar.b);
        cldVarA.i(2, v7jVar.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
