package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nyd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nyd0 f24325a;
    private static final ugi0 descriptor;

    static {
        nyd0 nyd0Var = new nyd0();
        f24325a = nyd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rainbow.RainbowSixStatisticResponse", nyd0Var, 3);
        zna0Var.j(TokenNames.M, true);
        zna0Var.j("PM", true);
        zna0Var.j("MD", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = pyd0.d;
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = pyd0.d;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
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
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new pyd0(i, str, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pyd0 pyd0Var = (pyd0) obj;
        pyd0Var.getClass();
        List list = pyd0Var.c;
        List list2 = pyd0Var.b;
        String str = pyd0Var.f27799a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = pyd0.d;
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
