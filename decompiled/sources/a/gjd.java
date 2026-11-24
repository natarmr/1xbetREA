package a;

import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class gjd extends zje {
    public long i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public GameBroadcastType n;
    public grs o;
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ hjd r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjd(hjd hjdVar, zje zjeVar) {
        super(zjeVar);
        this.r = hjdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.t(0L, 0L, 0L, false, null, null, null, 0L, this);
    }
}
