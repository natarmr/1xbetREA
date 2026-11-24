package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class a1e0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ d1e0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1e0(d1e0 d1e0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d1e0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d1e0 d1e0Var = this.k;
        switch (b) {
            case 0:
                return new a1e0(d1e0Var, yjeVar, (byte) 0);
            case 1:
                a1e0 a1e0Var = new a1e0(d1e0Var, yjeVar, (byte) 1);
                a1e0Var.j = ((Boolean) obj).booleanValue();
                return a1e0Var;
            case 2:
                a1e0 a1e0Var2 = new a1e0(d1e0Var, yjeVar, (byte) 2);
                a1e0Var2.j = ((Boolean) obj).booleanValue();
                return a1e0Var2;
            case 3:
                a1e0 a1e0Var3 = new a1e0(d1e0Var, yjeVar, (byte) 3);
                a1e0Var3.j = ((Boolean) obj).booleanValue();
                return a1e0Var3;
            default:
                return new a1e0(d1e0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a1e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a1e0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((a1e0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((a1e0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a1e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objA2;
        Object value2;
        byte b = this.i;
        d1e0 d1e0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    h3c h3cVar = d1e0Var.H;
                    RainbowGameScreenParams rainbowGameScreenParams = d1e0Var.r;
                    long j = rainbowGameScreenParams.e;
                    long j2 = rainbowGameScreenParams.d;
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
                d1e0Var.P.c().d(new oac0(d1e0Var, (String) objA, (byte) 17));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = d1e0.e0;
                p7m0 p7m0Var = d1e0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, qyd0.a((qyd0) value, null, null, null, null, null, null, false, null, null, null, false, null, z2, false, null, null, 132120575)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    d1e0Var.I.h();
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i2 = d1e0.e0;
                p7m0 p7m0Var2 = d1e0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (p7m0Var2.m(value3, qyd0.a((qyd0) value3, null, null, null, null, null, null, false, null, null, null, z5, null, false, false, null, null, 134184959))) {
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
                    j3c j3cVar = d1e0Var.D;
                    RainbowGameScreenParams rainbowGameScreenParams2 = d1e0Var.r;
                    long j3 = rainbowGameScreenParams2.e;
                    long j4 = rainbowGameScreenParams2.d;
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
                int i3 = d1e0.e0;
                p7m0 p7m0Var3 = d1e0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, qyd0.a((qyd0) value2, null, null, null, ypl0Var, null, null, false, null, null, null, false, null, false, false, null, null, 134217711)));
                return Unit.f46060a;
        }
    }
}
