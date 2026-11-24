package a;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class e4e extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ConstraintTrackingWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4e(ConstraintTrackingWorker constraintTrackingWorker, zje zjeVar) {
        super(zjeVar);
        this.j = constraintTrackingWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, null, null, this);
    }
}
