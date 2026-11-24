package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31058a;
    public final /* synthetic */ float b;

    public /* synthetic */ rt2(float f, byte b) {
        this.f31058a = b;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31058a;
        float f = this.b;
        switch (b) {
            case 0:
                return androidx.compose.runtime.e.a(f);
            case 1:
                return androidx.compose.runtime.e.a(f);
            case 2:
                return new oyq0(f, 0.0f, 0.0f);
            case 3:
                return Float.valueOf(l1e0.c(f, 0.0f, 1.0f));
            case 4:
                return androidx.compose.runtime.e.a(f);
            case 5:
                return Float.valueOf(l1e0.c((f - 100.0f) / 100.0f, 0.0f, 1.0f));
            case 6:
                zcl zclVar = qmk.f28987a;
                return new ycl(314.0f + f);
            case 7:
                zcl zclVar2 = qmk.f28987a;
                return new ycl(56.0f + f);
            case 8:
                return Float.valueOf(l1e0.c((f - 100.0f) / 100.0f, 0.0f, 1.0f));
            case 9:
                return Float.valueOf(l1e0.c((f - 100.0f) / 100.0f, 0.0f, 1.0f));
            case 10:
                return Float.valueOf(f);
            default:
                return Float.valueOf(l1e0.c((f - 100.0f) / 100.0f, 0.0f, 1.0f));
        }
    }
}
