package a;

import androidx.biometric.internal.ui.FingerprintDialogActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class xdq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40707a;
    public final /* synthetic */ FingerprintDialogActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xdq(FingerprintDialogActivity fingerprintDialogActivity, byte b) {
        super(0);
        this.f40707a = b;
        this.b = fingerprintDialogActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40707a;
        FingerprintDialogActivity fingerprintDialogActivity = this.b;
        switch (b) {
            case 0:
                return fingerprintDialogActivity.g();
            case 1:
                return fingerprintDialogActivity.o();
            case 2:
                return fingerprintDialogActivity.g();
            default:
                return fingerprintDialogActivity.o();
        }
    }
}
