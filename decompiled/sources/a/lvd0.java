package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lvd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lvd0 f20710a;
    private static final ugi0 descriptor;

    static {
        lvd0 lvd0Var = new lvd0();
        f20710a = lvd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rainbow.RainbowGameStatisticMainStatPlayerResponse", lvd0Var, 7);
        zna0Var.j("N", true);
        zna0Var.j(TokenNames.K, true);
        zna0Var.j("D", true);
        zna0Var.j("KO", true);
        zna0Var.j("EPS", true);
        zna0Var.j("KPR", true);
        zna0Var.j("HS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klq.f18504a), mrv.j0(okxVar)};
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
        Integer num3 = null;
        Integer num4 = null;
        Float f = null;
        Integer num5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) bldVarA.e(ugi0Var, 5, klq.f18504a, f);
                    i |= 32;
                    break;
                case 6:
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new nvd0(i, str, num, num2, num3, num4, f, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nvd0 nvd0Var = (nvd0) obj;
        nvd0Var.getClass();
        Integer num = nvd0Var.g;
        Float f = nvd0Var.f;
        Integer num2 = nvd0Var.e;
        Integer num3 = nvd0Var.d;
        Integer num4 = nvd0Var.c;
        Integer num5 = nvd0Var.b;
        String str = nvd0Var.f24185a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
