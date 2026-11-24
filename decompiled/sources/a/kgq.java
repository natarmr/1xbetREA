package a;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kgq implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18251a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ kgq(FirebaseMessaging firebaseMessaging, byte b) {
        this.f18251a = b;
        this.b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z;
        byte b = this.f18251a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (b) {
            case 0:
                zfr0 zfr0Var = (zfr0) obj;
                if (!firebaseMessaging.f.h() || zfr0Var.g.a() == null) {
                    return;
                }
                synchronized (zfr0Var) {
                    z = zfr0Var.f;
                }
                if (z) {
                    return;
                }
                zfr0Var.c(0L);
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    x0x.X(cloudMessage.f45477a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
