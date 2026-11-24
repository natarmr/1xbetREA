package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class e3u extends zje {
    public CyberGamesPage i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f3u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3u(f3u f3uVar, zje zjeVar) {
        super(zjeVar);
        this.l = f3uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0, this, null);
    }
}
