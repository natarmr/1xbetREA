package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uf90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf90 f35567a;
    private static final ugi0 descriptor;

    static {
        uf90 uf90Var = new uf90();
        f35567a = uf90Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.data.model.PeriodSubScoreZipResponse", uf90Var, 3);
        zna0Var.j("N", true);
        zna0Var.j("S1", true);
        zna0Var.j("S2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wf90(i, num, num2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wf90 wf90Var = (wf90) obj;
        wf90Var.getClass();
        Integer num = wf90Var.c;
        Integer num2 = wf90Var.b;
        String str = wf90Var.f39060a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
