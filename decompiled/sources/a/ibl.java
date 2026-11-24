package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ibl implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ibl f14493a;
    private static final ugi0 descriptor;

    static {
        ibl iblVar = new ibl();
        f14493a = iblVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.DoubleArrayValue", iblVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{hbl.c};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        double[] dArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                dArr = (double[]) bldVarA.m(ugi0Var, 0, hbl.c, dArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new kbl(i, dArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kbl kblVar = (kbl) obj;
        kblVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, hbl.c, kblVar.f18019a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
