package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vd8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vd8 f37218a;
    private static final ugi0 descriptor;

    static {
        vd8 vd8Var = new vd8();
        f37218a = vd8Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.BonusCountResponse", vd8Var, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(wd8.f38960a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        yd8 yd8Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                yd8Var = (yd8) bldVarA.e(ugi0Var, 0, wd8.f38960a, yd8Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new ae8(i, yd8Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ae8 ae8Var = (ae8) obj;
        ae8Var.getClass();
        yd8 yd8Var = ae8Var.f715a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || yd8Var != null) {
            cldVarA.p(ugi0Var, 0, wd8.f38960a, yd8Var);
        }
        cldVarA.c(ugi0Var);
    }
}
