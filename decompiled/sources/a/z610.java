package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z610 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z610 f43843a;
    private static final ugi0 descriptor;

    static {
        z610 z610Var = new z610();
        f43843a = z610Var;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.LongArrayValue", z610Var, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{y610.c};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        long[] jArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                jArr = (long[]) bldVarA.m(ugi0Var, 0, y610.c, jArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new b710(i, jArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b710 b710Var = (b710) obj;
        b710Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, y610.c, b710Var.f2082a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
