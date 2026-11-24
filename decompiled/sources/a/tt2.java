package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tt2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34490a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ tt2(float f, l7m0 l7m0Var) {
        this.f34490a = (byte) 2;
        this.c = f;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34490a;
        float f = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(l1e0.c(1.0f - (((Number) l7m0Var.getValue()).floatValue() / f), 0.0f, 1.0f));
            case 1:
                return Float.valueOf(l1e0.c(1.0f - (((Number) l7m0Var.getValue()).floatValue() / f), 0.0f, 1.0f));
            case 2:
                return new ycl((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * f);
            default:
                return Float.valueOf(l1e0.c(1.0f - (((Number) l7m0Var.getValue()).floatValue() / f), 0.0f, 1.0f));
        }
    }

    public /* synthetic */ tt2(l7m0 l7m0Var, float f, byte b) {
        this.f34490a = b;
        this.b = l7m0Var;
        this.c = f;
    }
}
