package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class r79 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ s79 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r79(s79 s79Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = s79Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        s79 s79Var = this.k;
        switch (b) {
            case 0:
                return new r79(s79Var, yjeVar, (byte) 0);
            case 1:
                return new r79(s79Var, yjeVar, (byte) 1);
            case 2:
                return new r79(s79Var, yjeVar, (byte) 2);
            default:
                return new r79(s79Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((r79) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        s79 s79Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    sdi0 sdi0Var = s79Var.t;
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    sdi0 sdi0Var2 = s79Var.t;
                    psr psrVar2 = psr.f;
                    this.j = true;
                    if (sdi0Var2.a(psrVar2, this) == wneVar2) {
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
            case 2:
                ocj ocjVar = s79Var.i;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    int i = s79.A;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, o79.a((o79) value, false, false, true, false, null, null, false, null, 32511)));
                    int i2 = GameBroadcastingControlPanelView.A;
                    long jF = znq0.f(2L);
                    this.j = true;
                    if (qcc.O(jF, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = s79.A;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, o79.a((o79) value2, false, false, false, false, null, null, false, null, 32511)));
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    sdi0 sdi0Var3 = s79Var.t;
                    psr psrVar3 = psr.d;
                    this.j = true;
                    if (sdi0Var3.a(psrVar3, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
