package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z340 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z340 f43702a;
    private static final ugi0 descriptor;

    static {
        z340 z340Var = new z340();
        f43702a = z340Var;
        zna0 zna0Var = new zna0("org.xplatform.messages.data.models.MessageExtensionDataResponse", z340Var, 19);
        zna0Var.j("externalURL", true);
        zna0Var.j("mainSection", true);
        zna0Var.j("lineLive", true);
        zna0Var.j("target", true);
        zna0Var.j("cybertype", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("champId", true);
        zna0Var.j("gameId", true);
        zna0Var.j("casinoSubcategoryId", true);
        zna0Var.j("casinoTournamentId", true);
        zna0Var.j("casinoProviderId", true);
        zna0Var.j("casinoBrandId", true);
        zna0Var.j("casinoPartId", true);
        zna0Var.j("casinoSection", true);
        zna0Var.j("promocode", true);
        zna0Var.j("actionId", true);
        zna0Var.j("limitType", true);
        zna0Var.j("callbackId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        int i2 = 0;
        Long l7 = null;
        String str2 = null;
        String str3 = null;
        Long l8 = null;
        Integer num = null;
        Long l9 = null;
        Long l10 = null;
        Long l11 = null;
        boolean z = true;
        String str4 = null;
        String str5 = null;
        Integer num2 = null;
        Long l12 = null;
        Integer num3 = null;
        Long l13 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str4;
                    z = false;
                    l3 = l3;
                    l11 = l11;
                    str4 = str;
                    l2 = l2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i2 |= 1;
                    l3 = l3;
                    l10 = l10;
                    l11 = l11;
                    str4 = str;
                    l2 = l2;
                    break;
                case 1:
                    l = l10;
                    str5 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str5);
                    i2 |= 2;
                    num2 = num2;
                    l10 = l;
                    l11 = l11;
                    l2 = l2;
                    break;
                case 2:
                    l = l10;
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i2 |= 4;
                    l10 = l;
                    l11 = l11;
                    l2 = l2;
                    break;
                case 3:
                    l = l10;
                    l12 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l12);
                    i2 |= 8;
                    l10 = l;
                    l11 = l11;
                    l2 = l2;
                    break;
                case 4:
                    l = l10;
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i2 |= 16;
                    l10 = l;
                    l11 = l11;
                    l2 = l2;
                    break;
                case 5:
                    l = l10;
                    l13 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l13);
                    i2 |= 32;
                    l10 = l;
                    l11 = l11;
                    l2 = l2;
                    break;
                case 6:
                    l2 = l2;
                    l11 = l11;
                    l10 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l10);
                    i2 |= 64;
                    l11 = l11;
                    l2 = l2;
                    break;
                case 7:
                    l2 = l2;
                    l11 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l11);
                    i2 |= 128;
                    l10 = l10;
                    l2 = l2;
                    break;
                case 8:
                    l10 = l10;
                    l11 = l11;
                    l6 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l6);
                    i2 |= 256;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 9:
                    l10 = l10;
                    l11 = l11;
                    l4 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l4);
                    i2 |= 512;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 10:
                    l10 = l10;
                    l11 = l11;
                    l3 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l3);
                    i2 |= 1024;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 11:
                    l10 = l10;
                    l11 = l11;
                    l2 = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l2);
                    i2 |= 2048;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 12:
                    l10 = l10;
                    l11 = l11;
                    l5 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l5);
                    i2 |= 4096;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 13:
                    l10 = l10;
                    l11 = l11;
                    l7 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l7);
                    i2 |= 8192;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 14:
                    l10 = l10;
                    l11 = l11;
                    str2 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str2);
                    i2 |= 16384;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 15:
                    str3 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str3);
                    i = 32768;
                    i2 |= i;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 16:
                    l8 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l8);
                    i = 65536;
                    i2 |= i;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 17:
                    num = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num);
                    i = 131072;
                    i2 |= i;
                    l10 = l10;
                    l11 = l11;
                    break;
                case 18:
                    l9 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l9);
                    i = 262144;
                    i2 |= i;
                    l10 = l10;
                    l11 = l11;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l14 = l2;
        Long l15 = l11;
        String str6 = str4;
        String str7 = str5;
        Integer num4 = num2;
        bldVarA.c(ugi0Var);
        return new b440(i2, str6, str7, num4, l12, num3, l13, l10, l15, l6, l4, l3, l14, l5, l7, str2, str3, l8, num, l9);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b440 b440Var = (b440) obj;
        b440Var.getClass();
        Long l = b440Var.s;
        Integer num = b440Var.r;
        Long l2 = b440Var.q;
        String str = b440Var.p;
        String str2 = b440Var.o;
        Long l3 = b440Var.n;
        Long l4 = b440Var.m;
        Long l5 = b440Var.l;
        Long l6 = b440Var.k;
        Long l7 = b440Var.j;
        Long l8 = b440Var.i;
        Long l9 = b440Var.h;
        Long l10 = b440Var.g;
        Long l11 = b440Var.f;
        Integer num2 = b440Var.e;
        Long l12 = b440Var.d;
        Integer num3 = b440Var.c;
        String str3 = b440Var.b;
        String str4 = b440Var.f1940a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l12 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l12);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l11 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l11);
        }
        if (cldVarA.u(ugi0Var) || l10 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l10);
        }
        if (cldVarA.u(ugi0Var) || l9 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l9);
        }
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
