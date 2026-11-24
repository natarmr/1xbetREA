package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eu10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eu10 f8397a;
    private static final ugi0 descriptor;

    static {
        eu10 eu10Var = new eu10();
        f8397a = eu10Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.MainFeedChampsResponse", eu10Var, 4);
        zna0Var.j("mainLigas", true);
        zna0Var.j("gamesCount", true);
        zna0Var.j("sport", true);
        zna0Var.j("tabs", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pu10.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(s710.f31729a), mrv.j0(ju10.f17129a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pu10.e;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        lu10 lu10Var = null;
        List list2 = null;
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
                lu10Var = (lu10) bldVarA.e(ugi0Var, 2, ju10.f17129a, lu10Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new pu10(i, list, l, lu10Var, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pu10 pu10Var = (pu10) obj;
        pu10Var.getClass();
        List list = pu10Var.d;
        lu10 lu10Var = pu10Var.c;
        Long l = pu10Var.b;
        List list2 = pu10Var.f27591a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pu10.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || lu10Var != null) {
            cldVarA.p(ugi0Var, 2, ju10.f17129a, lu10Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
