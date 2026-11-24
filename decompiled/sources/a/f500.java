package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$SelfLimitsRSScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$TimeoutScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class f500 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g500 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f500(g500 g500Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g500Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g500 g500Var = this.k;
        switch (b) {
            case 0:
                return new f500(g500Var, yjeVar, (byte) 0);
            case 1:
                return new f500(g500Var, yjeVar, (byte) 1);
            default:
                return new f500(g500Var, yjeVar, (byte) 2);
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
        return ((f500) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[LOOP:2: B:40:0x00bd->B:42:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x015c A[LOOP:4: B:68:0x0153->B:70:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0166 A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        i1w0 i1w0Var;
        CopyOnWriteArrayList copyOnWriteArrayListQ;
        FragmentScreen responsibleGamblingScreens$SelfLimitsRSScreen;
        ListIterator listIteratorO;
        paw pawVar;
        i1w0 i1w0Var2;
        CopyOnWriteArrayList copyOnWriteArrayListQ2;
        FragmentScreen responsibleGamblingScreens$TimeoutScreen;
        ListIterator listIteratorO2;
        paw pawVar2;
        Object value;
        byte b = this.i;
        g500 g500Var = this.k;
        Object obj2 = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var = g500Var.n;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    this.j = true;
                    obj = g500Var.w(this);
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
                for (Object obj3 : (Iterable) obj) {
                    kzz kzzVar = (kzz) obj3;
                    if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION && kzzVar.h == prz.ACTIVE) {
                        obj2 = obj3;
                        if (((kzz) obj2) == null) {
                            i1w0Var = g500Var.b;
                            copyOnWriteArrayListQ = b1j.q(i1w0Var);
                            responsibleGamblingScreens$SelfLimitsRSScreen = new ResponsibleGamblingScreens$SelfLimitsRSScreen();
                            if (responsibleGamblingScreens$SelfLimitsRSScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$SelfLimitsRSScreen)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$SelfLimitsRSScreen)));
                            }
                            listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0Var.a((oe50) pawVar.next());
                                }
                            }
                        }
                        return Unit.f46060a;
                    }
                }
                if (((kzz) obj2) == null) {
                    i1w0Var = g500Var.b;
                    copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    responsibleGamblingScreens$SelfLimitsRSScreen = new ResponsibleGamblingScreens$SelfLimitsRSScreen();
                    if (responsibleGamblingScreens$SelfLimitsRSScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$SelfLimitsRSScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$SelfLimitsRSScreen)));
                    }
                    listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = g500Var.n;
                    Boolean bool2 = Boolean.TRUE;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool2);
                    this.j = true;
                    obj = g500Var.w(this);
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
                for (Object obj4 : (Iterable) obj) {
                    kzz kzzVar2 = (kzz) obj4;
                    if (kzzVar2.f19172a == LimitTypeEnum.TIMEOUT && kzzVar2.h == prz.ACTIVE) {
                        obj2 = obj4;
                        if (((kzz) obj2) == null) {
                            i1w0Var2 = g500Var.b;
                            copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                            responsibleGamblingScreens$TimeoutScreen = new ResponsibleGamblingScreens$TimeoutScreen();
                            if (responsibleGamblingScreens$TimeoutScreen instanceof DialogScreen) {
                                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$TimeoutScreen)));
                            } else {
                                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$TimeoutScreen)));
                            }
                            listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                            while (true) {
                                pawVar2 = (paw) listIteratorO2;
                                if (pawVar2.hasNext()) {
                                    i1w0Var2.a((oe50) pawVar2.next());
                                }
                            }
                        }
                        return Unit.f46060a;
                    }
                }
                if (((kzz) obj2) == null) {
                    i1w0Var2 = g500Var.b;
                    copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    responsibleGamblingScreens$TimeoutScreen = new ResponsibleGamblingScreens$TimeoutScreen();
                    if (responsibleGamblingScreens$TimeoutScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$TimeoutScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$TimeoutScreen)));
                    }
                    listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        pawVar2 = (paw) listIteratorO2;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (g500Var.w(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var3 = g500Var.m;
                do {
                    value = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value, b500.f1979a));
                return Unit.f46060a;
        }
    }
}
