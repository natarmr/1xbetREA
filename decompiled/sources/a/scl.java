package a;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class scl extends zje {
    public File i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cad l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scl(cad cadVar, zje zjeVar) {
        super(zjeVar);
        this.l = cadVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, null, 0L, this);
    }
}
