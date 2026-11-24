package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class gsu extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsu(Object obj, boolean z, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = false;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                Throwable th = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                wdu wduVar = (wdu) obj2;
                boolean z2 = this.k;
                if (agc.W(th)) {
                    if (z2) {
                        ((ort) wduVar.h).f25751a.j();
                    } else {
                        ((x1u) wduVar.i).f40137a.i();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Throwable th2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                tzi tziVar = (tzi) obj2;
                boolean z3 = this.k;
                if (agc.W(th2)) {
                    if (z3) {
                        ((t4v) tziVar.h).a();
                    } else {
                        ((wsc) tziVar.i).a();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Throwable th3 = this.j;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    th3.printStackTrace();
                    long jV = kpb.v(((zos) obj2).b);
                    this.j = null;
                    this.k = true;
                    if (qcc.P(jV, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Boolean.TRUE;
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.l;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        yje yjeVar = (yje) obj4;
        switch (b) {
            case 0:
                gsu gsuVar = new gsu((wdu) obj5, this.k, yjeVar, (byte) 0);
                gsuVar.j = th;
                return gsuVar.invokeSuspend(Unit.f46060a);
            case 1:
                gsu gsuVar2 = new gsu((tzi) obj5, this.k, yjeVar, (byte) 1);
                gsuVar2.j = th;
                return gsuVar2.invokeSuspend(Unit.f46060a);
            default:
                gsu gsuVar3 = new gsu((zos) obj5, yjeVar);
                gsuVar3.j = th;
                return gsuVar3.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsu(zos zosVar, yje yjeVar) {
        super(4, yjeVar);
        this.i = (byte) 2;
        this.l = zosVar;
    }
}
