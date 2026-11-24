package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c97 extends zje {
    public n3w i;
    public Collection j;
    public Iterator k;
    public su6 l;
    public Collection m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f97 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c97(f97 f97Var, zje zjeVar) {
        super(zjeVar);
        this.o = f97Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i0(null, this);
    }
}
