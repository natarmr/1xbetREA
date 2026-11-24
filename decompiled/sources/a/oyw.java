package a;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class oyw extends jwq {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public oyw(b1x b1xVar, pyw pywVar) {
        super(b1xVar);
        this.e = new WeakReference(pywVar);
        a(new nyw((Object) this, (byte) 0));
    }

    @Override // a.jwq, java.lang.AutoCloseable
    public void close() throws Exception {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public oyw(b1x b1xVar) {
        super(b1xVar);
        this.e = new AtomicBoolean(false);
    }
}
