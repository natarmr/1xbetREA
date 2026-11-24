package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qt f29275a;
    private static final ugi0 descriptor;

    static {
        qt qtVar = new qt();
        f29275a = qtVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.office.social.impl.data.models.AddSocialRequest", qtVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{rt.f31055a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        tt ttVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                ttVar = (tt) bldVarA.m(ugi0Var, 0, rt.f31055a, ttVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new vt(i, ttVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vt vtVar = (vt) obj;
        vtVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, rt.f31055a, vtVar.f37977a);
        cldVarA.c(ugi0Var);
    }
}
