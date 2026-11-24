package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mlk implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mlk f21994a;
    private static final ugi0 descriptor;

    static {
        mlk mlkVar = new mlk();
        f21994a = mlkVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.zip.model.zip.game.DiceZipRoundResponse", mlkVar, 3);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("Pl", true);
        zna0Var.j("Sc", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(plk.f27186a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        rlk rlkVar = null;
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
                rlkVar = (rlk) bldVarA.e(ugi0Var, 2, plk.f27186a, rlkVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new olk(i, num, num2, rlkVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        olk olkVar = (olk) obj;
        olkVar.getClass();
        rlk rlkVar = olkVar.c;
        Integer num = olkVar.b;
        Integer num2 = olkVar.f25459a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || rlkVar != null) {
            cldVarA.p(ugi0Var, 2, plk.f27186a, rlkVar);
        }
        cldVarA.c(ugi0Var);
    }
}
