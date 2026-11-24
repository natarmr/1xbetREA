package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class cm8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ jm8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm8(jm8 jm8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jm8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jm8 jm8Var = this.k;
        switch (b) {
            case 0:
                return new cm8(jm8Var, yjeVar, (byte) 0);
            case 1:
                return new cm8(jm8Var, yjeVar, (byte) 1);
            case 2:
                cm8 cm8Var = new cm8(jm8Var, yjeVar, (byte) 2);
                cm8Var.j = ((Boolean) obj).booleanValue();
                return cm8Var;
            default:
                return new cm8(jm8Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cm8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cm8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cm8) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cm8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objB;
        byte b = this.i;
        jm8 jm8Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ls lsVar = jm8Var.q;
                    long jA = s470.LUCKY_WHEEL.a();
                    this.j = true;
                    if (lsVar.b(jA, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean z2 = ((kl8) jm8Var.D()).c instanceof v3t;
                i1w0 i1w0Var = jm8Var.P;
                if (z2) {
                    i1w0Var.d(new d38(jm8Var, (byte) 10));
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen fragmentScreenE = jm8Var.E.e();
                    if (fragmentScreenE instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    je8 je8Var = ((kl8) jm8Var.D()).d;
                    this.j = true;
                    if (jm8Var.P(je8Var, false, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar = jm8Var.i;
                if (z4) {
                    int i = jm8.V;
                    jm8Var.Q(true, false);
                } else {
                    int i2 = jm8.V;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, kl8.a((kl8) value, false, null, null, null, false, false, null, null, false, null, null, false, true, 49055)));
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    boolean z5 = z4;
                    if (p7m0Var2.m(value2, kl8.a((kl8) value2, z5, null, null, null, false, false, null, null, false, null, null, false, false, 65533))) {
                        return Unit.f46060a;
                    }
                    z4 = z5;
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    ahu ahuVar = jm8Var.s;
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    objB = ahuVar.b(bm5Var, this);
                    if (objB == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                jm8Var.C.l(bm5.d, ql5Var);
                jm8Var.F.a(jm8Var.P, true, ql5Var.f28916a);
                return Unit.f46060a;
        }
    }
}
