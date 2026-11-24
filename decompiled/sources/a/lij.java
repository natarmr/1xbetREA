package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lij implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lij f20109a;
    private static final ugi0 descriptor;

    static {
        lij lijVar = new lij();
        f20109a = lijVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.weekly_reward.data.models.DayInfoResponse", lijVar, 4);
        zna0Var.j("NO", true);
        zna0Var.j("ST", true);
        zna0Var.j("TL", true);
        zna0Var.j("CR", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Long l = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new nij(i, num, str, l, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nij nijVar = (nij) obj;
        nijVar.getClass();
        Boolean bool = nijVar.d;
        Long l = nijVar.c;
        String str = nijVar.b;
        Integer num = nijVar.f23590a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
