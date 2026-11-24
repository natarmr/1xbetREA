package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.finsecurity_v2.impl.navigation.FinSecurityV2ScreenFactoryStub$getFinSecurityFragmentScreen$1;
import org.xplatform.limits.ie.impl.navigation.LimitsIeScreens$LimitsIeFragmentScreen;
import org.xplatform.limits.rs.impl.navigation.LimitsRsScreens$LimitsRsFragmentScreen;
import org.xplatform.limits_africa.impl.presentation.LimitsAfricaScreens$LimitsAfricaFragmentScreen;
import org.xplatform.limits_ee.impl.presentation.LimitsEeScreens$LimitsEeFragmentScreen;
import org.xplatform.limits_kenya.impl.presentation.LimitsKenyaScreens$LimitsKenyaFragmentScreen;
import org.xplatform.limits_ne.impl.presentation.LimitsNeScreens$LimitsNeFragmentScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$LimitsScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class due0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ due0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f6695a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        byte b = 1;
        yje yjeVar = null;
        switch (this.f6695a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 1:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 2:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 3:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 5:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 6:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 7:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 8:
                zvf0 zvf0Var = (zvf0) obj;
                File file = (File) obj2;
                zvf0Var.getClass();
                file.getClass();
                wuf0 wuf0Var = (wuf0) this.receiver;
                vd1 vd1Var = wuf0Var.j;
                i1w0 i1w0Var = wuf0Var.p;
                switch (zvf0Var.ordinal()) {
                    case 0:
                        i8i.D("point", "policy", vd1Var.f37210a, "acc_responsible_gambling_menu");
                        pru pruVar = wuf0Var.d;
                        String str = pruVar.a().m.u;
                        boolean z = pruVar.a().p0;
                        byte b2 = 12;
                        if (StringsKt.O(str, "https://", false) && z) {
                            i1w0Var.d(new dff0(wuf0Var, str, b2));
                        } else if (StringsKt.O(str, "https://", false)) {
                            p7m0 p7m0Var = wuf0Var.q;
                            do {
                                value = p7m0Var.getValue();
                            } while (!p7m0Var.m(value, new suf0(str)));
                        } else if (str.length() <= 0) {
                            sac.V(jiu0.a(wuf0Var), new luf0(wuf0Var, b), new muf0(wuf0Var, (byte) 1), null, new zye0(wuf0Var, file, yjeVar, b2), 12);
                        } else {
                            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                            wuf0Var.e.getClass();
                            k0w0VarI.h(bzs0.d(R.string.info_responsible_gaming, str));
                            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                            while (true) {
                                paw pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0Var.a((oe50) pawVar.next());
                                }
                            }
                        }
                        break;
                    case 1:
                        vd1Var.f37210a.a("acc_responsible_gambling_menu", wp20.b(new Pair("point", "limits")));
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        FragmentScreen responsibleGamblingScreens$LimitsScreen = new ResponsibleGamblingScreens$LimitsScreen();
                        if (responsibleGamblingScreens$LimitsScreen instanceof DialogScreen) {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$LimitsScreen)));
                        } else {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$LimitsScreen)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                            break;
                        }
                        break;
                    case 2:
                        k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.n.getClass();
                        k0w0VarI2.h(new LimitsIeScreens$LimitsIeFragmentScreen());
                        ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO3;
                            if (pawVar3.hasNext()) {
                                i1w0Var.a((oe50) pawVar3.next());
                            }
                            break;
                        }
                        break;
                    case 3:
                        k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.o.getClass();
                        k0w0VarI3.h(new LimitsRsScreens$LimitsRsFragmentScreen());
                        ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO4;
                            if (pawVar4.hasNext()) {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                            break;
                        }
                        break;
                    case 4:
                        k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.f.getClass();
                        k0w0VarI4.h(new FinSecurityV2ScreenFactoryStub$getFinSecurityFragmentScreen$1());
                        ListIterator listIteratorO5 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO5;
                            if (pawVar5.hasNext()) {
                                i1w0Var.a((oe50) pawVar5.next());
                            }
                            break;
                        }
                        break;
                    case 5:
                        k0w0 k0w0VarI5 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.m.getClass();
                        k0w0VarI5.h(new LimitsEeScreens$LimitsEeFragmentScreen());
                        ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI5.f17489a, 0);
                        while (true) {
                            paw pawVar6 = (paw) listIteratorO6;
                            if (pawVar6.hasNext()) {
                                i1w0Var.a((oe50) pawVar6.next());
                            }
                            break;
                        }
                        break;
                    case 6:
                        k0w0 k0w0VarI6 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.g.getClass();
                        k0w0VarI6.h(new LimitsKenyaScreens$LimitsKenyaFragmentScreen());
                        ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0VarI6.f17489a, 0);
                        while (true) {
                            paw pawVar7 = (paw) listIteratorO7;
                            if (pawVar7.hasNext()) {
                                i1w0Var.a((oe50) pawVar7.next());
                            }
                            break;
                        }
                        break;
                    case 7:
                        k0w0 k0w0VarI7 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.i.getClass();
                        k0w0VarI7.h(new LimitsAfricaScreens$LimitsAfricaFragmentScreen());
                        ListIterator listIteratorO8 = b1j.o(i1w0Var, k0w0VarI7.f17489a, 0);
                        while (true) {
                            paw pawVar8 = (paw) listIteratorO8;
                            if (pawVar8.hasNext()) {
                                i1w0Var.a((oe50) pawVar8.next());
                            }
                            break;
                        }
                        break;
                    case 8:
                        k0w0 k0w0VarI8 = cs0.i(i1w0Var, i1w0Var);
                        wuf0Var.h.getClass();
                        k0w0VarI8.h(new LimitsNeScreens$LimitsNeFragmentScreen());
                        ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0VarI8.f17489a, 0);
                        while (true) {
                            paw pawVar9 = (paw) listIteratorO9;
                            if (pawVar9.hasNext()) {
                                i1w0Var.a((oe50) pawVar9.next());
                            }
                            break;
                        }
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return Unit.f46060a;
            case 9:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 10:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 11:
                Function1 function1 = (Function1) obj;
                yje yjeVar2 = (yje) obj2;
                zdg0 zdg0Var = (zdg0) this.receiver;
                if (yjeVar2.getContext().get(ceg0.f4211a) == null) {
                    return function1.invoke(yjeVar2);
                }
                lcl0 lcl0Var = new lcl0(function1, yjeVar, (byte) 29);
                ces0 ces0Var = (ces0) yjeVar2.getContext().get(ces0.b);
                kotlin.coroutines.d dVar = ces0Var != null ? ces0Var.f4228a : null;
                if (dVar != null) {
                    return qjj.d0(dVar, lcl0Var, yjeVar2);
                }
                n5a n5aVar = new n5a(1, pnx.b(yjeVar2));
                n5aVar.r();
                try {
                    Executor executor = zdg0Var.b;
                    if (executor == null) {
                        Intrinsics.h("internalTransactionLimitedExecutor");
                        throw null;
                    }
                    executor.execute(new hf5(n5aVar, zdg0Var, lcl0Var, (byte) 10));
                    Object objP = n5aVar.p();
                    wne wneVar = wne.f39444a;
                    return objP;
                } catch (RejectedExecutionException e) {
                    n5aVar.h(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
                }
                break;
            case 12:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 13:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 14:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 15:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                ((cxg0) this.receiver).y(th);
                return Unit.f46060a;
            case 16:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                ((cxg0) this.receiver).y(th2);
                return Unit.f46060a;
            case 17:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 18:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 20:
                Object objInvoke = ((Function2) this.receiver).invoke((vne) obj, (yje) obj2);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 21:
                Object objInvoke2 = ((Function2) this.receiver).invoke((vne) obj, (yje) obj2);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 22:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 23:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case 24:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
            default:
                ((Function1) this.receiver).invoke(obj);
                return Unit.f46060a;
        }
    }
}
