package a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l23 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19287a;
    public final /* synthetic */ m23 b;

    public /* synthetic */ l23(int i, m23 m23Var) {
        this.f19287a = i;
        this.b = m23Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            i = this.f19287a;
            i2 = 10;
            if (i3 >= 10) {
                break;
            }
            if (i >= o23.f24511a[i3]) {
                i2 = i3 + 1;
                break;
            }
            i3++;
        }
        Thread threadNewThread = this.b.newThread(new n23(i, runnable));
        threadNewThread.setPriority(i2);
        return threadNewThread;
    }
}
