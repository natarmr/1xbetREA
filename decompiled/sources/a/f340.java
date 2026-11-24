package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.mlbb.api.MlbbPostGameStatScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f340 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f340(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f8843a = b;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0476  */
    /* JADX WARN: Code duplicated, block: B:152:0x0482  */
    /* JADX WARN: Code duplicated, block: B:188:0x0551 A[LOOP:5: B:186:0x054b->B:188:0x0551, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x0593  */
    /* JADX WARN: Code duplicated, block: B:196:0x059f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r9v11, types: [a.p7m0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        f2h f2hVar;
        String str;
        ArrayList arrayList;
        Iterator it;
        long j;
        long j2;
        Object value;
        lok0 lok0Var;
        Object value2;
        ArrayList arrayList2;
        String strA;
        switch (this.f8843a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((j340) this.receiver).P(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((j340) this.receiver).P(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((j340) this.receiver).P(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((j340) this.receiver).P(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((j340) this.receiver).P(th5);
                return Unit.f46060a;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((j340) this.receiver).P(th6);
                return Unit.f46060a;
            case 6:
                z840 z840Var = (z840) obj;
                z840Var.getClass();
                f840 f840Var = (f840) this.receiver;
                atz atzVar = f840.O1;
                f840Var.getClass();
                if (z840Var instanceof w840) {
                    vic.C(f840Var.o0(), ((w840) z840Var).f38704a);
                } else if (z840Var instanceof v840) {
                    gfk0 gfk0Var = ae1.n2;
                    List list2 = ((v840) z840Var).f36964a;
                    androidx.fragment.app.e eVarC = f840Var.C();
                    eVarC.getClass();
                    gfk0Var.getClass();
                    list2.getClass();
                    ae1 ae1Var = new ae1();
                    ae1Var.k2.D(ae1Var, ae1.o2[0], list2);
                    ae1Var.H0(eVarC, "AggregatorPromoCodeMessageBottomSheetFragment");
                } else if (z840Var instanceof t840) {
                    j120.M(f840Var, f840Var.G0().E, "PROMOCODE_LABEL", ((t840) z840Var).f33496a, f840Var.G0().q.b.a(R.string.promocode_copied_to_clipboard, Arrays.copyOf(new Object[0], 0)), null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                } else if (z840Var instanceof x840) {
                    boolean z = ((x840) z840Var).f40446a;
                    String strA2 = z ? f840Var.G0().q.b.a(R.string.message_confirm_delete_message_all, Arrays.copyOf(new Object[0], 0)) : f840Var.G0().q.b.a(R.string.message_confirm_delete_message, Arrays.copyOf(new Object[0], 0));
                    ii iiVar = f840Var.G0().F;
                    DialogFields dialogFields = new DialogFields((CharSequence) f840Var.H(R.string.caution), (CharSequence) strA2, (CharSequence) f840Var.G0().q.b.a(R.string.no, Arrays.copyOf(new Object[0], 0)), f840Var.G0().q.b.a(R.string.yes, Arrays.copyOf(new Object[0], 0)), (String) null, z ? "REQUEST_DELETE_ALL_MESSAGES_KEY" : "REQUEST_DELETE_MESSAGE_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = f840Var.C();
                    eVarC2.getClass();
                    iiVar.d(dialogFields, eVarC2);
                } else if (z840Var instanceof y840) {
                    wdk0.k(f840Var.G0().E, new xdk0(rek0.b, ((y840) z840Var).f42178a, null, null, null, null, 124), f840Var, null, null, false, null, 1020);
                    f840Var = f840Var;
                } else {
                    if (!(z840Var instanceof u840)) {
                        t9f.b();
                        return null;
                    }
                    i1w0 i1w0VarF = a4n0.f(f840Var);
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarF);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarF, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0VarF.a((oe50) pawVar.next());
                        }
                    }
                }
                f840Var.H0().x(j740.f16023a);
                return Unit.f46060a;
            case 7:
                v740 v740Var = (v740) obj;
                v740Var.getClass();
                ((k3t0) this.receiver).x(v740Var);
                return Unit.f46060a;
            case 8:
                uh40 uh40Var = (uh40) obj;
                uh40Var.getClass();
                ((k3t0) this.receiver).x(uh40Var);
                return Unit.f46060a;
            case 9:
                ek40 ek40Var = (ek40) obj;
                ek40Var.getClass();
                wk40 wk40Var = (wk40) this.receiver;
                hzg hzgVar = wk40Var.d;
                MlbbPostGameStatScreenParams mlbbPostGameStatScreenParams = wk40Var.b;
                ?? r13 = 0;
                Object obj2 = null;
                if (ek40Var instanceof ak40) {
                    ak40 ak40Var = (ak40) ek40Var;
                    if (ak40Var.equals(zj40.f44469a)) {
                        ((uzg) hzgVar).c(mlbbPostGameStatScreenParams.b, CyberGamesPage.Real.INSTANCE, k1g.OPEN_REGULAR);
                    } else {
                        if (!(ak40Var instanceof yj40)) {
                            t9f.b();
                            return null;
                        }
                        yj40 yj40Var = (yj40) ak40Var;
                        for (Object obj3 : wk40Var.k.f20692a.a()) {
                            lok0 lok0Var2 = (lok0) obj3;
                            if (lok0Var2.f20396a == mlbbPostGameStatScreenParams.c && lok0Var2.t.contains(1)) {
                                obj2 = obj3;
                                lok0Var = (lok0) obj2;
                                if (lok0Var != null) {
                                    ((uzg) hzgVar).o(lok0Var.f20396a, lok0Var.b);
                                } else {
                                    long j3 = mlbbPostGameStatScreenParams.b;
                                    long j4 = yj40Var.f42725a;
                                    String str2 = yj40Var.b;
                                    byte b = CyberGamesPage.Real.INSTANCE.f46556a;
                                    k1g k1gVar = k1g.OPEN_REGULAR;
                                    ((uzg) hzgVar).f(str2, j3, j4, b);
                                }
                            }
                        }
                        lok0Var = (lok0) obj2;
                        if (lok0Var != null) {
                            ((uzg) hzgVar).o(lok0Var.f20396a, lok0Var.b);
                        } else {
                            long j5 = mlbbPostGameStatScreenParams.b;
                            long j6 = yj40Var.f42725a;
                            String str3 = yj40Var.b;
                            byte b2 = CyberGamesPage.Real.INSTANCE.f46556a;
                            k1g k1gVar2 = k1g.OPEN_REGULAR;
                            ((uzg) hzgVar).f(str3, j5, j6, b2);
                        }
                    }
                } else if (ek40Var instanceof bk40) {
                    if (!((bk40) ek40Var).equals(bk40.f2732a)) {
                        t9f.b();
                        return null;
                    }
                    p7m0 p7m0Var = wk40Var.z;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, da10.TIMER_ERROR));
                    wk40Var.x();
                } else if (ek40Var instanceof dk40) {
                    sac.V(jiu0.a(wk40Var), null, null, wk40Var.f.f22085a, new wn10(wk40Var, ((dk40) ek40Var).f6215a, r13, (byte) 3), 11);
                } else {
                    if (!(ek40Var instanceof ck40)) {
                        t9f.b();
                        return null;
                    }
                    long j7 = ((ck40) ek40Var).f4489a;
                    Object value3 = wk40Var.w.getValue();
                    nk40 nk40Var = value3 instanceof nk40 ? (nk40) value3 : null;
                    if (nk40Var != null && (list = nk40Var.b) != null) {
                        for (Object obj4 : list) {
                            if (((f2h) obj4).b == j7) {
                                r13 = obj4;
                                f2hVar = (f2h) r13;
                                if (f2hVar != null && (str = f2hVar.c) != null) {
                                    List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                                    arrayList = new ArrayList(r3d.q(listJ, 10));
                                    it = listJ.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
                                    }
                                    j = mlbbPostGameStatScreenParams.b;
                                    j2 = mlbbPostGameStatScreenParams.b;
                                    if (!arrayList.contains(Long.valueOf(j)) && j7 != 0) {
                                        wk40Var.m.p(r1g.CYBERSPORT_POSTMATCH_STATISTIC, j2);
                                        wk40Var.n.z(j2, "сyber_postmatch_statistics");
                                        ((uzg) hzgVar).n(mlbbPostGameStatScreenParams.b, j7, str, k1g.OPEN_REGULAR);
                                    } else if (arrayList.contains(Long.valueOf(j2)) && j7 == 0) {
                                        wk40Var.x.f(new tk40(R.string.snackbar_no_info_for_selected_team));
                                    }
                                }
                            }
                        }
                        f2hVar = (f2h) r13;
                        if (f2hVar != null) {
                            List listJ2 = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
                            arrayList = new ArrayList(r3d.q(listJ2, 10));
                            it = listJ2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
                            }
                            j = mlbbPostGameStatScreenParams.b;
                            j2 = mlbbPostGameStatScreenParams.b;
                            if (!arrayList.contains(Long.valueOf(j))) {
                                if (arrayList.contains(Long.valueOf(j2))) {
                                    wk40Var.x.f(new tk40(R.string.snackbar_no_info_for_selected_team));
                                }
                            } else if (arrayList.contains(Long.valueOf(j2))) {
                                wk40Var.x.f(new tk40(R.string.snackbar_no_info_for_selected_team));
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 10:
                an40 an40Var = (an40) obj;
                an40Var.getClass();
                ((k3t0) this.receiver).x(an40Var);
                return Unit.f46060a;
            case 11:
                uo40 uo40Var = (uo40) obj;
                uo40Var.getClass();
                ((k3t0) this.receiver).x(uo40Var);
                return Unit.f46060a;
            case 12:
                s150 s150Var = (s150) obj;
                s150Var.getClass();
                ((k3t0) this.receiver).x(s150Var);
                return Unit.f46060a;
            case 13:
                o650 o650Var = (o650) obj;
                o650Var.getClass();
                u250 u250Var = (u250) this.receiver;
                wsz wszVar = u250.V1;
                u250Var.getClass();
                if (o650Var instanceof k650) {
                    DialogFields dialogFields2 = ((k650) o650Var).f17751a;
                    ii iiVar2 = u250Var.O1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC3 = u250Var.C();
                    eVarC3.getClass();
                    iiVar2.d(dialogFields2, eVarC3);
                } else if (o650Var instanceof l650) {
                    String str4 = ((l650) o650Var).f19489a;
                    wdk0 wdk0Var = u250Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str4, null, null, null, null, 124), u250Var, null, null, false, null, 1020);
                } else if (o650Var instanceof m650) {
                    DialogFields dialogFields3 = ((m650) o650Var).f21252a;
                    ii iiVar3 = u250Var.O1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC4 = u250Var.C();
                    eVarC4.getClass();
                    iiVar3.d(dialogFields3, eVarC4);
                } else if (o650Var instanceof n650) {
                    roq0 roq0Var = u250Var.R1;
                    if (roq0Var == null) {
                        Intrinsics.h("tipsDialogScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC5 = u250Var.C();
                    eVarC5.getClass();
                    roq0Var.d(eVarC5, 29, u250.class.getSimpleName());
                } else {
                    if (!(o650Var instanceof j650)) {
                        t9f.b();
                        return null;
                    }
                    ob0 ob0Var = ((j650) o650Var).f15968a;
                    if (ob0Var instanceof lb0) {
                        kxq kxqVarB = u250Var.B();
                        if (kxqVarB != null) {
                            ii iiVar4 = u250Var.O1;
                            if (iiVar4 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = kxqVarB.getString(R.string.attention);
                            String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string3 = kxqVarB.getString(R.string.ok);
                            string3.getClass();
                            iiVar4.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else if (ob0Var instanceof mb0) {
                        String str5 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = u250Var.Q1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC6 = u250Var.C();
                        eVarC6.getClass();
                        ynb.b(ynbVar, bm5Var, str5, eVarC6, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else {
                        if (!(ob0Var instanceof nb0)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = u250Var.B();
                        if (kxqVarB2 != null) {
                            ii iiVar5 = u250Var.O1;
                            if (iiVar5 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string4 = kxqVarB2.getString(R.string.attention);
                            String string5 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string6 = kxqVarB2.getString(R.string.ok);
                            string6.getClass();
                            iiVar5.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                }
                u250Var.G0().x(r050.f29613a);
                return Unit.f46060a;
            case 14:
                j450 j450Var = (j450) obj;
                j450Var.getClass();
                ((d650) this.receiver).X(j450Var);
                return Unit.f46060a;
            case 15:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                d650 d650Var = (d650) this.receiver;
                duj dujVar = d650Var.Z;
                ctf0 ctf0Var = d650Var.M;
                ?? r9 = d650Var.g1;
                do {
                    value2 = r9.getValue();
                    Iterable<ef40> iterable = (Iterable) r9.getValue();
                    arrayList2 = new ArrayList(r3d.q(iterable, 10));
                    for (ef40 we40Var : iterable) {
                        if (we40Var instanceof we40) {
                            vbj vbjVar = ((we40) we40Var).f39002a;
                            if (vbjVar instanceof qbj) {
                                wi10 wi10Var = ((sh10) ((qbj) vbjVar).f28448a).b;
                                wi10Var.getClass();
                                we40Var = new we40(new qbj(new sh10(false, wi10Var), false));
                            }
                        }
                        arrayList2.add(we40Var);
                    }
                } while (!r9.m(value2, arrayList2));
                if (th7 instanceof zhi0) {
                    strA = th7.getMessage();
                    if (strA == null) {
                        strA = "";
                    }
                    if (strA.length() == 0) {
                        strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                    }
                } else if (th7 instanceof UnknownHostException) {
                    dujVar.b(th7, new o240((byte) 19));
                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                } else {
                    dujVar.b(th7, new o240((byte) 20));
                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                }
                d650Var.h1.f(new u450(new DialogFields((CharSequence) ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) strA, (CharSequence) ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                return Unit.f46060a;
            case 16:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                d650 d650Var2 = (d650) this.receiver;
                int i = d650.k1;
                d650Var2.G(th8);
                return Unit.f46060a;
            case 17:
                ql5 ql5Var = (ql5) obj;
                ql5Var.getClass();
                return ((d650) this.receiver).x(ql5Var);
            case 18:
                ql5 ql5Var2 = (ql5) obj;
                ql5Var2.getClass();
                d650 d650Var3 = (d650) this.receiver;
                int i2 = d650.k1;
                return d650Var3.x(ql5Var2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((d650) this.receiver).G(th9);
                return Unit.f46060a;
            case 20:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((d650) this.receiver).G(th10);
                return Unit.f46060a;
            case 21:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                d650 d650Var4 = (d650) this.receiver;
                int i3 = d650.k1;
                d650Var4.G(th11);
                return Unit.f46060a;
            case 22:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((d650) this.receiver).G(th12);
                return Unit.f46060a;
            case 23:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                d650 d650Var5 = (d650) this.receiver;
                int i4 = d650.k1;
                d650Var5.G(th13);
                return Unit.f46060a;
            case 24:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((d650) this.receiver).G(th14);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((d650) this.receiver).G(th15);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                d650 d650Var6 = (d650) this.receiver;
                if (th16 instanceof jfp) {
                    d650Var6.h1.f(new w450(d650Var6.M.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0))));
                } else {
                    d650Var6.Z.b(th16, new f550(d650Var6, (byte) 1));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((p850) this.receiver).U(th17);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                p850 p850Var = (p850) this.receiver;
                ctf0 ctf0Var2 = p850Var.e0;
                if (th18 instanceof jfp) {
                    lsm0 lsm0Var = ctf0Var2.b;
                    lsm0 lsm0Var2 = ctf0Var2.b;
                    p850Var.G(new m650(new DialogFields((CharSequence) lsm0Var.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                } else {
                    p850Var.h0.b(th18, new pi40(p850Var, (byte) 11));
                }
                return Unit.f46060a;
            default:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((p850) this.receiver).U(th19);
                return Unit.f46060a;
        }
    }
}
