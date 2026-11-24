package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hbr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hbr f12783a;
    private static final ugi0 descriptor;

    static {
        hbr hbrVar = new hbr();
        f12783a = hbrVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.FullMatchInfoResponse", hbrVar, 6);
        zna0Var.j("tournamentStage", true);
        zna0Var.j("matchFormat", true);
        zna0Var.j("seriesScore", true);
        zna0Var.j("seeds", true);
        zna0Var.j("location", true);
        zna0Var.j("weather", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(avh0.f1524a), mrv.j0(ot00.f25808a), mrv.j0(r1v0.f29702a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        cvh0 cvh0Var = null;
        qt00 qt00Var = null;
        t1v0 t1v0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    cvh0Var = (cvh0) bldVarA.e(ugi0Var, 3, avh0.f1524a, cvh0Var);
                    i |= 8;
                    break;
                case 4:
                    qt00Var = (qt00) bldVarA.e(ugi0Var, 4, ot00.f25808a, qt00Var);
                    i |= 16;
                    break;
                case 5:
                    t1v0Var = (t1v0) bldVarA.e(ugi0Var, 5, r1v0.f29702a, t1v0Var);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new lbr(i, str, str2, str3, cvh0Var, qt00Var, t1v0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lbr lbrVar = (lbr) obj;
        lbrVar.getClass();
        t1v0 t1v0Var = lbrVar.f;
        qt00 qt00Var = lbrVar.e;
        cvh0 cvh0Var = lbrVar.d;
        String str = lbrVar.c;
        String str2 = lbrVar.b;
        String str3 = lbrVar.f19764a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || cvh0Var != null) {
            cldVarA.p(ugi0Var, 3, avh0.f1524a, cvh0Var);
        }
        if (cldVarA.u(ugi0Var) || qt00Var != null) {
            cldVarA.p(ugi0Var, 4, ot00.f25808a, qt00Var);
        }
        if (cldVarA.u(ugi0Var) || t1v0Var != null) {
            cldVarA.p(ugi0Var, 5, r1v0.f29702a, t1v0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
