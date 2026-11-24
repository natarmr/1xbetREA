package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k88 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k88 f17862a;
    private static final ugi0 descriptor;

    static {
        k88 k88Var = new k88();
        f17862a = k88Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.BlockHeaderResponse", k88Var, 10);
        zna0Var.j("counter", true);
        zna0Var.j("currencyId", true);
        zna0Var.j("description", true);
        zna0Var.j("endDt", true);
        zna0Var.j("mediaValue", true);
        zna0Var.j("prizeTitle", true);
        zna0Var.j("prizePool", true);
        zna0Var.j("startDt", true);
        zna0Var.j("title", true);
        zna0Var.j("buttons", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(bpe.f2978a);
        jiy jiyVarJ1 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(mf9.f21683a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        of9 of9Var = null;
        boolean z = true;
        String str = null;
        int i = 0;
        dpe dpeVar = null;
        Integer num = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    dpeVar = (dpe) bldVarA.e(ugi0Var, 0, bpe.f2978a, dpeVar);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                case 9:
                    of9Var = (of9) bldVarA.e(ugi0Var, 9, mf9.f21683a, of9Var);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new m88(i, dpeVar, num, str2, l, str3, str4, str5, l2, str, of9Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m88 m88Var = (m88) obj;
        m88Var.getClass();
        of9 of9Var = m88Var.j;
        String str = m88Var.i;
        Long l = m88Var.h;
        String str2 = m88Var.g;
        String str3 = m88Var.f;
        String str4 = m88Var.e;
        Long l2 = m88Var.d;
        String str5 = m88Var.c;
        Integer num = m88Var.b;
        dpe dpeVar = m88Var.f21358a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || dpeVar != null) {
            cldVarA.p(ugi0Var, 0, bpe.f2978a, dpeVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || of9Var != null) {
            cldVarA.p(ugi0Var, 9, mf9.f21683a, of9Var);
        }
        cldVarA.c(ugi0Var);
    }
}
