package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o2u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2u0 f24549a;
    private static final ugi0 descriptor;

    static {
        o2u0 o2u0Var = new o2u0();
        f24549a = o2u0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.career.data.models.ValueColBodyResponse", o2u0Var, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("contentType", true);
        zna0Var.j("value", true);
        zna0Var.j("competitorId", true);
        zna0Var.j("colSpan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = s2u0.f;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0(ysm0.f43175a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = s2u0.f;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        String str = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                list = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new s2u0(i, num, num2, l, str, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s2u0 s2u0Var = (s2u0) obj;
        s2u0Var.getClass();
        Integer num = s2u0Var.e;
        String str = s2u0Var.d;
        List list = s2u0Var.c;
        Integer num2 = s2u0Var.b;
        Long l = s2u0Var.f31522a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = s2u0.f;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
