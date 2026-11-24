package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class k8w0 extends zje {
    public String i;
    public String j;
    public Serializable k;
    public Serializable l;
    public Serializable m;
    public Object[] n;
    public Object[] o;
    public Object[] p;
    public /* synthetic */ Object q;
    public final /* synthetic */ h0q0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8w0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.r = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(null, this);
    }
}
