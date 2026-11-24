package a;

import java.util.concurrent.ThreadFactory;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m23 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f21037a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z04 c;

    public /* synthetic */ m23(ThreadFactory threadFactory, String str, z04 z04Var) {
        this.f21037a = threadFactory;
        this.b = str;
        this.c = z04Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f21037a.newThread(runnable);
        threadNewThread.getClass();
        threadNewThread.setName(this.b + StringsKt.b0(2, String.valueOf(z04.b.incrementAndGet(this.c))));
        return threadNewThread;
    }
}
