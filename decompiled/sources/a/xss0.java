package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xss0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xss0 f41431a;
    private static final ugi0 descriptor;

    static {
        xss0 xss0Var = new xss0();
        f41431a = xss0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tvbet.data.models.TvBetJackpotResponse", xss0Var, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(zss0.f44920a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        bts0 bts0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                bts0Var = (bts0) bldVarA.e(ugi0Var, 0, zss0.f44920a, bts0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new cts0(i, bts0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cts0 cts0Var = (cts0) obj;
        cts0Var.getClass();
        bts0 bts0Var = cts0Var.f4957a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bts0Var != null) {
            cldVarA.p(ugi0Var, 0, zss0.f44920a, bts0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
