package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gvf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gvf0 f11972a;
    private static final ugi0 descriptor;

    static {
        gvf0 gvf0Var = new gvf0();
        f11972a = gvf0Var;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.response.rules.ResponsibleHrefHref", gvf0Var, 3);
        zna0Var.j("href", true);
        zna0Var.j("link", true);
        zna0Var.j("title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(dvf0.f6741a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        fvf0 fvf0Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                fvf0Var = (fvf0) bldVarA.e(ugi0Var, 0, dvf0.f6741a, fvf0Var);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ivf0(i, fvf0Var, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ivf0 ivf0Var = (ivf0) obj;
        ivf0Var.getClass();
        String str = ivf0Var.c;
        String str2 = ivf0Var.b;
        fvf0 fvf0Var = ivf0Var.f15444a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || fvf0Var != null) {
            cldVarA.p(ugi0Var, 0, dvf0.f6741a, fvf0Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
