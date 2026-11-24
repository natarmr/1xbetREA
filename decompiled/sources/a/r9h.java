package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r9h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r9h f30081a;
    private static final ugi0 descriptor;

    static {
        r9h r9hVar = new r9h();
        f30081a = r9hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.mlbb.CyberMlbbStatisticResponse", r9hVar, 7);
        zna0Var.j("O1", true);
        zna0Var.j("O2", true);
        zna0Var.j("ST", true);
        zna0Var.j("TS", true);
        zna0Var.j("TR", true);
        zna0Var.j("LR", true);
        zna0Var.j("DR", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = t9h.h;
        u9h u9hVar = u9h.f35283a;
        jiy jiyVarJ0 = mrv.j0(u9hVar);
        jiy jiyVarJ1 = mrv.j0(u9hVar);
        jiy jiyVarJ2 = mrv.j0(c9h.f3962a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[6].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = t9h.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        w9h w9hVar = null;
        w9h w9hVar2 = null;
        e9h e9hVar = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    w9hVar = (w9h) bldVarA.e(ugi0Var, 0, u9h.f35283a, w9hVar);
                    i |= 1;
                    break;
                case 1:
                    w9hVar2 = (w9h) bldVarA.e(ugi0Var, 1, u9h.f35283a, w9hVar2);
                    i |= 2;
                    break;
                case 2:
                    e9hVar = (e9h) bldVarA.e(ugi0Var, 2, c9h.f3962a, e9hVar);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    break;
                case 6:
                    list = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new t9h(i, w9hVar, w9hVar2, e9hVar, l, l2, l3, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t9h t9hVar = (t9h) obj;
        t9hVar.getClass();
        List list = t9hVar.g;
        Long l = t9hVar.f;
        Long l2 = t9hVar.e;
        Long l3 = t9hVar.d;
        e9h e9hVar = t9hVar.c;
        w9h w9hVar = t9hVar.b;
        w9h w9hVar2 = t9hVar.f33562a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = t9h.h;
        if (cldVarA.u(ugi0Var) || w9hVar2 != null) {
            cldVarA.p(ugi0Var, 0, u9h.f35283a, w9hVar2);
        }
        if (cldVarA.u(ugi0Var) || w9hVar != null) {
            cldVarA.p(ugi0Var, 1, u9h.f35283a, w9hVar);
        }
        if (cldVarA.u(ugi0Var) || e9hVar != null) {
            cldVarA.p(ugi0Var, 2, c9h.f3962a, e9hVar);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
