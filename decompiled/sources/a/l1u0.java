package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l1u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1u0 f19277a;
    private static final ugi0 descriptor;

    static {
        l1u0 l1u0Var = new l1u0();
        f19277a = l1u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.valorant.ValorantStatisticResponse", l1u0Var, 4);
        zna0Var.j(TokenNames.R, true);
        zna0Var.j("RS", true);
        zna0Var.j(TokenNames.M, true);
        zna0Var.j("PM", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n1u0.e;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n1u0.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        List list = null;
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
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new n1u0(i, num, num2, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n1u0 n1u0Var = (n1u0) obj;
        n1u0Var.getClass();
        List list = n1u0Var.d;
        String str = n1u0Var.c;
        Integer num = n1u0Var.b;
        Integer num2 = n1u0Var.f22770a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n1u0.e;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
