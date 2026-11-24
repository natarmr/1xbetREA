package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e08 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e08 f6977a;
    private static final ugi0 descriptor;

    static {
        e08 e08Var = new e08();
        f6977a = e08Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.BigPigResponse", e08Var, 5);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("Cur1", true);
        zna0Var.j("Cur2", true);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = g08.f;
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ez7.f8659a), mrv.j0(bz7.f3452a), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = g08.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        gz7 gz7Var = null;
        dz7 dz7Var = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                gz7Var = (gz7) bldVarA.e(ugi0Var, 1, ez7.f8659a, gz7Var);
                i |= 2;
            } else if (iF == 2) {
                dz7Var = (dz7) bldVarA.e(ugi0Var, 2, bz7.f3452a, dz7Var);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new g08(i, num, gz7Var, dz7Var, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g08 g08Var = (g08) obj;
        g08Var.getClass();
        List list = g08Var.e;
        List list2 = g08Var.d;
        dz7 dz7Var = g08Var.c;
        gz7 gz7Var = g08Var.b;
        Integer num = g08Var.f10446a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = g08.f;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || gz7Var != null) {
            cldVarA.p(ugi0Var, 1, ez7.f8659a, gz7Var);
        }
        if (cldVarA.u(ugi0Var) || dz7Var != null) {
            cldVarA.p(ugi0Var, 2, bz7.f3452a, dz7Var);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
