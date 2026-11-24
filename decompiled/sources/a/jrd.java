package a;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class jrd implements OnSuccessListener, OnFailureListener, OnCanceledListener, nh60, fh60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16998a;
    public final CountDownLatch b;

    public jrd(byte b) {
        this.f16998a = b;
        switch (b) {
            case 1:
                this.b = new CountDownLatch(1);
                break;
            default:
                this.b = new CountDownLatch(1);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        this.b.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        byte b = this.f16998a;
        CountDownLatch countDownLatch = this.b;
        switch (b) {
            case 0:
                countDownLatch.countDown();
                break;
            default:
                countDownLatch.countDown();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        byte b = this.f16998a;
        CountDownLatch countDownLatch = this.b;
        switch (b) {
            case 0:
                countDownLatch.countDown();
                break;
            default:
                countDownLatch.countDown();
                break;
        }
    }
}
