package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y6d extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ z6d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6d(z6d z6dVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z6dVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        z6d z6dVar = this.k;
        switch (b) {
            case 0:
                return new y6d(z6dVar, yjeVar, (byte) 0);
            case 1:
                return new y6d(z6dVar, yjeVar, (byte) 1);
            default:
                return new y6d(z6dVar, yjeVar, (byte) 2);
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
        return ((y6d) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        z6d z6dVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    long jC = ((wgu0) mbc.R(z6dVar, bmd.t)).c();
                    this.j = true;
                    if (qcc.O(jC, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Function0 function0 = z6dVar.l1;
                if (function0 != null) {
                    function0.invoke();
                }
                if (z6dVar.m1) {
                    ((tv90) ((omv) mbc.R(z6dVar, bmd.l))).a(0);
                }
                z6dVar.t1 = true;
                c4m0 c4m0Var = z6dVar.r1;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                z6dVar.r1 = null;
                z6dVar.q1 = null;
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    long jC2 = ((wgu0) mbc.R(z6dVar, bmd.t)).c();
                    this.j = true;
                    if (qcc.O(jC2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Function0 function1 = z6dVar.l1;
                if (function1 != null) {
                    function1.invoke();
                }
                if (z6dVar.m1) {
                    ((tv90) ((omv) mbc.R(z6dVar, bmd.l))).a(0);
                }
                z6dVar.A1 = true;
                c4m0 c4m0Var2 = z6dVar.y1;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                z6dVar.y1 = null;
                z6dVar.x1 = null;
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    long jC3 = ((wgu0) mbc.R(z6dVar, bmd.t)).c();
                    this.j = true;
                    if (qcc.O(jC3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Function0 function2 = z6dVar.l1;
                if (function2 != null) {
                    function2.invoke();
                }
                return Unit.f46060a;
        }
    }
}
