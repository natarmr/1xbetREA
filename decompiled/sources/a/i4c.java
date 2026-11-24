package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i4c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i4c f14141a;
    private static final ugi0 descriptor;

    static {
        i4c i4cVar = new i4c();
        f14141a = i4cVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.CheckPasswordRequest.Data", i4cVar, 3);
        zna0Var.j("Password", true);
        zna0Var.j("Date", true);
        zna0Var.j("UserId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new k4c(i, l, l2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k4c k4cVar = (k4c) obj;
        k4cVar.getClass();
        Long l = k4cVar.c;
        Long l2 = k4cVar.b;
        String str = k4cVar.f17661a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
