package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class j530 extends zje {
    public Iterator i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m530 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j530(m530 m530Var, zje zjeVar) {
        super(zjeVar);
        this.k = m530Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
