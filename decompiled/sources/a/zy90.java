package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zy90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zy90 f45195a;
    private static final ugi0 descriptor;

    static {
        zy90 zy90Var = new zy90();
        f45195a = zy90Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.biography.data.models.PlayerBiographyCommonResponse", zy90Var, 4);
        zna0Var.j("teams", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0((jiy) bz90.e[0].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(hz90.f13897a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bz90.e;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        jz90 jz90Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                jz90Var = (jz90) bldVarA.e(ugi0Var, 3, hz90.f13897a, jz90Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new bz90(i, list, num, num2, jz90Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bz90 bz90Var = (bz90) obj;
        bz90Var.getClass();
        jz90 jz90Var = bz90Var.d;
        Integer num = bz90Var.c;
        Integer num2 = bz90Var.b;
        List list = bz90Var.f3455a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bz90.e;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || jz90Var != null) {
            cldVarA.p(ugi0Var, 3, hz90.f13897a, jz90Var);
        }
        cldVarA.c(ugi0Var);
    }
}
