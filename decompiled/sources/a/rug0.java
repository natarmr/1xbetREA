package a;

import org.xbet.client1.R;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class rug0 extends w46 {
    public final SaleDataModel b;
    public final p7m0 c;
    public final qoj0 d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    public rug0(ctf0 ctf0Var, n3w n3wVar, boolean z, SaleDataModel saleDataModel, double d, m1e m1eVar) {
        String strF;
        double d2 = saleDataModel.e;
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = saleDataModel;
        s77 s77Var = n3wVar.c;
        String str = n3wVar.f22868a;
        String str2 = n3wVar.g;
        String strF2 = (s77Var == s77.TOTO || s77Var == s77.JACKPOT) ? ctf0Var.f(R.string.history_coupon_number, str) : n3wVar.m1;
        int iOrdinal = s77Var.ordinal();
        byte b = 2;
        if (iOrdinal == 1) {
            strF = "";
        } else if (iOrdinal == 2) {
            strF = ctf0Var.f(R.string.history_coupon_number_with_dot, str.length() == 0 ? n3wVar.b : str);
        } else if (iOrdinal != 6) {
            strF = ctf0Var.f(R.string.history_coupon_number_with_dot, str);
        } else {
            strF = "";
        }
        String str3 = strF;
        pn40 pn40Var = pn40.f27267a;
        double d3 = n3wVar.n1;
        d3 = d3 <= 0.0d ? n3wVar.o : d3;
        p3u0 p3u0Var = p3u0.c;
        this.c = q7m0.a(new qug0(new xvg0(n3wVar.j, z, strF2, str3, pn40.d(d3, str2, p3u0Var), n3wVar.f, pn40.d(d, str2, p3u0Var), pn40.d(saleDataModel.l, str2, p3u0Var), pn40.d(saleDataModel.h, str2, p3u0Var), pn40.d(d2, str2, p3u0Var), ctf0Var.f(R.string.credited_to_account_with_sum_new, new Object[0]), ctf0Var.f(R.string.history_sale_for_v2, pn40.d(d2, str2, p3u0Var)), ctf0Var.h())));
        this.d = ckb.F();
        this.e = true;
        slb.U(new fnq(m1eVar.b(), new yng0(this, null, b), (byte) 4), jiu0.a(this));
    }
}
