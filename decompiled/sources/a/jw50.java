package a;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.fin_bet.impl.presentation.FinBetScreen;
import org.xplatform.feature.fin_bet.impl.presentation.navigation.FinBetsScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jw50 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw50(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f17235a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final byte b = 2;
        byte b2 = 14;
        byte b3 = 5;
        final byte b4 = 1;
        final byte b5 = 0;
        byte b6 = 4;
        switch (this.f17235a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((kw50) this.receiver).R(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                gx50 gx50Var = (gx50) this.receiver;
                gx50Var.getClass();
                th2.printStackTrace();
                if (th2 instanceof ff5) {
                    gx50Var.H(new rj50((byte) 10));
                } else {
                    gx50Var.H(new rj50((byte) 11));
                }
                return Unit.f46060a;
            case 2:
                p060 p060Var = (p060) obj;
                p060Var.getClass();
                m060 m060Var = (m060) this.receiver;
                xuz xuzVar = m060.O1;
                String str = p060Var.f26134a;
                String str2 = p060Var.b;
                ii iiVar = ((cmi) m060Var.L1.getValue()).f4605a;
                String strH = m060Var.H(R.string.reset);
                strH.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, m060Var.H(R.string.cancel), (String) null, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = m060Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                ((k3t0) m060Var.N1.getValue()).x(uz50.f36521a);
                return Unit.f46060a;
            case 3:
                d060 d060Var = (d060) obj;
                d060Var.getClass();
                ((k3t0) this.receiver).x(d060Var);
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                x060 x060Var = (x060) this.receiver;
                x060Var.H(new rj50((byte) 13));
                x060Var.E.b(th3, new rj50(b2));
                return Unit.f46060a;
            case 5:
                b260 b260Var = (b260) obj;
                b260Var.getClass();
                b160 b160Var = (b160) this.receiver;
                evz evzVar = b160.O1;
                b160Var.getClass();
                if (b260Var instanceof r160) {
                    e720 e720Var = b160Var.G0().e0;
                    androidx.fragment.app.e eVarC2 = b160Var.C();
                    eVarC2.getClass();
                    e720Var.a(eVarC2);
                } else if (b260Var instanceof s160) {
                    ujd ujdVarD = b160Var.G0().b.d();
                    x1x.x(ujdVarD);
                    ujdVarD.b(b160Var, ((s160) b260Var).f31439a);
                } else if (b260Var instanceof t160) {
                    afm0 afm0VarB = b160Var.G0().Z.b();
                    x1x.x(afm0VarB);
                    afm0VarB.q(b160Var, ((t160) b260Var).f33155a, new y060(b160Var, (byte) 0), new y060(b160Var, (byte) 1));
                } else if (b260Var instanceof u160) {
                    wdk0.k(b160Var.G0().c0, new xdk0(pek0.f26859a, b160Var.G0().k.b.a(R.string.auto_sub_info_message, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124), b160Var, null, null, true, null, 1004);
                } else {
                    if (b260Var instanceof v160) {
                        ii iiVar2 = b160Var.G0().d0;
                        DialogFields dialogFields2 = new DialogFields((CharSequence) b160Var.G0().k.b.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) b160Var.G0().k.b.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0)), (CharSequence) b160Var.G0().k.b.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC3 = b160Var.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (b260Var instanceof x160) {
                        wdk0.k(b160Var.G0().c0, new xdk0(rek0.b, ((x160) b260Var).f40105a, null, null, null, null, 124), b160Var, null, null, false, null, 1020);
                    } else {
                        b160Var = b160Var;
                        if (b260Var instanceof y160) {
                            y160 y160Var = (y160) b260Var;
                            e720 e720Var2 = b160Var.G0().e0;
                            androidx.fragment.app.e eVarC4 = b160Var.C();
                            eVarC4.getClass();
                            e720Var2.b(eVarC4, y160Var.b, y160Var.f41840a, new fq2());
                        } else if (b260Var instanceof a260) {
                            ii iiVar3 = b160Var.G0().d0;
                            String strH2 = b160Var.H(R.string.remove);
                            String strH3 = b160Var.H(R.string.coupon_edit_confirm_delete_message);
                            String strH4 = b160Var.H(R.string.remove);
                            strH4.getClass();
                            DialogFields dialogFields3 = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, b160Var.H(R.string.cancel), (String) null, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            androidx.fragment.app.e eVarC5 = b160Var.C();
                            eVarC5.getClass();
                            iiVar3.d(dialogFields3, eVarC5);
                        } else if (b260Var instanceof z160) {
                            poq0 poq0Var = b160Var.G0().f8047a;
                            androidx.fragment.app.e eVarC6 = b160Var.C();
                            eVarC6.getClass();
                            uuz uuzVar = fk60.b;
                            ki60.q2.getClass();
                            if (eVarC6.J("OnboardingBottomSheetContainerFragment") == null) {
                                ki60 ki60Var = new ki60();
                                iiy[] iiyVarArr = ki60.r2;
                                ki60Var.n2.I(ki60Var, iiyVarArr[1], 32);
                                ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                                sj3.E0(ki60Var, eVarC6, "OnboardingBottomSheetContainerFragment");
                            }
                        } else {
                            if (!(b260Var instanceof w160)) {
                                t9f.b();
                                return null;
                            }
                            ii iiVar4 = b160Var.G0().d0;
                            String strH5 = b160Var.H(R.string.each_way_dialog_title);
                            String strH6 = b160Var.H(R.string.each_way_description);
                            String strH7 = b160Var.H(R.string.ok_upper);
                            strH7.getClass();
                            DialogFields dialogFields4 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                            androidx.fragment.app.e eVarC7 = b160Var.C();
                            eVarC7.getClass();
                            iiVar4.d(dialogFields4, eVarC7);
                            Log.d("applog", "ShowEachWayInfo");
                        }
                    }
                    b160Var = b160Var;
                }
                b160Var.H0().x(gy50.f12110a);
                return Unit.f46060a;
            case 6:
                jz50 jz50Var = (jz50) obj;
                jz50Var.getClass();
                ((k3t0) this.receiver).x(jz50Var);
                return Unit.f46060a;
            case 7:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((v360) this.receiver).Z.b(th4, new rj50((byte) 17));
                return Unit.f46060a;
            case 8:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                v360 v360Var = (v360) this.receiver;
                v360Var.a0.f(th5, new h260(v360Var, b3));
                return Unit.f46060a;
            case 9:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                v360 v360Var2 = (v360) this.receiver;
                v360Var2.a0.f(th6, new h260(v360Var2, b3));
                return Unit.f46060a;
            case 10:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                v360 v360Var3 = (v360) this.receiver;
                v360Var3.a0.f(th7, new h260(v360Var3, b3));
                return Unit.f46060a;
            case 11:
                o560 o560Var = (o560) obj;
                o560Var.getClass();
                w560 w560Var = (w560) this.receiver;
                uuz uuzVar2 = w560.Q1;
                if (!(o560Var instanceof m560)) {
                    w560Var.getClass();
                    if (o560Var.equals(n560.f22928a)) {
                        ii iiVar5 = w560Var.L1;
                        if (iiVar5 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH8 = w560Var.H(R.string.confirmation);
                        String strH9 = w560Var.H(R.string.camera_permission_message_data);
                        String strH10 = w560Var.H(R.string.permission_allow);
                        strH10.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, w560Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_PERMISSION_DENIED_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC8 = w560Var.C();
                        eVarC8.getClass();
                        iiVar5.d(dialogFields5, eVarC8);
                    } else {
                        if (!(o560Var instanceof l560)) {
                            t9f.b();
                            return null;
                        }
                        try {
                            w560Var.w0(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(((l560) o560Var).f19440a)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                } else {
                    ii iiVar6 = w560Var.L1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String str3 = ((m560) o560Var).f21207a;
                    String strH11 = w560Var.H(R.string.ok_new);
                    strH11.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) null, (CharSequence) str3, (CharSequence) strH11, (String) null, (String) null, "NOMA_PAY_REQUEST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.c, false, 1497);
                    androidx.fragment.app.e eVarC9 = w560Var.C();
                    eVarC9.getClass();
                    iiVar6.d(dialogFields6, eVarC9);
                }
                w560Var.G0().x(b560.f1987a);
                return Unit.f46060a;
            case 12:
                return c0g.b(((List) this.receiver).get(((Number) obj).intValue()));
            case 13:
                gi60 gi60Var = (gi60) obj;
                gi60Var.getClass();
                ((k3t0) this.receiver).x(gi60Var);
                return Unit.f46060a;
            case 14:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((duj) this.receiver).a(th8);
                return Unit.f46060a;
            case 15:
                fj60 fj60Var = (fj60) obj;
                fj60Var.getClass();
                bj60 bj60Var = (bj60) this.receiver;
                iiy[] iiyVarArr2 = bj60.O1;
                byte b7 = fj60Var.f9622a;
                roq0 roq0Var = bj60Var.L1;
                if (roq0Var == null) {
                    Intrinsics.h("tipsDialogScreenFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC10 = bj60Var.C();
                eVarC10.getClass();
                roq0Var.d(eVarC10, b7, "");
                ((k3t0) bj60Var.M1.getValue()).x(wi60.f39199a);
                return Unit.f46060a;
            case 16:
                lk60 lk60Var = (lk60) obj;
                lk60Var.getClass();
                ik60 ik60Var = (ik60) this.receiver;
                iiy[] iiyVarArr3 = ik60.Q1;
                final pk60 pk60Var = (pk60) ik60Var.M1.getValue();
                pek pekVar = pk60Var.h;
                i1w0 i1w0Var = pk60Var.o;
                epi0 epi0Var = pk60Var.m;
                uuz uuzVar3 = fk60.b;
                byte b8 = lk60Var.f20185a;
                uuzVar3.getClass();
                String strG = uuz.g(b8);
                if (strG.length() > 0) {
                    i8i.D("point", strG, pk60Var.c.f44322a, "acc_app_intro_menu_call");
                    b1j.v(strG, pk60Var.b.f1455a, 3066L);
                }
                if (b8 == 1) {
                    epi0Var.j(true);
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    FragmentScreen fragmentScreenB = pmi0.b(pk60Var.d, false);
                    if (fragmentScreenB instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenB)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenB)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    final byte b9 = 3;
                    if (b8 == 3) {
                        epi0Var.j(true);
                        i1w0Var.d(new Function1() { // from class: a.mk60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b10 = b4;
                                pk60 pk60Var2 = pk60Var;
                                k0w0 k0w0Var = (k0w0) obj2;
                                switch (b10) {
                                    case 0:
                                        k0w0Var.getClass();
                                        k0w0Var.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.array_slots, new Object[0]), 1L, null, 58));
                                        break;
                                    case 1:
                                        k0w0Var.getClass();
                                        kj5 kj5Var = pk60Var2.e;
                                        r9u r9uVarC = ((xzp) pk60Var2.n.b).C();
                                        ygp ygpVar = ygp.k1;
                                        j1q0 j1q0Var = r9uVarC.f30104a;
                                        j1q0Var.getClass();
                                        boolean zD = j1q0Var.f15748a.d(ygpVar);
                                        kj5Var.getClass();
                                        k0w0Var.h(kj5.g(zD));
                                        break;
                                    case 2:
                                        k0w0Var.getClass();
                                        k0w0Var.h(pk60Var2.f.q(new jr1(new evc0(false, 0L))));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        k0w0Var.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.live_casino_title, new Object[0]), 37L, null, 58));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (b8 == 4) {
                        r9u r9uVarC = ((xzp) pk60Var.n.b).C();
                        ygp ygpVar = ygp.Z;
                        j1q0 j1q0Var = r9uVarC.f30104a;
                        j1q0Var.getClass();
                        if (j1q0Var.f15748a.d(ygpVar)) {
                            i1w0Var.getClass();
                            k0w0 k0w0Var = new k0w0(i1w0Var);
                            pekVar.getClass();
                            k0w0Var.h(new FinBetsScreen());
                            ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                            while (true) {
                                paw pawVar2 = (paw) listIteratorO2;
                                if (pawVar2.hasNext()) {
                                    i1w0Var.a((oe50) pawVar2.next());
                                }
                            }
                        } else {
                            i1w0Var.getClass();
                            k0w0 k0w0Var2 = new k0w0(i1w0Var);
                            pekVar.getClass();
                            k0w0Var2.h(new FinBetScreen());
                            ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                            while (true) {
                                paw pawVar3 = (paw) listIteratorO3;
                                if (pawVar3.hasNext()) {
                                    i1w0Var.a((oe50) pawVar3.next());
                                }
                            }
                        }
                    } else if (b8 == 5) {
                        pu50 pu50Var = new pu50(pk60Var, b2);
                        epi0Var.j(true);
                        pu50Var.invoke();
                    } else if (b8 == 14) {
                        epi0Var.j(true);
                        i1w0Var.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                        zx10 zx10Var = pk60Var.g;
                        zx10Var.getClass();
                        FragmentScreen fragmentScreenK = zx10.k(zx10Var, r040.AGGREGATOR, false, 2);
                        if (fragmentScreenK instanceof DialogScreen) {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenK)));
                        } else {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenK)));
                        }
                        ListIterator listIteratorO4 = b1j.o(i1w0Var, copyOnWriteArrayList2, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO4;
                            if (pawVar4.hasNext()) {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                        }
                    } else if (b8 == 15) {
                        epi0Var.j(true);
                        i1w0Var.d(new Function1() { // from class: a.mk60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b10 = b5;
                                pk60 pk60Var2 = pk60Var;
                                k0w0 k0w0Var3 = (k0w0) obj2;
                                switch (b10) {
                                    case 0:
                                        k0w0Var3.getClass();
                                        k0w0Var3.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.array_slots, new Object[0]), 1L, null, 58));
                                        break;
                                    case 1:
                                        k0w0Var3.getClass();
                                        kj5 kj5Var = pk60Var2.e;
                                        r9u r9uVarC2 = ((xzp) pk60Var2.n.b).C();
                                        ygp ygpVar2 = ygp.k1;
                                        j1q0 j1q0Var2 = r9uVarC2.f30104a;
                                        j1q0Var2.getClass();
                                        boolean zD = j1q0Var2.f15748a.d(ygpVar2);
                                        kj5Var.getClass();
                                        k0w0Var3.h(kj5.g(zD));
                                        break;
                                    case 2:
                                        k0w0Var3.getClass();
                                        k0w0Var3.h(pk60Var2.f.q(new jr1(new evc0(false, 0L))));
                                        break;
                                    default:
                                        k0w0Var3.getClass();
                                        k0w0Var3.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.live_casino_title, new Object[0]), 37L, null, 58));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (b8 == 16) {
                        epi0Var.j(true);
                        i1w0Var.d(new Function1() { // from class: a.mk60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b10 = b9;
                                pk60 pk60Var2 = pk60Var;
                                k0w0 k0w0Var3 = (k0w0) obj2;
                                switch (b10) {
                                    case 0:
                                        k0w0Var3.getClass();
                                        k0w0Var3.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.array_slots, new Object[0]), 1L, null, 58));
                                        break;
                                    case 1:
                                        k0w0Var3.getClass();
                                        kj5 kj5Var = pk60Var2.e;
                                        r9u r9uVarC2 = ((xzp) pk60Var2.n.b).C();
                                        ygp ygpVar2 = ygp.k1;
                                        j1q0 j1q0Var2 = r9uVarC2.f30104a;
                                        j1q0Var2.getClass();
                                        boolean zD = j1q0Var2.f15748a.d(ygpVar2);
                                        kj5Var.getClass();
                                        k0w0Var3.h(kj5.g(zD));
                                        break;
                                    case 2:
                                        k0w0Var3.getClass();
                                        k0w0Var3.h(pk60Var2.f.q(new jr1(new evc0(false, 0L))));
                                        break;
                                    default:
                                        k0w0Var3.getClass();
                                        k0w0Var3.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.live_casino_title, new Object[0]), 37L, null, 58));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (b8 == 17) {
                        epi0Var.j(true);
                        i1w0Var.getClass();
                        k0w0 k0w0Var3 = new k0w0(i1w0Var);
                        k0w0Var3.h(pk60Var.f.q(new jr1()));
                        ListIterator listIteratorO5 = b1j.o(i1w0Var, k0w0Var3.f17489a, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO5;
                            if (pawVar5.hasNext()) {
                                i1w0Var.a((oe50) pawVar5.next());
                            }
                        }
                    } else if (b8 == 18) {
                        epi0Var.j(true);
                        i1w0Var.d(new Function1() { // from class: a.mk60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b10 = b;
                                pk60 pk60Var2 = pk60Var;
                                k0w0 k0w0Var4 = (k0w0) obj2;
                                switch (b10) {
                                    case 0:
                                        k0w0Var4.getClass();
                                        k0w0Var4.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.array_slots, new Object[0]), 1L, null, 58));
                                        break;
                                    case 1:
                                        k0w0Var4.getClass();
                                        kj5 kj5Var = pk60Var2.e;
                                        r9u r9uVarC2 = ((xzp) pk60Var2.n.b).C();
                                        ygp ygpVar2 = ygp.k1;
                                        j1q0 j1q0Var2 = r9uVarC2.f30104a;
                                        j1q0Var2.getClass();
                                        boolean zD = j1q0Var2.f15748a.d(ygpVar2);
                                        kj5Var.getClass();
                                        k0w0Var4.h(kj5.g(zD));
                                        break;
                                    case 2:
                                        k0w0Var4.getClass();
                                        k0w0Var4.h(pk60Var2.f.q(new jr1(new evc0(false, 0L))));
                                        break;
                                    default:
                                        k0w0Var4.getClass();
                                        k0w0Var4.h(peg0.n(pk60Var2.f, pk60Var2.k.f(R.string.live_casino_title, new Object[0]), 37L, null, 58));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (b8 == 8 || b8 == 12 || b8 == 32 || b8 == 7 || b8 == 13) {
                        epi0Var.j(true);
                        sac.V(jiu0.a(pk60Var), ok60.f25392a, null, pk60Var.j.f22085a, new nf60(pk60Var, lk60Var, null, b6), 10);
                    }
                }
                return Unit.f46060a;
            case 17:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case 18:
                bf8 bf8Var = (bf8) obj;
                bf8Var.getClass();
                ((k3t0) this.receiver).x(bf8Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((pm60) this.receiver).v(th10);
                return Unit.f46060a;
            case 20:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((pm60) this.receiver).v(th11);
                return Unit.f46060a;
            case 21:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((pm60) this.receiver).v(th12);
                return Unit.f46060a;
            case 22:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((duj) this.receiver).a(th13);
                return Unit.f46060a;
            case 23:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                ((k3t0) this.receiver).x(vp60Var);
                return Unit.f46060a;
            case 24:
                tt60 tt60Var = (tt60) obj;
                tt60Var.getClass();
                ((k3t0) this.receiver).x(tt60Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((hv60) this.receiver).M.b(th14, new cr60((byte) 4));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((hv60) this.receiver).M.b(th15, new cr60((byte) 4));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((hv60) this.receiver).M.b(th16, new cr60((byte) 4));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((hv60) this.receiver).M.b(th17, new cr60((byte) 4));
                return Unit.f46060a;
            default:
                bx60 bx60Var = (bx60) obj;
                bx60Var.getClass();
                ((k3t0) this.receiver).x(bx60Var);
                return Unit.f46060a;
        }
    }
}
