package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m9e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m9e0 f21407a;
    private static final ugi0 descriptor;

    static {
        m9e0 m9e0Var = new m9e0();
        f21407a = m9e0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.medal_statistic.data.models.RatingValueColResponse", m9e0Var, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("contentType", true);
        zna0Var.j("ratingSpecialType", true);
        zna0Var.j("value", true);
        zna0Var.j("competitorId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = q9e0.f;
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = q9e0.f;
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        List list = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else if (iF == 2) {
                l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                i |= 4;
            } else if (iF == 3) {
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new q9e0(i, l, l2, l3, list, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q9e0 q9e0Var = (q9e0) obj;
        q9e0Var.getClass();
        String str = q9e0Var.e;
        List list = q9e0Var.d;
        Long l = q9e0Var.c;
        Long l2 = q9e0Var.b;
        Long l3 = q9e0Var.f28343a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = q9e0.f;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
