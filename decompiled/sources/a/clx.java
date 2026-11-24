package a;

import kotlin.jvm.functions.Function0;
import org.xplatform.client1.features.appactivity.IntentForwardingActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class clx implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4581a;
    public final /* synthetic */ IntentForwardingActivity b;

    public /* synthetic */ clx(IntentForwardingActivity intentForwardingActivity, byte b) {
        this.f4581a = b;
        this.b = intentForwardingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4581a;
        IntentForwardingActivity intentForwardingActivity = this.b;
        switch (b) {
            case 0:
                return intentForwardingActivity.g();
            default:
                return intentForwardingActivity.o();
        }
    }
}
