package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class c2u0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f2u0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2u0(f2u0 f2u0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f2u0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f2u0 f2u0Var = this.k;
        switch (b) {
            case 0:
                return new c2u0(f2u0Var, yjeVar, (byte) 0);
            case 1:
                c2u0 c2u0Var = new c2u0(f2u0Var, yjeVar, (byte) 1);
                c2u0Var.j = ((Boolean) obj).booleanValue();
                return c2u0Var;
            case 2:
                c2u0 c2u0Var2 = new c2u0(f2u0Var, yjeVar, (byte) 2);
                c2u0Var2.j = ((Boolean) obj).booleanValue();
                return c2u0Var2;
            case 3:
                c2u0 c2u0Var3 = new c2u0(f2u0Var, yjeVar, (byte) 3);
                c2u0Var3.j = ((Boolean) obj).booleanValue();
                return c2u0Var3;
            default:
                return new c2u0(f2u0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((c2u0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((c2u0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((c2u0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((c2u0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((c2u0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objA2;
        Object value2;
        byte b = this.i;
        f2u0 f2u0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    h3c h3cVar = f2u0Var.H;
                    ValorantGameScreenParams valorantGameScreenParams = f2u0Var.r;
                    long j = valorantGameScreenParams.e;
                    long j2 = valorantGameScreenParams.c;
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
                f2u0Var.P.c().d(new xis0((Object) f2u0Var, objA, (byte) 15));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = f2u0.e0;
                p7m0 p7m0Var = f2u0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, b0u0.a((b0u0) value, null, null, null, null, null, null, false, null, null, null, false, null, z2, false, null, null, 33030143)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    f2u0Var.I.h();
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i2 = f2u0.e0;
                p7m0 p7m0Var2 = f2u0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (p7m0Var2.m(value3, b0u0.a((b0u0) value3, null, null, null, null, null, null, false, null, null, null, z5, null, false, false, null, null, 33521663))) {
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
                    j3c j3cVar = f2u0Var.D;
                    ValorantGameScreenParams valorantGameScreenParams2 = f2u0Var.r;
                    long j3 = valorantGameScreenParams2.e;
                    long j4 = valorantGameScreenParams2.c;
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
                int i3 = f2u0.e0;
                p7m0 p7m0Var3 = f2u0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, b0u0.a((b0u0) value2, null, null, null, ypl0Var, null, null, false, null, null, null, false, null, false, false, null, null, 33554415)));
                return Unit.f46060a;
        }
    }
}
