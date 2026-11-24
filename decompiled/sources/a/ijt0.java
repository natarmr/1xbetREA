package a;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ijt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ijt0 f14893a;
    private static final ugi0 descriptor;

    static {
        ijt0 ijt0Var = new ijt0();
        f14893a = ijt0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.UpdateEditMessageWSEvent", ijt0Var, 3);
        zna0Var.j("chatId", true);
        zna0Var.j("dialogId", true);
        zna0Var.j(CrashHianalyticsData.MESSAGE, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(j640.f15967a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        n640 n640Var = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                n640Var = (n640) bldVarA.e(ugi0Var, 2, j640.f15967a, n640Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new kjt0(i, n640Var, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kjt0 kjt0Var = (kjt0) obj;
        kjt0Var.getClass();
        n640 n640Var = kjt0Var.c;
        String str = kjt0Var.b;
        String str2 = kjt0Var.f18403a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || n640Var != null) {
            cldVarA.p(ugi0Var, 2, j640.f15967a, n640Var);
        }
        cldVarA.c(ugi0Var);
    }
}
