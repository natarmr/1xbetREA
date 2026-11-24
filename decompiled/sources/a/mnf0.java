package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mnf0 extends zje {
    public byte i;
    public int j;
    public int k;
    public List l;
    public /* synthetic */ Object m;
    public final /* synthetic */ iu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnf0(iu iuVar, zje zjeVar) {
        super(zjeVar);
        this.n = iuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(0, 0, this);
    }
}
