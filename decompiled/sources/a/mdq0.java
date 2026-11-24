package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mdq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mdq0 f21610a;
    private static final ugi0 descriptor;

    static {
        mdq0 mdq0Var = new mdq0();
        f21610a = mdq0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.tic_tac_toe.TicTacToeResponse", mdq0Var, 2);
        zna0Var.j("A", true);
        zna0Var.j(TokenNames.R, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new odq0(i, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        odq0 odq0Var = (odq0) obj;
        odq0Var.getClass();
        String str = odq0Var.b;
        String str2 = odq0Var.f25089a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
