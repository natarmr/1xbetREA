package a;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class f4e extends zje {
    public og00 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ConstraintTrackingWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4e(ConstraintTrackingWorker constraintTrackingWorker, zje zjeVar) {
        super(zjeVar);
        this.k = constraintTrackingWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(this);
    }
}
