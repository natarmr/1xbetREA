package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits_ne.impl.presentation.LimitsNeScreens$ChoiceNewLimitNeFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class m100 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ p100 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m100(p100 p100Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = p100Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        p100 p100Var = this.k;
        switch (b) {
            case 0:
                return new m100(p100Var, yjeVar, (byte) 0);
            case 1:
                m100 m100Var = new m100(p100Var, yjeVar, (byte) 1);
                m100Var.j = ((Boolean) obj).booleanValue();
                return m100Var;
            default:
                return new m100(p100Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((m100) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((m100) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((m100) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        Object value3;
        Object objM;
        m100 m100Var = this;
        byte b = m100Var.i;
        p100 p100Var = m100Var.k;
        switch (b) {
            case 0:
                ocj ocjVar = p100Var.i;
                wne wneVar = wne.f39444a;
                boolean z = m100Var.j;
                if (!z) {
                    z1x.P(obj);
                    int i = p100.A;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var.getValue();
                        value4.getClass();
                        if (p7m0Var.m(value4, e100.a((e100) value4, null, null, 0, true, false, null, null, null, 4087))) {
                            biu biuVar = p100Var.o;
                            boolean z2 = ((e100) p100Var.D()).f;
                            boolean z3 = ((e100) p100Var.D()).g;
                            boolean z4 = ((e100) p100Var.D()).h;
                            boolean z5 = ((e100) p100Var.D()).i;
                            m100Var.j = true;
                            objA = biuVar.a(true, z2, z3, z4, z5, m100Var);
                            if (objA == wneVar) {
                                return wneVar;
                            }
                        } else {
                            m100Var = this;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                jzz jzzVar = (jzz) objA;
                Map mapN = xp20.n((ConcurrentHashMap) p100Var.u.f30855a.b.b);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, e100.a((e100) value, jzzVar.f17437a, jzzVar.b, 0, false, false, null, mapN, null, 3044)));
                return Unit.f46060a;
            case 1:
                boolean z6 = m100Var.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z6) {
                    int i2 = p100.A;
                    p100Var.N();
                } else {
                    int i3 = p100.A;
                    p7m0 p7m0Var3 = p100Var.i.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, e100.a((e100) value2, null, null, 0, false, true, null, null, null, 4079)));
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z7 = m100Var.j;
                if (!z7) {
                    z1x.P(obj);
                    int i4 = p100.A;
                    p7m0 p7m0Var4 = p100Var.i.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, e100.a((e100) value3, null, null, 0, true, false, null, null, null, 4071)));
                    m100Var.j = true;
                    objM = p100Var.M(m100Var);
                    if (objM == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                if (((Boolean) objM).booleanValue()) {
                    i1w0 i1w0Var = p100Var.r;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    g8i0 g8i0Var = g8i0.f10866a;
                    FragmentScreen limitsNeScreens$ChoiceNewLimitNeFragmentScreen = new LimitsNeScreens$ChoiceNewLimitNeFragmentScreen(30);
                    if (limitsNeScreens$ChoiceNewLimitNeFragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) limitsNeScreens$ChoiceNewLimitNeFragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(limitsNeScreens$ChoiceNewLimitNeFragmentScreen)));
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
        }
    }
}
