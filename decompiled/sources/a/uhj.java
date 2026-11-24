package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uhj extends zje {
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public List p;
    public List q;
    public /* synthetic */ Object r;
    public final /* synthetic */ uii s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhj(uii uiiVar, zje zjeVar) {
        super(zjeVar);
        this.s = uiiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.l(0, false, 0L, false, false, false, false, this);
    }
}
