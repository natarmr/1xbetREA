package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pf20 extends zje {
    public List i;
    public List j;
    public List k;
    public svu l;
    public String m;
    public boolean n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qg20 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf20(qg20 qg20Var, zje zjeVar) {
        super(zjeVar);
        this.q = qg20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.X(null, null, false, this);
    }
}
