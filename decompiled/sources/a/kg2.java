package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kg2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18220a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ kg2(byte b, boolean z) {
        this.f18220a = b;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18220a;
        boolean z = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(!z);
            case 1:
                return Boolean.valueOf(!z);
            case 2:
                return Boolean.valueOf(!z);
            case 3:
                return Boolean.valueOf(!z);
            case 4:
                return z ? dqo0.f6527a : xoo0.f41232a;
            case 5:
                return Boolean.valueOf(!z);
            case 6:
                return androidx.compose.runtime.e.e(Boolean.valueOf(z));
            default:
                return Boolean.valueOf(z);
        }
    }
}
