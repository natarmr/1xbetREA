package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sl00 extends zje {
    public boolean i;
    public boolean j;
    public Object k;
    public List l;
    public Object m;
    public List n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ vl00 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl00(vl00 vl00Var, zje zjeVar) {
        super(zjeVar);
        this.q = vl00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(false, this);
    }
}
