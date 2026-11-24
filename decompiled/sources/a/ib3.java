package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ib3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14467a;
    public final /* synthetic */ jie0 b;
    public final /* synthetic */ oyq0 c;
    public final /* synthetic */ jie0 d;

    public /* synthetic */ ib3(jie0 jie0Var, oyq0 oyq0Var, jie0 jie0Var2, byte b) {
        this.f14467a = b;
        this.b = jie0Var;
        this.c = oyq0Var;
        this.d = jie0Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14467a;
        jie0 jie0Var = this.d;
        oyq0 oyq0Var = this.c;
        jie0 jie0Var2 = this.b;
        i73 i73Var = (i73) obj;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) ((hgk0) i73Var.e).getValue()).floatValue() - jie0Var2.f16571a;
                float fL = oyq0Var.c.l();
                oyq0Var.c(fL + fFloatValue);
                float fAbs = Math.abs(fL - oyq0Var.c.l());
                jie0Var2.f16571a = ((Number) ((hgk0) i73Var.e).getValue()).floatValue();
                jie0Var.f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    i73Var.a();
                }
                break;
            case 1:
                i73Var.getClass();
                hgk0 hgk0Var = (hgk0) i73Var.e;
                float fFloatValue2 = ((Number) hgk0Var.getValue()).floatValue() - jie0Var2.f16571a;
                float fL2 = oyq0Var.c.l();
                oyq0Var.c(fL2 + fFloatValue2);
                float fAbs2 = Math.abs(fL2 - oyq0Var.c.l());
                jie0Var2.f16571a = ((Number) hgk0Var.getValue()).floatValue();
                jie0Var.f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue2 - fAbs2) > 0.5f) {
                    i73Var.a();
                }
                break;
            case 2:
                i73Var.getClass();
                hgk0 hgk0Var2 = (hgk0) i73Var.e;
                float fFloatValue3 = ((Number) hgk0Var2.getValue()).floatValue() - jie0Var2.f16571a;
                float fL3 = oyq0Var.c.l();
                oyq0Var.c(fL3 + fFloatValue3);
                float fAbs3 = Math.abs(fL3 - oyq0Var.c.l());
                jie0Var2.f16571a = ((Number) hgk0Var2.getValue()).floatValue();
                jie0Var.f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue3 - fAbs3) > 0.5f) {
                    i73Var.a();
                }
                break;
            case 3:
                i73Var.getClass();
                hgk0 hgk0Var3 = (hgk0) i73Var.e;
                float fFloatValue4 = ((Number) hgk0Var3.getValue()).floatValue() - jie0Var2.f16571a;
                float fL4 = oyq0Var.c.l();
                oyq0Var.c(fL4 + fFloatValue4);
                float fAbs4 = Math.abs(fL4 - oyq0Var.c.l());
                jie0Var2.f16571a = ((Number) hgk0Var3.getValue()).floatValue();
                jie0Var.f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue4 - fAbs4) > 0.5f) {
                    i73Var.a();
                }
                break;
            default:
                i73Var.getClass();
                hgk0 hgk0Var4 = (hgk0) i73Var.e;
                float fFloatValue5 = ((Number) hgk0Var4.getValue()).floatValue() - jie0Var2.f16571a;
                float fL5 = oyq0Var.c.l();
                oyq0Var.c(fL5 + fFloatValue5);
                float fAbs5 = Math.abs(fL5 - oyq0Var.c.l());
                jie0Var2.f16571a = ((Number) hgk0Var4.getValue()).floatValue();
                jie0Var.f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue5 - fAbs5) > 0.5f) {
                    i73Var.a();
                }
                break;
        }
        return Unit.f46060a;
    }
}
