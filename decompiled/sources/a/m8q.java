package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m8q extends zje {
    public List i;
    public r8q j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ r8q m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8q(r8q r8qVar, zje zjeVar) {
        super(zjeVar);
        this.m = r8qVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.w(null, this);
    }
}
