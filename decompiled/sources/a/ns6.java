package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ns6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24038a;
    public final /* synthetic */ ql5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ns6(ql5 ql5Var, boolean z, byte b) {
        this.f24038a = b;
        this.b = ql5Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24038a;
        boolean z = this.c;
        ql5 ql5Var = this.b;
        switch (b) {
            case 0:
                c820 c820Var = (c820) obj2;
                ((oyg0) obj).getClass();
                c820Var.getClass();
                return c820.a(c820Var, null, null, new bn5(new ke(String.valueOf(ql5Var.b), ql5Var.f), z, ql5Var, false), null, null, null, false, false, false, false, null, 8187);
            case 1:
                x5y x5yVar = (x5y) obj2;
                ((oyg0) obj).getClass();
                x5yVar.getClass();
                long j = ql5Var.f28916a;
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(ql5Var.b, p3u0.c);
                String str = ql5Var.f;
                long j2 = ql5Var.e;
                str.getClass();
                return x5y.a(x5yVar, new vm5(j, j2, strC, str, this.c), null, false, false, 61);
            case 2:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                ql5 ql5Var2 = this.b;
                return b820.a(b820Var, null, null, new an5(new ke(String.valueOf(ql5Var2.b), ql5Var2.f), this.c, ql5Var2, b820Var.c.d, false), null, null, null, null, false, false, false, false, false, 8187);
            case 3:
                sg20 sg20Var = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var.getClass();
                return sg20.a(sg20Var, null, new ym5(new ke(String.valueOf(ql5Var.b), ql5Var.f), z, ql5Var, false), null, null, null, false, false, false, 0, 2043);
            default:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                xm5 xm5Var = a820Var.d;
                pn40 pn40Var2 = pn40.f27267a;
                ql5 ql5Var3 = this.b;
                String strC2 = pn40.c(ql5Var3.b, p3u0.c);
                String str2 = ql5Var3.f;
                str2.getClass();
                return a820.a(a820Var, null, null, xm5.a(xm5Var, new ke(strC2, str2), this.c, ql5Var3, null, 8), null, null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262135);
        }
    }
}
