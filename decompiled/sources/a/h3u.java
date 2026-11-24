package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h3u extends zje {
    public int i;
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i3u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3u(i3u i3uVar, zje zjeVar) {
        super(zjeVar);
        this.l = i3uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0, this);
    }
}
