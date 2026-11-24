package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qvb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qvb f29378a;
    private static final ugi0 descriptor;

    static {
        qvb qvbVar = new qvb();
        f29378a = qvbVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.CharValue", qvbVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{pvb.f27654a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        char cE = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                cE = bldVarA.E(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new tvb(cE, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tvb tvbVar = (tvb) obj;
        tvbVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.D(ugi0Var, 0, tvbVar.f34591a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
