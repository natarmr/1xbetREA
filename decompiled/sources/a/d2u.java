package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d2u extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ e2u k;
    public kmq l;
    public List m;
    public d2u n;
    public Throwable o;
    public long p;
    public long q;
    public int r;
    public int s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2u(e2u e2uVar, yje yjeVar) {
        super(yjeVar);
        this.k = e2uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
