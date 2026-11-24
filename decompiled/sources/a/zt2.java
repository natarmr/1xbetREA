package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zt2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44935a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zt2(x3m x3mVar, boolean z, float f) {
        this.d = x3mVar;
        this.b = z;
        this.c = f;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        byte b = this.f44935a;
        float fFloatValue = this.c;
        boolean z2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj;
                if (!z2) {
                    fFloatValue *= 1.0f - ((Number) l7m0Var.getValue()).floatValue();
                }
                return new ycl(fFloatValue);
            default:
                x3m x3mVar = (x3m) obj;
                rv2 rv2Var = x3mVar.d;
                float fL = rv2Var.f.l();
                Float fValueOf = Float.valueOf(fL);
                if (Float.isNaN(fL)) {
                    fValueOf = null;
                }
                if (z2) {
                    y3m y3mVarC = x3mVar.c();
                    y3m y3mVar = y3m.f41958a;
                    if (y3mVarC == y3mVar && ((y3m) rv2Var.e.getValue()) == y3mVar && (fValueOf == null || Math.abs(fValueOf.floatValue() - fFloatValue) <= 0.001f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ zt2(boolean z, float f, l7m0 l7m0Var) {
        this.b = z;
        this.c = f;
        this.d = l7m0Var;
    }
}
