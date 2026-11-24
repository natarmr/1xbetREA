package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i0m0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0m0 f13954a;
    private static final ugi0 descriptor;

    static {
        i0m0 i0m0Var = new i0m0();
        f13954a = i0m0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stage_net.data.models.StageNetCellItemResponse", i0m0Var, 9);
        zna0Var.j("title", true);
        zna0Var.j("levelId", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("games", true);
        zna0Var.j("cell1", true);
        zna0Var.j("cell2", true);
        zna0Var.j("seed1", true);
        zna0Var.j("seed2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = k0m0.j;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(okx.f25427a);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0((jiy) a8zVarArr[4].getValue());
        i0m0 i0m0Var = f13954a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(i0m0Var), mrv.j0(i0m0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = k0m0.j;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        k0m0 k0m0Var = null;
        k0m0 k0m0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            i0m0 i0m0Var = f13954a;
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str3);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    k0m0Var = (k0m0) bldVarA.e(ugi0Var, 5, i0m0Var, k0m0Var);
                    i |= 32;
                    break;
                case 6:
                    k0m0Var2 = (k0m0) bldVarA.e(ugi0Var, 6, i0m0Var, k0m0Var2);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new k0m0(i, str3, num, str4, str5, list, k0m0Var, k0m0Var2, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k0m0 k0m0Var = (k0m0) obj;
        k0m0Var.getClass();
        String str = k0m0Var.i;
        String str2 = k0m0Var.h;
        k0m0 k0m0Var2 = k0m0Var.g;
        k0m0 k0m0Var3 = k0m0Var.f;
        List list = k0m0Var.e;
        String str3 = k0m0Var.d;
        String str4 = k0m0Var.c;
        Integer num = k0m0Var.b;
        String str5 = k0m0Var.f17476a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = k0m0.j;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        boolean zU = cldVarA.u(ugi0Var);
        i0m0 i0m0Var = f13954a;
        if (zU || k0m0Var3 != null) {
            cldVarA.p(ugi0Var, 5, i0m0Var, k0m0Var3);
        }
        if (cldVarA.u(ugi0Var) || k0m0Var2 != null) {
            cldVarA.p(ugi0Var, 6, i0m0Var, k0m0Var2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
