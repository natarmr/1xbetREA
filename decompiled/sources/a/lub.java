package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lub implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lub f20666a;
    private static final ugi0 descriptor;

    static {
        lub lubVar = new lub();
        f20666a = lubVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.CharArrayValue", lubVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{kub.c};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        char[] cArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                cArr = (char[]) bldVarA.m(ugi0Var, 0, kub.c, cArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new nub(i, cArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nub nubVar = (nub) obj;
        nubVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, kub.c, nubVar.f24141a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
