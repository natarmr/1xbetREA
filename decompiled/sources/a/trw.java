package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class trw implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final trw f34436a;
    private static final ugi0 descriptor;

    static {
        trw trwVar = new trw();
        f34436a = trwVar;
        zna0 zna0Var = new zna0("org.xplatform.currentdomain.impl.data.model.Host", trwVar, 1);
        zna0Var.j("host", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new vrw(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vrw vrwVar = (vrw) obj;
        vrwVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, ysm0.f43175a, vrwVar.f37921a);
        cldVarA.c(ugi0Var);
    }
}
