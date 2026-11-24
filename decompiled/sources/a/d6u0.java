package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d6u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6u0 f5568a;
    private static final ugi0 descriptor;

    static {
        d6u0 d6u0Var = new d6u0();
        f5568a = d6u0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.cycling.impl.cycling_player.data.model.VeloJerseyResponse", d6u0Var, 2);
        zna0Var.j("veloJerseyLeaderType", true);
        zna0Var.j("veloJerseyType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
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
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new f6u0(i, num, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f6u0 f6u0Var = (f6u0) obj;
        f6u0Var.getClass();
        Integer num = f6u0Var.b;
        String str = f6u0Var.f9031a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
