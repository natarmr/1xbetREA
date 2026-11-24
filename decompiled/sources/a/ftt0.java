package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ftt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ftt0 f10131a;
    private static final ugi0 descriptor;

    static {
        ftt0 ftt0Var = new ftt0();
        f10131a = ftt0Var;
        zna0 zna0Var = new zna0("org.xplatform.localtimedif.impl.data.models.UtcLocalTimeResponse", ftt0Var, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new htt0(i, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        htt0 htt0Var = (htt0) obj;
        htt0Var.getClass();
        Double d = htt0Var.f13651a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
