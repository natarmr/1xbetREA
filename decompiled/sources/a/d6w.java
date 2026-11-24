package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d6w extends zje {
    public s77 i;
    public String j;
    public List k;
    public List l;
    public List m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ rrd s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6w(rrd rrdVar, zje zjeVar) {
        super(zjeVar);
        this.s = rrdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.l(null, 0L, null, null, 0, false, null, null, null, false, false, false, this);
    }
}
