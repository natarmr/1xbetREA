package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jb5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jb5 f16223a;
    private static final ugi0 descriptor;

    static {
        jb5 jb5Var = new jb5();
        f16223a = jb5Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.BTagResponse", jb5Var, 1);
        zna0Var.j("btag", true);
        zna0Var.k(new iy(new String[]{"bTag"}, (byte) 3));
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
        return new lb5(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lb5 lb5Var = (lb5) obj;
        lb5Var.getClass();
        String str = lb5Var.f19739a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
