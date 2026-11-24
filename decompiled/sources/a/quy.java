package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class quy implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final quy f29363a;
    private static final ugi0 descriptor;

    static {
        quy quyVar = new quy();
        f29363a = quyVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.online_call.api.domain.language_selector_block_status.model.LanguageSelectorBlockModel", quyVar, 5);
        zna0Var.j("clickStatus", false);
        zna0Var.j("isSubsequentBlock", false);
        zna0Var.j("endBlockingTime", false);
        zna0Var.j("lastRoundedBlockTime", false);
        zna0Var.j("isUnfinishedBlockTimeLeft", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{suy.f[0].getValue(), sm8Var, s710Var, s710Var, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = suy.f;
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        wuy wuyVar = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                wuyVar = (wuy) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), wuyVar);
                i |= 1;
            } else if (iF == 1) {
                zB = bldVarA.B(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                jR = bldVarA.r(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                jR2 = bldVarA.r(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                zB2 = bldVarA.B(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new suy(i, wuyVar, zB, jR, jR2, zB2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        suy suyVar = (suy) obj;
        suyVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) suy.f[0].getValue(), suyVar.f32841a);
        cldVarA.x(ugi0Var, 1, suyVar.b);
        cldVarA.n(ugi0Var, 2, suyVar.c);
        cldVarA.n(ugi0Var, 3, suyVar.d);
        cldVarA.x(ugi0Var, 4, suyVar.e);
        cldVarA.c(ugi0Var);
    }
}
