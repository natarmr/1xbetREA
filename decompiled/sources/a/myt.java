package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class myt extends zje {
    public List i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nyt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myt(nyt nytVar, zje zjeVar) {
        super(zjeVar);
        this.l = nytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
