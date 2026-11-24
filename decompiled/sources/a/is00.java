package a;

import org.xplatform.localtimedif.impl.presentation.localtimediffworker.LocalTimeDiffWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class is00 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ LocalTimeDiffWorker j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is00(LocalTimeDiffWorker localTimeDiffWorker, zje zjeVar) {
        super(zjeVar);
        this.j = localTimeDiffWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
