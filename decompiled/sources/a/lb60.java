package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lb60 extends zje {
    public List i;
    public String j;
    public w5z k;
    public boolean l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ w5z p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb60(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.p = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.x(null, null, false, this);
    }
}
