package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k7p implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k7p f17834a;
    private static final ugi0 descriptor;

    static {
        k7p k7pVar = new k7p();
        f17834a = k7pVar;
        zna0 zna0Var = new zna0("org.xplatform.favorites.core.data.model.sync.FavoriteConfigurationResponse", k7pVar, 4);
        zna0Var.j("maxCountChampionships", true);
        zna0Var.j("maxCountGames", true);
        zna0Var.j("maxCountTeams", true);
        zna0Var.j("gameStorageAfterStartSeconds", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else if (iF == 2) {
                l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new m7p(i, l, l2, l3, l4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m7p m7pVar = (m7p) obj;
        m7pVar.getClass();
        Long l = m7pVar.d;
        Long l2 = m7pVar.c;
        Long l3 = m7pVar.b;
        Long l4 = m7pVar.f21331a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
