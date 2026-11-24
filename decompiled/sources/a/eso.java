package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eso implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eso f8339a;
    private static final ugi0 descriptor;

    static {
        eso esoVar = new eso();
        f8339a = esoVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.games_by_champ.ExtendedScoreResponse", esoVar, 2);
        zna0Var.j("innsStats", true);
        zna0Var.j("cricketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(hex.f12946a), mrv.j0(pdf.f26805a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        jex jexVar = null;
        tdf tdfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jexVar = (jex) bldVarA.e(ugi0Var, 0, hex.f12946a, jexVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                tdfVar = (tdf) bldVarA.e(ugi0Var, 1, pdf.f26805a, tdfVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new iso(i, jexVar, tdfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iso isoVar = (iso) obj;
        isoVar.getClass();
        tdf tdfVar = isoVar.b;
        jex jexVar = isoVar.f15314a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || jexVar != null) {
            cldVarA.p(ugi0Var, 0, hex.f12946a, jexVar);
        }
        if (cldVarA.u(ugi0Var) || tdfVar != null) {
            cldVarA.p(ugi0Var, 1, pdf.f26805a, tdfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
