package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jl20 extends zje {
    public List i;
    public List j;
    public q4f k;
    public g920 l;
    public List m;
    public Iterator n;
    public String o;
    public svu p;
    public boolean q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ on20 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.t = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.u0(null, null, null, false, null, this);
    }
}
