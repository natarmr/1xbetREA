package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ec60 extends zje {
    public sff0 i;
    public String j;
    public s77 k;
    public String l;
    public rrd m;
    public List n;
    public List o;
    public boolean p;
    public int q;
    public long r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ywq0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec60(ywq0 ywq0Var, zje zjeVar) {
        super(zjeVar);
        this.t = ywq0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.m(null, null, this);
    }
}
