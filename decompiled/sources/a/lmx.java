package a;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class lmx extends f9w0 implements IInterface {
    public final /* synthetic */ TaskCompletionSource b;

    public lmx(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
