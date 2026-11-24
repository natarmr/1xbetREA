package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class so10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32521a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ so10(float f, float f2, byte b) {
        this.f32521a = b;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32521a;
        float f = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y0x0.y(f2, f, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                y0x0.y(f2, f, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 2:
                oyg0 oyg0Var = (oyg0) obj;
                svg0 svg0Var = (svg0) obj2;
                oyg0Var.getClass();
                svg0Var.getClass();
                float f3 = this.b;
                q7x.F(oyg0Var, Float.valueOf(f3), "KEY_NEW_STAKE_PROGRESS");
                float f4 = this.c;
                q7x.F(oyg0Var, Float.valueOf(f4), "KEY_PAYMENT_PROGRESS");
                return svg0.a(svg0Var, f3, f4, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, null, null, null, null, null, 8388604);
            default:
                oyg0 oyg0Var2 = (oyg0) obj;
                svg0 svg0Var2 = (svg0) obj2;
                oyg0Var2.getClass();
                svg0Var2.getClass();
                float f5 = this.b;
                q7x.F(oyg0Var2, Float.valueOf(f5), "KEY_NEW_STAKE_PROGRESS");
                float f6 = this.c;
                q7x.F(oyg0Var2, Float.valueOf(f6), "KEY_PAYMENT_PROGRESS");
                return svg0.a(svg0Var2, f5, f6, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, null, null, null, null, null, null, 8388604);
        }
    }

    public /* synthetic */ so10(float f, float f2, int i, byte b) {
        this.f32521a = b;
        this.b = f;
        this.c = f2;
    }
}
