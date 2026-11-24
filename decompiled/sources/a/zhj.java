package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zhj extends zje {
    public boolean i;
    public List j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uii m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhj(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.m = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.q(false, this);
    }
}
