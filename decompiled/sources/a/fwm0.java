package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fwm0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fwm0 f10267a;
    private static final ugi0 descriptor;

    static {
        fwm0 fwm0Var = new fwm0();
        f10267a = fwm0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.SubGameScoreResponse", fwm0Var, 3);
        zna0Var.j("fullScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("extendedScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0((jiy) hwm0.d[1].getValue()), mrv.j0(x3h0.f40218a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = hwm0.d;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        i4h0 i4h0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                i4h0Var = (i4h0) bldVarA.e(ugi0Var, 2, x3h0.f40218a, i4h0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new hwm0(i, str, list, i4h0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hwm0 hwm0Var = (hwm0) obj;
        hwm0Var.getClass();
        i4h0 i4h0Var = hwm0Var.c;
        List list = hwm0Var.b;
        String str = hwm0Var.f13774a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = hwm0.d;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || i4h0Var != null) {
            cldVarA.p(ugi0Var, 2, x3h0.f40218a, i4h0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
