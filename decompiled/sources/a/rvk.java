package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class rvk implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lne f31172a;

    public rvk(lne lneVar) {
        this.f31172a = lneVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws mvk {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        lne lneVar = this.f31172a;
        if (ovk.c(lneVar, gVar)) {
            ovk.b(lneVar, gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f31172a.toString();
    }
}
