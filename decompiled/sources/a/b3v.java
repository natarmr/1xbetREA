package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b3v extends zje {
    public long i;
    public boolean j;
    public List k;
    public Long l;
    public Integer m;
    public Long n;
    public String o;
    public Collection p;
    public Iterator q;
    public zfs0 r;
    public Collection s;
    public /* synthetic */ Object t;
    public final /* synthetic */ h7k u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3v(h7k h7kVar, zje zjeVar) {
        super(zjeVar);
        this.u = h7kVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.q(0L, false, null, null, null, null, null, this);
    }
}
