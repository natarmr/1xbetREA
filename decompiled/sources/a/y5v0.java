package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y5v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y5v0 f42066a;
    private static final ugi0 descriptor;

    static {
        y5v0 y5v0Var = new y5v0();
        f42066a = y5v0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tvbet.data.models.WeekJackpotInfoResponse", y5v0Var, 3);
        zna0Var.j(RemoteMessageConst.FROM, true);
        zna0Var.j(RemoteMessageConst.TO, true);
        zna0Var.j("wins", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = a6v0.d;
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = a6v0.d;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new a6v0(i, l, l2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a6v0 a6v0Var = (a6v0) obj;
        a6v0Var.getClass();
        List list = a6v0Var.c;
        Long l = a6v0Var.b;
        Long l2 = a6v0Var.f335a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = a6v0.d;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
