package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qpf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qpf f29115a;
    private static final ugi0 descriptor;

    static {
        qpf qpfVar = new qpf();
        f29115a = qpfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2MatchInfoResponse", qpfVar, 13);
        zna0Var.j("N", true);
        zna0Var.j("Period", true);
        zna0Var.j("Sc1", true);
        zna0Var.j("Sc2", true);
        zna0Var.j("MW", true);
        zna0Var.j("SCt1", true);
        zna0Var.j("SCct1", true);
        zna0Var.j("SCt2", true);
        zna0Var.j("SCct2", true);
        zna0Var.j("fR1", true);
        zna0Var.j("sR1", true);
        zna0Var.j("fR2", true);
        zna0Var.j("sR2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        hsf hsfVar = hsf.f13579a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, mrv.j0(hsfVar), mrv.j0(hsfVar), mrv.j0(hsfVar), mrv.j0(hsfVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        gsf gsfVar = null;
        gsf gsfVar2 = null;
        gsf gsfVar3 = null;
        gsf gsfVar4 = null;
        Integer num = null;
        int i = 0;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    gsfVar2 = gsfVar2;
                    gsfVar = gsfVar;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    gsfVar2 = gsfVar2;
                    gsfVar = gsfVar;
                    break;
                case 1:
                    gsfVar = gsfVar;
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    str = str;
                    gsfVar = gsfVar;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    str = str;
                    num2 = num2;
                    break;
                case 3:
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i |= 8;
                    str = str;
                    num2 = num2;
                    break;
                case 4:
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i |= 16;
                    str = str;
                    num2 = num2;
                    break;
                case 5:
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i |= 32;
                    str = str;
                    num2 = num2;
                    break;
                case 6:
                    num7 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num7);
                    i |= 64;
                    str = str;
                    num2 = num2;
                    break;
                case 7:
                    num8 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num8);
                    i |= 128;
                    str = str;
                    num2 = num2;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    str = str;
                    num2 = num2;
                    break;
                case 9:
                    gsfVar3 = (gsf) bldVarA.e(ugi0Var, 9, hsf.f13579a, gsfVar3);
                    i |= 512;
                    str = str;
                    num2 = num2;
                    break;
                case 10:
                    gsfVar2 = (gsf) bldVarA.e(ugi0Var, 10, hsf.f13579a, gsfVar2);
                    i |= 1024;
                    str = str;
                    num2 = num2;
                    break;
                case 11:
                    gsfVar = (gsf) bldVarA.e(ugi0Var, 11, hsf.f13579a, gsfVar);
                    i |= 2048;
                    str = str;
                    num2 = num2;
                    break;
                case 12:
                    gsfVar4 = (gsf) bldVarA.e(ugi0Var, 12, hsf.f13579a, gsfVar4);
                    i |= 4096;
                    str = str;
                    num2 = num2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        gsf gsfVar5 = gsfVar2;
        bldVarA.c(ugi0Var);
        return new spf(i, str, num2, num3, num4, num5, num6, num7, num8, num, gsfVar3, gsfVar5, gsfVar, gsfVar4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        spf spfVar = (spf) obj;
        spfVar.getClass();
        gsf gsfVar = spfVar.m;
        gsf gsfVar2 = spfVar.l;
        gsf gsfVar3 = spfVar.k;
        gsf gsfVar4 = spfVar.j;
        Integer num = spfVar.i;
        Integer num2 = spfVar.h;
        Integer num3 = spfVar.g;
        Integer num4 = spfVar.f;
        Integer num5 = spfVar.e;
        Integer num6 = spfVar.d;
        Integer num7 = spfVar.c;
        Integer num8 = spfVar.b;
        String str = spfVar.f32590a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || gsfVar4 != null) {
            cldVarA.p(ugi0Var, 9, hsf.f13579a, gsfVar4);
        }
        if (cldVarA.u(ugi0Var) || gsfVar3 != null) {
            cldVarA.p(ugi0Var, 10, hsf.f13579a, gsfVar3);
        }
        if (cldVarA.u(ugi0Var) || gsfVar2 != null) {
            cldVarA.p(ugi0Var, 11, hsf.f13579a, gsfVar2);
        }
        if (cldVarA.u(ugi0Var) || gsfVar != 0) {
            cldVarA.p(ugi0Var, 12, hsf.f13579a, gsfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
