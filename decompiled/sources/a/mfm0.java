package a;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mfm0 extends zje {
    public String i;
    public Map j;
    public Throwable k;
    public boolean l;
    public boolean m;
    public long n;
    public long o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ nfm0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfm0(nfm0 nfm0Var, yje yjeVar) {
        super(yjeVar);
        this.s = nfm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, false, this);
    }
}
