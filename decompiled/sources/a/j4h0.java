package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j4h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j4h0 f15884a;
    private static final ugi0 descriptor;

    static {
        j4h0 j4h0Var = new j4h0();
        f15884a = j4h0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.ScoreResponse.PeriodScore", j4h0Var, 4);
        zna0Var.j("periodName", true);
        zna0Var.j("period", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new l4h0(i, num, num2, num3, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l4h0 l4h0Var = (l4h0) obj;
        l4h0Var.getClass();
        Integer num = l4h0Var.d;
        Integer num2 = l4h0Var.c;
        Integer num3 = l4h0Var.b;
        String str = l4h0Var.f19405a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
