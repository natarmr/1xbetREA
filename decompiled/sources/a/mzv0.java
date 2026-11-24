package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mzv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rzv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzv0(rzv0 rzv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rzv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rzv0 rzv0Var = this.k;
        switch (b) {
            case 0:
                return new mzv0(rzv0Var, yjeVar, (byte) 0);
            case 1:
                return new mzv0(rzv0Var, yjeVar, (byte) 1);
            default:
                return new mzv0(rzv0Var, yjeVar, (byte) 2);
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
        return ((mzv0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        rzv0 rzv0Var = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (rzv0Var.q.f15225a.a()) {
                        gmq gmqVarW = i120.W(new u060(rzv0Var.p.p(true), (byte) 1));
                        jzv0 jzv0Var = new jzv0(rzv0Var, (byte) 0);
                        this.j = true;
                        if (gmqVarW.c(jzv0Var, this) == wneVar) {
                            return wneVar;
                        }
                    } else {
                        p7m0 p7m0Var = rzv0Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, bzv0.a((bzv0) value, null, g9p.f10926a, null, false, null, false, 61)));
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
                    gmq gmqVarW2 = i120.W(new qaf0(sj3.S(((n8v) ((g2v) rzv0Var.s.f40284a).f10580a).f23108a, 600L), (byte) 20));
                    jzv0 jzv0Var2 = new jzv0(rzv0Var, b2);
                    this.j = true;
                    if (gmqVarW2.c(jzv0Var2, this) == wneVar2) {
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
                    gmq gmqVarA = rzv0Var.u.a();
                    jzv0 jzv0Var3 = new jzv0(rzv0Var, (byte) 2);
                    this.j = true;
                    if (gmqVarA.c(jzv0Var3, this) == wneVar3) {
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
        }
    }
}
