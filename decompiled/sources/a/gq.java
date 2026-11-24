package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gq f11707a;
    private static final ugi0 descriptor;

    static {
        gq gqVar = new gq();
        f11707a = gqVar;
        zna0 zna0Var = new zna0("org.xplatform.wallet.impl.data.model.request.AddCurrencyRequest", gqVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{hq.f13463a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        jq jqVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                jqVar = (jq) bldVarA.m(ugi0Var, 0, hq.f13463a, jqVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new lq(i, jqVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lq lqVar = (lq) obj;
        lqVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, hq.f13463a, lqVar.f20463a);
        cldVarA.c(ugi0Var);
    }
}
