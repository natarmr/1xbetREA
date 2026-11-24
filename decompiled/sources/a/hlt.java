package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hlt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hlt f13279a;
    private static final ugi0 descriptor;

    static {
        hlt hltVar = new hlt();
        f13279a = hltVar;
        zna0 zna0Var = new zna0("org.xplatform.client1.geo.impl.data.model.response.GeoRegionCityResponse", hltVar, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(jlt.f16734a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        llt lltVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                lltVar = (llt) bldVarA.e(ugi0Var, 0, jlt.f16734a, lltVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new plt(i, lltVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        plt pltVar = (plt) obj;
        pltVar.getClass();
        llt lltVar = pltVar.f27202a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || lltVar != null) {
            cldVarA.p(ugi0Var, 0, jlt.f16734a, lltVar);
        }
        cldVarA.c(ugi0Var);
    }
}
