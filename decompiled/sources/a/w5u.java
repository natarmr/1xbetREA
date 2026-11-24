package a;

import java.util.Map;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class w5u extends zje {
    public CyberGamesPage i;
    public Map j;
    public /* synthetic */ Object k;
    public final /* synthetic */ es l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5u(es esVar, zje zjeVar) {
        super(zjeVar);
        this.l = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.q(null, this);
    }
}
