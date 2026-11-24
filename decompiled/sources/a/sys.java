package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class sys extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yys k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sys(yys yysVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yysVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yys yysVar = this.k;
        switch (b) {
            case 0:
                return new sys(yysVar, yjeVar, (byte) 0);
            case 1:
                return new sys(yysVar, yjeVar, (byte) 1);
            default:
                return new sys(yysVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((sys) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((sys) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sys) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        yys yysVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (yysVar.y(this) == wneVar) {
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
                    xsc xscVar = yysVar.h;
                    gqw0 gqw0Var = gqw0.m1;
                    this.j = true;
                    if (xscVar.a(gqw0Var, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p7m0 p7m0Var = yysVar.B;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, true, false, null, false, false, null, false, null, false, false, 524159)));
                    int i = GameBroadcastingControlPanelView.A;
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
                p7m0 p7m0Var2 = yysVar.B;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, ixs.a((ixs) value2, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 524159)));
                return Unit.f46060a;
        }
    }
}
