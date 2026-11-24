package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iaf extends zje {
    public long i;
    public long j;
    public double k;
    public double l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public List q;
    public q4f r;
    public Object s;
    public iie0 t;
    public iie0 u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ o3c y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaf(o3c o3cVar, zje zjeVar) {
        super(zjeVar);
        this.y = o3cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.n(0L, 0.0d, 0.0d, false, null, this);
    }
}
