package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits_africa.impl.presentation.LimitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class cuz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ euz k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cuz(euz euzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = euzVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        euz euzVar = this.k;
        switch (b) {
            case 0:
                return new cuz(euzVar, yjeVar, (byte) 0);
            case 1:
                cuz cuzVar = new cuz(euzVar, yjeVar, (byte) 1);
                cuzVar.j = ((Boolean) obj).booleanValue();
                return cuzVar;
            default:
                return new cuz(euzVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cuz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cuz) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cuz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        Object value4;
        Object objM;
        byte b = this.i;
        euz euzVar = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = euzVar.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = euz.w;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, ttz.a((ttz) value, null, null, 0, true, false, false, null, null, 2039)));
                    diu diuVar = euzVar.o;
                    boolean z2 = ((ttz) euzVar.D()).f;
                    boolean z3 = ((ttz) euzVar.D()).g;
                    boolean z4 = ((ttz) euzVar.D()).h;
                    this.j = true;
                    objA = diuVar.a(z2, z3, z4, this);
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
                gzz gzzVar = (gzz) objA;
                int i2 = euz.w;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ttz.a((ttz) value2, gzzVar.f12206a, gzzVar.b, 0, false, false, false, null, null, 2028)));
                return Unit.f46060a;
            case 1:
                boolean z5 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z5) {
                    int i3 = euz.w;
                    euzVar.N();
                } else {
                    int i4 = euz.w;
                    p7m0 p7m0Var3 = euzVar.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, ttz.a((ttz) value3, null, null, 0, false, true, false, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    int i5 = euz.w;
                    p7m0 p7m0Var4 = euzVar.i.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, ttz.a((ttz) value4, null, null, 0, true, false, false, null, null, 2023)));
                    this.j = true;
                    objM = euzVar.M(this);
                    if (objM == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                if (((Boolean) objM).booleanValue()) {
                    i1w0 i1w0Var = euzVar.q;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen limitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen = new LimitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen();
                    if (limitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) limitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(limitsAfricaScreens$LimitSelfExcludeAfricaFragmentScreen)));
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
