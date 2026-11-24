package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f7y implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f7y f9081a;
    private static final ugi0 descriptor;

    static {
        f7y f7yVar = new f7y();
        f9081a = f7yVar;
        zna0 zna0Var = new zna0("org.xplatform.games_section.feature.jackpot.data.model.JackpotResponse", f7yVar, 6);
        zna0Var.j("HT", true);
        zna0Var.j("DT", true);
        zna0Var.j("WT", true);
        zna0Var.j("MT", true);
        zna0Var.j("JS", true);
        zna0Var.j(TokenNames.C, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(h7y.f12598a), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        j7y j7yVar = null;
        Long l5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    break;
                case 3:
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    i |= 8;
                    break;
                case 4:
                    j7yVar = (j7y) bldVarA.e(ugi0Var, 4, h7y.f12598a, j7yVar);
                    i |= 16;
                    break;
                case 5:
                    l5 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new k7y(i, l, l2, l3, l4, j7yVar, l5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k7y k7yVar = (k7y) obj;
        k7yVar.getClass();
        Long l = k7yVar.f;
        j7y j7yVar = k7yVar.e;
        Long l2 = k7yVar.d;
        Long l3 = k7yVar.c;
        Long l4 = k7yVar.b;
        Long l5 = k7yVar.f17846a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || j7yVar != null) {
            cldVarA.p(ugi0Var, 4, h7y.f12598a, j7yVar);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
