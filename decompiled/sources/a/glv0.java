package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class glv0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final glv0 f11515a;
    private static final ugi0 descriptor;

    static {
        glv0 glv0Var = new glv0();
        f11515a = glv0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.winter_games.impl.winter_game_result.data.model.WinterGameResultInfoResponse", glv0Var, 15);
        zna0Var.j("competitor", true);
        zna0Var.j("position", true);
        zna0Var.j("totalTime", true);
        zna0Var.j("diffTime", true);
        zna0Var.j("shooting1", true);
        zna0Var.j("shooting2", true);
        zna0Var.j("diffCircle", true);
        zna0Var.j("totalScore", true);
        zna0Var.j("run1Meters", true);
        zna0Var.j("run2Meters", true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("jumps", true);
        zna0Var.j("run1Time", true);
        zna0Var.j("run2Time", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        String str2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Integer num = null;
        Double d4 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Double d5 = null;
        boolean z = true;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str7;
                    z = false;
                    d2 = d2;
                    str6 = str6;
                    str7 = str;
                    d = d;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str7);
                    i |= 1;
                    d2 = d2;
                    str5 = str5;
                    str6 = str6;
                    str7 = str;
                    d = d;
                    break;
                case 1:
                    str2 = str6;
                    str8 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str8);
                    i |= 2;
                    str5 = str5;
                    str6 = str2;
                    d = d;
                    break;
                case 2:
                    str2 = str6;
                    str5 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str5);
                    i |= 4;
                    str6 = str2;
                    d = d;
                    break;
                case 3:
                    d = d;
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i |= 8;
                    str5 = str5;
                    d = d;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 5:
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i |= 32;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 6:
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i |= 64;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 7:
                    d5 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d5);
                    i |= 128;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 8:
                    d4 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d4);
                    i |= 256;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 9:
                    d3 = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d3);
                    i |= 512;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 10:
                    d2 = (Double) bldVarA.e(ugi0Var, 10, tbl.f33669a, d2);
                    i |= 1024;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 11:
                    d = (Double) bldVarA.e(ugi0Var, 11, tbl.f33669a, d);
                    i |= 2048;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 12:
                    num = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num);
                    i |= 4096;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 13:
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i |= 8192;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 14:
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i |= 16384;
                    str5 = str5;
                    str6 = str6;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Double d6 = d;
        String str9 = str6;
        bldVarA.c(ugi0Var);
        return new ilv0(i, str7, str8, str5, str9, num2, num3, num4, d5, d4, d3, d2, d6, num, str3, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ilv0 ilv0Var = (ilv0) obj;
        ilv0Var.getClass();
        String str = ilv0Var.o;
        String str2 = ilv0Var.n;
        Integer num = ilv0Var.m;
        Double d = ilv0Var.l;
        Double d2 = ilv0Var.k;
        Double d3 = ilv0Var.j;
        Double d4 = ilv0Var.i;
        Double d5 = ilv0Var.h;
        Integer num2 = ilv0Var.g;
        Integer num3 = ilv0Var.f;
        Integer num4 = ilv0Var.e;
        String str3 = ilv0Var.d;
        String str4 = ilv0Var.c;
        String str5 = ilv0Var.b;
        String str6 = ilv0Var.f14997a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 10, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 11, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
