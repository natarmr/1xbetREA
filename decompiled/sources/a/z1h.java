package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z1h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1h f43619a;
    private static final ugi0 descriptor;

    static {
        z1h z1hVar = new z1h();
        f43619a = z1hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.lastmatches.CyberLastMatchesResponse", z1hVar, 4);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("headToHead", true);
        zna0Var.j(ParameterNames.INFO, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(w0h.f38348a), mrv.j0(w1h.f38398a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        y0h y0hVar = null;
        y1h y1hVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                y0hVar = (y0h) bldVarA.e(ugi0Var, 2, w0h.f38348a, y0hVar);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                y1hVar = (y1h) bldVarA.e(ugi0Var, 3, w1h.f38398a, y1hVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new b2h(i, str, str2, y0hVar, y1hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b2h b2hVar = (b2h) obj;
        b2hVar.getClass();
        y1h y1hVar = b2hVar.d;
        y0h y0hVar = b2hVar.c;
        String str = b2hVar.b;
        String str2 = b2hVar.f1852a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || y0hVar != null) {
            cldVarA.p(ugi0Var, 2, w0h.f38348a, y0hVar);
        }
        if (cldVarA.u(ugi0Var) || y1hVar != null) {
            cldVarA.p(ugi0Var, 3, w1h.f38398a, y1hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
