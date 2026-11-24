package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g010 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g010 f10438a;
    private static final ugi0 descriptor;

    static {
        g010 g010Var = new g010();
        f10438a = g010Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.cyber_info.lol.data.model.LolGroupTeamResponse", g010Var, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("feedId", true);
        zna0Var.j("teamName", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("score", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(i010.f13930a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        k010 k010Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else if (iF == 3) {
                str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                k010Var = (k010) bldVarA.e(ugi0Var, 4, i010.f13930a, k010Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new l010(i, l, l2, str, str2, k010Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l010 l010Var = (l010) obj;
        l010Var.getClass();
        k010 k010Var = l010Var.e;
        String str = l010Var.d;
        String str2 = l010Var.c;
        Long l = l010Var.b;
        Long l2 = l010Var.f19177a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || k010Var != null) {
            cldVarA.p(ugi0Var, 4, i010.f13930a, k010Var);
        }
        cldVarA.c(ugi0Var);
    }
}
