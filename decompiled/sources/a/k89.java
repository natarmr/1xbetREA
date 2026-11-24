package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class k89 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ p89 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k89(p89 p89Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p89Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p89 p89Var = this.k;
        switch (b) {
            case 0:
                return new k89(p89Var, yjeVar, (byte) 0);
            case 1:
                k89 k89Var = new k89(p89Var, yjeVar, (byte) 1);
                k89Var.j = ((Boolean) obj).booleanValue();
                return k89Var;
            case 2:
                return new k89(p89Var, yjeVar, (byte) 2);
            case 3:
                return new k89(p89Var, yjeVar, (byte) 3);
            default:
                return new k89(p89Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k89) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((k89) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((k89) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((k89) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k89) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        p89 p89Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    sdi0 sdi0Var = p89Var.g;
                    psr psrVar = psr.b;
                    this.j = true;
                    if (sdi0Var.a(psrVar, this) == wneVar) {
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
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    p7m0 p7m0Var = p89Var.l;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, b89.a((b89) value, true, false, false, false, null, false, 32479)));
                } else {
                    p89Var.y();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    sdi0 sdi0Var2 = p89Var.g;
                    psr psrVar2 = psr.f;
                    this.j = true;
                    if (sdi0Var2.a(psrVar2, this) == wneVar3) {
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
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = p89Var.l;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, b89.a((b89) value2, false, false, false, true, null, false, 32255)));
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
                p7m0 p7m0Var3 = p89Var.l;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, b89.a((b89) value3, false, false, false, false, null, false, 32255)));
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    sdi0 sdi0Var3 = p89Var.g;
                    psr psrVar3 = psr.d;
                    this.j = true;
                    if (sdi0Var3.a(psrVar3, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
