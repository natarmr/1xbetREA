package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ppc extends zje {
    public q4f i;
    public List j;
    public Iterator k;
    public hf6 l;
    public boolean m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ mii0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppc(mii0 mii0Var, zje zjeVar) {
        super(zjeVar);
        this.p = mii0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.D(this);
    }
}
