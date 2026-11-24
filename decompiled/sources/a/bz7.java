package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bz7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bz7 f3452a;
    private static final ugi0 descriptor;

    static {
        bz7 bz7Var = new bz7();
        f3452a = bz7Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.big_pig.BigPigCurrentThrowExtendedResponse", bz7Var, 10);
        zna0Var.j("P", true);
        zna0Var.j("N", true);
        zna0Var.j("W", true);
        zna0Var.j(TokenNames.T, true);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("FS", true);
        zna0Var.j("SS", true);
        zna0Var.j("D1", true);
        zna0Var.j("D2", true);
        zna0Var.j("ST", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        a08 a08Var = a08.f14a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(a08Var), mrv.j0(a08Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        c08 c08Var = null;
        c08 c08Var2 = null;
        Integer num7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i |= 1;
                    break;
                case 1:
                    num3 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num3);
                    i |= 2;
                    break;
                case 2:
                    num4 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num4);
                    i |= 4;
                    break;
                case 3:
                    num5 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num5);
                    i |= 8;
                    break;
                case 4:
                    num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                    i |= 16;
                    break;
                case 5:
                    c08Var = (c08) bldVarA.e(ugi0Var, 5, a08.f14a, c08Var);
                    i |= 32;
                    break;
                case 6:
                    c08Var2 = (c08) bldVarA.e(ugi0Var, 6, a08.f14a, c08Var2);
                    i |= 64;
                    break;
                case 7:
                    num7 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num7);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    bool = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new dz7(i, num2, num3, num4, num5, num6, c08Var, c08Var2, num7, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dz7 dz7Var = (dz7) obj;
        dz7Var.getClass();
        Boolean bool = dz7Var.j;
        Integer num = dz7Var.i;
        Integer num2 = dz7Var.h;
        c08 c08Var = dz7Var.g;
        c08 c08Var2 = dz7Var.f;
        Integer num3 = dz7Var.e;
        Integer num4 = dz7Var.d;
        Integer num5 = dz7Var.c;
        Integer num6 = dz7Var.b;
        Integer num7 = dz7Var.f6928a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || c08Var2 != null) {
            cldVarA.p(ugi0Var, 5, a08.f14a, c08Var2);
        }
        if (cldVarA.u(ugi0Var) || c08Var != null) {
            cldVarA.p(ugi0Var, 6, a08.f14a, c08Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
