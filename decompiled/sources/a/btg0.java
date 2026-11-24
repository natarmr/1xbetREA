package a;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class btg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3182a;
    public final Runnable b;

    public /* synthetic */ btg0(Runnable runnable, byte b) {
        this.f3182a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f3182a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    m8x.O(e, "Executor", "Background execution failure.");
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.f3182a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
