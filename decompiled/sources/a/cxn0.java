package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cxn0 extends zje {
    public List i;
    public Map j;
    public List k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ z220 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxn0(z220 z220Var, zje zjeVar) {
        super(zjeVar);
        this.s = z220Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.w(this, null, null);
    }
}
