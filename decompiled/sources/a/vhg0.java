package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vhg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vhg0 f37428a;
    private static final ugi0 descriptor;

    static {
        vhg0 vhg0Var = new vhg0();
        f37428a = vhg0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stat_results.impl.results_grid.data.model.RowResponse", vhg0Var, 9);
        zna0Var.j("chessCells", true);
        zna0Var.j(RemoteMessageConst.Notification.COLOR, true);
        zna0Var.j("draws", true);
        zna0Var.j("losses", true);
        zna0Var.j("numberOfGames", true);
        zna0Var.j("points", true);
        zna0Var.j("scoredMissed", true);
        zna0Var.j("team", true);
        zna0Var.j("wins", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) xhg0.j[0].getValue());
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xhg0.j;
        Integer num = null;
        boolean z = true;
        String str = null;
        int i = 0;
        List list = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str2 = null;
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
                    str2 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new xhg0(i, list, num2, num3, num4, num5, num6, str2, str, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xhg0 xhg0Var = (xhg0) obj;
        xhg0Var.getClass();
        Integer num = xhg0Var.i;
        String str = xhg0Var.h;
        String str2 = xhg0Var.g;
        Integer num2 = xhg0Var.f;
        Integer num3 = xhg0Var.e;
        Integer num4 = xhg0Var.d;
        Integer num5 = xhg0Var.c;
        Integer num6 = xhg0Var.b;
        List list = xhg0Var.f40890a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xhg0.j;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
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
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
