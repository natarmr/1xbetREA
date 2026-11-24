package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u6p implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u6p f35148a;
    private static final ugi0 descriptor;

    static {
        u6p u6pVar = new u6p();
        f35148a = u6pVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.favorite.data.models.FavoriteClearRequest", u6pVar, 2);
        zna0Var.j("gamesSource", false);
        zna0Var.j("subCategoryId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{w6p.c[0].getValue(), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = w6p.c;
        boolean z = true;
        int i = 0;
        c7p c7pVar = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                c7pVar = (c7p) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), c7pVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new w6p(i, c7pVar, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w6p w6pVar = (w6p) obj;
        w6pVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) w6p.c[0].getValue(), w6pVar.f38634a);
        cldVarA.p(ugi0Var, 1, okx.f25427a, w6pVar.b);
        cldVarA.c(ugi0Var);
    }
}
