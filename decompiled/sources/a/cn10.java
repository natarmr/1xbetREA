package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cn10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4633a = 0;
    public final /* synthetic */ ql5 b;
    public final /* synthetic */ double c;

    public /* synthetic */ cn10(double d, ql5 ql5Var) {
        this.c = d;
        this.b = ql5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4633a) {
            case 0:
                tm10 tm10Var = (tm10) obj2;
                ((oyg0) obj).getClass();
                tm10Var.getClass();
                pn40 pn40Var = pn40.f27267a;
                return tm10.a(tm10Var, null, pn40.c(this.c, p3u0.c), this.b.f, null, null, null, false, null, null, false, null, false, 0L, false, null, null, false, false, false, null, null, 4194297);
            default:
                xb70 xb70Var = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var.getClass();
                return xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, f970.a(xb70Var.o, false, true, false, this.c, false, false, false, 53), null, z870.a(xb70Var.q, 0, null, false, false, this.b, false, 47), 49151);
        }
    }

    public /* synthetic */ cn10(ql5 ql5Var, double d) {
        this.b = ql5Var;
        this.c = d;
    }
}
