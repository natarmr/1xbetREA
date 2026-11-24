package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tde implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tde f33765a;
    private static final ugi0 descriptor;

    static {
        tde tdeVar = new tde();
        f33765a = tdeVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stagetable.data.common.model.ContentByGroupResponse", tdeVar, 2);
        zna0Var.j("title", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(lko0.f20210a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        tko0 tko0Var = null;
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
                tko0Var = (tko0) bldVarA.e(ugi0Var, 1, lko0.f20210a, tko0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new vde(i, str, tko0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vde vdeVar = (vde) obj;
        vdeVar.getClass();
        tko0 tko0Var = vdeVar.b;
        String str = vdeVar.f37227a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || tko0Var != null) {
            cldVarA.p(ugi0Var, 1, lko0.f20210a, tko0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
