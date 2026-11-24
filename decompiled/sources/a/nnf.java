package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class nnf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rnf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnf(rnf rnfVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rnfVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rnf rnfVar = this.k;
        switch (b) {
            case 0:
                return new nnf(rnfVar, yjeVar, (byte) 0);
            case 1:
                nnf nnfVar = new nnf(rnfVar, yjeVar, (byte) 1);
                nnfVar.j = ((Boolean) obj).booleanValue();
                return nnfVar;
            case 2:
                nnf nnfVar2 = new nnf(rnfVar, yjeVar, (byte) 2);
                nnfVar2.j = ((Boolean) obj).booleanValue();
                return nnfVar2;
            case 3:
                nnf nnfVar3 = new nnf(rnfVar, yjeVar, (byte) 3);
                nnfVar3.j = ((Boolean) obj).booleanValue();
                return nnfVar3;
            default:
                return new nnf(rnfVar, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nnf) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nnf) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((nnf) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((nnf) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nnf) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objA2;
        Object value2;
        byte b = this.i;
        rnf rnfVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    h3c h3cVar = rnfVar.N;
                    Cs2GameScreenParams cs2GameScreenParams = rnfVar.q;
                    long j = cs2GameScreenParams.e;
                    long j2 = cs2GameScreenParams.d;
                    this.j = true;
                    objA = h3cVar.a(j, j2, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                rnfVar.O.c().d(new v4f(rnfVar, (String) objA, (byte) 8));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = rnf.e0;
                p7m0 p7m0Var = rnfVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, wmf.a((wmf) value, null, null, false, null, null, null, z2, false, null, false, null, null, null, null, null, 16776191)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    rnfVar.u.h();
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i2 = rnf.e0;
                p7m0 p7m0Var2 = rnfVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (p7m0Var2.m(value3, wmf.a((wmf) value3, null, null, z5, null, null, null, false, false, null, false, null, null, null, null, null, 16777199))) {
                        return Unit.f46060a;
                    }
                    z4 = z5;
                }
                break;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    j3c j3cVar = rnfVar.T;
                    Cs2GameScreenParams cs2GameScreenParams2 = rnfVar.q;
                    long j3 = cs2GameScreenParams2.e;
                    long j4 = cs2GameScreenParams2.d;
                    this.j = true;
                    objA2 = j3cVar.a(j3, j4, this);
                    if (objA2 == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                ypl0 ypl0Var = (ypl0) objA2;
                int i3 = rnf.e0;
                p7m0 p7m0Var3 = rnfVar.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, wmf.a((wmf) value2, null, null, false, null, null, ypl0Var, false, false, null, false, null, null, null, null, null, 16776959)));
                return Unit.f46060a;
        }
    }
}
