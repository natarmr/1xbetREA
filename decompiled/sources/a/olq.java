package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class olq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final olq f25469a;
    private static final ugi0 descriptor;

    static {
        olq olqVar = new olq();
        f25469a = olqVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.FloatValue", olqVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{klq.f18504a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        float fN = 0.0f;
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
                fN = bldVarA.n(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new qlq(fN, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qlq qlqVar = (qlq) obj;
        qlqVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.o(ugi0Var, 0, qlqVar.f28946a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
