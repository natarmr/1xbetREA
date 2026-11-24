package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class w1e extends zje {
    public boolean i;
    public Object j;
    public Object k;
    public mie0 l;
    public mie0 m;
    public CoroutineContext n;
    public mie0 o;
    public usd p;
    public /* synthetic */ Object q;
    public final /* synthetic */ z1e r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1e(z1e z1eVar, zje zjeVar) {
        super(zjeVar);
        this.r = z1eVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.m(false, null, this);
    }
}
