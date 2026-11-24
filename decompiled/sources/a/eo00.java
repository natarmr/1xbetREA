package a;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class eo00 extends zje {
    public j700 i;
    public Set j;
    public Set k;
    public boolean l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pzu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo00(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.o = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e0(null, null, null, false, false, this);
    }
}
