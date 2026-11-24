package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l6i0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l6i0 f19507a;
    private static final ugi0 descriptor;

    static {
        l6i0 l6i0Var = new l6i0();
        f19507a = l6i0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.medal_statistic.data.models.SelectorsResponse", l6i0Var, 5);
        zna0Var.j("group", true);
        zna0Var.j("season", true);
        zna0Var.j("discipline", true);
        zna0Var.j("competitorType", true);
        zna0Var.j("tournament", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(jhv.f16546a), mrv.j0(wih0.f39214a), mrv.j0(huk.f13684a), mrv.j0(kdd.f18100a), mrv.j0(q4s0.f28116a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        nhv nhvVar = null;
        yih0 yih0Var = null;
        juk jukVar = null;
        mdd mddVar = null;
        a5s0 a5s0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                nhvVar = (nhv) bldVarA.e(ugi0Var, 0, jhv.f16546a, nhvVar);
                i |= 1;
            } else if (iF == 1) {
                yih0Var = (yih0) bldVarA.e(ugi0Var, 1, wih0.f39214a, yih0Var);
                i |= 2;
            } else if (iF == 2) {
                jukVar = (juk) bldVarA.e(ugi0Var, 2, huk.f13684a, jukVar);
                i |= 4;
            } else if (iF == 3) {
                mddVar = (mdd) bldVarA.e(ugi0Var, 3, kdd.f18100a, mddVar);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                a5s0Var = (a5s0) bldVarA.e(ugi0Var, 4, q4s0.f28116a, a5s0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new p6i0(i, nhvVar, yih0Var, jukVar, mddVar, a5s0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p6i0 p6i0Var = (p6i0) obj;
        p6i0Var.getClass();
        a5s0 a5s0Var = p6i0Var.e;
        mdd mddVar = p6i0Var.d;
        juk jukVar = p6i0Var.c;
        yih0 yih0Var = p6i0Var.b;
        nhv nhvVar = p6i0Var.f26456a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || nhvVar != null) {
            cldVarA.p(ugi0Var, 0, jhv.f16546a, nhvVar);
        }
        if (cldVarA.u(ugi0Var) || yih0Var != null) {
            cldVarA.p(ugi0Var, 1, wih0.f39214a, yih0Var);
        }
        if (cldVarA.u(ugi0Var) || jukVar != null) {
            cldVarA.p(ugi0Var, 2, huk.f13684a, jukVar);
        }
        if (cldVarA.u(ugi0Var) || mddVar != null) {
            cldVarA.p(ugi0Var, 3, kdd.f18100a, mddVar);
        }
        if (cldVarA.u(ugi0Var) || a5s0Var != null) {
            cldVarA.p(ugi0Var, 4, q4s0.f28116a, a5s0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
