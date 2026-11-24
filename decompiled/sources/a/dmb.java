package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dmb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dmb f6315a;
    private static final ugi0 descriptor;

    static {
        dmb dmbVar = new dmb();
        f6315a = dmbVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.feed.data.model.ChampsImagesResponse", dmbVar, 2);
        zna0Var.j("feedId", true);
        zna0Var.j("images", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(rzw.f31381a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        tzw tzwVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                tzwVar = (tzw) bldVarA.e(ugi0Var, 1, rzw.f31381a, tzwVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fmb(i, l, tzwVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fmb fmbVar = (fmb) obj;
        fmbVar.getClass();
        tzw tzwVar = fmbVar.b;
        Long l = fmbVar.f9771a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || tzwVar != null) {
            cldVarA.p(ugi0Var, 1, rzw.f31381a, tzwVar);
        }
        cldVarA.c(ugi0Var);
    }
}
