package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jio implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jio f16584a;
    private static final ugi0 descriptor;

    static {
        jio jioVar = new jio();
        f16584a = jioVar;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.EventsTypeSmallGroupsResponse", jioVar, 5);
        zna0Var.j("eventId", true);
        zna0Var.j("name", true);
        zna0Var.j("position", true);
        zna0Var.j("countCols", true);
        zna0Var.j("hasAutoSub", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(ysm0.f43175a), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            } else if (iF == 3) {
                l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new lio(i, bool, l, l2, l3, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lio lioVar = (lio) obj;
        lioVar.getClass();
        Boolean bool = lioVar.e;
        Long l = lioVar.d;
        Long l2 = lioVar.c;
        String str = lioVar.b;
        Long l3 = lioVar.f20116a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
