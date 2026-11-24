package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4k f36784a;
    private static final ugi0 descriptor;

    static {
        v4k v4kVar = new v4k();
        f36784a = v4kVar;
        zna0 zna0Var = new zna0("org.xplatform.favorites.impl.data.entities.DeleteFavoriteChampRequest", v4kVar, 2);
        zna0Var.j("champId", false);
        zna0Var.j("subSportId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        Long l = null;
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
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new x4k(i, jR, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x4k x4kVar = (x4k) obj;
        x4kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, x4kVar.f40268a);
        cldVarA.p(ugi0Var, 1, s710.f31729a, x4kVar.b);
        cldVarA.c(ugi0Var);
    }
}
