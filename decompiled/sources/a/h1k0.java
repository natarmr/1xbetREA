package a;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h1k0 extends zje {
    public Collection i;
    public Iterator j;
    public j1k0 k;
    public d0t l;
    public Collection m;
    public j1k0 n;
    public Collection o;
    public int p;
    public boolean q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ i1k0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1k0(i1k0 i1k0Var, zje zjeVar) {
        super(zjeVar);
        this.t = i1k0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(null, this);
    }
}
