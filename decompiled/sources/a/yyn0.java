package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yyn0 extends zje {
    public Throwable i;
    public kka j;
    public bpn0 k;
    public fuj0 l;
    public i050 m;
    public List n;
    public Iterator o;
    public List p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ zyn0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyn0(zyn0 zyn0Var, zje zjeVar) {
        super(zjeVar);
        this.s = zyn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a0(null, null, null, this);
    }
}
