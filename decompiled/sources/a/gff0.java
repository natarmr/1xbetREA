package a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class gff0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f11204a;
    public final /* synthetic */ hny b;

    public gff0(ExecutorService executorService, hny hnyVar) {
        this.f11204a = executorService;
        this.b = hnyVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11204a.execute(runnable);
    }
}
