package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class u9k0 extends zje {
    public List i;
    public sff0 j;
    public ouu k;
    public byte l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ ouu p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9k0(ouu ouuVar, zje zjeVar) {
        super(zjeVar);
        this.p = ouuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.C(0, this, null);
    }
}
