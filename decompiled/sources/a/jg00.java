package a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16456a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ jg00(AtomicBoolean atomicBoolean, byte b) {
        this.f16456a = b;
        this.b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f16456a;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
