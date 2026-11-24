package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hdq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hdq f12881a;
    private static final ugi0 descriptor;

    static {
        hdq hdqVar = new hdq();
        f12881a = hdqVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.generate_coupon.data.model.FindCouponResponse", hdqVar, 4);
        zna0Var.j(TokenNames.C, true);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j(TokenNames.T, true);
        zna0Var.j("P", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jdq.e;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jdq.e;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
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
                list3 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list4 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list4);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new jdq(i, list, list2, list3, list4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jdq jdqVar = (jdq) obj;
        jdqVar.getClass();
        List list = jdqVar.d;
        List list2 = jdqVar.c;
        List list3 = jdqVar.b;
        List list4 = jdqVar.f16341a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jdq.e;
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
