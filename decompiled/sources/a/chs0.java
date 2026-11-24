package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class chs0 extends zje {
    public long i;
    public long j;
    public long k;
    public Long l;
    public Long m;
    public String n;
    public Map o;
    public Throwable p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ vkr0 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chs0(vkr0 vkr0Var, zje zjeVar) {
        super(zjeVar);
        this.w = vkr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.y(0L, null, null, null, false, 0, null, this);
    }
}
