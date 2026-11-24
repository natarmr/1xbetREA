package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f65 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f65 f8993a;
    private static final ugi0 descriptor;

    static {
        f65 f65Var = new f65();
        f8993a = f65Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.AvailableBonusesResponse", f65Var, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(g65.f10746a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        i65 i65Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                i65Var = (i65) bldVarA.e(ugi0Var, 0, g65.f10746a, i65Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new k65(i, i65Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k65 k65Var = (k65) obj;
        k65Var.getClass();
        i65 i65Var = k65Var.f17750a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || i65Var != null) {
            cldVarA.p(ugi0Var, 0, g65.f10746a, i65Var);
        }
        cldVarA.c(ugi0Var);
    }
}
