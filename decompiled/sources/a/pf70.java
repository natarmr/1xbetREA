package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pf70 extends zje {
    public ql5 i;
    public Function2 j;
    public e5c k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qf70 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf70(qf70 qf70Var, zje zjeVar) {
        super(zjeVar);
        this.q = qf70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.J(null, false, null, this);
    }
}
