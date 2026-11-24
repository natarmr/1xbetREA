package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class om8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final om8 f25490a;
    private static final ugi0 descriptor;

    static {
        om8 om8Var = new om8();
        f25490a = om8Var;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.BooleanArrayValue", om8Var, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{nm8.c};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        boolean[] zArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                zArr = (boolean[]) bldVarA.m(ugi0Var, 0, nm8.c, zArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new qm8(i, zArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qm8 qm8Var = (qm8) obj;
        qm8Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, nm8.c, qm8Var.f28970a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
