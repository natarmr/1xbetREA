package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ant0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ant0 f1171a;
    private static final ugi0 descriptor;

    static {
        ant0 ant0Var = new ant0();
        f1171a = ant0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.daily_tasks.impl.data.model.UpdateTaskRequest", ant0Var, 3);
        zna0Var.j("accId", false);
        zna0Var.j("taskId", false);
        zna0Var.j(CommonConstant.KEY_STATUS, false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new cnt0(i, iJ, jR, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cnt0 cnt0Var = (cnt0) obj;
        cnt0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, cnt0Var.f4673a);
        cldVarA.n(ugi0Var, 1, cnt0Var.b);
        cldVarA.i(2, cnt0Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
