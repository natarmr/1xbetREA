package a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u7a implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f35175a;

    public u7a(AtomicReference atomicReference) {
        this.f35175a = atomicReference;
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) throws Exception {
        b1x b1xVar = (b1x) this.f35175a.getAndSet(null);
        if (b1xVar != null) {
            b1xVar.close();
        }
    }

    @Override // a.bmf0
    public final void q(cmf0 cmf0Var) throws Exception {
        cmf0Var.getClass();
        b1x b1xVar = (b1x) this.f35175a.getAndSet(null);
        if (b1xVar != null) {
            b1xVar.close();
        }
    }

    @Override // a.bmf0
    public final void w(gnf0 gnf0Var, long j, qmf0 qmf0Var) throws Exception {
        b1x b1xVar = (b1x) this.f35175a.getAndSet(null);
        if (b1xVar != null) {
            b1xVar.close();
        }
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) throws Exception {
        b1x b1xVar = (b1x) this.f35175a.getAndSet(null);
        if (b1xVar != null) {
            b1xVar.close();
        }
    }
}
