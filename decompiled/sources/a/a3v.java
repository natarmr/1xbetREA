package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a3v extends zje {
    public long i;
    public Long j;
    public Long k;
    public String l;
    public Integer m;
    public List n;
    public Collection o;
    public Iterator p;
    public zfs0 q;
    public Collection r;
    public int s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ h7k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3v(h7k h7kVar, zje zjeVar) {
        super(zjeVar);
        this.v = h7kVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.p(0L, null, null, null, null, 0, null, false, this);
    }
}
