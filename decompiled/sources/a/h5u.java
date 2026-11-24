package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h5u extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ i5u k;
    public kmq l;
    public List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5u(i5u i5uVar, yje yjeVar) {
        super(yjeVar);
        this.k = i5uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
