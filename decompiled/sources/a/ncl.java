package a;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ncl extends zje {
    public File i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ocl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncl(ocl oclVar, zje zjeVar) {
        super(zjeVar);
        this.l = oclVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(null, null, 0L, this);
    }
}
