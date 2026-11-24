package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ciz extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ eiz k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ciz(eiz eizVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = eizVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        eiz eizVar = this.k;
        switch (b) {
            case 0:
                return new ciz(eizVar, yjeVar, (byte) 0);
            case 1:
                return new ciz(eizVar, yjeVar, (byte) 1);
            default:
                return new ciz(eizVar, yjeVar, (byte) 2);
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
        return ((ciz) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objA;
        Object value;
        byte b = this.i;
        eiz eizVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    n4u n4uVar = eizVar.v;
                    String str = ((ihz) eizVar.D()).e.b;
                    this.j = true;
                    Serializable serializableG = n4uVar.g(str, this);
                    if (serializableG == wneVar) {
                        return wneVar;
                    }
                    obj2 = serializableG;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj2 = ((j0g0) obj).f15681a;
                }
                biz bizVar = new biz(obj2, (byte) 0);
                int i = eiz.E;
                eizVar.H(bizVar);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    eiz eizVar2 = this.k;
                    diz dizVar = new diz(eizVar2, eizVar2.o.b, ((ihz) eizVar2.D()).b, ((ihz) eizVar2.D()).c, null);
                    this.j = true;
                    if (d5c.J(this, dizVar) == wneVar2) {
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
                    j3c j3cVar = eizVar.s;
                    long j = eizVar.o.b;
                    long j2 = ((ihz) eizVar.D()).b;
                    this.j = true;
                    objA = j3cVar.a(j, j2, this);
                    if (objA == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i2 = eiz.E;
                p7m0 p7m0Var = eizVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ihz.a((ihz) value, 0L, 0, null, null, null, ypl0Var, null, null, null, null, null, null, null, false, false, false, 131007)));
                return Unit.f46060a;
        }
    }
}
