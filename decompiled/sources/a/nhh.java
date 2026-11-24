package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nhh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nhh f23532a;
    private static final ugi0 descriptor;

    static {
        nhh nhhVar = new nhh();
        f23532a = nhhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.dota.CyberTeamStatisticsResponse", nhhVar, 7);
        zna0Var.j("RS", true);
        zna0Var.j("HR", true);
        zna0Var.j("BH", true);
        zna0Var.j("NW", true);
        zna0Var.j("TRT", true);
        zna0Var.j("RSC", true);
        zna0Var.j("TSC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = phh.h;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = phh.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        List list2 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
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
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num4);
                    i |= 32;
                    break;
                case 6:
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new phh(i, num, list, list2, num2, num3, num4, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        phh phhVar = (phh) obj;
        phhVar.getClass();
        Integer num = phhVar.g;
        Integer num2 = phhVar.f;
        Integer num3 = phhVar.e;
        Integer num4 = phhVar.d;
        List list = phhVar.c;
        List list2 = phhVar.b;
        Integer num5 = phhVar.f26996a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = phh.h;
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
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
        cldVarA.c(ugi0Var);
    }
}
