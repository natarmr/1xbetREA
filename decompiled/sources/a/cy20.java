package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cy20 extends zje {
    public Map i;
    public Collection j;
    public Iterator k;
    public kx20 l;
    public dy20 m;
    public Collection n;
    public /* synthetic */ Object o;
    public final /* synthetic */ dy20 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy20(dy20 dy20Var, zje zjeVar) {
        super(zjeVar);
        this.p = dy20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.C(null, this);
    }
}
