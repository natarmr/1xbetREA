package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tl20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ on20 k;
    public final /* synthetic */ q4f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl20(on20 on20Var, q4f q4fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = on20Var;
        this.l = q4fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        q4f q4fVar = this.l;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                return new tl20(on20Var, q4fVar, yjeVar, (byte) 0);
            case 1:
                return new tl20(on20Var, q4fVar, yjeVar, (byte) 1);
            default:
                return new tl20(on20Var, q4fVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tl20) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tl20) create((hf6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tl20) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        q4f q4fVar = this.l;
        on20 on20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = on20.m1;
                    if (on20Var.T0(q4fVar, null, this) == wneVar) {
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
                    this.j = true;
                    int i2 = on20.m1;
                    if (on20Var.T0(q4fVar, null, this) == wneVar2) {
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
                    int i3 = on20.m1;
                    if (on20Var.T0(q4fVar, null, this) == wneVar3) {
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
