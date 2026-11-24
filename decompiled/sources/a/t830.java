package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t830 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t830 f33494a;
    private static final ugi0 descriptor;

    static {
        t830 t830Var = new t830();
        f33494a = t830Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.MarkupType.OrderedListContent", t830Var, 2);
        zna0Var.j("attrs", true);
        zna0Var.j(RemoteMessageConst.Notification.CONTENT, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(da80.f5735a), mrv.j0((jiy) v830.c[1].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = v830.c;
        boolean z = true;
        int i = 0;
        fa80 fa80Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                fa80Var = (fa80) bldVarA.e(ugi0Var, 0, da80.f5735a, fa80Var);
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
        return new v830(i, fa80Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v830 v830Var = (v830) obj;
        v830Var.getClass();
        List list = v830Var.b;
        fa80 fa80Var = v830Var.f36962a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = v830.c;
        if (cldVarA.u(ugi0Var) || fa80Var != null) {
            cldVarA.p(ugi0Var, 0, da80.f5735a, fa80Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
