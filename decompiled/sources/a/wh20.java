package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39146a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ wh20(double d, double d2, boolean z, boolean z2, byte b) {
        this.f39146a = b;
        this.b = d;
        this.c = d2;
        this.d = z;
        this.e = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39146a;
        boolean z = this.e;
        boolean z2 = this.d;
        double d = this.c;
        switch (b) {
            case 0:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                return a820.a(a820Var, null, null, null, null, null, null, new vtb0(this.b, false, false, false, null, new ex4(d, z2, z), g920.COEF, false), false, null, 0.0f, false, null, 0, false, false, false, 262015);
            default:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                return b820.a(b820Var, null, null, null, null, null, null, new wtb0(this.b, false, false, false, null, new ex4(d, z2, z)), false, false, false, false, false, 8127);
        }
    }
}
