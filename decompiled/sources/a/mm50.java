package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mm50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mm50 f22021a;
    private static final ugi0 descriptor;

    static {
        mm50 mm50Var = new mm50();
        f22021a = mm50Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.NewMessageWSEvent", mm50Var, 3);
        zna0Var.j(CrashHianalyticsData.MESSAGE, true);
        zna0Var.j("chatId", true);
        zna0Var.j("dialogId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(j640.f15967a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        n640 n640Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                n640Var = (n640) bldVarA.e(ugi0Var, 0, j640.f15967a, n640Var);
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
        return new om50(i, n640Var, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        om50 om50Var = (om50) obj;
        om50Var.getClass();
        String str = om50Var.c;
        String str2 = om50Var.b;
        n640 n640Var = om50Var.f25488a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || n640Var != null) {
            cldVarA.p(ugi0Var, 0, j640.f15967a, n640Var);
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
