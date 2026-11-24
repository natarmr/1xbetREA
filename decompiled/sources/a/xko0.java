package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xko0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xko0 f41038a;
    private static final ugi0 descriptor;

    static {
        xko0 xko0Var = new xko0();
        f41038a = xko0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stage.impl.stagetable.data.common.model.TableRowResponse", xko0Var, 2);
        zna0Var.j(RemoteMessageConst.Notification.COLOR, true);
        zna0Var.j("valueCol", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0((jiy) blo0.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = blo0.c;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new blo0(i, num, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        blo0 blo0Var = (blo0) obj;
        blo0Var.getClass();
        List list = blo0Var.b;
        Integer num = blo0Var.f2805a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = blo0.c;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
