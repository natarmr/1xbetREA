package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hj0 f13139a;
    private static final ugi0 descriptor;

    static {
        hj0 hj0Var = new hj0();
        f13139a = hj0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorContentBlockResponse", hj0Var, 5);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("typeId", true);
        zna0Var.j("name", true);
        zna0Var.j("nameType", true);
        zna0Var.j("additionalData", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ni0.f23561a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        pi0 pi0Var = null;
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
            } else if (iF == 3) {
                str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                pi0Var = (pi0) bldVarA.e(ugi0Var, 4, ni0.f23561a, pi0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new jj0(i, num, num2, str, str2, pi0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jj0 jj0Var = (jj0) obj;
        jj0Var.getClass();
        pi0 pi0Var = jj0Var.e;
        String str = jj0Var.d;
        String str2 = jj0Var.c;
        Integer num = jj0Var.b;
        Integer num2 = jj0Var.f16598a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || pi0Var != null) {
            cldVarA.p(ugi0Var, 4, ni0.f23561a, pi0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
