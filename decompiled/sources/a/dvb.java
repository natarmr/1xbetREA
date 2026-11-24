package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dvb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dvb f6734a;
    private static final ugi0 descriptor;

    static {
        dvb dvbVar = new dvb();
        f6734a = dvbVar;
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.CharSequenceArrayValue", dvbVar, 1);
        zna0Var.j("value", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{fvb.b[0].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fvb.b;
        boolean z = true;
        int i = 0;
        String[] strArr = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                strArr = (String[]) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), strArr);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new fvb(i, strArr);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fvb fvbVar = (fvb) obj;
        fvbVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, (jiy) fvb.b[0].getValue(), fvbVar.f10206a);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
