package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ovd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ovd0 f25920a;
    private static final ugi0 descriptor;

    static {
        ovd0 ovd0Var = new ovd0();
        f25920a = ovd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rainbow.RainbowGameStatisticMainStatResponse", ovd0Var, 6);
        zna0Var.j("LP", true);
        zna0Var.j("SC", true);
        zna0Var.j("fH", true);
        zna0Var.j("sH", true);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("OB", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = qvd0.g;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(uvd0.f36344a), mrv.j0((jiy) a8zVarArr[5].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qvd0.g;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Map map = null;
        Map map2 = null;
        tvd0 tvd0Var = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    map2 = (Map) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map2);
                    i |= 8;
                    break;
                case 4:
                    tvd0Var = (tvd0) bldVarA.e(ugi0Var, 4, uvd0.f36344a, tvd0Var);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new qvd0(i, list, num, map, map2, tvd0Var, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qvd0 qvd0Var = (qvd0) obj;
        qvd0Var.getClass();
        List list = qvd0Var.f;
        tvd0 tvd0Var = qvd0Var.e;
        Map map = qvd0Var.d;
        Map map2 = qvd0Var.c;
        Integer num = qvd0Var.b;
        List list2 = qvd0Var.f29381a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qvd0.g;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || map2 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), map2);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || tvd0Var != null) {
            cldVarA.p(ugi0Var, 4, uvd0.f36344a, tvd0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
