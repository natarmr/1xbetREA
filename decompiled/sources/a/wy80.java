package a;

import java.util.Collection;
import java.util.Iterator;
import org.xplatform.banners.api.domain.models.PartnersTeamInfoBannerModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wy80 extends zje {
    public Collection i;
    public Iterator j;
    public PartnersTeamInfoBannerModel k;
    public Collection l;
    public Iterator m;
    public Collection n;
    public Collection o;
    public /* synthetic */ Object p;
    public final /* synthetic */ dq00 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy80(dq00 dq00Var, zje zjeVar) {
        super(zjeVar);
        this.q = dq00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(this);
    }
}
