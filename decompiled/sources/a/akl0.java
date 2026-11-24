package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class akl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final akl0 f1027a;
    private static final ugi0 descriptor;

    static {
        akl0 akl0Var = new akl0();
        f1027a = akl0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.SportResponse", akl0Var, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("subSportId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ukl0(i, l, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ukl0 ukl0Var = (ukl0) obj;
        ukl0Var.getClass();
        Long l = ukl0Var.b;
        Long l2 = ukl0Var.f35833a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
