package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vj00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vj00 f37507a;
    private static final ugi0 descriptor;

    static {
        vj00 vj00Var = new vj00();
        f37507a = vj00Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.data.model.LiveGameEventsResponse", vj00Var, 4);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("constId", true);
        zna0Var.j("events", true);
        zna0Var.j("scores", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xj00.e;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(s3h0.f31558a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xj00.e;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        c5h0 c5h0Var = null;
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
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                c5h0Var = (c5h0) bldVarA.e(ugi0Var, 3, s3h0.f31558a, c5h0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new xj00(i, num, num2, list, c5h0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xj00 xj00Var = (xj00) obj;
        xj00Var.getClass();
        c5h0 c5h0Var = xj00Var.d;
        List list = xj00Var.c;
        Integer num = xj00Var.b;
        Integer num2 = xj00Var.f40973a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xj00.e;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || c5h0Var != null) {
            cldVarA.p(ugi0Var, 3, s3h0.f31558a, c5h0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
