package okhttp3.internal.concurrent;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46131a;
    public final boolean b;
    public TaskQueue c;
    public long d;

    public Task(String str, boolean z) {
        str.getClass();
        this.f46131a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long b();

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF46131a() {
        return this.f46131a;
    }
}
