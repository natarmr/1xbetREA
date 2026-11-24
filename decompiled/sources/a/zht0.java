package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zht0 extends zje {
    public List i;
    public List j;
    public Iterator k;
    public hf6 l;
    public ArrayList m;
    public /* synthetic */ Object n;
    public final /* synthetic */ lri o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zht0(lri lriVar, zje zjeVar) {
        super(zjeVar);
        this.o = lriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.d(null, this);
    }
}
