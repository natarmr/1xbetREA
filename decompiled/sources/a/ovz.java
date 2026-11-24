package a;

import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits_ee.impl.presentation.LimitsEeScreens$LimitSelfExcludeEeFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class ovz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qvz k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovz(qvz qvzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qvzVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qvz qvzVar = this.k;
        switch (b) {
            case 0:
                return new ovz(qvzVar, yjeVar, (byte) 0);
            case 1:
                ovz ovzVar = new ovz(qvzVar, yjeVar, (byte) 1);
                ovzVar.j = ((Boolean) obj).booleanValue();
                return ovzVar;
            default:
                return new ovz(qvzVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ovz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ovz) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ovz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
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
        qvz qvzVar = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = qvzVar.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = qvz.u;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, gvz.a((gvz) value, null, null, 0, true, false, null, null, Response.SERVICE_UNAVAILABLE)));
                    zhu zhuVar = qvzVar.o;
                    boolean z2 = ((gvz) qvzVar.D()).f;
                    boolean z3 = ((gvz) qvzVar.D()).g;
                    this.j = true;
                    objA = zhuVar.a(z2, z3, this);
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
                hzz hzzVar = (hzz) objA;
                int i2 = qvz.u;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, gvz.a((gvz) value2, hzzVar.f13925a, hzzVar.b, 0, false, false, null, null, 492)));
                return Unit.f46060a;
            case 1:
                boolean z4 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z4) {
                    int i3 = qvz.u;
                    qvzVar.N();
                } else {
                    int i4 = qvz.u;
                    p7m0 p7m0Var3 = qvzVar.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, gvz.a((gvz) value3, null, null, 0, false, true, null, null, 495)));
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    int i5 = qvz.u;
                    p7m0 p7m0Var4 = qvzVar.i.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, gvz.a((gvz) value4, null, null, 0, true, false, null, null, Response.REQUEST_TERMINATED)));
                    this.j = true;
                    objM = qvzVar.M(this);
                    if (objM == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                if (((Boolean) objM).booleanValue()) {
                    i1w0 i1w0Var = qvzVar.p;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen limitsEeScreens$LimitSelfExcludeEeFragmentScreen = new LimitsEeScreens$LimitSelfExcludeEeFragmentScreen();
                    if (limitsEeScreens$LimitSelfExcludeEeFragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) limitsEeScreens$LimitSelfExcludeEeFragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(limitsEeScreens$LimitSelfExcludeEeFragmentScreen)));
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
