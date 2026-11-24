package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z6f extends zje {
    public q4f i;
    public qz40 j;
    public r7f k;
    public q4f l;
    public List m;
    public List n;
    public List o;
    public List p;
    public /* synthetic */ Object q;
    public final /* synthetic */ r7f r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.r = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.Y(null, null, this);
    }
}
