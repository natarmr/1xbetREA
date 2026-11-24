package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zkg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zkg0 f44531a;
    private static final ugi0 descriptor;

    static {
        zkg0 zkg0Var = new zkg0();
        f44531a = zkg0Var;
        zna0 zna0Var = new zna0("org.xplatform.rules.impl.data.models.RuleTranslationResponse", zkg0Var, 2);
        zna0Var.j("key", true);
        zna0Var.j("value", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(sns0.f32511a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        rns0 rns0Var = null;
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
                rns0Var = (rns0) bldVarA.e(ugi0Var, 1, sns0.f32511a, rns0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new blg0(i, str, rns0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        blg0 blg0Var = (blg0) obj;
        blg0Var.getClass();
        rns0 rns0Var = blg0Var.b;
        String str = blg0Var.f2794a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || rns0Var != null) {
            cldVarA.p(ugi0Var, 1, sns0.f32511a, rns0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
