package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0e0 f23a;
    private static final ugi0 descriptor;

    static {
        a0e0 a0e0Var = new a0e0();
        f23a = a0e0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.match.RainbowStatisticMatchesMatchTeamPlayerResponse", a0e0Var, 8);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("kost", true);
        zna0Var.j("eps", true);
        zna0Var.j("kpr", true);
        zna0Var.j("hs", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(klqVar), mrv.j0(okxVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        Float f = null;
        Integer num4 = null;
        Float f2 = null;
        Float f3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    f = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num4);
                    i |= 32;
                    break;
                case 6:
                    f2 = (Float) bldVarA.e(ugi0Var, 6, klq.f18504a, f2);
                    i |= 64;
                    break;
                case 7:
                    f3 = (Float) bldVarA.e(ugi0Var, 7, klq.f18504a, f3);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new c0e0(i, num, str, num2, num3, f, num4, f2, f3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c0e0 c0e0Var = (c0e0) obj;
        c0e0Var.getClass();
        Float f = c0e0Var.h;
        Float f2 = c0e0Var.g;
        Integer num = c0e0Var.f;
        Float f3 = c0e0Var.e;
        Integer num2 = c0e0Var.d;
        Integer num3 = c0e0Var.c;
        String str = c0e0Var.b;
        Integer num4 = c0e0Var.f3521a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 6, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 7, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
