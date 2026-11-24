package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1u0 f26222a;
    private static final ugi0 descriptor;

    static {
        p1u0 p1u0Var = new p1u0();
        f26222a = p1u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.valorant.ValorantStatisticTeamResponse", p1u0Var, 4);
        zna0Var.j("SC", true);
        zna0Var.j("EH", true);
        zna0Var.j("CS", true);
        zna0Var.j("LP", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = r1u0.e;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = r1u0.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Map map = null;
        Integer num2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                map = (Map) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new r1u0(i, num, map, num2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r1u0 r1u0Var = (r1u0) obj;
        r1u0Var.getClass();
        List list = r1u0Var.d;
        Integer num = r1u0Var.c;
        Map map = r1u0Var.b;
        Integer num2 = r1u0Var.f29701a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = r1u0.e;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
