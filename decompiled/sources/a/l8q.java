package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l8q extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ r8q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8q(r8q r8qVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r8qVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r8q r8qVar = this.k;
        switch (b) {
            case 0:
                l8q l8qVar = new l8q(r8qVar, yjeVar, (byte) 0);
                l8qVar.j = ((Boolean) obj).booleanValue();
                return l8qVar;
            case 1:
                return new l8q(r8qVar, yjeVar, (byte) 1);
            case 2:
                return new l8q(r8qVar, yjeVar, (byte) 2);
            case 3:
                return new l8q(r8qVar, yjeVar, (byte) 3);
            default:
                l8q l8qVar2 = new l8q(r8qVar, yjeVar, (byte) 4);
                l8qVar2.j = ((Boolean) obj).booleanValue();
                return l8qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((l8q) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((l8q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((l8q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((l8q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((l8q) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 1;
        r8q r8qVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = r8qVar.U;
                l7q l7qVarA = l7q.a(r8qVar.x(), z, null, 6);
                p7m0Var.getClass();
                p7m0Var.o(null, l7qVarA);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    xex xexVar = r8qVar.M;
                    this.j = true;
                    obj = xexVar.H(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    r8qVar.T.f(t7q.f33479a);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vpu vpuVar = r8qVar.w;
                    this.j = true;
                    if (vpuVar.b(false, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                r8qVar.T.f(a8q.f439a);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (r8qVar.d.f25751a.a()) {
                        this.j = true;
                        if (r8qVar.y(this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                mne mneVar = r8qVar.i;
                sje sjeVar = r8qVar.X;
                j8q j8qVar = (j8q) r8qVar.Q.getValue();
                if ((j8qVar instanceof f8q) || Intrinsics.d(j8qVar, h8q.f12640a)) {
                    if (z5) {
                        qjj.W(sjeVar, mneVar.b, null, new e3p(r8qVar, yjeVar, (byte) 2), 2);
                        slb.U(new fnq(i120.W(r8qVar.d.a()), new k8q(r8qVar, yjeVar, b2), (byte) 4), d5c.S(sjeVar, mneVar.b));
                    } else {
                        r8qVar.F();
                    }
                } else if (!z5) {
                    r8qVar.F();
                }
                return Unit.f46060a;
        }
    }
}
