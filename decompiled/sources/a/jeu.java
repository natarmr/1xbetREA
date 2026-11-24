package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jeu extends zje {
    public long i;
    public long j;
    public c7v k;
    public List l;
    public Collection m;
    public Object n;
    public Iterator o;
    public Object p;
    public Object q;
    public Object r;
    public Collection s;
    public double t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ abu x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jeu(abu abuVar, zje zjeVar) {
        super(zjeVar);
        this.x = abuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.t(0L, this);
    }
}
