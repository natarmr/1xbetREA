package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gwv implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gwv f12047a;
    private static final ugi0 descriptor;

    static {
        gwv gwvVar = new gwv();
        f12047a = gwvVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.hiddenbetting.data.response.HiddenBettingAppLinkResponse", gwvVar, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(iwv.f15510a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        kwv kwvVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                kwvVar = (kwv) bldVarA.e(ugi0Var, 0, iwv.f15510a, kwvVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new lwv(i, kwvVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lwv lwvVar = (lwv) obj;
        lwvVar.getClass();
        kwv kwvVar = lwvVar.f20782a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || kwvVar != null) {
            cldVarA.p(ugi0Var, 0, iwv.f15510a, kwvVar);
        }
        cldVarA.c(ugi0Var);
    }
}
