package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ang implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ang f1150a;
    private static final ugi0 descriptor;

    static {
        ang angVar = new ang();
        f1150a = angVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.dota.CyberDotaStatisticDetailsResponse", angVar, 6);
        zna0Var.j("ST", true);
        zna0Var.j("RRT", true);
        zna0Var.j("TS", true);
        zna0Var.j("TRT", true);
        zna0Var.j("BS", true);
        zna0Var.j("DR", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = cng.g;
        jiy jiyVarJ0 = mrv.j0(zfh.f44300a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[5].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cng.g;
        boolean z = true;
        int i = 0;
        bgh bghVar = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bghVar = (bgh) bldVarA.e(ugi0Var, 0, zfh.f44300a, bghVar);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    break;
                case 4:
                    l4 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new cng(i, bghVar, l, l2, l3, l4, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cng cngVar = (cng) obj;
        cngVar.getClass();
        List list = cngVar.f;
        Long l = cngVar.e;
        Long l2 = cngVar.d;
        Long l3 = cngVar.c;
        Long l4 = cngVar.b;
        bgh bghVar = cngVar.f4653a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cng.g;
        if (cldVarA.u(ugi0Var) || bghVar != null) {
            cldVarA.p(ugi0Var, 0, zfh.f44300a, bghVar);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
