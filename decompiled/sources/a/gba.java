package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gba implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gba f11008a;
    private static final ugi0 descriptor;

    static {
        gba gbaVar = new gba();
        f11008a = gbaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.card_basketball.CardBasketballPlayerInfoResponse", gbaVar, 4);
        zna0Var.j("Q", true);
        zna0Var.j("P", true);
        zna0Var.j(TokenNames.C, true);
        zna0Var.j(TokenNames.S, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ag9 ag9Var = ag9.f814a;
        return new jiy[]{mrv.j0(ag9Var), mrv.j0(ag9Var), mrv.j0(moa.f22125a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Byte b = null;
        Byte b2 = null;
        ooa ooaVar = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                b = (Byte) bldVarA.e(ugi0Var, 0, ag9.f814a, b);
                i |= 1;
            } else if (iF == 1) {
                b2 = (Byte) bldVarA.e(ugi0Var, 1, ag9.f814a, b2);
                i |= 2;
            } else if (iF == 2) {
                ooaVar = (ooa) bldVarA.e(ugi0Var, 2, moa.f22125a, ooaVar);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new iba(i, b, b2, ooaVar, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iba ibaVar = (iba) obj;
        ibaVar.getClass();
        Boolean bool = ibaVar.d;
        ooa ooaVar = ibaVar.c;
        Byte b = ibaVar.b;
        Byte b2 = ibaVar.f14477a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || b2 != null) {
            cldVarA.p(ugi0Var, 0, ag9.f814a, b2);
        }
        if (cldVarA.u(ugi0Var) || b != null) {
            cldVarA.p(ugi0Var, 1, ag9.f814a, b);
        }
        if (cldVarA.u(ugi0Var) || ooaVar != null) {
            cldVarA.p(ugi0Var, 2, moa.f22125a, ooaVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
