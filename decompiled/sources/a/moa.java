package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class moa implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final moa f22125a;
    private static final ugi0 descriptor;

    static {
        moa moaVar = new moa();
        f22125a = moaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.CardValueResponse", moaVar, 2);
        zna0Var.j("CS", true);
        zna0Var.k(new iy(new String[]{TokenNames.S, "Suit"}, (byte) 11));
        zna0Var.j("CV", true);
        zna0Var.k(new iy(new String[]{TokenNames.R, "Rank"}, (byte) 11));
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ooa(i, num, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ooa ooaVar = (ooa) obj;
        ooaVar.getClass();
        Integer num = ooaVar.b;
        Integer num2 = ooaVar.f25586a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
