package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qm9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qm9 f28971a;
    private static final ugi0 descriptor;

    static {
        qm9 qm9Var = new qm9();
        f28971a = qm9Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.calendar_tournament.CalendarTournamentDotaHeroResponse", qm9Var, 5);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("winPercentage", true);
        zna0Var.j("pickPercentage", true);
        zna0Var.j("banPercentage", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
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
                f = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f);
                i |= 4;
            } else if (iF == 3) {
                f2 = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                f3 = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new sm9(i, str, str2, f, f2, f3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sm9 sm9Var = (sm9) obj;
        sm9Var.getClass();
        Float f = sm9Var.e;
        Float f2 = sm9Var.d;
        Float f3 = sm9Var.c;
        String str = sm9Var.b;
        String str2 = sm9Var.f32433a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
