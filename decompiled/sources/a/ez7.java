package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ez7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ez7 f8659a;
    private static final ugi0 descriptor;

    static {
        ez7 ez7Var = new ez7();
        f8659a = ez7Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.big_pig.BigPigCurrentThrowResponse", ez7Var, 5);
        zna0Var.j("W", true);
        zna0Var.j(TokenNames.T, true);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("FS", true);
        zna0Var.j("SS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
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
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else if (iF == 3) {
                num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new gz7(i, num, num2, num3, num4, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gz7 gz7Var = (gz7) obj;
        gz7Var.getClass();
        Integer num = gz7Var.e;
        Integer num2 = gz7Var.d;
        Integer num3 = gz7Var.c;
        Integer num4 = gz7Var.b;
        Integer num5 = gz7Var.f12167a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
