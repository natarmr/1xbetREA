package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iht0 extends zje {
    public /* synthetic */ Object A;
    public final /* synthetic */ xzp B;
    public int Y;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public List o;
    public List p;
    public List q;
    public List r;
    public g45 s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public long y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iht0(xzp xzpVar, zje zjeVar) {
        super(zjeVar);
        this.B = xzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.B.Q(false, false, false, false, this);
    }
}
