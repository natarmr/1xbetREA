package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class nbs extends zje {
    public ArrayList i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sbs k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbs(sbs sbsVar, zje zjeVar) {
        super(zjeVar);
        this.k = sbsVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(this);
    }
}
