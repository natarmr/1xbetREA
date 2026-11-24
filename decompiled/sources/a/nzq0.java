package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nzq0 extends zje {
    public int i;
    public List j;
    public ArrayList k;
    public ArrayList l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cyu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzq0(cyu cyuVar, zje zjeVar) {
        super(zjeVar);
        this.n = cyuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.l(0, this, null);
    }
}
