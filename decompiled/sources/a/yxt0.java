package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yxt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yxt0 f43440a;
    private static final ugi0 descriptor;

    static {
        yxt0 yxt0Var = new yxt0();
        f43440a = yxt0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.valorant.ValorantMatchInfoResponse", yxt0Var, 5);
        zna0Var.j("N", true);
        zna0Var.j("Period", true);
        zna0Var.j("Sc1", true);
        zna0Var.j("Sc2", true);
        zna0Var.j("MW", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
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
        Integer num4 = null;
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
            } else if (iF == 3) {
                num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new ayt0(i, num, num2, num3, num4, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ayt0 ayt0Var = (ayt0) obj;
        ayt0Var.getClass();
        Integer num = ayt0Var.e;
        Integer num2 = ayt0Var.d;
        Integer num3 = ayt0Var.c;
        Integer num4 = ayt0Var.b;
        String str = ayt0Var.f1686a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
