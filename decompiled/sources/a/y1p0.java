package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y1p0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1p0 f41869a;
    private static final ugi0 descriptor;

    static {
        y1p0 y1p0Var = new y1p0();
        f41869a = y1p0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.impl.data.teambet.models.TeamBetStatisticResponse", y1p0Var, 4);
        zna0Var.j("teams", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) a2p0.e[0].getValue());
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(p1p0.f26215a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = a2p0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        Long l2 = null;
        r1p0 r1p0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else if (iF == 2) {
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                r1p0Var = (r1p0) bldVarA.e(ugi0Var, 3, p1p0.f26215a, r1p0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new a2p0(i, list, l, l2, r1p0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a2p0 a2p0Var = (a2p0) obj;
        a2p0Var.getClass();
        r1p0 r1p0Var = a2p0Var.d;
        Long l = a2p0Var.c;
        Long l2 = a2p0Var.b;
        List list = a2p0Var.f134a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = a2p0.e;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || r1p0Var != null) {
            cldVarA.p(ugi0Var, 3, p1p0.f26215a, r1p0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
