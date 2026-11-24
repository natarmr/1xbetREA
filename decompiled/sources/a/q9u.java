package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q9u extends zje {
    public List i;
    public ArrayList j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ali l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9u(ali aliVar, zje zjeVar) {
        super(zjeVar);
        this.l = aliVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.x(null, this);
    }
}
