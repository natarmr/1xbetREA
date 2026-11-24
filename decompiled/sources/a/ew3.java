package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8500a;

    public /* synthetic */ ew3(byte b) {
        this.f8500a = b;
    }

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8500a) {
            case 0:
                fw3.y().f10239a.b.execute(runnable);
                break;
            case 1:
                runnable.run();
                break;
        }
    }
}
