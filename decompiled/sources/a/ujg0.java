package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ujg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ujg0 f35778a;
    private static final ugi0 descriptor;

    static {
        ujg0 ujg0Var = new ujg0();
        f35778a = ujg0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rps.RpsPlayersRoundResultResponse", ujg0Var, 4);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("P3", true);
        zna0Var.j(TokenNames.R, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        gkg0 gkg0Var = gkg0.f11443a;
        return new jiy[]{mrv.j0(gkg0Var), mrv.j0(gkg0Var), mrv.j0(gkg0Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ikg0 ikg0Var = null;
        ikg0 ikg0Var2 = null;
        ikg0 ikg0Var3 = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ikg0Var = (ikg0) bldVarA.e(ugi0Var, 0, gkg0.f11443a, ikg0Var);
                i |= 1;
            } else if (iF == 1) {
                ikg0Var2 = (ikg0) bldVarA.e(ugi0Var, 1, gkg0.f11443a, ikg0Var2);
                i |= 2;
            } else if (iF == 2) {
                ikg0Var3 = (ikg0) bldVarA.e(ugi0Var, 2, gkg0.f11443a, ikg0Var3);
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
        return new wjg0(i, ikg0Var, ikg0Var2, ikg0Var3, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wjg0 wjg0Var = (wjg0) obj;
        wjg0Var.getClass();
        Integer num = wjg0Var.d;
        ikg0 ikg0Var = wjg0Var.c;
        ikg0 ikg0Var2 = wjg0Var.b;
        ikg0 ikg0Var3 = wjg0Var.f39262a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ikg0Var3 != null) {
            cldVarA.p(ugi0Var, 0, gkg0.f11443a, ikg0Var3);
        }
        if (cldVarA.u(ugi0Var) || ikg0Var2 != null) {
            cldVarA.p(ugi0Var, 1, gkg0.f11443a, ikg0Var2);
        }
        if (cldVarA.u(ugi0Var) || ikg0Var != null) {
            cldVarA.p(ugi0Var, 2, gkg0.f11443a, ikg0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
