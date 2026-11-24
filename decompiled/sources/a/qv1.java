package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qv1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ uv1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv1(uv1 uv1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uv1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uv1 uv1Var = this.k;
        switch (b) {
            case 0:
                return new qv1(uv1Var, yjeVar, (byte) 0);
            case 1:
                return new qv1(uv1Var, yjeVar, (byte) 1);
            default:
                return new qv1(uv1Var, yjeVar, (byte) 2);
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
        return ((qv1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objI;
        Object value;
        Object objM;
        List list;
        mlr mlrVar;
        byte b = this.i;
        uv1 uv1Var = this.k;
        Long l = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gu1 gu1Var = ((yu1) uv1Var.D()).p;
                    if (gu1Var != null) {
                        if (gu1Var.b == z1s0.f43637a || !gu1Var.d) {
                            gu1Var = null;
                        }
                        if (gu1Var != null) {
                            l = new Long(0L);
                        }
                    }
                    zpu zpuVar = uv1Var.q;
                    long j = uv1Var.B;
                    this.j = true;
                    objI = zpuVar.i(j, this, l);
                    if (objI == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objI = obj;
                }
                List list2 = (List) objI;
                int i = uv1.X;
                p7m0 p7m0Var = uv1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yu1.a((yu1) value, null, false, null, null, null, null, at1.f1413a, null, null, false, false, false, null, list2, null, null, null, 31456255)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    o7s0 o7s0VarA = uv1Var.M.a(uv1Var.B);
                    mn1 mn1Var = new mn1(uv1Var, (byte) 2);
                    this.j = true;
                    if (o7s0VarA.c(mn1Var, this) == wneVar2) {
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
                    utb utbVarQ = uv1Var.o.q(true, uv1Var.B);
                    this.j = true;
                    objM = ntb.M(utbVarQ, this);
                    if (objM == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                gu1 gu1Var2 = (gu1) objM;
                if (gu1Var2 == null || (list = gu1Var2.r) == null || (mlrVar = (mlr) CollectionsKt.firstOrNull(list)) == null) {
                    return Unit.f46060a;
                }
                bv1 bv1Var = bv1.GAMES;
                int i2 = uv1.X;
                uv1Var.O(mlrVar, bv1Var);
                return Unit.f46060a;
        }
    }
}
