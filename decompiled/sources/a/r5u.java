package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class r5u extends zje {
    public CyberGamesPage i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s5u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5u(s5u s5uVar, zje zjeVar) {
        super(zjeVar);
        this.k = s5uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
