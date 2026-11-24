package a;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ugu extends zje {
    public LinkedHashSet i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f4u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugu(f4u f4uVar, zje zjeVar) {
        super(zjeVar);
        this.k = f4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
