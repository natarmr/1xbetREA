package a;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class ibi0 extends wvh0 {
    public final /* synthetic */ AtomicReferenceArray g;

    public ibi0(long j, ibi0 ibi0Var, int i) {
        super(j, ibi0Var, i);
        this.g = new AtomicReferenceArray(hbi0.f);
    }

    @Override // a.wvh0
    public final int g() {
        return hbi0.f;
    }

    @Override // a.wvh0
    public final void h(int i, CoroutineContext coroutineContext) {
        this.g.set(i, hbi0.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
