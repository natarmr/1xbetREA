package okhttp3.internal.http2.flowcontrol;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WindowCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46204a;
    public long b;
    public long c;

    public WindowCounter(int i) {
        this.f46204a = i;
    }

    public static void b(WindowCounter windowCounter, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (windowCounter) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = windowCounter.b + j;
                windowCounter.b = j3;
                long j4 = windowCounter.c + j2;
                windowCounter.c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.b - this.c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f46204a + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + a() + ')';
    }
}
