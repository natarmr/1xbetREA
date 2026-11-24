package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class elk implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final elk f8002a;
    private static final ugi0 descriptor;

    static {
        elk elkVar = new elk();
        f8002a = elkVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.dice.DiceRoundResponse", elkVar, 3);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("Pl", true);
        zna0Var.j("Sc", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ilk.f14984a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        klk klkVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                klkVar = (klk) bldVarA.e(ugi0Var, 2, ilk.f14984a, klkVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new glk(i, num, num2, klkVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        glk glkVar = (glk) obj;
        glkVar.getClass();
        klk klkVar = glkVar.c;
        Integer num = glkVar.b;
        Integer num2 = glkVar.f11495a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || klkVar != null) {
            cldVarA.p(ugi0Var, 2, ilk.f14984a, klkVar);
        }
        cldVarA.c(ugi0Var);
    }
}
