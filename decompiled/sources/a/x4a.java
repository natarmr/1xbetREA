package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x4a implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x4a f40255a;
    private static final ugi0 descriptor;

    static {
        x4a x4aVar = new x4a();
        f40255a = x4aVar;
        zna0 zna0Var = new zna0("org.xplatform.bonuses.impl.data.models.CancelBonusRequest", x4aVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new z4a(i, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z4a z4aVar = (z4a) obj;
        z4aVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, z4aVar.f43760a, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
