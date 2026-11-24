package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bxa0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bxa0 f3367a;
    private static final ugi0 descriptor;

    static {
        bxa0 bxa0Var = new bxa0();
        f3367a = bxa0Var;
        zna0 zna0Var = new zna0("org.xplatform.messages.data.models.PopUpResponse", bxa0Var, 6);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j(CrashHianalyticsData.TIME, true);
        zna0Var.j("title", true);
        zna0Var.j("typeId", true);
        zna0Var.j("extension", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ywa0.f43362a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Integer num2 = null;
        axa0 axa0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    break;
                case 5:
                    axa0Var = (axa0) bldVarA.e(ugi0Var, 5, ywa0.f43362a, axa0Var);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new dxa0(i, str, str2, num, str3, num2, axa0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dxa0 dxa0Var = (dxa0) obj;
        dxa0Var.getClass();
        axa0 axa0Var = dxa0Var.f;
        Integer num = dxa0Var.e;
        String str = dxa0Var.d;
        Integer num2 = dxa0Var.c;
        String str2 = dxa0Var.b;
        String str3 = dxa0Var.f6839a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || axa0Var != null) {
            cldVarA.p(ugi0Var, 5, ywa0.f43362a, axa0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
