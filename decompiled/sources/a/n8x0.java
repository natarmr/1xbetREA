package a;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n8x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l8x0 f23112a;

    static {
        l8x0 l8x0Var;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new l8x0[0]).iterator();
                if (it.hasNext()) {
                    l8x0Var = (l8x0) it.next();
                    x0x.J("Expected at most one FlagsService", !it.hasNext());
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    l8x0Var = new l8x0();
                }
                f23112a = l8x0Var;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
