package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.mlbb.api.MlbbGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ll40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nl40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll40(nl40 nl40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nl40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nl40 nl40Var = this.k;
        switch (b) {
            case 0:
                ll40 ll40Var = new ll40(nl40Var, yjeVar, (byte) 0);
                ll40Var.j = ((Boolean) obj).booleanValue();
                return ll40Var;
            case 1:
                ll40 ll40Var2 = new ll40(nl40Var, yjeVar, (byte) 1);
                ll40Var2.j = ((Boolean) obj).booleanValue();
                return ll40Var2;
            case 2:
                ll40 ll40Var3 = new ll40(nl40Var, yjeVar, (byte) 2);
                ll40Var3.j = ((Boolean) obj).booleanValue();
                return ll40Var3;
            default:
                return new ll40(nl40Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ll40) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((ll40) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((ll40) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ll40) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        byte b = this.i;
        nl40 nl40Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = nl40.a0;
                p7m0 p7m0Var = nl40Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, dl40.a((dl40) value, null, null, null, null, null, false, null, z, false, null, null, null, false, null, 0L, 16760831)));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    nl40Var.G.h();
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = nl40.a0;
                p7m0 p7m0Var2 = nl40Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z4 = z3;
                    if (p7m0Var2.m(value3, dl40.a((dl40) value3, null, null, null, null, null, z4, null, false, false, null, null, null, false, null, 0L, 16776703))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    j3c j3cVar = nl40Var.C;
                    MlbbGameScreenParams mlbbGameScreenParams = nl40Var.r;
                    long j = mlbbGameScreenParams.e;
                    long j2 = mlbbGameScreenParams.d;
                    this.j = true;
                    objA = j3cVar.a(j, j2, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ypl0 ypl0Var = (ypl0) objA;
                int i3 = nl40.a0;
                p7m0 p7m0Var3 = nl40Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, dl40.a((dl40) value2, null, null, null, ypl0Var, null, false, null, false, false, null, null, null, false, null, 0L, 16777199)));
                return Unit.f46060a;
        }
    }
}
