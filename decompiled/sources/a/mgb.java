package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mgb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mgb f21734a;
    private static final ugi0 descriptor;

    static {
        mgb mgbVar = new mgb();
        f21734a = mgbVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.medal_statistic.data.models.ChampTopRatingResponse", mgbVar, 3);
        zna0Var.j("teams", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) ogb.d[0].getValue()), mrv.j0(s710.f31729a), mrv.j0(oeb.f25115a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ogb.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        veb vebVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                vebVar = (veb) bldVarA.e(ugi0Var, 2, oeb.f25115a, vebVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ogb(i, list, l, vebVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ogb ogbVar = (ogb) obj;
        ogbVar.getClass();
        veb vebVar = ogbVar.c;
        Long l = ogbVar.b;
        List list = ogbVar.f25210a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ogb.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || vebVar != null) {
            cldVarA.p(ugi0Var, 2, oeb.f25115a, vebVar);
        }
        cldVarA.c(ugi0Var);
    }
}
