package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cqu extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dqu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqu(dqu dquVar, zje zjeVar) {
        super(zjeVar);
        this.k = dquVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0, this, null);
    }
}
