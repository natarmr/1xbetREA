package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k5f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5f(wti wtiVar, int i, long j, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.k = wtiVar;
        this.m = i;
        this.l = j;
        this.n = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new k5f((r7f) obj2, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new k5f((r7f) obj2, this.l, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new k5f((wti) obj2, this.m, this.l, this.n, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((k5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k5f) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                r7f r7fVar = (r7f) obj2;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    r7fVar.g0();
                    wdu wduVar = r7fVar.M;
                    this.j = true;
                    if (wduVar.u(this.m, this.l, this, this.n) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                r7fVar.b0.b();
                r7fVar.h0(false, false, new s4f(r7fVar, (byte) 9));
                return Unit.f46060a;
            case 1:
                r7f r7fVar2 = (r7f) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                long j = this.l;
                if (!z2) {
                    z1x.P(obj);
                    p0f p0fVar = p0f.CONFIRM;
                    this.j = true;
                    if (r7fVar2.U(p0fVar, j, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                bvc bvcVarA = jiu0.a(r7fVar2);
                dvj dvjVar = r7fVar2.Y0.b;
                sac.V(bvcVarA, j5f.f15930a, null, dvjVar, new k5f(r7fVar2, j, this.m, this.n, null, (byte) 0), 10);
                return Unit.f46060a;
            default:
                wti wtiVar = (wti) obj2;
                Object obj3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    boolean z4 = this.n;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        g0g0Var = Boolean.valueOf(((gst0) wtiVar.c).d(z4));
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Object obj4 = Boolean.FALSE;
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = obj4;
                    }
                    boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
                    long jE = ((gst0) wtiVar.c).e();
                    eu7 eu7Var = (eu7) wtiVar.b;
                    this.j = true;
                    Object objD0 = qjj.d0(eu7Var.g.b, new du7(eu7Var, this.m, this.l, zBooleanValue, jE, this.n, null), this);
                    if (objD0 != wne.f39444a) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == obj3) {
                        return obj3;
                    }
                    break;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5f(r7f r7fVar, long j, int i, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r7fVar;
        this.l = j;
        this.m = i;
        this.n = z;
    }
}
