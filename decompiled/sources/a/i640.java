package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i640 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i640 f14223a;
    private static final ugi0 descriptor;

    static {
        i640 i640Var = new i640();
        f14223a = i640Var;
        zna0 zna0Var = new zna0("org.xplatform.messages.data.models.MessageResponse", i640Var, 8);
        zna0Var.j("readTime", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("title", true);
        zna0Var.j(ParameterNames.TEXT, true);
        zna0Var.j("img", true);
        zna0Var.j(CrashHianalyticsData.TIME, true);
        zna0Var.j("isMatchOfDays", true);
        zna0Var.j("extension", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(u440.f35027a)};
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
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num2 = null;
        Boolean bool = null;
        w440 w440Var = null;
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
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                case 7:
                    w440Var = (w440) bldVarA.e(ugi0Var, 7, u440.f35027a, w440Var);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new m640(i, num, str, str2, str3, str4, num2, bool, w440Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m640 m640Var = (m640) obj;
        m640Var.getClass();
        w440 w440Var = m640Var.h;
        Boolean bool = m640Var.g;
        Integer num = m640Var.f;
        String str = m640Var.e;
        String str2 = m640Var.d;
        String str3 = m640Var.c;
        String str4 = m640Var.b;
        Integer num2 = m640Var.f21250a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
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
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || w440Var != null) {
            cldVarA.p(ugi0Var, 7, u440.f35027a, w440Var);
        }
        cldVarA.c(ugi0Var);
    }
}
