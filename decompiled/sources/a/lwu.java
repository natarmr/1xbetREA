package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class lwu extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Throwable j;
    public final /* synthetic */ yhi k;
    public final /* synthetic */ hie0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwu(byte b, yje yjeVar, yhi yhiVar, hie0 hie0Var) {
        super(4, yjeVar);
        this.i = b;
        this.k = yhiVar;
        this.l = hie0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        hie0 hie0Var = this.l;
        yhi yhiVar = this.k;
        Throwable th = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (agc.W(th)) {
                    ((jc60) yhiVar.c).f16260a.i();
                    hie0Var.f13108a = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (agc.W(th)) {
                    ((gqt) yhiVar.u).f11749a.j();
                    hie0Var.f13108a = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        hie0 hie0Var = this.l;
        yhi yhiVar = this.k;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        yje yjeVar = (yje) obj4;
        switch (b) {
            case 0:
                lwu lwuVar = new lwu((byte) 0, yjeVar, yhiVar, hie0Var);
                lwuVar.j = th;
                return lwuVar.invokeSuspend(Unit.f46060a);
            default:
                lwu lwuVar2 = new lwu((byte) 1, yjeVar, yhiVar, hie0Var);
                lwuVar2.j = th;
                return lwuVar2.invokeSuspend(Unit.f46060a);
        }
    }
}
