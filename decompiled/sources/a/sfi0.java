package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sfi0 extends zje {
    public rh80 i;
    public ArrayList j;
    public ArrayList k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public ArrayList q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ufi0 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfi0(ufi0 ufi0Var, zje zjeVar) {
        super(zjeVar);
        this.w = ufi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.b(null, this);
    }
}
