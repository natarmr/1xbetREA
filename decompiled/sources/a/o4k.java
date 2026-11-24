package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o4k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o4k f24640a;
    private static final ugi0 descriptor;

    static {
        o4k o4kVar = new o4k();
        f24640a = o4kVar;
        zna0 zna0Var = new zna0("org.xplatform.wallet.impl.data.model.request.DeleteCurrencyRequest", o4kVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{q4k.f28100a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        s4k s4kVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                s4kVar = (s4k) bldVarA.m(ugi0Var, 0, q4k.f28100a, s4kVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new t4k(i, s4kVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t4k t4kVar = (t4k) obj;
        t4kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, q4k.f28100a, t4kVar.f33323a);
        cldVarA.c(ugi0Var);
    }
}
