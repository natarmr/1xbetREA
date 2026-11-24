package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v2u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2u0 f36705a;
    private static final ugi0 descriptor;

    static {
        v2u0 v2u0Var = new v2u0();
        f36705a = v2u0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.players_statistic.data.models.ValueColTitleResponse", v2u0Var, 3);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("title", true);
        zna0Var.j(SDPKeywords.PROMPT, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new z2u0(i, l, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z2u0 z2u0Var = (z2u0) obj;
        z2u0Var.getClass();
        String str = z2u0Var.c;
        String str2 = z2u0Var.b;
        Long l = z2u0Var.f43689a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
