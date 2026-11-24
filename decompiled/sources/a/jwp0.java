package a;

import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jwp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jwp0 f17264a;
    private static final ugi0 descriptor;

    static {
        jwp0 jwp0Var = new jwp0();
        f17264a = jwp0Var;
        zna0 zna0Var = new zna0("org.xplatform.mailing.impl.data.models.TelegramUserPairResponse", jwp0Var, 1);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new lwp0(i, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lwp0 lwp0Var = (lwp0) obj;
        lwp0Var.getClass();
        Integer num = lwp0Var.f20775a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
