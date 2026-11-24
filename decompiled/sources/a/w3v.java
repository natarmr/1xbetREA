package a;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class w3v extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ p3v k;
    public kmq l;
    public Date m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3v(p3v p3vVar, yje yjeVar) {
        super(yjeVar);
        this.k = p3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
