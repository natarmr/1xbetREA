package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class il20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ mn20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il20(mn20 mn20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mn20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mn20 mn20Var = this.k;
        switch (b) {
            case 0:
                return new il20(mn20Var, yjeVar, (byte) 0);
            case 1:
                il20 il20Var = new il20(mn20Var, yjeVar, (byte) 1);
                il20Var.j = ((Boolean) obj).booleanValue();
                return il20Var;
            case 2:
                il20 il20Var2 = new il20(mn20Var, yjeVar, (byte) 2);
                il20Var2.j = ((Boolean) obj).booleanValue();
                return il20Var2;
            case 3:
                return new il20(mn20Var, yjeVar, (byte) 3);
            default:
                return new il20(mn20Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((il20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((il20) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((il20) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((il20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((il20) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        mn20 mn20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    f3c f3cVar = mn20Var.n;
                    this.j = true;
                    obj = f3cVar.a(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                long j = ((m97) obj).h;
                mii0 mii0Var = mn20Var.F;
                f680[] f680VarArr = f680.f8998a;
                mii0Var.T(j, "placement_bet");
                mn20Var.G.u(j, "placement_bet");
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!z2) {
                    mn20Var.X.f(Unit.f46060a);
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    fnq fnqVar = new fnq(mn20Var.r.a(bm5.b), new mt00((Object) mn20Var, yjeVar, (byte) 17));
                    fd20 fd20Var = new fd20((byte) 19);
                    eoh0 eoh0Var = i120.f;
                    zys0.e(2, fd20Var);
                    sac.T(new fnq(i120.X(fnqVar, eoh0Var, fd20Var), new il20(mn20Var, yjeVar, (byte) 4), (byte) 4), d5c.S(jiu0.a(mn20Var), mn20Var.i.b), new sax(2, yjeVar, (byte) 27));
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    esg0 esg0Var = mn20Var.u;
                    this.j = true;
                    if (esg0Var.Y(this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ol60 ol60Var = mn20Var.P;
                Unit unit = Unit.f46060a;
                ol60Var.f(unit);
                return unit;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    sd60 sd60Var = mn20Var.p;
                    this.j = true;
                    if (sd60Var.h(this) == wneVar5) {
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
        }
    }
}
