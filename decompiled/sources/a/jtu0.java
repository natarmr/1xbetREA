package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jtu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jtu0 f17120a;
    private static final ugi0 descriptor;

    static {
        jtu0 jtu0Var = new jtu0();
        f17120a = jtu0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.rules.data.model.VirtualSportRulesResponse.ValueContent", jtu0Var, 3);
        zna0Var.j("main", true);
        zna0Var.j("markets", true);
        zna0Var.j("remark", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(atu0.f1451a);
        gtu0 gtu0Var = gtu0.f11898a;
        return new jiy[]{jiyVarJ0, mrv.j0(gtu0Var), mrv.j0(gtu0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ctu0 ctu0Var = null;
        itu0 itu0Var = null;
        itu0 itu0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ctu0Var = (ctu0) bldVarA.e(ugi0Var, 0, atu0.f1451a, ctu0Var);
                i |= 1;
            } else if (iF == 1) {
                itu0Var = (itu0) bldVarA.e(ugi0Var, 1, gtu0.f11898a, itu0Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                itu0Var2 = (itu0) bldVarA.e(ugi0Var, 2, gtu0.f11898a, itu0Var2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ltu0(i, ctu0Var, itu0Var, itu0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ltu0 ltu0Var = (ltu0) obj;
        ltu0Var.getClass();
        itu0 itu0Var = ltu0Var.c;
        itu0 itu0Var2 = ltu0Var.b;
        ctu0 ctu0Var = ltu0Var.f20643a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ctu0Var != null) {
            cldVarA.p(ugi0Var, 0, atu0.f1451a, ctu0Var);
        }
        if (cldVarA.u(ugi0Var) || itu0Var2 != null) {
            cldVarA.p(ugi0Var, 1, gtu0.f11898a, itu0Var2);
        }
        if (cldVarA.u(ugi0Var) || itu0Var != null) {
            cldVarA.p(ugi0Var, 2, gtu0.f11898a, itu0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
