package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class r3z extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tzi l;
    public final /* synthetic */ l4z m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3z(tzi tziVar, l4z l4zVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = tziVar;
        this.m = l4zVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                r3z r3zVar = new r3z(this.l, this.m, yjeVar, (byte) 0);
                r3zVar.k = obj;
                return r3zVar;
            case 1:
                r3z r3zVar2 = new r3z(this.l, this.m, yjeVar, (byte) 1);
                r3zVar2.k = obj;
                return r3zVar2;
            default:
                r3z r3zVar3 = new r3z(this.l, this.m, yjeVar, (byte) 2);
                r3zVar3.k = obj;
                return r3zVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r3z) create((x3z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r3z) create((b4z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r3z) create((f4z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        byte b = this.i;
        l4z l4zVar = this.m;
        tzi tziVar = this.l;
        switch (b) {
            case 0:
                x3z x3zVar = (x3z) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    tziVar.getClass();
                    if (x3zVar instanceof v3z) {
                        ((p7m0) tziVar.k).o(null, new k4z(l4zVar.a()));
                        unit = Unit.f46060a;
                    } else {
                        unit = Unit.f46060a;
                    }
                    if (unit == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                b4z b4zVar = (b4z) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (tziVar.a(b4zVar, (j4z) l4zVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                f4z f4zVar = (f4z) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (tziVar.b(f4zVar, l4zVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
