package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c4t0 extends zje {
    public List i;
    public d4t0 j;
    public c4t0 k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ d4t0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4t0(d4t0 d4t0Var, zje zjeVar) {
        super(zjeVar);
        this.s = d4t0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objC = this.s.c(null, this);
        return objC == wne.f39444a ? objC : new j0g0(objC);
    }
}
