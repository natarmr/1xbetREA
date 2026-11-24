package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nje0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nje0 f23631a;
    private static final ugi0 descriptor;

    static {
        nje0 nje0Var = new nje0();
        f23631a = nje0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.referee.referee_team.data.models.RefereeTeamInfoResponse", nje0Var, 14);
        zna0Var.j("team", true);
        zna0Var.j("winRatio", true);
        zna0Var.j("loseRatio", true);
        zna0Var.j("drawRatio", true);
        zna0Var.j("pointsPerGame", true);
        zna0Var.j("penaltiesAwardedAgainstPerGame", true);
        zna0Var.j("foulsAwardedAgainstPerGame", true);
        zna0Var.j("foulsPerTackle", true);
        zna0Var.j("yellowCdsPerGame", true);
        zna0Var.j("redCdsPerGame", true);
        zna0Var.j("numParticipations", true);
        zna0Var.j("yellowCds", true);
        zna0Var.j("redCds", true);
        zna0Var.j("penalties", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(tblVar);
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(tblVar);
        jiy jiyVarJ5 = mrv.j0(tblVar);
        jiy jiyVarJ6 = mrv.j0(tblVar);
        jiy jiyVarJ7 = mrv.j0(tblVar);
        jiy jiyVarJ8 = mrv.j0(tblVar);
        jiy jiyVarJ9 = mrv.j0(tblVar);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        Integer num3 = null;
        Double d2 = null;
        int i = 0;
        Integer num4 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        boolean z = true;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str2;
                    z = false;
                    num2 = num2;
                    d4 = d4;
                    str2 = str;
                    num = num;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    d3 = d3;
                    num2 = num2;
                    d4 = d4;
                    str2 = str;
                    num = num;
                    break;
                case 1:
                    num = num;
                    d3 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d3);
                    i |= 2;
                    d4 = d4;
                    num = num;
                    break;
                case 2:
                    num = num;
                    d4 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d4);
                    i |= 4;
                    d3 = d3;
                    num = num;
                    break;
                case 3:
                    d5 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d5);
                    i |= 8;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 4:
                    d6 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d6);
                    i |= 16;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 5:
                    d7 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d7);
                    i |= 32;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 6:
                    d8 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d8);
                    i |= 64;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 7:
                    d9 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d9);
                    i |= 128;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 8:
                    d2 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d2);
                    i |= 256;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 9:
                    d = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d);
                    i |= 512;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 10:
                    num2 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num2);
                    i |= 1024;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 11:
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i |= 2048;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 12:
                    num3 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num3);
                    i |= 4096;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 13:
                    num4 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num4);
                    i |= 8192;
                    d3 = d3;
                    d4 = d4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num5 = num;
        String str3 = str2;
        bldVarA.c(ugi0Var);
        return new pje0(i, str3, d3, d4, d5, d6, d7, d8, d9, d2, d, num2, num5, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pje0 pje0Var = (pje0) obj;
        pje0Var.getClass();
        Integer num = pje0Var.n;
        Integer num2 = pje0Var.m;
        Integer num3 = pje0Var.l;
        Integer num4 = pje0Var.k;
        Double d = pje0Var.j;
        Double d2 = pje0Var.i;
        Double d3 = pje0Var.h;
        Double d4 = pje0Var.g;
        Double d5 = pje0Var.f;
        Double d6 = pje0Var.e;
        Double d7 = pje0Var.d;
        Double d8 = pje0Var.c;
        Double d9 = pje0Var.b;
        String str = pje0Var.f27087a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d9 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d9);
        }
        if (cldVarA.u(ugi0Var) || d8 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d8);
        }
        if (cldVarA.u(ugi0Var) || d7 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d7);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
