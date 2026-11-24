package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ubl implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ubl f35386a;
    private static final ugi0 descriptor;

    static {
        ubl ublVar = new ubl();
        f35386a = ublVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.DoubleValue", ublVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        double dT = 0.0d;
        boolean z = true;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                dT = bldVarA.t(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wbl(dT, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wbl wblVar = (wbl) obj;
        wblVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.j(ugi0Var, 0, wblVar.f38884a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
