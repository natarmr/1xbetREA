package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class w2b extends zje {
    public Iterator i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x2b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2b(x2b x2bVar, zje zjeVar) {
        super(zjeVar);
        this.k = x2bVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
