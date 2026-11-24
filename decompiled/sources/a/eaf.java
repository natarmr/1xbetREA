package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eaf extends zje {
    public List i;
    public gwe j;
    public List k;
    public boolean l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ gr00 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaf(gr00 gr00Var, zje zjeVar) {
        super(zjeVar);
        this.p = gr00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.y(null, 0L, null, false, false, this);
    }
}
