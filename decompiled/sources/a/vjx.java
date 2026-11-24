package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vjx implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vjx f37552a;
    private static final ugi0 descriptor;

    static {
        vjx vjxVar = new vjx();
        f37552a = vjxVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.IntArrayValue", vjxVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ujx.c};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int[] iArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iArr = (int[]) bldVarA.m(ugi0Var, 0, ujx.c, iArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new xjx(iArr, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xjx xjxVar = (xjx) obj;
        xjxVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, ujx.c, xjxVar.f41007a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
