package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w4c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w4c f38536a;
    private static final ugi0 descriptor;

    static {
        w4c w4cVar = new w4c();
        f38536a = w4cVar;
        zna0 zna0Var = new zna0("org.xplatform.authqr.impl.qr.data.models.CheckQuestionRequest", w4cVar, 2);
        zna0Var.j("Data", false);
        zna0Var.j("Auth", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{t4c.f33313a, sn4.f32474a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        v4c v4cVar = null;
        un4 un4Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                v4cVar = (v4c) bldVarA.m(ugi0Var, 0, t4c.f33313a, v4cVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                un4Var = (un4) bldVarA.m(ugi0Var, 1, sn4.f32474a, un4Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new y4c(i, v4cVar, un4Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y4c y4cVar = (y4c) obj;
        y4cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, t4c.f33313a, y4cVar.f41995a);
        cldVarA.m(ugi0Var, 1, sn4.f32474a, y4cVar.b);
        cldVarA.c(ugi0Var);
    }
}
