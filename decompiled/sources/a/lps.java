package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lps implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lps f20455a;
    private static final ugi0 descriptor;

    static {
        lps lpsVar = new lps();
        f20455a = lpsVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.GameResponse", lpsVar, 2);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.k(new iy(new String[]{"GameId"}, (byte) 16));
        zna0Var.j("name", true);
        zna0Var.k(new iy(new String[]{"Name"}, (byte) 16));
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new cqs(i, num, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cqs cqsVar = (cqs) obj;
        cqsVar.getClass();
        String str = cqsVar.b;
        Integer num = cqsVar.f4812a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
