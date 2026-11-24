package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fu7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10148a;
    public final /* synthetic */ t33 b;

    public /* synthetic */ fu7(t33 t33Var, byte b) {
        this.f10148a = b;
        this.b = t33Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fFloatValue;
        float fFloatValue2;
        byte b = this.f10148a;
        t33 t33Var = this.b;
        switch (b) {
            case 0:
                fFloatValue = ((Number) t33Var.d()).floatValue();
                break;
            case 1:
                fFloatValue = l1e0.c(1.0f - (((Number) t33Var.d()).floatValue() * 2.0f), 0.0f, 1.0f);
                break;
            case 2:
                fFloatValue = ((Number) t33Var.d()).floatValue();
                break;
            case 3:
                fFloatValue2 = ((Number) t33Var.d()).floatValue();
                fFloatValue = fFloatValue2 * 1.9f;
                break;
            case 4:
                fFloatValue = ((Number) t33Var.d()).floatValue();
                break;
            case 5:
                fFloatValue = -((Number) t33Var.d()).floatValue();
                break;
            case 6:
                fFloatValue2 = -((Number) t33Var.d()).floatValue();
                fFloatValue = fFloatValue2 * 1.9f;
                break;
            case 7:
                fFloatValue = Math.abs(((Number) t33Var.d()).floatValue()) / 10.0f;
                break;
            case 8:
                fFloatValue = ((Number) t33Var.d()).floatValue();
                break;
            case 9:
                fFloatValue = ((Number) t33Var.d()).floatValue();
                break;
            case 10:
                fFloatValue = l1e0.c(1.0f - (((Number) t33Var.d()).floatValue() * 2.0f), 0.0f, 1.0f);
                break;
            case 11:
                fFloatValue = (float) Math.max(0.0d, (((Number) t33Var.d()).doubleValue() - 0.5d) / 0.5d);
                break;
            default:
                fFloatValue = ((Number) t33Var.d()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
