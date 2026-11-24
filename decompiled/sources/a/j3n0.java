package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j3n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3n0 f15844a;
    private static final ugi0 descriptor;

    static {
        j3n0 j3n0Var = new j3n0();
        f15844a = j3n0Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.popular.data.models.SubSportResponse", j3n0Var, 4);
        zna0Var.j("subSportId", true);
        zna0Var.j("name", true);
        zna0Var.j("img", true);
        zna0Var.j("imgNew", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(ysm0.f43175a), mrv.j0(yel0.f42492a), mrv.j0((jiy) v3n0.e[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = v3n0.e;
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        cfl0 cfl0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                cfl0Var = (cfl0) bldVarA.e(ugi0Var, 2, yel0.f42492a, cfl0Var);
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
        return new v3n0(i, l, str, cfl0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v3n0 v3n0Var = (v3n0) obj;
        v3n0Var.getClass();
        List list = v3n0Var.d;
        cfl0 cfl0Var = v3n0Var.c;
        String str = v3n0Var.b;
        Long l = v3n0Var.f36737a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = v3n0.e;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || cfl0Var != null) {
            cldVarA.p(ugi0Var, 2, yel0.f42492a, cfl0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
