package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class npl0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ xpl0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npl0(xpl0 xpl0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = xpl0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        xpl0 xpl0Var = this.k;
        switch (b) {
            case 0:
                return new npl0(xpl0Var, yjeVar, (byte) 0);
            case 1:
                return new npl0(xpl0Var, yjeVar, (byte) 1);
            default:
                return new npl0(xpl0Var, yjeVar, (byte) 2);
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
        }
        return ((npl0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        xpl0 xpl0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hjd hjdVar = xpl0Var.E;
                    cid cidVar = new cid("global_search", xpl0Var.o.b instanceof GlobalSearchContainerSettings.FromBetSlip ? new qr2() : new pr2());
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar) {
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
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i = xpl0.P;
                Object objM = xpl0Var.M(this);
                return objM == wneVar2 ? wneVar2 : objM;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                this.j = true;
                int i2 = xpl0.P;
                Object objM2 = xpl0Var.M(this);
                return objM2 == wneVar3 ? wneVar3 : objM2;
        }
    }
}
