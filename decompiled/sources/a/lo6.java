package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lo6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ po6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo6(po6 po6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = po6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        po6 po6Var = this.k;
        switch (b) {
            case 0:
                lo6 lo6Var = new lo6(po6Var, yjeVar, (byte) 0);
                lo6Var.j = ((Boolean) obj).booleanValue();
                return lo6Var;
            case 1:
                lo6 lo6Var2 = new lo6(po6Var, yjeVar, (byte) 1);
                lo6Var2.j = ((Boolean) obj).booleanValue();
                return lo6Var2;
            case 2:
                return new lo6(po6Var, yjeVar, (byte) 2);
            default:
                return new lo6(po6Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((lo6) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((lo6) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lo6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        po6 po6Var = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    po6Var.O = sac.T(bkb.h0(30L, TimeUnit.SECONDS, new no6(po6Var, null)), jiu0.a(po6Var), new mo6(po6Var, yjeVar, (byte) 4));
                } else {
                    v3c.N(po6Var.O);
                    p7m0 p7m0Var = po6Var.R;
                    Object yv7Var = (Intrinsics.d(p7m0Var.getValue(), wv7.f39827a) && po6Var.c.g()) ? new yv7(po6Var.x(), false) : new uv7(sa10.b(po6Var.C, pb10.g, R.string.statistic_empty_data, 0, null, 28));
                    p7m0Var.getClass();
                    p7m0Var.o(null, yv7Var);
                }
                po6Var.N = z;
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                po6Var.B(z2);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (po6Var.q.g()) {
                        vpu vpuVar = po6Var.t;
                        this.j = true;
                        if (vpuVar.b(false, this) == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        i1w0 i1w0Var = po6Var.E;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new io6(po6Var, b2))), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    }
                    po6Var.M = false;
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qjj.W(jiu0.a(po6Var), null, null, new ko6(po6Var, yjeVar, b2), 3);
                po6Var.M = false;
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    buo0 buo0Var = po6Var.w;
                    hae0 hae0Var = hae0.ACTION_DO_BET;
                    this.j = true;
                    if (buo0Var.a(hae0Var, this) == wneVar4) {
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
        }
    }
}
