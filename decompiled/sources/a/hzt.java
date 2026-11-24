package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class hzt extends zje {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ tzi Y;
    public int Z;
    public List i;
    public List j;
    public List k;
    public q4f l;
    public List m;
    public Map n;
    public cit0 o;
    public Collection p;
    public Iterator q;
    public List r;
    public List s;
    public List t;
    public List u;
    public tzi v;
    public vb9 w;
    public p0g0 x;
    public p0g0 y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzt(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.Y = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.q(null, null, null, null, null, false, null, null, this);
    }
}
