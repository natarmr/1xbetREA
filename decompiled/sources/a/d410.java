package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d410 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d410 f5432a;
    private static final ugi0 descriptor;

    static {
        d410 d410Var = new d410();
        f5432a = d410Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.lol.impl.data.model.matches.LolStatisticMatchesMatchObjectKillsResponse", d410Var, 4);
        zna0Var.j("teamId", true);
        zna0Var.j("objectType", true);
        zna0Var.j("objectSubType", true);
        zna0Var.j("timeSeconds", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = f410.e;
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = f410.e;
        boolean z = true;
        int i = 0;
        Long l = null;
        c410 c410Var = null;
        z310 z310Var = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                c410Var = (c410) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), c410Var);
                i |= 2;
            } else if (iF == 2) {
                z310Var = (z310) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), z310Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new f410(i, l, c410Var, z310Var, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f410 f410Var = (f410) obj;
        f410Var.getClass();
        Integer num = f410Var.d;
        z310 z310Var = f410Var.c;
        c410 c410Var = f410Var.b;
        Long l = f410Var.f8890a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = f410.e;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || c410Var != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), c410Var);
        }
        if (cldVarA.u(ugi0Var) || z310Var != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), z310Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
