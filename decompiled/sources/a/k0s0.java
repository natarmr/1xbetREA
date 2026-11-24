package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k0s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0s0 f17484a;
    private static final ugi0 descriptor;

    static {
        k0s0 k0s0Var = new k0s0();
        f17484a = k0s0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.feed_statistic.cs.TournamentCsFeedStatisticTopPlayerResponse", k0s0Var, 4);
        zna0Var.j("name", true);
        zna0Var.j("image", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("score", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(o0s0.f24444a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        q0s0 q0s0Var = null;
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
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                q0s0Var = (q0s0) bldVarA.e(ugi0Var, 3, o0s0.f24444a, q0s0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new m0s0(i, str, str2, str3, q0s0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m0s0 m0s0Var = (m0s0) obj;
        m0s0Var.getClass();
        q0s0 q0s0Var = m0s0Var.d;
        String str = m0s0Var.c;
        String str2 = m0s0Var.b;
        String str3 = m0s0Var.f20971a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || q0s0Var != null) {
            cldVarA.p(ugi0Var, 3, o0s0.f24444a, q0s0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
