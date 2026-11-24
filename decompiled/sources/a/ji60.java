package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ji60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ i89 k;
    public final /* synthetic */ clz l;
    public final /* synthetic */ Function2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji60(i89 i89Var, clz clzVar, Function2 function2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        switch (b) {
            case 1:
                lkz lkzVar = lkz.f20223a;
                this.k = i89Var;
                this.l = clzVar;
                this.m = function2;
                super(2, yjeVar);
                break;
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                this.k = i89Var;
                this.l = clzVar;
                this.m = function2;
                super(2, yjeVar);
                break;
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                this.k = i89Var;
                this.l = clzVar;
                this.m = function2;
                super(2, yjeVar);
                break;
            default:
                lkz lkzVar4 = lkz.f20223a;
                this.k = i89Var;
                this.l = clzVar;
                this.m = function2;
                break;
        }
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new ji60(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new ji60(this.k, this.l, this.m, yjeVar, (byte) 1);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new ji60(this.k, this.l, this.m, yjeVar, (byte) 2);
            default:
                lkz lkzVar4 = lkz.f20223a;
                return new ji60(this.k, this.l, this.m, yjeVar, (byte) 3);
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
            case 2:
                break;
        }
        return ((ji60) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function2 function2 = this.m;
        clz clzVar = this.l;
        i89 i89Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B(i89Var, clzVar.x(), lkz.d);
                    ii60 ii60Var = new ii60(function2, (byte) 0);
                    this.j = true;
                    if (bq9VarB.c(ii60Var, this) == wneVar) {
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
                    bq9 bq9VarB2 = hkb.B(i89Var, clzVar.x(), lkz.d);
                    ii60 ii60Var2 = new ii60(function2, (byte) 1);
                    this.j = true;
                    if (bq9VarB2.c(ii60Var2, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B(i89Var, clzVar.x(), lkz.d);
                    ii60 ii60Var3 = new ii60(function2, (byte) 2);
                    this.j = true;
                    if (bq9VarB3.c(ii60Var3, this) == wneVar3) {
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
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B(i89Var, clzVar.x(), lkz.d);
                    ii60 ii60Var4 = new ii60(function2, (byte) 3);
                    this.j = true;
                    if (bq9VarB4.c(ii60Var4, this) == wneVar4) {
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
