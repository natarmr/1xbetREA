package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskQueue$schedule$2 extends Task {
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, Function0 function0) {
        super(str, true);
        this.e = function0;
    }

    @Override // okhttp3.internal.concurrent.Task
    public final long b() {
        return ((Number) this.e.invoke()).longValue();
    }
}
