package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class u3u extends zje {
    public sip i;
    public CyberGamesPage j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d4u l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3u(d4u d4uVar, zje zjeVar) {
        super(zjeVar);
        this.l = d4uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, this);
    }
}
