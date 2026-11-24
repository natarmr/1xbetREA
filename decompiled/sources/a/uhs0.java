package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uhs0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uhs0 f35698a;
    private static final ugi0 descriptor;

    static {
        uhs0 uhs0Var = new uhs0();
        f35698a = uhs0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.team_details.transfer.data.model.TransferResponse", uhs0Var, 4);
        zna0Var.j("dateStamp", true);
        zna0Var.j("player", true);
        zna0Var.j("oldTeam", true);
        zna0Var.j("newTeam", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        jiy jiyVarJ1 = mrv.j0(kca0.f18049a);
        ump0 ump0Var = ump0.f35929a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ump0Var), mrv.j0(ump0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        mca0 mca0Var = null;
        wmp0 wmp0Var = null;
        wmp0 wmp0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                mca0Var = (mca0) bldVarA.e(ugi0Var, 1, kca0.f18049a, mca0Var);
                i |= 2;
            } else if (iF == 2) {
                wmp0Var = (wmp0) bldVarA.e(ugi0Var, 2, ump0.f35929a, wmp0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                wmp0Var2 = (wmp0) bldVarA.e(ugi0Var, 3, ump0.f35929a, wmp0Var2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new whs0(i, l, mca0Var, wmp0Var, wmp0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        whs0 whs0Var = (whs0) obj;
        whs0Var.getClass();
        wmp0 wmp0Var = whs0Var.d;
        wmp0 wmp0Var2 = whs0Var.c;
        mca0 mca0Var = whs0Var.b;
        Long l = whs0Var.f39181a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || mca0Var != null) {
            cldVarA.p(ugi0Var, 1, kca0.f18049a, mca0Var);
        }
        if (cldVarA.u(ugi0Var) || wmp0Var2 != null) {
            cldVarA.p(ugi0Var, 2, ump0.f35929a, wmp0Var2);
        }
        if (cldVarA.u(ugi0Var) || wmp0Var != null) {
            cldVarA.p(ugi0Var, 3, ump0.f35929a, wmp0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
