package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class il implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final il f14952a;
    private static final ugi0 descriptor;

    static {
        il ilVar = new il();
        f14952a = ilVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.ActiveBonusSumResponse", ilVar, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(jl.f16693a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ll llVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                llVar = (ll) bldVarA.e(ugi0Var, 0, jl.f16693a, llVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new nl(i, llVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nl nlVar = (nl) obj;
        nlVar.getClass();
        ll llVar = nlVar.f23704a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || llVar != null) {
            cldVarA.p(ugi0Var, 0, jl.f16693a, llVar);
        }
        cldVarA.c(ugi0Var);
    }
}
