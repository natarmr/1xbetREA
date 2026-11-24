package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class th20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33943a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Object c;

    public /* synthetic */ th20(Object obj, double d, byte b) {
        this.f33943a = b;
        this.c = obj;
        this.b = d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33943a;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gx4 gx4Var = (gx4) obj3;
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                dx6 dx6Var = gx4Var.c;
                return b820.a(b820Var, null, null, null, null, null, gx4.a(gx4Var, null, null, dx6.a(dx6Var, null, vw6.a(dx6Var.b, this.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, 65534), 1), null, null, 27), null, false, false, false, false, false, 8159);
            default:
                hx4 hx4Var = (hx4) obj3;
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                bx6 bx6Var = hx4Var.c;
                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, null, bx6.a(bx6Var, null, tw6.a(bx6Var.b, this.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 65534), false, 5), null, null, false, 59), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
        }
    }
}
