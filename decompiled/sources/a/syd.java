package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class syd extends w46 {
    public final n3w b;
    public final p7m0 c;
    public final qoj0 d;

    public syd(ctf0 ctf0Var, n3w n3wVar, double d) {
        String strF;
        ctf0Var.getClass();
        this.b = n3wVar;
        s77 s77Var = n3wVar.c;
        String str = n3wVar.g;
        String str2 = n3wVar.f22868a;
        String strF2 = (s77Var == s77.TOTO || s77Var == s77.JACKPOT) ? ctf0Var.f(R.string.history_coupon_number, str2) : n3wVar.m1;
        int iOrdinal = s77Var.ordinal();
        if (iOrdinal == 1) {
            strF = "";
        } else if (iOrdinal != 2) {
            strF = ctf0Var.f(R.string.history_coupon_number_with_dot, str2);
        } else {
            strF = ctf0Var.f(R.string.history_coupon_number_with_dot, str2.length() == 0 ? n3wVar.b : str2);
        }
        String str3 = strF;
        pn40 pn40Var = pn40.f27267a;
        double d2 = n3wVar.n1;
        d2 = d2 <= 0.0d ? n3wVar.o : d2;
        p3u0 p3u0Var = p3u0.c;
        String strD = pn40.d(d2, str, p3u0Var);
        String strD2 = pn40.d(d, str, p3u0Var);
        this.c = q7m0.a(new ryd(new lzd(n3wVar.j, strF2, str3, strD, n3wVar.f, strD2, strD2, ctf0Var.f(R.string.credited_to_account_with_sum_new, new Object[0]), ctf0Var.f(R.string.history_sale_for_v2, strD2), ctf0Var.h())));
        this.d = ckb.F();
    }
}
