package a;

import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;

/* JADX INFO: loaded from: classes.dex */
public final class skt0 extends zje {
    public xuf i;
    public StepInputConfigModel j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fht0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skt0(fht0 fht0Var, zje zjeVar) {
        super(zjeVar);
        this.l = fht0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(null, null, null, null, 0.0d, this);
    }
}
