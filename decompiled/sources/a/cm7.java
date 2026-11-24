package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class cm7 extends zje {
    public n3w i;
    public Collection j;
    public Iterator k;
    public su6 l;
    public Collection m;
    public /* synthetic */ Object n;
    public final /* synthetic */ fm7 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm7(fm7 fm7Var, zje zjeVar) {
        super(zjeVar);
        this.o = fm7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.X(null, this);
    }
}
