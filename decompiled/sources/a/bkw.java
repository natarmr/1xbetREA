package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bkw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2769a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ bkw(byte b, l7m0 l7m0Var, boolean z) {
        this.f2769a = b;
        this.b = z;
        this.c = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2769a;
        boolean z = false;
        l7m0 l7m0Var = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                if (z2 && ((Number) l7m0Var.getValue()).floatValue() == 1.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (z2 && ((Number) l7m0Var.getValue()).floatValue() < 1.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (!z2 && ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (!z2 && ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
