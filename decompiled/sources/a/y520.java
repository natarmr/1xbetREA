package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y520 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h620 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y520(h620 h620Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = h620Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        h620 h620Var = this.l;
        switch (b) {
            case 0:
                y520 y520Var = new y520(h620Var, yjeVar, (byte) 0);
                y520Var.k = obj;
                return y520Var;
            default:
                y520 y520Var2 = new y520(h620Var, yjeVar, (byte) 1);
                y520Var2.k = obj;
                return y520Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y520) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y520) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        h620 h620Var = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    q4f q4fVarA = h620Var.n.a();
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(q4fVarA, this) == wneVar) {
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
            default:
                q4f q4fVar = (q4f) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qoj0 qoj0Var = h620Var.g0;
                    this.k = null;
                    this.j = true;
                    if (qoj0Var.a(q4fVar, this) == wneVar2) {
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
        }
    }
}
