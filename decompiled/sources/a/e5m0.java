package a;

import java.io.File;
import org.xplatform.app_start.impl.work.StartFailedLogWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class e5m0 extends zje {
    public File i;
    public gv00 j;
    public StartFailedLogWorker k;
    public /* synthetic */ Object l;
    public final /* synthetic */ StartFailedLogWorker m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5m0(StartFailedLogWorker startFailedLogWorker, zje zjeVar) {
        super(zjeVar);
        this.m = startFailedLogWorker;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
