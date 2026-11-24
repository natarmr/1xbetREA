package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hv70 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hv70 f13713a;
    private static final ugi0 descriptor;

    static {
        hv70 hv70Var = new hv70();
        f13713a = hv70Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.web_view.webview_messages.OpenAggregatorMessage", hv70Var, 5);
        zna0Var.j("section", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("filterId", true);
        zna0Var.j("partId", true);
        zna0Var.j(ParameterNames.ID, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else if (iF == 3) {
                str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new jv70(i, str, str2, str3, str4, str5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jv70 jv70Var = (jv70) obj;
        jv70Var.getClass();
        String str = jv70Var.e;
        String str2 = jv70Var.d;
        String str3 = jv70Var.c;
        String str4 = jv70Var.b;
        String str5 = jv70Var.f17195a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
