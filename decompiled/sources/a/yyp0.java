package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yyp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yyp0 f43478a;
    private static final ugi0 descriptor;

    static {
        yyp0 yyp0Var = new yyp0();
        f43478a = yyp0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.summary.data.models.TennisSummaryResponse", yyp0Var, 4);
        zna0Var.j("year", true);
        zna0Var.j("surface", true);
        zna0Var.j("serviceStats", true);
        zna0Var.j("returnStats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(oii0.f25313a), mrv.j0(kag0.f17962a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        qii0 qii0Var = null;
        mag0 mag0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                qii0Var = (qii0) bldVarA.e(ugi0Var, 2, oii0.f25313a, qii0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                mag0Var = (mag0) bldVarA.e(ugi0Var, 3, kag0.f17962a, mag0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new azp0(i, str, str2, qii0Var, mag0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        azp0 azp0Var = (azp0) obj;
        azp0Var.getClass();
        mag0 mag0Var = azp0Var.d;
        qii0 qii0Var = azp0Var.c;
        String str = azp0Var.b;
        String str2 = azp0Var.f1730a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || qii0Var != null) {
            cldVarA.p(ugi0Var, 2, oii0.f25313a, qii0Var);
        }
        if (cldVarA.u(ugi0Var) || mag0Var != null) {
            cldVarA.p(ugi0Var, 3, kag0.f17962a, mag0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
