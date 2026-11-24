package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xea implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xea f40735a;
    private static final ugi0 descriptor;

    static {
        xea xeaVar = new xea();
        f40735a = xeaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.card_ckricket.CardCricketResponse", xeaVar, 9);
        zna0Var.j("Status", true);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("W1", true);
        zna0Var.j("W2", true);
        zna0Var.j("C1", true);
        zna0Var.j("C2", true);
        zna0Var.j("I1", true);
        zna0Var.j("I2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zea.j;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zea.j;
        List list = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
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
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i |= 8;
                    break;
                case 4:
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i |= 16;
                    break;
                case 5:
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i |= 32;
                    break;
                case 6:
                    num7 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num7);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list2);
                    i |= 128;
                    break;
                case 8:
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new zea(i, num, num2, num3, num4, num5, num6, num7, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zea zeaVar = (zea) obj;
        zeaVar.getClass();
        List list = zeaVar.i;
        List list2 = zeaVar.h;
        Integer num = zeaVar.g;
        Integer num2 = zeaVar.f;
        Integer num3 = zeaVar.e;
        Integer num4 = zeaVar.d;
        Integer num5 = zeaVar.c;
        Integer num6 = zeaVar.b;
        Integer num7 = zeaVar.f44241a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zea.j;
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
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
