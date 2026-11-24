package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ep00 extends zje {
    public Object i;
    public Set j;
    public Collection k;
    public Iterator l;
    public Collection m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pzu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep00(pzu pzuVar, zje zjeVar) {
        super(zjeVar);
        this.p = pzuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.f0(null, this);
    }
}
