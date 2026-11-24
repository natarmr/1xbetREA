package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class cv00 extends zje {
    public Iterator i;
    public /* synthetic */ Object j;
    public final /* synthetic */ w5z k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv00(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.k = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(this);
    }
}
