package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class h0v extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0v(Object obj, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        Object obj2 = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ywq0 ywq0Var = (ywq0) obj2;
                if (agc.W(th)) {
                    ((wsc) ywq0Var.f).a();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qgd qgdVar = (qgd) obj2;
                if (agc.W(th)) {
                    ((t4v) qgdVar.g).a();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                wdu wduVar = (wdu) obj2;
                if (agc.W(th)) {
                    ((wsc) wduVar.f).a();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                rrd rrdVar = (rrd) obj2;
                if (agc.W(th)) {
                    ((t4v) rrdVar.f).a();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                nc0 nc0Var = (nc0) obj2;
                if (agc.W(th)) {
                    ((s4v) nc0Var.k).f31626a.i();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                qv2 qv2Var = (qv2) obj2;
                if (agc.W(th)) {
                    ((wsc) qv2Var.k).f39683a.j();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.k;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        yje yjeVar = (yje) obj4;
        switch (b) {
            case 0:
                h0v h0vVar = new h0v((ywq0) obj5, yjeVar, (byte) 0);
                h0vVar.j = th;
                return h0vVar.invokeSuspend(Unit.f46060a);
            case 1:
                h0v h0vVar2 = new h0v((qgd) obj5, yjeVar, (byte) 1);
                h0vVar2.j = th;
                return h0vVar2.invokeSuspend(Unit.f46060a);
            case 2:
                h0v h0vVar3 = new h0v((wdu) obj5, yjeVar, (byte) 2);
                h0vVar3.j = th;
                return h0vVar3.invokeSuspend(Unit.f46060a);
            case 3:
                h0v h0vVar4 = new h0v((rrd) obj5, yjeVar, (byte) 3);
                h0vVar4.j = th;
                return h0vVar4.invokeSuspend(Unit.f46060a);
            case 4:
                h0v h0vVar5 = new h0v((nc0) obj5, yjeVar, (byte) 4);
                h0vVar5.j = th;
                return h0vVar5.invokeSuspend(Unit.f46060a);
            default:
                h0v h0vVar6 = new h0v((qv2) obj5, yjeVar, (byte) 5);
                h0vVar6.j = th;
                return h0vVar6.invokeSuspend(Unit.f46060a);
        }
    }
}
