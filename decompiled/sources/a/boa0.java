package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class boa0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boa0 f2925a;
    private static final ugi0 descriptor;

    static {
        boa0 boa0Var = new boa0();
        f2925a = boa0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.match_progress.match_progress_main.data.models.PointByPointsResponse", boa0Var, 10);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("server", true);
        zna0Var.j("isLostServe", true);
        zna0Var.j("advScore1", true);
        zna0Var.j("advScore2", true);
        zna0Var.j("points", true);
        zna0Var.j("tieBreak", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = doa0.k;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        a8z[] a8zVarArr;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr2 = doa0.k;
        List list = null;
        List list2 = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    a8zVarArr = a8zVarArr2;
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    a8zVarArr = a8zVarArr2;
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    break;
                case 2:
                    a8zVarArr = a8zVarArr2;
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    a8zVarArr = a8zVarArr2;
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    a8zVarArr = a8zVarArr2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    a8zVarArr = a8zVarArr2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i |= 32;
                    break;
                case 6:
                    a8zVarArr = a8zVarArr2;
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    break;
                case 7:
                    a8zVarArr = a8zVarArr2;
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                case 8:
                    a8zVarArr = a8zVarArr2;
                    list2 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
                    i |= 256;
                    break;
                case 9:
                    a8zVarArr = a8zVarArr2;
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr2[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr2 = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new doa0(i, str2, str3, num, num2, num3, bool, str4, str, list2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        doa0 doa0Var = (doa0) obj;
        doa0Var.getClass();
        List list = doa0Var.j;
        List list2 = doa0Var.i;
        String str = doa0Var.h;
        String str2 = doa0Var.g;
        Boolean bool = doa0Var.f;
        Integer num = doa0Var.e;
        Integer num2 = doa0Var.d;
        Integer num3 = doa0Var.c;
        String str3 = doa0Var.b;
        String str4 = doa0Var.f6406a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = doa0.k;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
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
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
