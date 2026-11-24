package a;

import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ci20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4392a = 1;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ci20(double d, double d2, boolean z) {
        this.b = d;
        this.c = d2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4392a) {
            case 0:
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                dx6 dx6Var = rvj0Var.f31171a;
                return b820.a(b820Var, null, null, null, rvj0.a(rvj0Var, dx6.a(dx6Var, null, vw6.a(dx6Var.b, this.b, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, new AutoMaxUiModel(this.c, this.d), false, false, false, false, 65278), 1), null, null, null, null, 30), null, null, null, false, false, false, false, false, 8183);
            default:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                pvj0 pvj0Var = a820Var.e;
                bx6 bx6Var = pvj0Var.f27665a;
                return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(bx6Var.b, this.b, this.c, 0.0d, 0.0d, 0.0d, null, false, this.d, null, false, false, false, false, false, false, 65404), false, 5), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
        }
    }

    public /* synthetic */ ci20(double d, boolean z, double d2) {
        this.b = d;
        this.d = z;
        this.c = d2;
    }
}
