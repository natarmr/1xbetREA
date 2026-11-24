package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class myb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final myb0 f22596a;
    private static final ugi0 descriptor;

    static {
        myb0 myb0Var = new myb0();
        f22596a = myb0Var;
        zna0 zna0Var = new zna0("com.google.firebase.sessions.ProcessData", myb0Var, 2);
        zna0Var.j("pid", false);
        zna0Var.j("uuid", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new oyb0(i, iJ, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oyb0 oyb0Var = (oyb0) obj;
        oyb0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, oyb0Var.f26054a, ugi0Var);
        cldVarA.z(ugi0Var, 1, oyb0Var.b);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
