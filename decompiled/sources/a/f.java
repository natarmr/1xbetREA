package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends h {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p68 p68Var, byte b) {
        super(p68Var);
        this.c = b;
    }

    @Override // a.c2
    public final String C() throws o660 {
        switch (this.c) {
            case 0:
                oif0 oif0Var = (oif0) this.b;
                if (((p68) this.f3600a).b < 48) {
                    throw o660.a();
                }
                StringBuilder sb = new StringBuilder();
                Q(8, sb);
                int iM = oif0.m(48, 2, (p68) oif0Var.b);
                sb.append("(392");
                sb.append(iM);
                sb.append(')');
                sb.append(oif0Var.i(50, null).e);
                return sb.toString();
            case 1:
                oif0 oif0Var2 = (oif0) this.b;
                p68 p68Var = (p68) oif0Var2.b;
                if (((p68) this.f3600a).b < 48) {
                    throw o660.a();
                }
                StringBuilder sb2 = new StringBuilder();
                Q(8, sb2);
                int iM2 = oif0.m(48, 2, p68Var);
                sb2.append("(393");
                sb2.append(iM2);
                sb2.append(')');
                int iM3 = oif0.m(50, 10, p68Var);
                if (iM3 / 100 == 0) {
                    sb2.append('0');
                }
                if (iM3 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(iM3);
                sb2.append(oif0Var2.i(60, null).e);
                return sb2.toString();
            default:
                StringBuilder sbR = brm0.r("(01)");
                int length = sbR.length();
                oif0 oif0Var3 = (oif0) this.b;
                sbR.append(oif0.m(4, 4, (p68) oif0Var3.b));
                R(sbR, 8, length);
                return oif0Var3.g(48, sbR);
        }
    }
}
