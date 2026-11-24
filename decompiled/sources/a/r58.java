package a;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class r58 implements qvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29872a = 1;
    public final Object b;

    public r58(t58 t58Var) {
        this.b = new WeakReference(t58Var);
    }

    @Override // a.qvj
    public final void onDestroy(clz clzVar) {
        byte b = this.f29872a;
        Object obj = this.b;
        switch (b) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((t58) weakReference.get()).c = null;
                }
                break;
            default:
                ujk.b.remove((f8) obj);
                break;
        }
    }

    public r58(f8 f8Var) {
        this.b = f8Var;
    }
}
