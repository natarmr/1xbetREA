package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n4v extends zje {
    public svu i;
    public List j;
    public cne0 k;
    public ynb0 l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public /* synthetic */ Object q;
    public final /* synthetic */ f7u r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4v(f7u f7uVar, zje zjeVar) {
        super(zjeVar);
        this.r = f7uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.v(null, null, 0, false, false, this);
    }
}
