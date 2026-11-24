package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vbc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vbc0 f37135a;
    private static final ugi0 descriptor;

    static {
        vbc0 vbc0Var = new vbc0();
        f37135a = vbc0Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.news.impl.data.models.PromoCmsGetPromotionTemplateInfoResponse", vbc0Var, 5);
        zna0Var.j("userData", true);
        zna0Var.j("stageDraws", true);
        zna0Var.j("ticketsTypes", true);
        zna0Var.j("pointsTypes", true);
        zna0Var.j("spinsTypes", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = xbc0.f;
        return new jiy[]{mrv.j0(bcc0.f2351a), mrv.j0((jiy) a8zVarArr[1].getValue()), mrv.j0((jiy) a8zVarArr[2].getValue()), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0((jiy) a8zVarArr[4].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = xbc0.f;
        boolean z = true;
        int i = 0;
        dcc0 dcc0Var = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                dcc0Var = (dcc0) bldVarA.e(ugi0Var, 0, bcc0.f2351a, dcc0Var);
                i |= 1;
            } else if (iF == 1) {
                list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                i |= 2;
            } else if (iF == 2) {
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            } else if (iF == 3) {
                list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                list4 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new xbc0(i, dcc0Var, list, list2, list3, list4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xbc0 xbc0Var = (xbc0) obj;
        xbc0Var.getClass();
        List list = xbc0Var.e;
        List list2 = xbc0Var.d;
        List list3 = xbc0Var.c;
        List list4 = xbc0Var.b;
        dcc0 dcc0Var = xbc0Var.f40595a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = xbc0.f;
        if (cldVarA.u(ugi0Var) || dcc0Var != null) {
            cldVarA.p(ugi0Var, 0, bcc0.f2351a, dcc0Var);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
