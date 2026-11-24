package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class y81 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ n91 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y81(n91 n91Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = n91Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        n91 n91Var = this.k;
        switch (b) {
            case 0:
                return new y81(n91Var, yjeVar, (byte) 0);
            case 1:
                return new y81(n91Var, yjeVar, (byte) 1);
            case 2:
                return new y81(n91Var, yjeVar, (byte) 2);
            case 3:
                return new y81(n91Var, yjeVar, (byte) 3);
            case 4:
                return new y81(n91Var, yjeVar, (byte) 4);
            case 5:
                return new y81(n91Var, yjeVar, (byte) 5);
            default:
                return new y81(n91Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((y81) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object objA2;
        Object objA3;
        Object objD0;
        Object value2;
        Object objG;
        Object value3;
        byte b = this.i;
        y71 y71Var = y71.f42127a;
        n91 n91Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    nou nouVar = n91Var.O;
                    this.j = true;
                    objA = nouVar.a(tl5.c, this);
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
                ql5 ql5Var = (ql5) objA;
                n91Var.C.l(bm5.e, ql5Var);
                p7m0 p7m0Var = n91Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u81.a((u81) value, null, false, false, false, null, null, ql5Var.f28916a, false, false, null, false, false, false, 0, null, 2096895)));
                n91Var.U();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    nrt nrtVar = n91Var.J;
                    long j = ((u81) n91Var.D()).i;
                    this.j = true;
                    objA2 = nrt.a(nrtVar, j, this);
                    if (objA2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                if (((ql5) objA2).i.a()) {
                    int i = n91.f0;
                    n91Var.G(y71Var);
                } else {
                    int i2 = n91.f0;
                    n91Var.S();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    nrt nrtVar2 = n91Var.J;
                    long j2 = ((u81) n91Var.D()).i;
                    this.j = true;
                    objA3 = nrt.a(nrtVar2, j2, this);
                    if (objA3 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                if (((ql5) objA3).i.a() && ((u81) n91Var.D()).f35213a.m) {
                    n91Var.G(y71Var);
                } else {
                    int i3 = n91.f0;
                    n91Var.U();
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    mii0 mii0Var = n91Var.L;
                    mlr mlrVar = ((u81) n91Var.D()).f35213a;
                    this.j = true;
                    sff0 sff0VarA = ((pru) mii0Var.e).a();
                    ehf0 ehf0Var = (ehf0) mii0Var.b;
                    objD0 = qjj.d0(((mne) ehf0Var.c).b, new v1c(ehf0Var, mlrVar, ((ntu) mii0Var.c).a(), ((iqt) mii0Var.d).f15225a.a(), sff0VarA.b.N, null), this);
                    if (objD0 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                boolean zBooleanValue = ((Boolean) objD0).booleanValue();
                int i4 = n91.f0;
                p7m0 p7m0Var2 = n91Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, u81.a((u81) value2, null, false, false, zBooleanValue, null, null, 0L, false, false, null, false, false, false, 0, null, 2097119)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (((u81) n91Var.D()).l && !((u81) n91Var.D()).d && ((u81) n91Var.D()).i == 0) {
                        bm5 bm5Var = !((u81) n91Var.D()).c ? bm5.f2822a : bm5.e;
                        khf0 khf0Var = n91Var.t;
                        this.j = true;
                        objG = khf0.G(khf0Var, bm5Var, this);
                        if (objG == wneVar5) {
                            return wneVar5;
                        }
                    }
                    int i5 = n91.f0;
                    n91Var.T();
                    return Unit.f46060a;
                }
                if (!z5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objG = obj;
                ql5 ql5Var2 = (ql5) objG;
                int i6 = n91.f0;
                p7m0 p7m0Var3 = n91Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, u81.a((u81) value3, null, false, false, false, null, null, ql5Var2.f28916a, false, false, null, false, false, false, 0, null, 2096895)));
                int i7 = n91.f0;
                n91Var.T();
                return Unit.f46060a;
            case 5:
                zw0 zw0Var = n91Var.e0;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    un6 un6Var = new un6(n91Var, (byte) 11);
                    zw0Var.getClass();
                    zw0Var.g = un6Var;
                    w81 w81Var = new w81(n91Var, (byte) 2);
                    zw0Var.getClass();
                    zw0Var.f = w81Var;
                    w81 w81Var2 = new w81(n91Var, (byte) 3);
                    zw0Var.getClass();
                    zw0Var.h = w81Var2;
                    w81 w81Var3 = new w81(n91Var, (byte) 4);
                    zw0Var.getClass();
                    zw0Var.i = w81Var3;
                    byte b2 = 5;
                    w81 w81Var4 = new w81(n91Var, b2);
                    zw0Var.getClass();
                    zw0Var.j = w81Var4;
                    x81 x81Var = new x81(n91Var, b2);
                    zw0Var.getClass();
                    zw0Var.k = x81Var;
                    zw0Var.e = ((u81) n91Var.D()).j;
                    String str = ((u81) n91Var.D()).g;
                    String str2 = ((u81) n91Var.D()).h;
                    this.j = true;
                    if (zw0Var.d(this, str, str2, true) == wneVar6) {
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
                    ((u81) n91Var.D()).u.add(ju0.e);
                    long millis = TimeUnit.SECONDS.toMillis(((u81) n91Var.D()).r);
                    this.j = true;
                    if (qcc.O(millis, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i8 = n91.f0;
                n91Var.G(m81.f21347a);
                return Unit.f46060a;
        }
    }
}
