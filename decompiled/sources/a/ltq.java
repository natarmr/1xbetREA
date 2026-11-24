package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ltq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ltq f20639a;
    private static final ugi0 descriptor;

    static {
        ltq ltqVar = new ltq();
        f20639a = ltqVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.career.data.models.FooterResponse", ltqVar, 2);
        zna0Var.j("title", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(qtq.f29309a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        stq stqVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                stqVar = (stq) bldVarA.e(ugi0Var, 1, qtq.f29309a, stqVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ptq(i, str, stqVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ptq ptqVar = (ptq) obj;
        ptqVar.getClass();
        stq stqVar = ptqVar.b;
        String str = ptqVar.f27577a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || stqVar != null) {
            cldVarA.p(ugi0Var, 1, qtq.f29309a, stqVar);
        }
        cldVarA.c(ugi0Var);
    }
}
