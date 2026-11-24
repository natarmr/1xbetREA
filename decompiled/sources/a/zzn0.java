package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zzn0 extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kvu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn0(kvu kvuVar, zje zjeVar) {
        super(zjeVar);
        this.k = kvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
