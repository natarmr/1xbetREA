package a;

import android.gov.nist.core.Separators;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.bets.presentation.BetConstructorBetsOldScreen;
import org.xplatform.bet_history.sale.presentation.SaleBetScreen;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;
import org.xplatform.bethistory.transaction_history.presentation.TransactionHistoryScreenOld;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetInfoItem;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.ChildBets;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.api.presentation.models.SendEmailIntention;
import org.xplatform.security.impl.presentation.email.confirmation.screen.SendConfirmationEmailScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class os5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25768a;
    public final /* synthetic */ Object b;

    public /* synthetic */ os5(Object obj, byte b) {
        this.f25768a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:213:0x0775  */
    /* JADX WARN: Code duplicated, block: B:214:0x0777  */
    /* JADX WARN: Code duplicated, block: B:233:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:235:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:237:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:238:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:240:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:243:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:245:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:246:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:248:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:251:0x0817  */
    /* JADX WARN: Code duplicated, block: B:254:0x082f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0837  */
    /* JADX WARN: Code duplicated, block: B:259:0x086a A[LOOP:12: B:257:0x0864->B:259:0x086a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:265:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:267:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:271:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:273:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:276:0x0918 A[LOOP:14: B:274:0x0912->B:276:0x0918, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x095a  */
    /* JADX WARN: Code duplicated, block: B:418:0x0945 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0969 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x089b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x095d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [org.xplatform.betting.core.zip.model.zip.BetZip] */
    /* JADX WARN: Type inference failed for: r17v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v22, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v36 */
    /* JADX WARN: Type inference failed for: r17v37 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39 */
    /* JADX WARN: Type inference failed for: r17v40 */
    /* JADX WARN: Type inference failed for: r17v41 */
    /* JADX WARN: Type inference failed for: r17v42 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v15, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v16, types: [org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r8v35, types: [org.xplatform.betting.core.zip.model.zip.BetZip] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v51 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar;
        yje yjeVar2;
        boolean z;
        ArrayList arrayList;
        Iterator it;
        int i;
        ?? r17;
        Object next;
        int i2;
        BetGroupZip betGroupZip;
        List list;
        long j;
        BetGroupZip betGroupZip2;
        ?? r7;
        Iterator it2;
        Set set;
        List list2;
        int i3;
        ArrayList arrayList2;
        Iterator it3;
        int i4;
        boolean z2;
        a4x a4xVarO0;
        Object next2;
        int i5;
        ArrayList arrayList3;
        ?? ry20Var;
        ArrayList arrayList4;
        int i6;
        ?? r18;
        int i7;
        ArrayList arrayList5;
        Iterator it4;
        ?? r19;
        long j2;
        ?? r8;
        ?? r110;
        yje yjeVar3;
        int i8;
        boolean z3;
        String string;
        boolean z4;
        boolean z5;
        gmm emmVar;
        long primary;
        Object value;
        String string2;
        byte b = this.f25768a;
        byte b2 = 4;
        byte b3 = 2;
        String str = "";
        byte b4 = 3;
        byte b5 = 1;
        byte b6 = 0;
        yje yjeVar4 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((qs5) obj2).f = null;
                return Boolean.FALSE;
            case 1:
                d650 d650Var = (d650) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var = d650Var.v;
                p7m0Var.getClass();
                p7m0Var.o(null, kv5.f18939a);
                d650Var.c.a(th);
                return Unit.f46060a;
            case 2:
                oie oieVar = (oie) obj2;
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                if (oieVar != null) {
                    yai0.c(abi0Var, oieVar);
                }
                return Unit.f46060a;
            case 3:
                return new ty2((v96) obj2, b4);
            case 4:
                return new ty2((bxq0) obj2, b2);
            case 5:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                abi0Var2.b(cbi0.b, Integer.valueOf(((gc6) obj2).i));
                return Unit.f46060a;
            case 6:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new qo5(cpVar, (x6f) obj2, (byte) 14));
                return Unit.f46060a;
            case 7:
                uwe uweVar = (uwe) obj2;
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new if6(cpVar2, uweVar, cpVar2, uweVar, (byte) 0));
                return Unit.f46060a;
            case 8:
                wn6 wn6Var = (wn6) obj2;
                ip6 ip6Var = (ip6) obj;
                bj5 bj5Var = wn6.V1;
                ip6Var.getClass();
                if (ip6Var instanceof bp6) {
                    bp6 bp6Var = (bp6) ip6Var;
                    boolean z6 = bp6Var.f2966a;
                    boolean z7 = bp6Var.b;
                    if (z6) {
                        is6 is6Var = new is6();
                        androidx.fragment.app.e eVarC = wn6Var.C();
                        eVarC.getClass();
                        sj3.D0(is6Var, eVarC);
                    } else {
                        zp6.m2.getClass();
                        zp6 zp6Var = new zp6();
                        zp6Var.k2.v(zp6Var, zp6.n2[1], z7);
                        androidx.fragment.app.e eVarC2 = wn6Var.C();
                        eVarC2.getClass();
                        sj3.D0(zp6Var, eVarC2);
                    }
                } else if (ip6Var.equals(cp6.f4729a)) {
                    kxq kxqVarB = wn6Var.B();
                    if (kxqVarB != null) {
                        v1r v1rVarR = kxqVarB.r();
                        if (wn6Var.P1 == null) {
                            Intrinsics.h("quickBetDialogNavigator");
                            throw null;
                        }
                        xi70.h(v1rVarR);
                    }
                } else if (ip6Var.equals(dp6.f6447a)) {
                    wdk0 wdk0Var = wn6Var.Q1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    qek0 qek0Var = qek0.f28589a;
                    String strH = wn6Var.H(R.string.one_click_bet_disabled_message);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), wn6Var, null, null, false, null, 1020);
                } else if (ip6Var instanceof gp6) {
                    s2m0 s2m0Var = oxo0.q2;
                    androidx.fragment.app.e eVarF = wn6Var.F();
                    d9a0 d9a0Var = ((gp6) ip6Var).f11668a;
                    int i9 = d9a0Var.f5691a;
                    int i10 = d9a0Var.b;
                    int i11 = d9a0Var.f;
                    s2m0Var.getClass();
                    if (eVarF.J("TeamActionDialog") == null) {
                        oxo0 oxo0Var = new oxo0();
                        iiy[] iiyVarArr = oxo0.r2;
                        oxo0Var.l2.x(oxo0Var, iiyVarArr[0], "REQUEST_TEAM_ACTION_KEY_NEW");
                        oxo0Var.n2.I(oxo0Var, iiyVarArr[2], i9);
                        oxo0Var.o2.I(oxo0Var, iiyVarArr[3], i10);
                        oxo0Var.m2.I(oxo0Var, iiyVarArr[1], i11);
                        oxo0Var.H0(eVarF, "TeamActionDialog");
                    }
                } else if (ip6Var instanceof ep6) {
                    wn6Var.H0(((ep6) ip6Var).f8171a);
                } else if (ip6Var instanceof xo6) {
                    cgk0 cgk0Var = wn6Var.S1;
                    cgk0Var.m(cgk0Var.l() + 1);
                    wn6Var.H0(((xo6) ip6Var).f41200a);
                } else if (ip6Var instanceof yo6) {
                    String str2 = ((yo6) ip6Var).f42969a;
                    if (wn6Var.S()) {
                        ii iiVar = wn6Var.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH2 = wn6Var.H(R.string.error);
                        String strH3 = wn6Var.H(R.string.replenish);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) str2, (CharSequence) strH3, wn6Var.H(R.string.cancel), (String) null, "REQUEST_BALANCE_ERROR_DIALOG_KEY_NEW", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC3 = wn6Var.C();
                        eVarC3.getClass();
                        iiVar.d(dialogFields, eVarC3);
                    }
                } else if (ip6Var instanceof zo6) {
                    String str3 = ((zo6) ip6Var).f44704a;
                    if (wn6Var.S()) {
                        ii iiVar2 = wn6Var.M1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = wn6Var.H(R.string.error);
                        String strH5 = wn6Var.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str3, (CharSequence) strH5, wn6Var.H(R.string.cancel), (String) null, "REQUEST_BET_EXISTS_DIALOG_KEY_NEW", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC4 = wn6Var.C();
                        eVarC4.getClass();
                        iiVar2.d(dialogFields2, eVarC4);
                    }
                } else if (ip6Var instanceof ap6) {
                    ap6 ap6Var = (ap6) ip6Var;
                    String str4 = ap6Var.f1235a;
                    String str5 = ap6Var.b;
                    if (wn6Var.S()) {
                        ii iiVar3 = wn6Var.M1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = wn6Var.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) str4, (CharSequence) str5, (CharSequence) strH6, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC5 = wn6Var.C();
                        eVarC5.getClass();
                        iiVar3.d(dialogFields3, eVarC5);
                    }
                } else if (!(ip6Var instanceof hp6)) {
                    if (!(ip6Var instanceof fp6)) {
                        t9f.b();
                        return null;
                    }
                    fp6 fp6Var = (fp6) ip6Var;
                    lgn0 lgn0Var = wn6Var.O1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    String strH7 = wn6Var.H(R.string.bet_processed_successfully);
                    strH7.getClass();
                    SuccessBetStringModel successBetStringModel = new SuccessBetStringModel(strH7, null, null, null);
                    String strH8 = wn6Var.H(R.string.alternative_sport);
                    String str6 = fp6Var.f9913a;
                    lc00 lc00VarB = kotlin.collections.a.b();
                    String strH9 = wn6Var.H(R.string.coefficient);
                    strH9.getClass();
                    lc00VarB.add(new SuccessBetInfoItem.Simple(strH9, fp6Var.d));
                    String strH10 = wn6Var.H(R.string.bet_sum);
                    strH10.getClass();
                    pn40 pn40Var = pn40.f27267a;
                    lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitTextPrimary, wn6Var.o0()), strH10, pn40.c(fp6Var.c, p3u0.c), fp6Var.f, true));
                    if (!fp6Var.g) {
                        String strH11 = wn6Var.H(R.string.history_possible_win);
                        strH11.getClass();
                        lc00VarB.add(new SuccessBetInfoItem.WithCurrency(m5d.b(R.attr.uikitCommerce, wn6Var.o0()), StringsKt.v0(kotlin.text.c.r(strH11, Separators.COLON, "", false)).toString(), pn40.o(fp6Var.e), fp6Var.f, false));
                    }
                    lgn0Var.c(successBetStringModel, new SuccessBetAlertModel(strH8, str6, "REQUEST_SUCCESS_BET_KEY_NEW", Long.valueOf(fp6Var.b), "SIMPLE", kotlin.collections.a.a(lc00VarB)), wn6Var);
                } else if (((hp6) ip6Var).f13427a) {
                    gnm0.s(wn6Var.C());
                } else {
                    gnm0.i(wn6Var.C());
                }
                wn6Var.G0().x(dn6.f6353a);
                return Unit.f46060a;
            case 9:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((po6) obj2).F.b(th2, new gh5((byte) 16));
                return Unit.f46060a;
            case 10:
                op6 op6Var = (op6) obj2;
                fee feeVar = (fee) obj;
                feeVar.getClass();
                List list3 = (List) feeVar.c();
                Set set2 = (Set) ((fee) op6Var.e.getValue()).c();
                List list4 = (List) ((fee) op6Var.f.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) op6Var.g.getValue()).c()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ((fee) op6Var.h.getValue()).c()).booleanValue();
                list3.getClass();
                set2.getClass();
                list4.getClass();
                if (zBooleanValue2 && !list3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        w3d.u(arrayList6, ((BetGroupZip) it5.next()).f);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : arrayList6) {
                        if (((BetZip) obj3).f46426a > 0) {
                            arrayList7.add(obj3);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        w3d.u(arrayList8, ((BetGroupZip) it6.next()).f);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj4 : arrayList8) {
                        if (((BetZip) obj4).f46426a > 0) {
                            arrayList9.add(obj4);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList(r3d.q(arrayList7, 10));
                    int i12 = 0;
                    for (Object obj5 : arrayList7) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            ?? r111 = yjeVar4;
                            q3d.p();
                            throw r111;
                        }
                        BetZip betZip = (BetZip) obj5;
                        BetZip betZip2 = (BetZip) CollectionsKt.W(i12, arrayList9);
                        if (betZip2 != null) {
                            long j3 = betZip2.f46426a;
                            yjeVar3 = yjeVar4;
                            ?? r9 = betZip2;
                            if (j3 != betZip.f46426a) {
                                r9 = yjeVar3;
                            }
                            i8 = r9 != 0 ? ((int) (betZip.b * 10000.0d)) - ((int) (r9.b * 10000.0d)) : 0;
                            if (i8 != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList10.add(Boolean.valueOf(z3));
                            i12 = i13;
                            yjeVar4 = yjeVar3;
                        } else {
                            yjeVar3 = yjeVar4;
                        }
                        if (i8 != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList10.add(Boolean.valueOf(z3));
                        i12 = i13;
                        yjeVar4 = yjeVar3;
                    }
                    yjeVar = yjeVar4;
                    if (!arrayList10.isEmpty()) {
                        Iterator it7 = arrayList10.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (!((Boolean) it7.next()).booleanValue()) {
                                }
                            }
                        }
                    }
                    z = true;
                    yjeVar2 = yjeVar;
                    arrayList = new ArrayList();
                    it = list3.iterator();
                    i = 0;
                    r17 = yjeVar2;
                    while (it.hasNext()) {
                        next = it.next();
                        i2 = i + 1;
                        if (i >= 0) {
                            q3d.p();
                            throw r17;
                        }
                        betGroupZip = (BetGroupZip) next;
                        list = betGroupZip.g;
                        j = betGroupZip.b;
                        if (list.isEmpty()) {
                            it2 = it;
                            set = set2;
                            list2 = list4;
                            ry20Var = r17;
                            r110 = r17;
                        } else {
                            betGroupZip2 = (BetGroupZip) CollectionsKt.W(i, list4);
                            if (betGroupZip2 != null) {
                                j2 = betGroupZip2.b;
                                r8 = betGroupZip2;
                                if (j2 != j) {
                                    r8 = r17;
                                }
                                if (r8 != 0) {
                                    r7 = r8.f;
                                } else {
                                    r7 = r17;
                                }
                            } else {
                                r7 = r17;
                            }
                            if (r7 == 0) {
                                r7 = iun.f15405a;
                            }
                            String strValueOf = String.valueOf(j);
                            long j4 = betGroupZip.b;
                            String str7 = betGroupZip.c;
                            boolean zContains = set2.contains(Long.valueOf(j4));
                            if (sy20.f33005a[betGroupZip.i.ordinal()] == b5) {
                                List list5 = betGroupZip.g;
                                arrayList4 = new ArrayList(r3d.q(list5, 10));
                                i6 = 0;
                                r18 = r17;
                                for (Object obj6 : list5) {
                                    i7 = i6 + 1;
                                    if (i6 >= 0) {
                                        ?? r2 = r18;
                                        q3d.p();
                                        throw r2;
                                    }
                                    Iterator it8 = it;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(j);
                                    Set set3 = set2;
                                    sb.append("_accuracy_");
                                    sb.append(i6);
                                    String string3 = sb.toString();
                                    ArrayList arrayList11 = ((ChildBets) obj6).b;
                                    List list6 = list4;
                                    arrayList5 = new ArrayList(r3d.q(arrayList11, 10));
                                    r19 = r18;
                                    for (it4 = arrayList11.iterator(); it4.hasNext(); it4 = it4) {
                                        ?? r10 = r19;
                                        arrayList5.add(m8x.y0((BetZip) it4.next(), r10, zBooleanValue, false));
                                        r19 = r10;
                                    }
                                    arrayList4.add(new et6(dyb.o0(arrayList5), string3));
                                    it = it8;
                                    i6 = i7;
                                    set2 = set3;
                                    list4 = list6;
                                    r18 = r19;
                                }
                                it2 = it;
                                set = set2;
                                list2 = list4;
                                a4xVarO0 = dyb.o0(arrayList4);
                                z2 = false;
                            } else {
                                it2 = it;
                                set = set2;
                                list2 = list4;
                                i3 = betGroupZip.e;
                                if (i3 < 1) {
                                    i3 = 1;
                                }
                                ArrayList arrayListQ0 = CollectionsKt.Q0(CollectionsKt.S0(betGroupZip.f), i3, i3);
                                arrayList2 = new ArrayList(r3d.q(arrayListQ0, 10));
                                it3 = arrayListQ0.iterator();
                                i4 = 0;
                                while (it3.hasNext()) {
                                    next2 = it3.next();
                                    i5 = i4 + 1;
                                    if (i4 >= 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    List<IndexedValue> list7 = (List) next2;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j);
                                    Iterator it9 = it3;
                                    sb2.append(BundleUtil.UNDERLINE_TAG);
                                    sb2.append(i4);
                                    String string4 = sb2.toString();
                                    arrayList3 = new ArrayList(r3d.q(list7, 10));
                                    for (IndexedValue indexedValue : list7) {
                                        arrayList3.add(m8x.y0((BetZip) indexedValue.b, (BetZip) CollectionsKt.W(indexedValue.f46061a, r7), zBooleanValue, z));
                                    }
                                    arrayList2.add(new et6(dyb.o0(arrayList3), string4));
                                    i4 = i5;
                                    it3 = it9;
                                }
                                z2 = false;
                                a4xVarO0 = dyb.o0(arrayList2);
                            }
                            ry20Var = new ry20(strValueOf, j4, str7, zContains, a4xVarO0);
                            r110 = z2;
                        }
                        if (ry20Var != 0) {
                            arrayList.add(ry20Var);
                        }
                        it = it2;
                        i = i2;
                        set2 = set;
                        list4 = list2;
                        b5 = 1;
                        r17 = r110;
                    }
                    return dyb.o0(arrayList);
                }
                yjeVar = null;
                z = false;
                yjeVar2 = yjeVar;
                arrayList = new ArrayList();
                it = list3.iterator();
                i = 0;
                r17 = yjeVar2;
                while (it.hasNext()) {
                    next = it.next();
                    i2 = i + 1;
                    if (i >= 0) {
                        q3d.p();
                        throw r17;
                    }
                    betGroupZip = (BetGroupZip) next;
                    list = betGroupZip.g;
                    j = betGroupZip.b;
                    if (list.isEmpty()) {
                        it2 = it;
                        set = set2;
                        list2 = list4;
                        ry20Var = r17;
                        r110 = r17;
                    } else {
                        betGroupZip2 = (BetGroupZip) CollectionsKt.W(i, list4);
                        if (betGroupZip2 != null) {
                            j2 = betGroupZip2.b;
                            r8 = betGroupZip2;
                            if (j2 != j) {
                                r8 = r17;
                            }
                            if (r8 != 0) {
                                r7 = r8.f;
                            } else {
                                r7 = r17;
                            }
                        } else {
                            r7 = r17;
                        }
                        if (r7 == 0) {
                            r7 = iun.f15405a;
                        }
                        String strValueOf2 = String.valueOf(j);
                        long j5 = betGroupZip.b;
                        String str8 = betGroupZip.c;
                        boolean zContains2 = set2.contains(Long.valueOf(j5));
                        if (sy20.f33005a[betGroupZip.i.ordinal()] == b5) {
                            List list8 = betGroupZip.g;
                            arrayList4 = new ArrayList(r3d.q(list8, 10));
                            i6 = 0;
                            r18 = r17;
                            while (r5.hasNext()) {
                                i7 = i6 + 1;
                                if (i6 >= 0) {
                                    ?? r3 = r18;
                                    q3d.p();
                                    throw r3;
                                }
                                Iterator it10 = it;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(j);
                                Set set4 = set2;
                                sb3.append("_accuracy_");
                                sb3.append(i6);
                                String string5 = sb3.toString();
                                ArrayList arrayList12 = ((ChildBets) obj6).b;
                                List list9 = list4;
                                arrayList5 = new ArrayList(r3d.q(arrayList12, 10));
                                r19 = r18;
                                while (it4.hasNext()) {
                                    ?? r11 = r19;
                                    arrayList5.add(m8x.y0((BetZip) it4.next(), r11, zBooleanValue, false));
                                    r19 = r11;
                                }
                                arrayList4.add(new et6(dyb.o0(arrayList5), string5));
                                it = it10;
                                i6 = i7;
                                set2 = set4;
                                list4 = list9;
                                r18 = r19;
                            }
                            it2 = it;
                            set = set2;
                            list2 = list4;
                            a4xVarO0 = dyb.o0(arrayList4);
                            z2 = false;
                        } else {
                            it2 = it;
                            set = set2;
                            list2 = list4;
                            i3 = betGroupZip.e;
                            if (i3 < 1) {
                                i3 = 1;
                            }
                            ArrayList arrayListQ1 = CollectionsKt.Q0(CollectionsKt.S0(betGroupZip.f), i3, i3);
                            arrayList2 = new ArrayList(r3d.q(arrayListQ1, 10));
                            it3 = arrayListQ1.iterator();
                            i4 = 0;
                            while (it3.hasNext()) {
                                next2 = it3.next();
                                i5 = i4 + 1;
                                if (i4 >= 0) {
                                    q3d.p();
                                    throw null;
                                }
                                List<IndexedValue> list10 = (List) next2;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(j);
                                Iterator it11 = it3;
                                sb4.append(BundleUtil.UNDERLINE_TAG);
                                sb4.append(i4);
                                String string6 = sb4.toString();
                                arrayList3 = new ArrayList(r3d.q(list10, 10));
                                while (r5.hasNext()) {
                                    arrayList3.add(m8x.y0((BetZip) indexedValue.b, (BetZip) CollectionsKt.W(indexedValue.f46061a, r7), zBooleanValue, z));
                                }
                                arrayList2.add(new et6(dyb.o0(arrayList3), string6));
                                i4 = i5;
                                it3 = it11;
                            }
                            z2 = false;
                            a4xVarO0 = dyb.o0(arrayList2);
                        }
                        ry20Var = new ry20(strValueOf2, j5, str8, zContains2, a4xVarO0);
                        r110 = z2;
                    }
                    if (ry20Var != 0) {
                        arrayList.add(ry20Var);
                    }
                    it = it2;
                    i = i2;
                    set2 = set;
                    list4 = list2;
                    b5 = 1;
                    r17 = r110;
                }
                return dyb.o0(arrayList);
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                yk5 yk5Var = zp6.m2;
                ((zp6) obj2).Q0().f.setCurrentItem(iIntValue);
                return Unit.f46060a;
            case 12:
                yq6 yq6Var = (yq6) obj2;
                nr6 nr6Var = (nr6) obj;
                gl5 gl5Var = yq6.R1;
                nr6Var.getClass();
                if (nr6Var instanceof lr6) {
                    s9m0 s9m0Var = ajp0.r2;
                    lr6 lr6Var = (lr6) nr6Var;
                    d9a0 d9a0Var2 = lr6Var.f20514a;
                    String str9 = d9a0Var2.c;
                    int i14 = d9a0Var2.f5691a;
                    int i15 = d9a0Var2.b;
                    ArrayList arrayList13 = lr6Var.b;
                    s9m0Var.getClass();
                    ajp0 ajp0Var = new ajp0();
                    iiy[] iiyVarArr2 = ajp0.s2;
                    ajp0Var.l2.x(ajp0Var, iiyVarArr2[0], "REQUEST_TEAM_SELECTOR_KEY_NEW");
                    ajp0Var.m2.x(ajp0Var, iiyVarArr2[1], str9);
                    ajp0Var.n2.I(ajp0Var, iiyVarArr2[2], i14);
                    ajp0Var.o2.I(ajp0Var, iiyVarArr2[3], i15);
                    ajp0Var.p2.D(ajp0Var, iiyVarArr2[4], arrayList13);
                    sj3.D0(ajp0Var, yq6Var.F());
                } else if (nr6Var.equals(mr6.f22253a)) {
                    if (yq6Var.M1 == null) {
                        Intrinsics.h("tipsDialogFeature");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC6 = yq6Var.C();
                    eVarC6.getClass();
                    uuz uuzVar = fk60.b;
                    noq0.m2.getClass();
                    if (eVarC6.J("TipsDialogTag") == null) {
                        noq0 noq0Var = new noq0();
                        iiy[] iiyVarArr3 = noq0.n2;
                        noq0Var.h2.I(noq0Var, iiyVarArr3[3], 3);
                        noq0Var.i2.x(noq0Var, iiyVarArr3[4], "");
                        sj3.E0(noq0Var, eVarC6, "TipsDialogTag");
                    }
                } else if (nr6Var.equals(jr6.f16987a)) {
                    ii iiVar4 = yq6Var.N1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH12 = yq6Var.H(R.string.attention);
                    String strH13 = yq6Var.H(R.string.betconstructor_exit_message);
                    String strH14 = yq6Var.H(R.string.yes);
                    strH14.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, yq6Var.H(R.string.no), (String) null, "REQUEST_KEY_EXIT_NEW", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC7 = yq6Var.C();
                    eVarC7.getClass();
                    iiVar4.d(dialogFields4, eVarC7);
                } else if (nr6Var instanceof kr6) {
                    wdk0 wdk0Var2 = yq6Var.O1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, ((kr6) nr6Var).f18750a, null, null, null, null, 124), yq6Var, null, null, false, null, 1020);
                } else {
                    if (!nr6Var.equals(ir6.f15241a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar5 = yq6Var.N1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH15 = yq6Var.H(R.string.attention);
                    String strH16 = yq6Var.H(R.string.unacceptable_account_for_section);
                    String strH17 = yq6Var.H(R.string.ok);
                    strH17.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC8 = yq6Var.C();
                    eVarC8.getClass();
                    iiVar5.d(dialogFields5, eVarC8);
                }
                yq6Var.G0().x(jq6.f16935a);
                return Unit.f46060a;
            case 13:
                kl5 kl5Var = er6.S1;
                ((View) obj).getClass();
                as6 as6VarH0 = ((er6) obj2).H0();
                as6VarH0.B = false;
                as6VarH0.o.b.c("betkit_bet_call");
                as6VarH0.p.f1455a.a(xun.f41520a, 3357L);
                i1w0 i1w0Var = as6VarH0.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen betConstructorBetsOldScreen = new BetConstructorBetsOldScreen();
                if (betConstructorBetsOldScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) betConstructorBetsOldScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(betConstructorBetsOldScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 14:
                kt6 kt6Var = (kt6) obj2;
                bj5 bj5Var2 = kt6.Q1;
                ((View) obj).getClass();
                y920 y920VarH0 = kt6Var.H0();
                CharSequence text = kt6Var.G0().c.getText();
                if (text != null && (string = text.toString()) != null) {
                    str = string;
                }
                y920VarH0.w(str, false);
                return Unit.f46060a;
            case 15:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                MaterialCardView materialCardView = ((cs6) cpVar3.u).c;
                materialCardView.getClass();
                dyb.O(materialCardView, new qo5((yj5) obj2, cpVar3, (byte) 20));
                cpVar3.t(new ok(cpVar3, cpVar3, b3));
                return Unit.f46060a;
            case 16:
                hz6 hz6Var = (hz6) obj2;
                cl5 cl5Var = hz6.p2;
                ((View) obj).getClass();
                View viewE = hz6Var.e2.e(hz6Var.L0().b.getLayoutManager());
                if (viewE != null) {
                    hz6Var.L0();
                    int iU = RecyclerView.U(viewE);
                    Integer numValueOf = Integer.valueOf(iU);
                    if (iU == -1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue2 = numValueOf.intValue();
                        b07 b07VarU0 = hz6Var.U0();
                        mne mneVar = b07VarU0.e;
                        if (b07VarU0.m.c()) {
                            rg5 rg5Var = (rg5) CollectionsKt.W(iIntValue2, b07VarU0.v);
                            if (rg5Var != null) {
                                double d = b07VarU0.s * ((double) b07VarU0.t);
                                if (!rg5Var.e || d <= rg5Var.b) {
                                    b07VarU0.z(new tz6(true));
                                    sac.V(jiu0.a(b07VarU0), new iz6(b07VarU0, b5), null, mneVar.f22085a, new zz6(b07VarU0, rg5Var, yjeVar4, b4), 10);
                                } else {
                                    b07VarU0.z(new rz6(b07VarU0.o.r));
                                }
                            }
                        } else {
                            sac.V(jiu0.a(b07VarU0), a07.f12a, null, mneVar.f22085a, new mz6(b07VarU0, yjeVar4, b5), 10);
                            b07VarU0.z(oz6.f26090a);
                        }
                    }
                }
                return Unit.f46060a;
            case 17:
                a0k a0kVar = (a0k) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new SaleBetScreen(new SaleScreenModel(a0kVar.f28a, true, a0kVar.b, a0kVar.c, a0kVar.d)));
                return Unit.f46060a;
            case 18:
                o0k o0kVar = (o0k) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(new SaleBetScreen(new SaleScreenModel(o0kVar.f24429a, false, o0kVar.b, false, o0kVar.c)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xfs0 xfs0Var = (xfs0) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(new TransactionHistoryScreenOld(xfs0Var.h, xfs0Var.j, xfs0Var.k, xfs0Var.b, xfs0Var.f40807a, xfs0Var.e, xfs0Var.c, xfs0Var.d, xfs0Var.f, xfs0Var.g, xfs0Var.i));
                return Unit.f46060a;
            case 20:
                o77 o77Var = (o77) obj2;
                kl5 kl5Var2 = o77.k2;
                ((View) obj).getClass();
                phf0 phf0Var = o77Var.h2;
                iiy[] iiyVarArr4 = o77.l2;
                if (phf0Var.n(o77Var, iiyVarArr4[3]).length() > 0) {
                    vcc.f0(i120.V(new Pair("RESULT_HIDE_HISTORY_CLICK", Boolean.TRUE)), o77Var, phf0Var.n(o77Var, iiyVarArr4[3]));
                }
                o77Var.y0();
                return Unit.f46060a;
            case 21:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new qo5(cpVar4, (ao6) obj2, (byte) 27));
                return Unit.f46060a;
            case 22:
                ke7 ke7Var = (ke7) obj2;
                yk5 yk5Var2 = ke7.R1;
                ((View) obj).getClass();
                ii iiVar6 = ke7Var.L1;
                if (iiVar6 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH18 = ke7Var.H(R.string.caution);
                String strH19 = ke7Var.H(R.string.timeout_dialog_message);
                strH19.getClass();
                Spanned spannedFromHtml = Html.fromHtml(strH19, 0);
                spannedFromHtml.getClass();
                SpannableString spannableString = new SpannableString(spannedFromHtml);
                String strH20 = ke7Var.H(R.string.yes);
                strH20.getClass();
                DialogFields dialogFields6 = new DialogFields((CharSequence) strH18, (CharSequence) spannableString, (CharSequence) strH20, ke7Var.H(R.string.cancel), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC9 = ke7Var.C();
                eVarC9.getClass();
                iiVar6.d(dialogFields6, eVarC9);
                return Unit.f46060a;
            case 23:
                kf7 kf7Var = (kf7) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                duj dujVar = kf7Var.s;
                Throwable cause = th3.getCause();
                if (cause != null) {
                    th3 = cause;
                }
                dujVar.b(th3, new m87(kf7Var, b3));
                return Unit.f46060a;
            case 24:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                i4 i4Var = ((sn7) ((tn7) obj2)).f32479a;
                hczVar.f(i4Var.size(), null, new pn7(i4Var, (byte) 0), new ugd(802480018, true, new qn7(i4Var, b6)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hx7 hx7Var = (hx7) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                int iC = (int) (hx7Var.C(1, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L)) & 4294967295L);
                hx7Var.S(1, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(iC))) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue - Float.intBitsToFloat(iC))) & 4294967295L));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ru7 ru7Var = (ru7) obj2;
                qqp0 qqp0Var = (qqp0) obj;
                qqp0Var.getClass();
                a8h0 a8h0Var = (a8h0) ((fee) ru7Var.h.getValue()).c();
                if (a8h0Var != null && (qqp0Var instanceof oqp0)) {
                    List list11 = ((oqp0) qqp0Var).f25700a;
                    if (list11 == null || !list11.isEmpty()) {
                        Iterator it12 = list11.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                z4 = false;
                            } else if (!((sfp0) it12.next()).c.isEmpty()) {
                                z4 = true;
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    if (list11 == null || !list11.isEmpty()) {
                        Iterator it13 = list11.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                z5 = false;
                            } else if (!((sfp0) it13.next()).d.isEmpty()) {
                                z5 = true;
                            }
                        }
                    } else {
                        z5 = false;
                    }
                    b5 = (z4 && z5) ? (byte) 1 : (byte) 0;
                }
                ctf0 ctf0Var = ru7Var.f31112a;
                z7h0 z7h0Var = a8h0Var != null ? a8h0Var.b : null;
                ctf0Var.getClass();
                if (b5 != 0) {
                    if (z7h0Var instanceof y7h0) {
                        pz40 pz40Var = s6t0.f31722a;
                        primary = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                    } else {
                        pz40 pz40Var2 = s6t0.f31722a;
                        primary = s6t0.b().f33626a.getPrimary();
                    }
                    emmVar = new emm(new la50(new skm(0, R.drawable.ic_glyph_move_vertical_large, true, new y3d(primary), 16)));
                } else {
                    emmVar = fmm.f9790a;
                }
                gmm gmmVar = emmVar;
                pz40 pz40Var3 = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                return new imm(new ilm(staticColors.m123getWhite0d7_KjU()), new plm(ctf0Var.b.a(R.string.bets_on_players_title, Arrays.copyOf(new Object[0], 0)), ha50.THREE_LINES, staticColors.m123getWhite0d7_KjU(), new ea50(staticColors.m123getWhite0d7_KjU())), gmmVar, staticColors.m121getTransparent0d7_KjU(), false, null);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                zas0 zas0Var = ((tu7) obj2).w;
                mqp0 mqp0Var = new mqp0(th4);
                zas0Var.getClass();
                ((hqp0) zas0Var.b).f13495a.f44771a.o(null, mqp0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Editable editable = (Editable) obj;
                kj5 kj5Var = j28.R1;
                editable.getClass();
                z28 z28Var = (z28) ((j28) obj2).Q1.getValue();
                String string7 = editable.toString();
                if (string7 != null && (string2 = StringsKt.u0(string7).toString()) != null) {
                    str = string2;
                }
                z28Var.b.e("entered_email", str);
                p7m0 p7m0Var2 = z28Var.i;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, v28.a((v28) value, str, str.length() > 0, false, 9)));
                z28Var.h.f(q28.f27989a);
                return Unit.f46060a;
            default:
                z28 z28Var2 = (z28) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                String str10 = ((v28) z28Var2.i.getValue()).b;
                BindEmailScreenParams bindEmailScreenParams = z28Var2.d;
                k0w0Var4.h(new SendConfirmationEmailScreen(new ConfirmSendEmailScreenParams.BindEmail(new SendEmailIntention.Bind(str10, bindEmailScreenParams.f46928a, bindEmailScreenParams.c))));
                return Unit.f46060a;
        }
    }
}
