package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lne0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lne0 f20340a;
    private static final ugi0 descriptor;

    static {
        lne0 lne0Var = new lne0();
        f20340a = lne0Var;
        zna0 zna0Var = new zna0("org.xplatform.referral.impl.data.model.ReferralNetworkInfoResponse", lne0Var, 5);
        zna0Var.j("userBalance", true);
        zna0Var.j("userFullBalance", true);
        zna0Var.j("userHoldBalance", true);
        zna0Var.j("refUrl", true);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nne0.f;
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nne0.f;
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                i |= 2;
            } else if (iF == 2) {
                d3 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d3);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new nne0(i, d, d2, d3, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nne0 nne0Var = (nne0) obj;
        nne0Var.getClass();
        List list = nne0Var.e;
        String str = nne0Var.d;
        Double d = nne0Var.c;
        Double d2 = nne0Var.b;
        Double d3 = nne0Var.f23817a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nne0.f;
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
