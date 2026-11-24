package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wk90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wk90 f39297a;
    private static final ugi0 descriptor;

    static {
        wk90 wk90Var = new wk90();
        f39297a = wk90Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.winter_games.impl.personal_statistic.data.model.PersonalStatisticResponse", wk90Var, 2);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(lcm0.f19805a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        pcm0 pcm0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                pcm0Var = (pcm0) bldVarA.e(ugi0Var, 1, lcm0.f19805a, pcm0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new yk90(i, num, pcm0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yk90 yk90Var = (yk90) obj;
        yk90Var.getClass();
        pcm0 pcm0Var = yk90Var.b;
        Integer num = yk90Var.f42777a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || pcm0Var != null) {
            cldVarA.p(ugi0Var, 1, lcm0.f19805a, pcm0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
