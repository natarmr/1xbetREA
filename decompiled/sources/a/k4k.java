package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k4k extends zje {
    public long i;
    public long j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zri m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4k(zri zriVar, zje zjeVar) {
        super(zjeVar);
        this.m = zriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(0L, this);
    }
}
