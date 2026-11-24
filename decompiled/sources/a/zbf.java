package a;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface zbf {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, f0u f0uVar, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar);
}
