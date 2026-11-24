package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qmi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qmi0 f28984a;
    private static final ugi0 descriptor;

    static {
        qmi0 qmi0Var = new qmi0();
        f28984a = qmi0Var;
        zna0 zna0Var = new zna0("org.xplatform.session_timer.domain.models.SessionTimerStatusModel", qmi0Var, 2);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("enabled", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{smi0.c[0].getValue(), sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = smi0.c;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        umi0 umi0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                umi0Var = (umi0) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), umi0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new smi0(i, umi0Var, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        smi0 smi0Var = (smi0) obj;
        smi0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) smi0.c[0].getValue(), smi0Var.f32448a);
        cldVarA.x(ugi0Var, 1, smi0Var.b);
        cldVarA.c(ugi0Var);
    }
}
