package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kv60 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kv60 f18942a;
    private static final ugi0 descriptor;

    static {
        kv60 kv60Var = new kv60();
        f18942a = kv60Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.models.OneXGamesChangeFavoritesRequest", kv60Var, 1);
        zna0Var.j("gameId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new mv60(i, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mv60 mv60Var = (mv60) obj;
        mv60Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, s710.f31729a, mv60Var.f22442a);
        cldVarA.c(ugi0Var);
    }
}
