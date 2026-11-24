package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ovu extends zje {
    public List i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r2u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovu(r2u r2uVar, zje zjeVar) {
        super(zjeVar);
        this.k = r2uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
