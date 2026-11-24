package a;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class hw40 extends zje {
    public FileOutputStream i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uuz l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw40(uuz uuzVar, zje zjeVar) {
        super(zjeVar);
        this.l = uuzVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, this);
    }
}
