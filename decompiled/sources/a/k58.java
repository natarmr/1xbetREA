package a;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class k58 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17706a;
    public final WeakReference b;

    public k58(t58 t58Var, byte b) {
        this.f17706a = b;
        switch (b) {
            case 2:
                this.b = new WeakReference(t58Var);
                break;
            default:
                this.b = new WeakReference(t58Var);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f17706a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                if (weakReference.get() != null) {
                    ((l58) weakReference.get()).H0();
                }
                break;
            case 1:
                if (weakReference.get() != null) {
                    ((t58) weakReference.get()).o = false;
                }
                break;
            default:
                if (weakReference.get() != null) {
                    ((t58) weakReference.get()).p = false;
                }
                break;
        }
    }

    public k58(l58 l58Var) {
        this.f17706a = (byte) 0;
        this.b = new WeakReference(l58Var);
    }
}
