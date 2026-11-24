package a;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class jaw0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jaw0(Looper looper, byte b) {
        super(looper);
        switch (b) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            default:
                Looper.getMainLooper();
                break;
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
