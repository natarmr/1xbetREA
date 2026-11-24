package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hte0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hte0 f13630a;
    private static final ugi0 descriptor;

    static {
        hte0 hte0Var = new hte0();
        f13630a = hte0Var;
        zna0 zna0Var = new zna0("org.xplatform.feature.online_call.impl.data.rating_dialog.models.RegisterCallUserFeedbackRequest", hte0Var, 6);
        zna0Var.j(ParameterNames.ID, false);
        zna0Var.j("callFeedback", false);
        zna0Var.j("comment", true);
        zna0Var.j("solve", true);
        zna0Var.j(RemoteMessageConst.FROM, true);
        zna0Var.j(RemoteMessageConst.TO, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, okx.f25427a, mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new jte0(i, strX, iJ, str, bool, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jte0 jte0Var = (jte0) obj;
        jte0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        String str = jte0Var.f17096a;
        String str2 = jte0Var.f;
        String str3 = jte0Var.e;
        Boolean bool = jte0Var.d;
        String str4 = jte0Var.c;
        cldVarA.z(ugi0Var, 0, str);
        cldVarA.i(1, jte0Var.b, ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        cldVarA.c(ugi0Var);
    }
}
