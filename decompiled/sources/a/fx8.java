package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fx8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10297a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fx8(float f, float f2, l7m0 l7m0Var) {
        this.b = f;
        this.c = f2;
        this.d = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10297a;
        float f = this.c;
        float fFloatValue = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj;
                float f2 = fFloatValue - f;
                return Float.valueOf(f2 == 0.0f ? ((Number) l7m0Var.getValue()).floatValue() : (si30.b((((Number) l7m0Var.getValue()).floatValue() * f2) + f) - f) / f2);
            default:
                o2s o2sVar = (o2s) obj;
                if (((Number) o2sVar.c.d()).floatValue() == 0.0f) {
                    fFloatValue += ((Number) o2sVar.d.d()).floatValue() * (f - fFloatValue);
                }
                return Integer.valueOf(Math.round(fFloatValue));
        }
    }

    public /* synthetic */ fx8(o2s o2sVar, float f, float f2) {
        this.d = o2sVar;
        this.b = f;
        this.c = f2;
    }
}
