package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mqb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mqb0 f22217a;
    private static final ugi0 descriptor;

    static {
        mqb0 mqb0Var = new mqb0();
        f22217a = mqb0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.power_of_power.PowerOfPowerTableResponse", mqb0Var, 8);
        zna0Var.j("B", true);
        zna0Var.j("D", true);
        zna0Var.j(TokenNames.K, true);
        zna0Var.j("P", true);
        zna0Var.j("Place", true);
        zna0Var.j("Planted", true);
        zna0Var.j("Defused", true);
        zna0Var.j(TokenNames.T, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    break;
                case 5:
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i |= 32;
                    break;
                case 6:
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new oqb0(i, num, num2, num3, str, num4, num5, num6, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oqb0 oqb0Var = (oqb0) obj;
        oqb0Var.getClass();
        String str = oqb0Var.h;
        Integer num = oqb0Var.g;
        Integer num2 = oqb0Var.f;
        Integer num3 = oqb0Var.e;
        String str2 = oqb0Var.d;
        Integer num4 = oqb0Var.c;
        Integer num5 = oqb0Var.b;
        Integer num6 = oqb0Var.f25681a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
