package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kf f18174a;
    private static final ugi0 descriptor;

    static {
        kf kfVar = new kf();
        f18174a = kfVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.balance_management.impl.account_number.data.AccountNumberUrlResponse", kfVar, 2);
        zna0Var.j("success", true);
        zna0Var.j("Value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(sm8.f32432a), mrv.j0(nf.f23411a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        pf pfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                pfVar = (pf) bldVarA.e(ugi0Var, 1, nf.f23411a, pfVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new mf(i, bool, pfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mf mfVar = (mf) obj;
        mfVar.getClass();
        pf pfVar = mfVar.b;
        Boolean bool = mfVar.f21672a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || pfVar != null) {
            cldVarA.p(ugi0Var, 1, nf.f23411a, pfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
