package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zcq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zcq0 f44177a;
    private static final ugi0 descriptor;

    static {
        zcq0 zcq0Var = new zcq0();
        f44177a = zcq0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.darts.ThrowResponse", zcq0Var, 5);
        zna0Var.j(TokenNames.X, true);
        zna0Var.j("Y", true);
        zna0Var.j("P", true);
        zna0Var.j("PR", true);
        zna0Var.j("PK", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(wcq0.f38936a)};
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
        vcq0 vcq0Var = null;
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
                vcq0Var = (vcq0) bldVarA.e(ugi0Var, 4, wcq0.f38936a, vcq0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new bdq0(i, num, num2, num3, num4, vcq0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bdq0 bdq0Var = (bdq0) obj;
        bdq0Var.getClass();
        vcq0 vcq0Var = bdq0Var.e;
        Integer num = bdq0Var.d;
        Integer num2 = bdq0Var.c;
        Integer num3 = bdq0Var.b;
        Integer num4 = bdq0Var.f2412a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || vcq0Var != null) {
            cldVarA.p(ugi0Var, 4, wcq0.f38936a, vcq0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
