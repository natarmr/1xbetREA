package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class iru extends zje {
    public boolean i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jru l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iru(jru jruVar, zje zjeVar) {
        super(zjeVar);
        this.l = jruVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(this, null, false);
    }
}
