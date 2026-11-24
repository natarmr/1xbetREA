package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q4k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q4k f28100a;
    private static final ugi0 descriptor;

    static {
        q4k q4kVar = new q4k();
        f28100a = q4kVar;
        zna0 zna0Var = new zna0("org.xplatform.wallet.impl.data.model.request.DeleteCurrencyRequest.DeleteCurrencyDataRequest", q4kVar, 1);
        zna0Var.j("CurrencyUserId", false);
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
        return new s4k(i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s4k s4kVar = (s4k) obj;
        s4kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, s4kVar.f31610a);
        cldVarA.c(ugi0Var);
    }
}
