package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dso implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dso f6620a;
    private static final ugi0 descriptor;

    static {
        dso dsoVar = new dso();
        f6620a = dsoVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.ExtendedScoreResponse", dsoVar, 2);
        zna0Var.j("innsStats", true);
        zna0Var.j("cricketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(mdx.f21618a), mrv.j0(odf.f25072a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        odx odxVar = null;
        sdf sdfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                odxVar = (odx) bldVarA.e(ugi0Var, 0, mdx.f21618a, odxVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                sdfVar = (sdf) bldVarA.e(ugi0Var, 1, odf.f25072a, sdfVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new hso(i, odxVar, sdfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hso hsoVar = (hso) obj;
        hsoVar.getClass();
        sdf sdfVar = hsoVar.b;
        odx odxVar = hsoVar.f13594a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || odxVar != null) {
            cldVarA.p(ugi0Var, 0, mdx.f21618a, odxVar);
        }
        if (cldVarA.u(ugi0Var) || sdfVar != null) {
            cldVarA.p(ugi0Var, 1, odf.f25072a, sdfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
