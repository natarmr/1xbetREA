package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cnu extends zje {
    public j2u i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ dnu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnu(dnu dnuVar, zje zjeVar) {
        super(zjeVar);
        this.l = dnuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
