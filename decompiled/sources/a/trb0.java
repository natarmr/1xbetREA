package a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class trb0 extends zje {
    public List i;
    public List j;
    public Map k;
    public Iterator l;
    public u0f0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ vrb0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trb0(vrb0 vrb0Var, zje zjeVar) {
        super(zjeVar);
        this.o = vrb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, this);
    }
}
