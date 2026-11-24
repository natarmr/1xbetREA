package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class itb extends ktb {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(itb.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final htb d;
    public final boolean e;

    public /* synthetic */ itb(htb htbVar, boolean z) {
        this(htbVar, z, kotlin.coroutines.g.f46065a, -3, i99.f14377a);
    }

    @Override // a.ktb, a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        if (this.b != -3) {
            Object objC = super.c(kmqVar, yjeVar);
            return objC == wne.f39444a ? objC : Unit.f46060a;
        }
        boolean z = this.e;
        if (z && f.getAndSet(this, 1) == 1) {
            jf4.n("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objM = xkb.M(kmqVar, this.d, z, yjeVar);
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    @Override // a.ktb
    public final String f() {
        return "channel=" + this.d;
    }

    @Override // a.ktb
    public final Object h(hzb0 hzb0Var, yje yjeVar) {
        Object objM = xkb.M(new mfi0(hzb0Var), this.d, this.e, yjeVar);
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    @Override // a.ktb
    public final ktb j(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return new itb(this.d, this.e, coroutineContext, i, i99Var);
    }

    @Override // a.ktb
    public final gmq k() {
        return new itb(this.d, this.e);
    }

    @Override // a.ktb
    public final htb l(vne vneVar) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.l(vneVar);
        }
        jf4.n("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public itb(htb htbVar, boolean z, CoroutineContext coroutineContext, int i, i99 i99Var) {
        super(coroutineContext, i, i99Var);
        this.d = htbVar;
        this.e = z;
    }
}
