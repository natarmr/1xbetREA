package okhttp3.internal.concurrent;

import a.brm0;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TaskLoggerKt {
    public static final String a(long j) {
        String strK;
        if (j <= -999500000) {
            strK = brm0.k((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strK = brm0.k((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strK = brm0.k((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strK = brm0.k((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strK = brm0.k((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strK = brm0.k((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strK}, 1));
    }

    public static final void b(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f46131a);
    }
}
