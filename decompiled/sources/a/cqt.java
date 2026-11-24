package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cqt extends zje {
    public bwl i;
    public List j;
    public cne0 k;
    public ynb0 l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ es r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqt(es esVar, zje zjeVar) {
        super(zjeVar);
        this.r = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.v(null, null, null, 0, false, false, this);
    }
}
