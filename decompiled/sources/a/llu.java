package a;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class llu extends zje {
    public boolean i;
    public boolean j;
    public Map k;
    public vae0 l;
    public gmq m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nlu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llu(nlu nluVar, zje zjeVar) {
        super(zjeVar);
        this.o = nluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(false, this);
    }
}
