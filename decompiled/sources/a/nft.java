package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nft implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nft f23453a;
    private static final ugi0 descriptor;

    static {
        nft nftVar = new nft();
        f23453a = nftVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.gems_odyssey.GemsOdysseyResultResponse", nftVar, 1);
        zna0Var.j("ST", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(xom0.f41229a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        zom0 zom0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                zom0Var = (zom0) bldVarA.e(ugi0Var, 0, xom0.f41229a, zom0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new pft(i, zom0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pft pftVar = (pft) obj;
        pftVar.getClass();
        zom0 zom0Var = pftVar.f26922a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || zom0Var != null) {
            cldVarA.p(ugi0Var, 0, xom0.f41229a, zom0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
