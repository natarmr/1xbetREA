package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cqi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cqi0 f4795a;
    private static final ugi0 descriptor;

    static {
        cqi0 cqi0Var = new cqi0();
        f4795a = cqi0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_africa.impl.data.models.requests.SetMoneyLimitsRequest", cqi0Var, 1);
        zna0Var.j("limits", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mqi0.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mqi0.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new mqi0(i, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mqi0 mqi0Var = (mqi0) obj;
        mqi0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) mqi0.b[0].getValue(), mqi0Var.f22227a);
        cldVarA.c(ugi0Var);
    }
}
