package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h3z implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3z f12409a;
    private static final ugi0 descriptor;

    static {
        h3z h3zVar = new h3z();
        f12409a = h3zVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.metrics.api.models.LaunchEntityRequest", h3zVar, 2);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j(Payload.TYPE, false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new j3z(str, i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j3z j3zVar = (j3z) obj;
        j3zVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, j3zVar.f15859a);
        cldVarA.p(ugi0Var, 1, ysm0.f43175a, j3zVar.b);
        cldVarA.c(ugi0Var);
    }
}
