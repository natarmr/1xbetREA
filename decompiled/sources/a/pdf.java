package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pdf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pdf f26805a;
    private static final ugi0 descriptor;

    static {
        pdf pdfVar = new pdf();
        f26805a = pdfVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.games_by_champ.CricketScoreResponse", pdfVar, 1);
        zna0Var.j("wicketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(k380.f17606a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        m380 m380Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                m380Var = (m380) bldVarA.e(ugi0Var, 0, k380.f17606a, m380Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new tdf(i, m380Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tdf tdfVar = (tdf) obj;
        tdfVar.getClass();
        m380 m380Var = tdfVar.f33766a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || m380Var != null) {
            cldVarA.p(ugi0Var, 0, k380.f17606a, m380Var);
        }
        cldVarA.c(ugi0Var);
    }
}
