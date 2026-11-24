package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class vns extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zns k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vns(zns znsVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = znsVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zns znsVar = this.k;
        switch (b) {
            case 0:
                return new vns(znsVar, yjeVar, (byte) 0);
            case 1:
                return new vns(znsVar, yjeVar, (byte) 1);
            default:
                return new vns(znsVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((vns) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        zns znsVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!((qns) znsVar.D()).f29046a) {
                        p7m0 p7m0Var = znsVar.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, qns.a((qns) value, true, false, false, null, null, null, 509)));
                    }
                    this.j = true;
                    obj = znsVar.O(true, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = zns.H;
                znsVar.W((GameSubscriptionSettingsScreenUiModel) obj);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarB = znsVar.C.b();
                    g7s g7sVar = new g7s(znsVar, (byte) 4);
                    this.j = true;
                    if (gmqVarB.c(g7sVar, this) == wneVar2) {
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
                    this.j = true;
                    int i2 = zns.H;
                    obj = znsVar.O(false, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = zns.H;
                znsVar.W((GameSubscriptionSettingsScreenUiModel) obj);
                return Unit.f46060a;
        }
    }
}
