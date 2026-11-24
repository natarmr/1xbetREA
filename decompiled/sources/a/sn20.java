package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sn20 extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wdu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn20(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.k = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(this, null, null);
    }
}
