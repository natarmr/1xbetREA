package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class fa20 extends zje {
    public nw40 i;
    public lie0 j;
    public LinkedHashMap k;
    public long l;
    public boolean m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ha20 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa20(ha20 ha20Var, zje zjeVar) {
        super(zjeVar);
        this.p = ha20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, 0L, false, 0, this);
    }
}
