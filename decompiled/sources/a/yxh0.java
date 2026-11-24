package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yxh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yxh0 f43422a;
    private static final ugi0 descriptor;

    static {
        yxh0 yxh0Var = new yxh0();
        f43422a = yxh0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.seka.SekaResponse", yxh0Var, 4);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("RG", true);
        zna0Var.j(TokenNames.S, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ayh0.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0(ysm0.f43175a), mrv.j0(sxh0.f32977a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ayh0.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String str = null;
        rxh0 rxh0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                rxh0Var = (rxh0) bldVarA.e(ugi0Var, 3, sxh0.f32977a, rxh0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new ayh0(i, list, list2, str, rxh0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ayh0 ayh0Var = (ayh0) obj;
        ayh0Var.getClass();
        rxh0 rxh0Var = ayh0Var.d;
        String str = ayh0Var.c;
        List list = ayh0Var.b;
        List list2 = ayh0Var.f1669a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ayh0.e;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || rxh0Var != null) {
            cldVarA.p(ugi0Var, 3, sxh0.f32977a, rxh0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
