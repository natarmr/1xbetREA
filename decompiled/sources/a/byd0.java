package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class byd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byd0 f3412a;
    private static final ugi0 descriptor;

    static {
        byd0 byd0Var = new byd0();
        f3412a = byd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rainbow.RainbowSixStatisticMapDraftResponse", byd0Var, 5);
        zna0Var.j("N", true);
        zna0Var.j("CT", true);
        zna0Var.j("NU", true);
        zna0Var.j("DT", true);
        zna0Var.j("MW", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(hyd0.f13854a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        gyd0 gyd0Var = null;
        Integer num3 = null;
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
                gyd0Var = (gyd0) bldVarA.e(ugi0Var, 3, hyd0.f13854a, gyd0Var);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new dyd0(i, str, num, num2, gyd0Var, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dyd0 dyd0Var = (dyd0) obj;
        dyd0Var.getClass();
        Integer num = dyd0Var.e;
        gyd0 gyd0Var = dyd0Var.d;
        Integer num2 = dyd0Var.c;
        Integer num3 = dyd0Var.b;
        String str = dyd0Var.f6886a;
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
        if (cldVarA.u(ugi0Var) || gyd0Var != null) {
            cldVarA.p(ugi0Var, 3, hyd0.f13854a, gyd0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
