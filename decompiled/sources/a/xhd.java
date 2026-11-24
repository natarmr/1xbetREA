package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xhd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40885a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xhd(Object obj, byte b) {
        this.f40885a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40885a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return androidx.compose.runtime.e.e(obj);
            case 1:
                return androidx.compose.runtime.e.e(obj);
            case 2:
                fee.h.getClass();
                return new fee(new vzd((byte) 3), obj);
            default:
                return obj;
        }
    }
}
