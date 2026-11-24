package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class exl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final exl0 f8584a;
    private static final ugi0 descriptor;

    static {
        exl0 exl0Var = new exl0();
        f8584a = exl0Var;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.championship.data.stadium.model.StadiumResponse", exl0Var, 1);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(dwl0.f6806a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        mwl0 mwl0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                mwl0Var = (mwl0) bldVarA.e(ugi0Var, 0, dwl0.f6806a, mwl0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new kxl0(i, mwl0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kxl0 kxl0Var = (kxl0) obj;
        kxl0Var.getClass();
        mwl0 mwl0Var = kxl0Var.f19061a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || mwl0Var != null) {
            cldVarA.p(ugi0Var, 0, dwl0.f6806a, mwl0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
