package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oyr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oyr0 f26072a;
    private static final ugi0 descriptor;

    static {
        oyr0 oyr0Var = new oyr0();
        f26072a = oyr0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.TournamentCardResponse.BlockHeader", oyr0Var, 13);
        zna0Var.j("title", true);
        zna0Var.j("currencyId", true);
        zna0Var.j("mediaValue", true);
        zna0Var.j("startDt", true);
        zna0Var.j("endDt", true);
        zna0Var.j("description", true);
        zna0Var.j("prizeTitle", true);
        zna0Var.j("prizePool", true);
        zna0Var.j("sum", true);
        zna0Var.j("currencySymbol", true);
        zna0Var.j("freeSpins", true);
        zna0Var.j("buttons", true);
        zna0Var.j("counter", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(mf9.f21683a), mrv.j0(vyr0.f38263a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        of9 of9Var = null;
        Integer num = null;
        String str = null;
        xyr0 xyr0Var = null;
        Long l = null;
        int i = 0;
        String str2 = null;
        Long l2 = null;
        String str3 = null;
        Long l3 = null;
        Long l4 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    num = num;
                    of9Var = of9Var;
                    break;
                case 0:
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    num = num;
                    of9Var = of9Var;
                    break;
                case 1:
                    of9Var = of9Var;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    str2 = str2;
                    of9Var = of9Var;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 3:
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 4:
                    l4 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l4);
                    i |= 16;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 7:
                    str6 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str6);
                    i |= 128;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 11:
                    of9Var = (of9) bldVarA.e(ugi0Var, 11, mf9.f21683a, of9Var);
                    i |= 2048;
                    str2 = str2;
                    l2 = l2;
                    break;
                case 12:
                    xyr0Var = (xyr0) bldVarA.e(ugi0Var, 12, vyr0.f38263a, xyr0Var);
                    i |= 4096;
                    str2 = str2;
                    l2 = l2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num2 = num;
        bldVarA.c(ugi0Var);
        return new qyr0(i, str2, l2, str3, l3, l4, str4, str5, str6, l, str, num2, of9Var, xyr0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qyr0 qyr0Var = (qyr0) obj;
        qyr0Var.getClass();
        xyr0 xyr0Var = qyr0Var.m;
        of9 of9Var = qyr0Var.l;
        Integer num = qyr0Var.k;
        String str = qyr0Var.j;
        Long l = qyr0Var.i;
        String str2 = qyr0Var.h;
        String str3 = qyr0Var.g;
        String str4 = qyr0Var.f;
        Long l2 = qyr0Var.e;
        Long l3 = qyr0Var.d;
        String str5 = qyr0Var.c;
        Long l4 = qyr0Var.b;
        String str6 = qyr0Var.f29550a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || of9Var != null) {
            cldVarA.p(ugi0Var, 11, mf9.f21683a, of9Var);
        }
        if (cldVarA.u(ugi0Var) || xyr0Var != 0) {
            cldVarA.p(ugi0Var, 12, vyr0.f38263a, xyr0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
