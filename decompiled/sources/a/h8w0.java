package a;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class h8w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12650a;

    public h8w0(String str) {
        this.f12650a = ohs0.m("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat(str);
    }

    public static String c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = ua80.i(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return kng0.l(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", c(this.f12650a, str, objArr), remoteException);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", c(this.f12650a, str, objArr));
        }
    }
}
