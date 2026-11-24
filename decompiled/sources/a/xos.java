package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xos implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xos f41235a;
    private static final ugi0 descriptor;

    static {
        xos xosVar = new xos();
        f41235a = xosVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.game_details.domain.model.GameRequestState.FetchGameDetails", xosVar, 3);
        zna0Var.j("gameId", false);
        zna0Var.j("feedKind", false);
        zna0Var.j("sportId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{zcs.f44180a, zos.d[1].getValue(), s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zos.d;
        int i = 0;
        bds bdsVar = null;
        sip sipVar = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bdsVar = (bds) bldVarA.m(ugi0Var, 0, zcs.f44180a, bdsVar);
                i |= 1;
            } else if (iF == 1) {
                sipVar = (sip) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), sipVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zos(i, bdsVar, sipVar, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zos zosVar = (zos) obj;
        zosVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zos.d;
        cldVarA.m(ugi0Var, 0, zcs.f44180a, new bds(zosVar.f44730a));
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), zosVar.b);
        cldVarA.n(ugi0Var, 2, zosVar.c);
        cldVarA.c(ugi0Var);
    }
}
