package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oar implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oar f24942a;
    private static final ugi0 descriptor;

    static {
        oar oarVar = new oar();
        f24942a = oarVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.winter_full_description.data.model.FullDescriptionResponse", oarVar, 1);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(gar.f10982a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        iar iarVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iarVar = (iar) bldVarA.e(ugi0Var, 0, gar.f10982a, iarVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new qar(i, iarVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qar qarVar = (qar) obj;
        qarVar.getClass();
        iar iarVar = qarVar.f28410a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || iarVar != null) {
            cldVarA.p(ugi0Var, 0, gar.f10982a, iarVar);
        }
        cldVarA.c(ugi0Var);
    }
}
