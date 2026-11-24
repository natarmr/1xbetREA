package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ofu extends zje {
    public sys0 i;
    public s77 j;
    public gr00 k;
    public List l;
    public String m;
    public s77 n;
    public List o;
    public long p;
    public long q;
    public long r;
    public int s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ nc0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofu(nc0 nc0Var, zje zjeVar) {
        super(zjeVar);
        this.v = nc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.f(null, null, this);
    }
}
