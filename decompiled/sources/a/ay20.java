package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ay20 extends zje {
    public Map i;
    public Collection j;
    public Iterator k;
    public kx20 l;
    public kx20 m;
    public qz40 n;
    public Collection o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ dy20 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay20(dy20 dy20Var, zje zjeVar) {
        super(zjeVar);
        this.s = dy20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.A(null, null, this);
    }
}
