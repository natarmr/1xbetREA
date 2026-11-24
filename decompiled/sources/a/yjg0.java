package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yjg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yjg0 f42739a;
    private static final ugi0 descriptor;

    static {
        yjg0 yjg0Var = new yjg0();
        f42739a = yjg0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rps.RpsResponse", yjg0Var, 4);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("D", true);
        zna0Var.j("A", true);
        zna0Var.j(TokenNames.R, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(oig0.f25310a), mrv.j0(ujg0.f35778a), mrv.j0((jiy) akg0.e[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = akg0.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        qig0 qig0Var = null;
        wjg0 wjg0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                qig0Var = (qig0) bldVarA.e(ugi0Var, 1, oig0.f25310a, qig0Var);
                i |= 2;
            } else if (iF == 2) {
                wjg0Var = (wjg0) bldVarA.e(ugi0Var, 2, ujg0.f35778a, wjg0Var);
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
        return new akg0(i, num, qig0Var, wjg0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        akg0 akg0Var = (akg0) obj;
        akg0Var.getClass();
        List list = akg0Var.d;
        wjg0 wjg0Var = akg0Var.c;
        qig0 qig0Var = akg0Var.b;
        Integer num = akg0Var.f1021a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = akg0.e;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || qig0Var != null) {
            cldVarA.p(ugi0Var, 1, oig0.f25310a, qig0Var);
        }
        if (cldVarA.u(ugi0Var) || wjg0Var != null) {
            cldVarA.p(ugi0Var, 2, ujg0.f35778a, wjg0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
