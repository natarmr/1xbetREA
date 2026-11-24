package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uct0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uct0 f35448a;
    private static final ugi0 descriptor;

    static {
        uct0 uct0Var = new uct0();
        f35448a = uct0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.UniversalChampSocialMediaResponse.ValueContent", uct0Var, 1);
        zna0Var.j("main", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(lct0.f19816a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        nct0 nct0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                nct0Var = (nct0) bldVarA.e(ugi0Var, 0, lct0.f19816a, nct0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wct0(i, nct0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wct0 wct0Var = (wct0) obj;
        wct0Var.getClass();
        nct0 nct0Var = wct0Var.f38941a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || nct0Var != null) {
            cldVarA.p(ugi0Var, 0, lct0.f19816a, nct0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
