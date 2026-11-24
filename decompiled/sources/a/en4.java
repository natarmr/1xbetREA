package a;

import android.content.BroadcastReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.authreminder.impl.data.AuthReminderBroadcastReceiver;
import org.xplatform.prophylaxis.impl.prophylaxis.presentation.ProphylaxisAlarmReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8074a;
    public final /* synthetic */ BroadcastReceiver.PendingResult b;

    public /* synthetic */ en4(BroadcastReceiver.PendingResult pendingResult, byte b) {
        this.f8074a = b;
        this.b = pendingResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8074a;
        BroadcastReceiver.PendingResult pendingResult = this.b;
        switch (b) {
            case 0:
                int i = AuthReminderBroadcastReceiver.g;
                pendingResult.finish();
                break;
            default:
                int i2 = ProphylaxisAlarmReceiver.h;
                pendingResult.finish();
                break;
        }
        return Unit.f46060a;
    }
}
