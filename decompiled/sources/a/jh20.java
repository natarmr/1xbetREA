package a;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16507a;
    public final /* synthetic */ BigDecimal b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jh20(BigDecimal bigDecimal, boolean z, boolean z2, byte b) {
        this.f16507a = b;
        this.b = bigDecimal;
        this.c = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16507a) {
            case 0:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                hx4 hx4Var = a820Var.g;
                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, yyc.a(hx4Var.b, this.b, null, this.c, this.d, 30), null, null, null, false, 61), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case 1:
                a820 a820Var2 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var2.getClass();
                hx4 hx4Var2 = a820Var2.g;
                return a820.a(a820Var2, null, null, null, null, null, hx4.a(hx4Var2, null, yyc.a(hx4Var2.b, this.b, null, this.c, this.d, 30), null, null, null, false, 61), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case 2:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                gx4 gx4Var = b820Var.f;
                return b820.a(b820Var, null, null, null, null, null, gx4Var != null ? gx4.a(gx4Var, null, xyc.a(gx4Var.b, this.b, null, this.c, this.d, 30), null, null, null, 29) : null, null, false, false, false, false, false, 8159);
            default:
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                gx4 gx4Var2 = b820Var2.f;
                return b820.a(b820Var2, null, null, null, null, null, gx4Var2 != null ? gx4.a(gx4Var2, null, xyc.a(gx4Var2.b, this.b, null, this.c, this.d, 30), null, null, null, 29) : null, null, false, false, false, false, false, 8159);
        }
    }
}
