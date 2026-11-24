package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pcp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pcp f26770a;
    private static final ugi0 descriptor;

    static {
        pcp pcpVar = new pcp();
        f26770a = pcpVar;
        zna0 zna0Var = new zna0("org.xplatform.favorites.core.data.model.games.FavoriteResultGamesResponse", pcpVar, 1);
        zna0Var.j(RemoteMessageConst.DATA, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(mcp.f21562a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ocp ocpVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                ocpVar = (ocp) bldVarA.e(ugi0Var, 0, mcp.f21562a, ocpVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new rcp(i, ocpVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rcp rcpVar = (rcp) obj;
        rcpVar.getClass();
        ocp ocpVar = rcpVar.f30250a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ocpVar != null) {
            cldVarA.p(ugi0Var, 0, mcp.f21562a, ocpVar);
        }
        cldVarA.c(ugi0Var);
    }
}
