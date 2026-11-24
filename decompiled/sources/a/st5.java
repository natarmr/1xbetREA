package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class st5 extends zje {
    public List i;
    public String j;
    public Object k;
    public Throwable l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ cu5 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st5(cu5 cu5Var, zje zjeVar) {
        super(zjeVar);
        this.x = cu5Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.l(null, 0, false, false, null, false, false, this);
    }
}
