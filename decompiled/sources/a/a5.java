package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ lbh0 k;
    public /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5(lbh0 lbh0Var, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lbh0Var;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                a5 a5Var = new a5(this.k, yjeVar);
                a5Var.l = ((ne60) obj).f23370a;
                return a5Var;
            case 1:
                return new a5(this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new a5(this.k, this.l, yjeVar, (byte) 2);
            default:
                return new a5(this.k, this.l, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                long j = ((ne60) obj).f23370a;
                a5 a5Var = new a5(this.k, (yje) obj2);
                a5Var.l = j;
                return a5Var.invokeSuspend(Unit.f46060a);
            case 1:
                return ((a5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        lbh0 lbh0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                long j = this.l;
                this.j = true;
                Object objC = fbh0.c(lbh0Var.s1, j, this);
                return objC == wneVar ? wneVar : objC;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    sch0 sch0Var = lbh0Var.s1;
                    c050 c050Var = c050.b;
                    hu6 hu6Var = new hu6(this.l, yjeVar, (byte) 9);
                    this.j = true;
                    if (sch0Var.g(c050Var, hu6Var, this) == wneVar2) {
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
                    sch0 sch0Var2 = lbh0Var.s1;
                    long j2 = this.l;
                    this.j = true;
                    if (sch0Var2.c(j2, true, this) == wneVar3) {
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
                    sch0 sch0Var3 = lbh0Var.s1;
                    long j3 = this.l;
                    this.j = true;
                    if (sch0Var3.c(j3, false, this) == wneVar4) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(lbh0 lbh0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = lbh0Var;
    }
}
