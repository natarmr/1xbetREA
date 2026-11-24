package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gof implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gof f11628a;
    private static final ugi0 descriptor;

    static {
        gof gofVar = new gof();
        f11628a = gofVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2KillGameLogResponse", gofVar, 16);
        zna0Var.j("killer", true);
        zna0Var.j("killerSide", true);
        zna0Var.j("victim", true);
        zna0Var.j("victimSide", true);
        zna0Var.j("weapon", true);
        zna0Var.j("headShot", true);
        zna0Var.j("penetrated", true);
        zna0Var.j("throughSmoke", true);
        zna0Var.j("noScope", true);
        zna0Var.j("killerBlind", true);
        zna0Var.j("assister", true);
        zna0Var.j("flasher", true);
        zna0Var.j("flasherSide", true);
        zna0Var.j("assisterSide", true);
        zna0Var.j("vX", true);
        zna0Var.j("vY", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        hsf hsfVar = hsf.f13579a;
        jiy jiyVarJ1 = mrv.j0(hsfVar);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(hsfVar);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(sm8Var);
        jiy jiyVarJ7 = mrv.j0(sm8Var);
        jiy jiyVarJ8 = mrv.j0(sm8Var);
        jiy jiyVarJ9 = mrv.j0(sm8Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0(hsfVar);
        jiy jiyVarJ13 = mrv.j0(hsfVar);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        gsf gsfVar;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        gsf gsfVar2 = null;
        Boolean bool2 = null;
        int i = 0;
        gsf gsfVar3 = null;
        Integer num = null;
        Integer num2 = null;
        gsf gsfVar4 = null;
        String str4 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        boolean z = true;
        String str5 = null;
        gsf gsfVar5 = null;
        String str6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str5;
                    z = false;
                    str3 = str3;
                    str4 = str4;
                    str5 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str5);
                    i |= 1;
                    str3 = str3;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    str5 = str;
                    str2 = str2;
                    break;
                case 1:
                    gsfVar = gsfVar4;
                    gsfVar5 = (gsf) bldVarA.e(ugi0Var, 1, hsf.f13579a, gsfVar5);
                    i |= 2;
                    str6 = str6;
                    gsfVar4 = gsfVar;
                    str4 = str4;
                    str2 = str2;
                    break;
                case 2:
                    gsfVar = gsfVar4;
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i |= 4;
                    gsfVar4 = gsfVar;
                    str4 = str4;
                    str2 = str2;
                    break;
                case 3:
                    str2 = str2;
                    str4 = str4;
                    gsfVar4 = (gsf) bldVarA.e(ugi0Var, 3, hsf.f13579a, gsfVar4);
                    i |= 8;
                    str4 = str4;
                    str2 = str2;
                    break;
                case 4:
                    str2 = str2;
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    gsfVar4 = gsfVar4;
                    str2 = str2;
                    break;
                case 5:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool3);
                    i |= 32;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 6:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool4);
                    i |= 64;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 7:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool5);
                    i |= 128;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 8:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool2);
                    i |= 256;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 9:
                    bool = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool);
                    i |= 512;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 10:
                    str3 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str3);
                    i |= 1024;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 11:
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i |= 2048;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 12:
                    gsfVar2 = (gsf) bldVarA.e(ugi0Var, 12, hsf.f13579a, gsfVar2);
                    i |= 4096;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 13:
                    gsfVar3 = (gsf) bldVarA.e(ugi0Var, 13, hsf.f13579a, gsfVar3);
                    i |= 8192;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 14:
                    num = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num);
                    i |= 16384;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                case 15:
                    num2 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num2);
                    i |= 32768;
                    gsfVar4 = gsfVar4;
                    str4 = str4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str7 = str2;
        String str8 = str4;
        String str9 = str5;
        gsf gsfVar6 = gsfVar5;
        String str10 = str6;
        bldVarA.c(ugi0Var);
        return new iof(i, str9, gsfVar6, str10, gsfVar4, str8, bool3, bool4, bool5, bool2, bool, str3, str7, gsfVar2, gsfVar3, num, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iof iofVar = (iof) obj;
        iofVar.getClass();
        Integer num = iofVar.p;
        Integer num2 = iofVar.o;
        gsf gsfVar = iofVar.n;
        gsf gsfVar2 = iofVar.m;
        String str = iofVar.l;
        String str2 = iofVar.k;
        Boolean bool = iofVar.j;
        Boolean bool2 = iofVar.i;
        Boolean bool3 = iofVar.h;
        Boolean bool4 = iofVar.g;
        Boolean bool5 = iofVar.f;
        String str3 = iofVar.e;
        gsf gsfVar3 = iofVar.d;
        String str4 = iofVar.c;
        gsf gsfVar4 = iofVar.b;
        String str5 = iofVar.f15114a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || gsfVar4 != null) {
            cldVarA.p(ugi0Var, 1, hsf.f13579a, gsfVar4);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || gsfVar3 != null) {
            cldVarA.p(ugi0Var, 3, hsf.f13579a, gsfVar3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || gsfVar2 != 0) {
            cldVarA.p(ugi0Var, 12, hsf.f13579a, gsfVar2);
        }
        if (cldVarA.u(ugi0Var) || gsfVar != 0) {
            cldVarA.p(ugi0Var, 13, hsf.f13579a, gsfVar);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
