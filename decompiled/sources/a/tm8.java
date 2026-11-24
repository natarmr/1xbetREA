package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tm8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tm8 f34181a;
    private static final ugi0 descriptor;

    static {
        tm8 tm8Var = new tm8();
        f34181a = tm8Var;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.BooleanValue", tm8Var, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        boolean zB = false;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wm8(i, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wm8 wm8Var = (wm8) obj;
        wm8Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.x(ugi0Var, 0, wm8Var.f39391a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
