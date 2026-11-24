package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fav0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fav0 f9229a;
    private static final ugi0 descriptor;

    static {
        fav0 fav0Var = new fav0();
        f9229a = fav0Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_wheel.data.responses.WheelSectionResponse", fav0Var, 1);
        zna0Var.j("BTID", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new hav0(i, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hav0 hav0Var = (hav0) obj;
        hav0Var.getClass();
        Integer num = hav0Var.f12744a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
