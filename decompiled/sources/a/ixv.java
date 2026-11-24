package a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class ixv implements ThreadFactory {
    public static final /* synthetic */ ixv b = new ixv(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15561a;

    public /* synthetic */ ixv(byte b2) {
        this.f15561a = b2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15561a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 1:
                return new i04(runnable, "fonts-androidx");
            default:
                Object obj = c1x0.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
