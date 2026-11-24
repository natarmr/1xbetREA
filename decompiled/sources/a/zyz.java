package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits_kenya.impl.presentation.LimitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class zyz extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bzz k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyz(bzz bzzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bzzVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bzz bzzVar = this.k;
        switch (b) {
            case 0:
                return new zyz(bzzVar, yjeVar, (byte) 0);
            case 1:
                zyz zyzVar = new zyz(bzzVar, yjeVar, (byte) 1);
                zyzVar.j = ((Boolean) obj).booleanValue();
                return zyzVar;
            default:
                return new zyz(bzzVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zyz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zyz) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zyz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        Object value2;
        Object value3;
        Object objM;
        zyz zyzVar = this;
        byte b = zyzVar.i;
        bzz bzzVar = zyzVar.k;
        switch (b) {
            case 0:
                ocj ocjVar = bzzVar.i;
                wne wneVar = wne.f39444a;
                boolean z = zyzVar.j;
                if (!z) {
                    z1x.P(obj);
                    int i = bzz.w;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var.getValue();
                        value4.getClass();
                        if (p7m0Var.m(value4, ryz.a((ryz) value4, null, null, 0, true, false, null, null, 2039))) {
                            aiu aiuVar = bzzVar.o;
                            boolean z2 = ((ryz) bzzVar.D()).f;
                            boolean z3 = ((ryz) bzzVar.D()).g;
                            boolean z4 = ((ryz) bzzVar.D()).h;
                            zyzVar.j = true;
                            objA = aiuVar.a(true, z2, z3, z4, zyzVar);
                            if (objA == wneVar) {
                                return wneVar;
                            }
                        } else {
                            zyzVar = this;
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
                izz izzVar = (izz) objA;
                int i2 = bzz.w;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, ryz.a((ryz) value, izzVar.f15656a, izzVar.b, 0, false, false, null, null, 2028)));
                return Unit.f46060a;
            case 1:
                boolean z5 = zyzVar.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z5) {
                    int i3 = bzz.w;
                    bzzVar.N();
                } else {
                    int i4 = bzz.w;
                    p7m0 p7m0Var3 = bzzVar.i.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, ryz.a((ryz) value2, null, null, 0, false, true, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z6 = zyzVar.j;
                if (!z6) {
                    z1x.P(obj);
                    int i5 = bzz.w;
                    p7m0 p7m0Var4 = bzzVar.i.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, ryz.a((ryz) value3, null, null, 0, true, false, null, null, 2023)));
                    zyzVar.j = true;
                    objM = bzzVar.M(zyzVar);
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
                    i1w0 i1w0Var = bzzVar.q;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    FragmentScreen limitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen = new LimitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen();
                    if (limitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) limitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen)));
                    } else {
                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(limitsKenyaScreens$LimitSelfExcludeKenyaFragmentScreen)));
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
