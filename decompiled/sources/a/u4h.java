package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u4h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35048a;
    public final /* synthetic */ u910 b;

    public /* synthetic */ u4h(u910 u910Var, byte b) {
        this.f35048a = b;
        this.b = u910Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fFloatValue;
        byte b = this.f35048a;
        u910 u910Var = this.b;
        switch (b) {
            case 0:
                fFloatValue = ((Number) u910Var.getValue()).floatValue();
                break;
            case 1:
                fFloatValue = ((Number) u910Var.getValue()).floatValue();
                break;
            case 2:
                fFloatValue = ((Number) u910Var.getValue()).floatValue();
                break;
            default:
                fFloatValue = ((Number) u910Var.getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
