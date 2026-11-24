package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a9r f492a;
    private static final ugi0 descriptor;

    static {
        a9r a9rVar = new a9r();
        f492a = a9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.fruit_blast.FruitBlastBonusResponse", a9rVar, 2);
        zna0Var.j("BD", true);
        zna0Var.j("BT", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(vk10.f37554a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        uk10 uk10Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                uk10Var = (uk10) bldVarA.e(ugi0Var, 1, vk10.f37554a, uk10Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new c9r(i, uk10Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c9r c9rVar = (c9r) obj;
        c9rVar.getClass();
        uk10 uk10Var = c9rVar.b;
        String str = c9rVar.f3975a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || uk10Var != null) {
            cldVarA.p(ugi0Var, 1, vk10.f37554a, uk10Var);
        }
        cldVarA.c(ugi0Var);
    }
}
