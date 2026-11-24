package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tq10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vq10 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq10(vq10 vq10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = vq10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vq10 vq10Var = this.l;
        switch (b) {
            case 0:
                tq10 tq10Var = new tq10(vq10Var, yjeVar, (byte) 0);
                tq10Var.k = obj;
                return tq10Var;
            default:
                tq10 tq10Var2 = new tq10(vq10Var, yjeVar, (byte) 1);
                tq10Var2.k = obj;
                return tq10Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tq10) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tq10) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        vq10 vq10Var = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p5a p5aVarA = vq10Var.i.a(new p6a(String.valueOf(vq10Var.l.b()), (byte) 6));
                    this.k = null;
                    this.j = true;
                    if (slb.Q(kmqVar, p5aVarA, this) == wneVar) {
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
                e7a e7aVar = (e7a) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (e7aVar instanceof d7a) {
                        qoj0 qoj0Var = vq10Var.w;
                        eq10 eq10Var = new eq10((d7a) e7aVar);
                        this.k = null;
                        this.j = true;
                        if (qoj0Var.a(eq10Var, this) == wneVar2) {
                            return wneVar2;
                        }
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
