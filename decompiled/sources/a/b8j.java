package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b8j implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b8j f2160a;
    private static final ugi0 descriptor;

    static {
        b8j b8jVar = new b8j();
        f2160a = b8jVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.daily_tournament.data.model.DailyWinnerResponse.Winners", b8jVar, 4);
        zna0Var.j("PT", true);
        zna0Var.j("NK", true);
        zna0Var.j("TX", true);
        zna0Var.j("PL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(klq.f18504a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        String str = null;
        String str2 = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new d8j(i, f, str, str2, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d8j d8jVar = (d8j) obj;
        d8jVar.getClass();
        Long l = d8jVar.d;
        String str = d8jVar.c;
        String str2 = d8jVar.b;
        Float f = d8jVar.f5651a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
