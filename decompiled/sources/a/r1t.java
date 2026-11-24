package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class r1t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ x1t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1t(x1t x1tVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = x1tVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        x1t x1tVar = this.k;
        switch (b) {
            case 0:
                r1t r1tVar = new r1t(x1tVar, yjeVar, (byte) 0);
                r1tVar.j = ((Boolean) obj).booleanValue();
                return r1tVar;
            case 1:
                return new r1t(x1tVar, yjeVar, (byte) 1);
            case 2:
                return new r1t(x1tVar, yjeVar, (byte) 2);
            case 3:
                return new r1t(x1tVar, yjeVar, (byte) 3);
            default:
                return new r1t(x1tVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((r1t) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r1t) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r1t) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r1t) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r1t) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        h1t h1tVar = h1t.f12300a;
        x1t x1tVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    p7m0 p7m0Var = x1tVar.m;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, true, false, false, null, false, null, 32735)));
                } else {
                    x1tVar.x();
                }
                return Unit.f46060a;
            case 1:
                p7m0 p7m0Var2 = x1tVar.m;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mpx mpxVar = x1tVar.d;
                    vsr vsrVar = vsr.b;
                    this.j = true;
                    if (mpxVar.a(vsrVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                x1tVar.b.C(new BroadcastingZoneLandscapeParams(((j1t) p7m0Var2.getValue()).f15752a, ((j1t) p7m0Var2.getValue()).b, ((j1t) p7m0Var2.getValue()).c, ((j1t) p7m0Var2.getValue()).d, true));
                p7m0 p7m0Var3 = x1tVar.n;
                p7m0Var3.getClass();
                p7m0Var3.o(null, h1tVar);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    mpx mpxVar2 = x1tVar.d;
                    wsr wsrVar = wsr.b;
                    this.j = true;
                    if (mpxVar2.a(wsrVar, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var4 = x1tVar.n;
                p7m0Var4.getClass();
                p7m0Var4.o(null, h1tVar);
                return Unit.f46060a;
            case 3:
                p7m0 p7m0Var5 = x1tVar.m;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    do {
                        value2 = p7m0Var5.getValue();
                    } while (!p7m0Var5.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, false, false, true, null, false, null, 32255)));
                    int i = GameBroadcastingControlPanelView.A;
                    long jF = znq0.f(2L);
                    this.j = true;
                    if (qcc.O(jF, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                do {
                    value3 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32255)));
                return Unit.f46060a;
            default:
                p7m0 p7m0Var6 = x1tVar.m;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    mpx mpxVar3 = x1tVar.d;
                    tsr tsrVar = new tsr(((j1t) p7m0Var6.getValue()).c, ((j1t) p7m0Var6.getValue()).f15752a, ((j1t) p7m0Var6.getValue()).b, ((j1t) p7m0Var6.getValue()).d);
                    this.j = true;
                    if (mpxVar3.a(tsrVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var7 = x1tVar.n;
                p7m0Var7.getClass();
                p7m0Var7.o(null, h1tVar);
                return Unit.f46060a;
        }
    }
}
