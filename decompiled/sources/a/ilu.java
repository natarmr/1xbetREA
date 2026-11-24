package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ilu extends zje {
    public List i;
    public Map j;
    public Map k;
    public Object l;
    public r040 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nlu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilu(nlu nluVar, zje zjeVar) {
        super(zjeVar);
        this.o = nluVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
