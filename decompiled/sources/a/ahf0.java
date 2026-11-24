package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ahf0 extends zje {
    public List i;
    public q4f j;
    public int k;
    public boolean l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wdu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahf0(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.o = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.x(null, this);
    }
}
