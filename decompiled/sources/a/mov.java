package a;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mov extends zje {
    public nov i;
    public Map j;
    public mov k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ nov s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mov(nov novVar, zje zjeVar) {
        super(zjeVar);
        this.s = novVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objA = this.s.a(null, this);
        return objA == wne.f39444a ? objA : new j0g0(objA);
    }
}
