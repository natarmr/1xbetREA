package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pc1 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pc1 f26736a;
    private static final ugi0 descriptor;

    static {
        pc1 pc1Var = new pc1();
        f26736a = pc1Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.AggregatorProductsResponse", pc1Var, 3);
        zna0Var.j(RemoteMessageConst.DATA, true);
        zna0Var.j("ErrorId", true);
        zna0Var.j("Message", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(qc1.f28465a), okx.f25427a, mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        sc1 sc1Var = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                sc1Var = (sc1) bldVarA.e(ugi0Var, 0, qc1.f28465a, sc1Var);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new uc1(i, sc1Var, iJ, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uc1 uc1Var = (uc1) obj;
        uc1Var.getClass();
        String str = uc1Var.c;
        int i = uc1Var.b;
        sc1 sc1Var = uc1Var.f35408a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || sc1Var != null) {
            cldVarA.p(ugi0Var, 0, qc1.f28465a, sc1Var);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(1, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
