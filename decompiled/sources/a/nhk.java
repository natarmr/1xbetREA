package a;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.javax.sip.header.SubscriptionStateHeader;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class nhk extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23536a;
    public final /* synthetic */ jtj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhk(jtj jtjVar, byte b) {
        super(0);
        this.f23536a = b;
        this.b = jtjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23536a;
        jtj jtjVar = this.b;
        switch (b) {
            case 0:
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) jtjVar.b;
                devicePolicyManager.getClass();
                int storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
                if (storageEncryptionStatus == 0) {
                    return "unsupported";
                }
                if (storageEncryptionStatus == 1) {
                    return "inactive";
                }
                if (storageEncryptionStatus == 2) {
                    return "activating";
                }
                if (storageEncryptionStatus != 3) {
                    return storageEncryptionStatus != 5 ? "" : "active_per_user";
                }
                return SubscriptionStateHeader.ACTIVE;
            default:
                KeyguardManager keyguardManager = (KeyguardManager) jtjVar.c;
                keyguardManager.getClass();
                return Boolean.valueOf(keyguardManager.isKeyguardSecure());
        }
    }
}
