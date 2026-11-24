package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class bd7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ kd7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd7(kd7 kd7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kd7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kd7 kd7Var = this.k;
        switch (b) {
            case 0:
                return new bd7(kd7Var, yjeVar, (byte) 0);
            case 1:
                bd7 bd7Var = new bd7(kd7Var, yjeVar, (byte) 1);
                bd7Var.j = ((Boolean) obj).booleanValue();
                return bd7Var;
            case 2:
                return new bd7(kd7Var, yjeVar, (byte) 2);
            case 3:
                return new bd7(kd7Var, yjeVar, (byte) 3);
            case 4:
                return new bd7(kd7Var, yjeVar, (byte) 4);
            case 5:
                return new bd7(kd7Var, yjeVar, (byte) 5);
            default:
                return new bd7(kd7Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((bd7) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((bd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((bd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((bd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((bd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bd7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object value2;
        Object value3;
        Object objB2;
        Object value4;
        bby bbyVar;
        byte b = this.i;
        kd7 kd7Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jrt jrtVar = kd7Var.q;
                    BetInfoScreenModel betInfoScreenModel = kd7Var.p;
                    long j = betInfoScreenModel.b;
                    HistoryTypeModel historyTypeModel = betInfoScreenModel.f46385a;
                    this.j = true;
                    objB = jrtVar.b(j, historyTypeModel, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                List list = kd7.m0;
                p7m0 p7m0Var = kd7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, rc7.a((rc7) value, null, false, null, null, null, ql5Var, null, null, null, false, false, false, 0L, 0L, 268435327)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!((rc7) kd7Var.D()).b && !((rc7) kd7Var.D()).f30223a.equals(r9x.f30108a)) {
                    kd7Var.Q();
                }
                p7m0 p7m0Var2 = kd7Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, rc7.a((rc7) value2, null, z2, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 268435453)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    xw30 xw30Var = kd7Var.d0;
                    this.j = true;
                    xw30Var.getClass();
                    if (xw30Var.a(dv30.f6726a, this) == wneVar3) {
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
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    xw30 xw30Var2 = kd7Var.d0;
                    this.j = true;
                    xw30Var2.getClass();
                    if (xw30Var2.a(gv30.f11957a, this) == wneVar4) {
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
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    List list2 = kd7.m0;
                    p7m0 p7m0Var3 = kd7Var.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, rc7.a((rc7) value3, null, false, null, null, null, null, null, null, null, true, false, false, 0L, 0L, 267911167)));
                    xw30 xw30Var3 = kd7Var.d0;
                    iv30 iv30Var = new iv30(kd7Var.p.c);
                    this.j = true;
                    xw30Var3.getClass();
                    if (xw30Var3.a(iv30Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    xw30 xw30Var4 = kd7Var.d0;
                    this.j = true;
                    xw30Var4.getClass();
                    if (xw30Var4.a(kv30.f18936a, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    uii uiiVar = kd7Var.u;
                    String str = kd7Var.o;
                    BetInfoScreenModel betInfoScreenModel2 = kd7Var.p;
                    this.j = true;
                    objB2 = uiiVar.B(str, betInfoScreenModel2, this);
                    if (objB2 == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                a5w a5wVar = (a5w) objB2;
                List list3 = kd7.m0;
                p7m0 p7m0Var4 = kd7Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, rc7.a((rc7) value4, null, false, a5wVar, null, null, null, null, null, null, false, false, false, 0L, 0L, 268435447)));
                if ((!kd7Var.P() || !kd7Var.R()) && (bbyVar = kd7Var.k0) != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
        }
    }
}
