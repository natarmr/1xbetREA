package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class e3v extends zje {
    public String i;
    public Object j;
    public i6t0 k;
    public Object l;
    public List m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ dgu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3v(dgu dguVar, zje zjeVar) {
        super(zjeVar);
        this.p = dguVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.w(null, this);
    }
}
