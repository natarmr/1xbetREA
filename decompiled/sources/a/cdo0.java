package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cdo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cdo0 f4171a;
    private static final ugi0 descriptor;

    static {
        cdo0 cdo0Var = new cdo0();
        f4171a = cdo0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.career.data.models.TabResponse", cdo0Var, 2);
        zna0Var.j("title", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(mko0.f21953a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        uko0 uko0Var = null;
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
                uko0Var = (uko0) bldVarA.e(ugi0Var, 1, mko0.f21953a, uko0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new gdo0(i, str, uko0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gdo0 gdo0Var = (gdo0) obj;
        gdo0Var.getClass();
        uko0 uko0Var = gdo0Var.b;
        String str = gdo0Var.f11113a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || uko0Var != null) {
            cldVarA.p(ugi0Var, 1, mko0.f21953a, uko0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
