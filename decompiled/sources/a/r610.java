package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.lol.api.LolScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class r610 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ u610 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r610(u610 u610Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = u610Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u610 u610Var = this.k;
        switch (b) {
            case 0:
                return new r610(u610Var, yjeVar, (byte) 0);
            case 1:
                r610 r610Var = new r610(u610Var, yjeVar, (byte) 1);
                r610Var.j = ((Boolean) obj).booleanValue();
                return r610Var;
            case 2:
                r610 r610Var2 = new r610(u610Var, yjeVar, (byte) 2);
                r610Var2.j = ((Boolean) obj).booleanValue();
                return r610Var2;
            case 3:
                r610 r610Var3 = new r610(u610Var, yjeVar, (byte) 3);
                r610Var3.j = ((Boolean) obj).booleanValue();
                return r610Var3;
            default:
                return new r610(u610Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r610) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((r610) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((r610) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((r610) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r610) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objA2;
        Object value2;
        byte b = this.i;
        u610 u610Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    h3c h3cVar = u610Var.H;
                    LolScreenParams lolScreenParams = u610Var.r;
                    long j = lolScreenParams.e;
                    long j2 = lolScreenParams.d;
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
                u610Var.P.c().d(new r91((Object) u610Var, u610Var.Q.j(), objA, (byte) 18));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = u610.e0;
                p7m0 p7m0Var = u610Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, m310.a((m310) value, null, null, null, null, null, null, false, null, null, null, false, null, z2, false, null, null, 33030143)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    u610Var.I.h();
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i2 = u610.e0;
                p7m0 p7m0Var2 = u610Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (p7m0Var2.m(value3, m310.a((m310) value3, null, null, null, null, null, null, false, null, null, null, z5, null, false, false, null, null, 33521663))) {
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
                    j3c j3cVar = u610Var.D;
                    LolScreenParams lolScreenParams2 = u610Var.r;
                    long j3 = lolScreenParams2.e;
                    long j4 = lolScreenParams2.d;
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
                int i3 = u610.e0;
                p7m0 p7m0Var3 = u610Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, m310.a((m310) value2, null, null, null, ypl0Var, null, null, false, null, null, null, false, null, false, false, null, null, 33554415)));
                return Unit.f46060a;
        }
    }
}
