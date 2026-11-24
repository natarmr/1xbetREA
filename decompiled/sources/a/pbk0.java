package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pbk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pbk0 f26713a;
    private static final ugi0 descriptor;

    static {
        pbk0 pbk0Var = new pbk0();
        f26713a = pbk0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.sms.SmsCodeRequest", pbk0Var, 2);
        zna0Var.j("Auth", false);
        zna0Var.j("Data", true);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{twp0.f34662a, eck0.c[1].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = eck0.c;
        boolean z = true;
        int i = 0;
        vwp0 vwp0Var = null;
        dck0 dck0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                vwp0Var = (vwp0) bldVarA.m(ugi0Var, 0, twp0.f34662a, vwp0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                dck0Var = (dck0) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), dck0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new eck0(i, vwp0Var, dck0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eck0 eck0Var = (eck0) obj;
        eck0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = eck0.c;
        twp0 twp0Var = twp0.f34662a;
        vwp0 vwp0Var = eck0Var.f7571a;
        dck0 dck0Var = eck0Var.b;
        cldVarA.m(ugi0Var, 0, twp0Var, vwp0Var);
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(dck0Var, sbk0.INSTANCE)) {
            cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), dck0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
