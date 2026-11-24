package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dqt extends zje {
    public lsn i;
    public List j;
    public cne0 k;
    public ynb0 l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ pmi r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqt(pmi pmiVar, zje zjeVar) {
        super(zjeVar);
        this.r = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.A(null, null, 0, false, false, this);
    }
}
