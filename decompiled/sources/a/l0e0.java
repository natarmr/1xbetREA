package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0e0 f19197a;
    private static final ugi0 descriptor;

    static {
        l0e0 l0e0Var = new l0e0();
        f19197a = l0e0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.team.RainbowStatisticMatchesTeamPlayerResponse", l0e0Var, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("realName", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("stats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(o0e0.f24421a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        q0e0 q0e0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else if (iF == 3) {
                str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                q0e0Var = (q0e0) bldVarA.e(ugi0Var, 4, o0e0.f24421a, q0e0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new n0e0(i, num, str, str2, str3, q0e0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n0e0 n0e0Var = (n0e0) obj;
        n0e0Var.getClass();
        q0e0 q0e0Var = n0e0Var.e;
        String str = n0e0Var.d;
        String str2 = n0e0Var.c;
        String str3 = n0e0Var.b;
        Integer num = n0e0Var.f22696a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || q0e0Var != null) {
            cldVarA.p(ugi0Var, 4, o0e0.f24421a, q0e0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
