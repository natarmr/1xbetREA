package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c5d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3766a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c5d(float f, boolean z, byte b) {
        this.f3766a = b;
        this.b = f;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3766a;
        boolean z = false;
        boolean z2 = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                if (f > 0.5f && !z2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (f > 0.5d && !z2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
