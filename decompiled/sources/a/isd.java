package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isd implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final isd f15298a;
    private static final ugi0 descriptor;

    static {
        isd isdVar = new isd();
        f15298a = isdVar;
        zna0 zna0Var = new zna0("org.xplatform.config.data.models.ConfigResponse", isdVar, 3);
        zna0Var.j("Settings", true);
        zna0Var.j("Common", true);
        zna0Var.j("MainMenu", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(iwi0.f15492a), mrv.j0(m8d.f21364a), mrv.j0(tv10.f34577a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        kwi0 kwi0Var = null;
        o8d o8dVar = null;
        vv10 vv10Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                kwi0Var = (kwi0) bldVarA.e(ugi0Var, 0, iwi0.f15492a, kwi0Var);
                i |= 1;
            } else if (iF == 1) {
                o8dVar = (o8d) bldVarA.e(ugi0Var, 1, m8d.f21364a, o8dVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                vv10Var = (vv10) bldVarA.e(ugi0Var, 2, tv10.f34577a, vv10Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ksd(i, kwi0Var, o8dVar, vv10Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ksd ksdVar = (ksd) obj;
        ksdVar.getClass();
        vv10 vv10Var = ksdVar.c;
        o8d o8dVar = ksdVar.b;
        kwi0 kwi0Var = ksdVar.f18808a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || kwi0Var != null) {
            cldVarA.p(ugi0Var, 0, iwi0.f15492a, kwi0Var);
        }
        if (cldVarA.u(ugi0Var) || o8dVar != null) {
            cldVarA.p(ugi0Var, 1, m8d.f21364a, o8dVar);
        }
        if (cldVarA.u(ugi0Var) || vv10Var != null) {
            cldVarA.p(ugi0Var, 2, tv10.f34577a, vv10Var);
        }
        cldVarA.c(ugi0Var);
    }
}
