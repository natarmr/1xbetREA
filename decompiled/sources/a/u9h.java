package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u9h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u9h f35283a;
    private static final ugi0 descriptor;

    static {
        u9h u9hVar = new u9h();
        f35283a = u9hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.mlbb.CyberMlbbTeamStatisticResponse", u9hVar, 7);
        zna0Var.j("HR", true);
        zna0Var.j("SD", true);
        zna0Var.j("TW", true);
        zna0Var.j("LR", true);
        zna0Var.j("TR", true);
        zna0Var.j("GL", true);
        zna0Var.j("GH", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = w9h.h;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klq.f18504a), mrv.j0((jiy) a8zVarArr[6].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = w9h.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Float f = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
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
                    list2 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new w9h(i, list, num, num2, num3, num4, f, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w9h w9hVar = (w9h) obj;
        w9hVar.getClass();
        List list = w9hVar.g;
        Float f = w9hVar.f;
        Integer num = w9hVar.e;
        Integer num2 = w9hVar.d;
        Integer num3 = w9hVar.c;
        Integer num4 = w9hVar.b;
        List list2 = w9hVar.f38780a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = w9h.h;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
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
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
