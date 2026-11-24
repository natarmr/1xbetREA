package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dut extends zje {
    public long i;
    public boolean j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dut(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.m = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.s(0L, this, false);
    }
}
