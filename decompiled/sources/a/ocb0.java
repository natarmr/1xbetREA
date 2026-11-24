package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ocb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ocb0 f25020a;
    private static final ugi0 descriptor;

    static {
        ocb0 ocb0Var = new ocb0();
        f25020a = ocb0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.team_details.popular_heroes.data.model.PopularHeroesHeroResponse", ocb0Var, 5);
        zna0Var.j("name", true);
        zna0Var.j("win_rate", true);
        zna0Var.j("pick_rate", true);
        zna0Var.j("matchesCount", true);
        zna0Var.j("imageS3", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(okx.f25427a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Float f = null;
        Float f2 = null;
        Integer num = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                f = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f);
                i |= 2;
            } else if (iF == 2) {
                f2 = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f2);
                i |= 4;
            } else if (iF == 3) {
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new qcb0(i, str, f, f2, num, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qcb0 qcb0Var = (qcb0) obj;
        qcb0Var.getClass();
        String str = qcb0Var.e;
        Integer num = qcb0Var.d;
        Float f = qcb0Var.c;
        Float f2 = qcb0Var.b;
        String str2 = qcb0Var.f28477a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
