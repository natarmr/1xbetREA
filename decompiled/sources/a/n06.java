package a;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class n06 extends jaw0 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", b1j.h(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.h);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            hny.b();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            y50 y50Var = BasePendingResult.j;
            throw e;
        }
    }
}
