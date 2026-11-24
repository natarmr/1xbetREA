package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kps implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kps f18689a;
    private static final ugi0 descriptor;

    static {
        kps kpsVar = new kps();
        f18689a = kpsVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.statistic_core.data.models.GameResponse", kpsVar, 4);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = bqs.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(okx.f25427a), mrv.j0(fgs.f9506a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bqs.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        Integer num = null;
        hgs hgsVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                hgsVar = (hgs) bldVarA.e(ugi0Var, 3, fgs.f9506a, hgsVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new bqs(i, list, list2, num, hgsVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bqs bqsVar = (bqs) obj;
        bqsVar.getClass();
        hgs hgsVar = bqsVar.d;
        Integer num = bqsVar.c;
        List list = bqsVar.b;
        List list2 = bqsVar.f3048a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bqs.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || hgsVar != null) {
            cldVarA.p(ugi0Var, 3, fgs.f9506a, hgsVar);
        }
        cldVarA.c(ugi0Var);
    }
}
