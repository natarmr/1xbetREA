package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class jiw extends zje {
    public sip i;
    public List j;
    public Map k;
    public Collection l;
    public Iterator m;
    public Object n;
    public long o;
    public /* synthetic */ Object p;
    public final /* synthetic */ a6u q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jiw(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.q = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(0L, this, null, null);
    }
}
