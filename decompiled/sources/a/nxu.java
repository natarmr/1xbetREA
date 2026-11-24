package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nxu implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nxu f24299a;
    private static final ugi0 descriptor;

    static {
        nxu nxuVar = new nxu();
        f24299a = nxuVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.tax.data.models.GetTaxResponse", nxuVar, 6);
        zna0Var.j("vat", true);
        byte b = 20;
        zna0Var.k(new iy(new String[]{"Vat", "VAT"}, b));
        zna0Var.j("sumAfterTax", true);
        zna0Var.k(new iy(new String[]{"SumAfterTax"}, b));
        zna0Var.j("payout", true);
        zna0Var.k(new iy(new String[]{"Payout"}, b));
        zna0Var.j("tax", true);
        zna0Var.k(new iy(new String[]{"Tax"}, b));
        zna0Var.j("taxRefund", true);
        zna0Var.k(new iy(new String[]{"TaxRefund"}, b));
        zna0Var.j("potentialWinning", true);
        zna0Var.k(new iy(new String[]{"PotentialWinning"}, (byte) 20));
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jvo0 jvo0Var = jvo0.f17213a;
        return new jiy[]{mrv.j0(jvo0Var), mrv.j0(jvo0Var), mrv.j0(jvo0Var), mrv.j0(jvo0Var), mrv.j0(jvo0Var), mrv.j0(jvo0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        lvo0 lvo0Var = null;
        lvo0 lvo0Var2 = null;
        lvo0 lvo0Var3 = null;
        lvo0 lvo0Var4 = null;
        lvo0 lvo0Var5 = null;
        lvo0 lvo0Var6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    lvo0Var = (lvo0) bldVarA.e(ugi0Var, 0, jvo0.f17213a, lvo0Var);
                    i |= 1;
                    break;
                case 1:
                    lvo0Var2 = (lvo0) bldVarA.e(ugi0Var, 1, jvo0.f17213a, lvo0Var2);
                    i |= 2;
                    break;
                case 2:
                    lvo0Var3 = (lvo0) bldVarA.e(ugi0Var, 2, jvo0.f17213a, lvo0Var3);
                    i |= 4;
                    break;
                case 3:
                    lvo0Var4 = (lvo0) bldVarA.e(ugi0Var, 3, jvo0.f17213a, lvo0Var4);
                    i |= 8;
                    break;
                case 4:
                    lvo0Var5 = (lvo0) bldVarA.e(ugi0Var, 4, jvo0.f17213a, lvo0Var5);
                    i |= 16;
                    break;
                case 5:
                    lvo0Var6 = (lvo0) bldVarA.e(ugi0Var, 5, jvo0.f17213a, lvo0Var6);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new pxu(i, lvo0Var, lvo0Var2, lvo0Var3, lvo0Var4, lvo0Var5, lvo0Var6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pxu pxuVar = (pxu) obj;
        pxuVar.getClass();
        lvo0 lvo0Var = pxuVar.f;
        lvo0 lvo0Var2 = pxuVar.e;
        lvo0 lvo0Var3 = pxuVar.d;
        lvo0 lvo0Var4 = pxuVar.c;
        lvo0 lvo0Var5 = pxuVar.b;
        lvo0 lvo0Var6 = pxuVar.f27772a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || lvo0Var6 != null) {
            cldVarA.p(ugi0Var, 0, jvo0.f17213a, lvo0Var6);
        }
        if (cldVarA.u(ugi0Var) || lvo0Var5 != null) {
            cldVarA.p(ugi0Var, 1, jvo0.f17213a, lvo0Var5);
        }
        if (cldVarA.u(ugi0Var) || lvo0Var4 != null) {
            cldVarA.p(ugi0Var, 2, jvo0.f17213a, lvo0Var4);
        }
        if (cldVarA.u(ugi0Var) || lvo0Var3 != null) {
            cldVarA.p(ugi0Var, 3, jvo0.f17213a, lvo0Var3);
        }
        if (cldVarA.u(ugi0Var) || lvo0Var2 != null) {
            cldVarA.p(ugi0Var, 4, jvo0.f17213a, lvo0Var2);
        }
        if (cldVarA.u(ugi0Var) || lvo0Var != null) {
            cldVarA.p(ugi0Var, 5, jvo0.f17213a, lvo0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
