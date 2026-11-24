package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ConnectionPool;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectionPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f46084a;

    public ConnectionPool() {
        TimeUnit.MINUTES.getClass();
        TaskRunner taskRunner = TaskRunner.INSTANCE;
        taskRunner.getClass();
        this.f46084a = new RealConnectionPool(taskRunner);
    }
}
