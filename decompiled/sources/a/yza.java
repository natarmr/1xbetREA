package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yza extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d0b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yza(d0b d0bVar, zje zjeVar) {
        super(zjeVar);
        this.k = d0bVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
