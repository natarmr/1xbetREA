package a;

import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.wallet.impl.presentation.dialogs.accountactions.params.AccountActionsScreenParams;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params.BonusAccountScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class rtq0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtq0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object l(Object obj) {
        xzu0 xzu0Var;
        String strConcat;
        rek0 rek0Var = rek0.b;
        xzu0 xzu0Var2 = (xzu0) this.k;
        i0v0 i0v0Var = (i0v0) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (i0v0Var != null) {
            if (i0v0Var instanceof f0v0) {
                f0v0 f0v0Var = (f0v0) i0v0Var;
                ql5 ql5Var = f0v0Var.f8734a;
                ql5 ql5Var2 = f0v0Var.b;
                long j = f0v0Var.c;
                uxs0 uxs0Var = xzu0.S1;
                double d = ql5Var.b;
                if (d > 0.0d) {
                    strConcat = ("<b>" + xzu0Var2.I(R.string.multiaccount_del_balance_confirm_money, Double.valueOf(d), ql5Var.f)).concat("</b>").concat("<br />").concat("<br />");
                } else {
                    strConcat = "";
                }
                if (j == ql5Var.f28916a) {
                    strConcat = (strConcat + xzu0Var2.I(R.string.account_delete_warning_v2, Long.valueOf(ql5Var2.f28916a))).concat("<br />").concat("<br />");
                }
                String strK = kng0.k(strConcat, xzu0Var2.H(R.string.multiaccount_del_balance_confirm));
                ii iiVar = xzu0Var2.N1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = xzu0Var2.H(R.string.confirmation);
                Spanned spannedFromHtml = Html.fromHtml(strK, 0);
                spannedFromHtml.getClass();
                SpannableString spannableString = new SpannableString(spannedFromHtml);
                String strH2 = xzu0Var2.H(R.string.ok);
                strH2.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) spannableString, (CharSequence) strH2, xzu0Var2.H(R.string.cancel), (String) null, "DELETE_CONFIRM_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = xzu0Var2.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
            } else if (i0v0Var instanceof c0v0) {
                ql5 ql5Var3 = ((c0v0) i0v0Var).f3542a;
                uxs0 uxs0Var2 = xzu0.S1;
                if (xzu0Var2.H0()) {
                    hfk0 hfk0Var = qc.n2;
                    androidx.fragment.app.e eVarC2 = xzu0Var2.C();
                    eVarC2.getClass();
                    AccountActionsScreenParams accountActionsScreenParams = new AccountActionsScreenParams("REQUEST_ACCOUNT_ACTIONS_DIALOG_KEY", ql5Var3.f28916a, ql5Var3.m, ql5Var3.e, ql5Var3.f, ql5Var3.b, ql5Var3.i == txs0.g);
                    hfk0Var.getClass();
                    String str = qc.p2;
                    if (eVarC2.J(str) == null) {
                        qc qcVar = new qc();
                        qcVar.m2.J(qcVar, qc.o2[0], accountActionsScreenParams);
                        qcVar.H0(eVarC2, str);
                    }
                }
            } else {
                if (!(i0v0Var instanceof e0v0)) {
                    if (i0v0Var instanceof d0v0) {
                        List list = ((d0v0) i0v0Var).f5284a;
                        uxs0 uxs0Var3 = xzu0.S1;
                        if (xzu0Var2.H0()) {
                            kj5 kj5Var = wb8.n2;
                            androidx.fragment.app.e eVarC3 = xzu0Var2.C();
                            eVarC3.getClass();
                            BonusAccountScreenParams bonusAccountScreenParams = new BonusAccountScreenParams("REQUEST_BONUS_ACCOUNT_ACTION_DIALOG_KEY", list);
                            kj5Var.getClass();
                            String str2 = wb8.p2;
                            if (eVarC3.J(str2) == null) {
                                wb8 wb8Var = new wb8();
                                wb8Var.m2.J(wb8Var, wb8.o2[0], bonusAccountScreenParams);
                                wb8Var.H0(eVarC3, str2);
                            }
                        }
                    } else if (i0v0Var instanceof g0v0) {
                        String strH3 = ((g0v0) i0v0Var).f10479a;
                        uxs0 uxs0Var4 = xzu0.S1;
                        wdk0 wdk0Var = xzu0Var2.O1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        if (strH3.length() == 0) {
                            strH3 = xzu0Var2.H(R.string.error_something_went_wrong);
                            strH3.getClass();
                        }
                        xzu0Var = xzu0Var2;
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH3, null, null, null, Integer.valueOf(R.drawable.ic_glyph_trash), 92), xzu0Var, null, null, false, null, 1020);
                    } else if (i0v0Var instanceof h0v0) {
                        String strH4 = ((h0v0) i0v0Var).f12252a;
                        uxs0 uxs0Var5 = xzu0.S1;
                        wdk0 wdk0Var2 = xzu0Var2.O1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        if (strH4.length() == 0) {
                            strH4 = xzu0Var2.H(R.string.error_something_went_wrong);
                            strH4.getClass();
                        }
                        xzu0Var = xzu0Var2;
                        wdk0.k(wdk0Var2, new xdk0(rek0Var, strH4, null, null, null, null, 124), xzu0Var, null, null, false, null, 1020);
                    }
                    xzu0Var.G0().x(ezu0.f8688a);
                    return Unit.f46060a;
                }
                ql5 ql5Var4 = ((e0v0) i0v0Var).f7008a;
                uxs0 uxs0Var6 = xzu0.S1;
                String strH5 = ql5Var4.i.e() ? xzu0Var2.H(R.string.account_change_warning) : String.format("%s\n\n%s", Arrays.copyOf(new Object[]{xzu0Var2.H(R.string.account_change_warning), xzu0Var2.H(R.string.account_change_warning2)}, 2));
                strH5.getClass();
                ynb ynbVar = xzu0Var2.M1;
                if (ynbVar == null) {
                    Intrinsics.h("changeBalanceDialogProvider");
                    throw null;
                }
                String strH6 = xzu0Var2.H(R.string.attention);
                strH6.getClass();
                String strH7 = xzu0Var2.H(R.string.allow);
                strH7.getClass();
                String strH8 = xzu0Var2.H(R.string.cancel);
                strH8.getClass();
                androidx.fragment.app.e eVarC4 = xzu0Var2.C();
                eVarC4.getClass();
                ynbVar.a(strH6, strH5, eVarC4, strH7, strH8, ql5Var4);
            }
            xzu0Var = xzu0Var2;
            xzu0Var.G0().x(ezu0.f8688a);
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object m(Object obj) {
        Object value;
        Pair pair = (Pair) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.b).booleanValue();
        vcv0 vcv0Var = (vcv0) this.k;
        ncv0 ncv0Var = (ncv0) vcv0Var.D();
        boolean z = !ncv0Var.e && zBooleanValue2;
        boolean z2 = vcv0Var.y == null;
        boolean z3 = zBooleanValue && ncv0Var.c;
        p7m0 p7m0Var = vcv0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, ncv0.a((ncv0) value, null, null, false, zBooleanValue2, false, 239)));
        if (z2 || z3 || z) {
            v3c.N(vcv0Var.y);
            vcv0Var.y = i3t0.K(vcv0Var, null, new npt0(vcv0Var, (byte) 29), new jtr0((Object) vcv0Var, (yje) null, (byte) 12), 1);
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                rtq0 rtq0Var = new rtq0((xtq0) obj2, yjeVar, (byte) 0);
                rtq0Var.j = obj;
                return rtq0Var;
            case 1:
                rtq0 rtq0Var2 = new rtq0((edr0) obj2, yjeVar, (byte) 1);
                rtq0Var2.j = obj;
                return rtq0Var2;
            case 2:
                rtq0 rtq0Var3 = new rtq0((dmr0) obj2, yjeVar, (byte) 2);
                rtq0Var3.j = obj;
                return rtq0Var3;
            case 3:
                rtq0 rtq0Var4 = new rtq0((ltr0) obj2, yjeVar, (byte) 3);
                rtq0Var4.j = obj;
                return rtq0Var4;
            case 4:
                rtq0 rtq0Var5 = new rtq0((k1s0) obj2, yjeVar, (byte) 4);
                rtq0Var5.j = obj;
                return rtq0Var5;
            case 5:
                rtq0 rtq0Var6 = new rtq0((u2s0) obj2, yjeVar, (byte) 5);
                rtq0Var6.j = obj;
                return rtq0Var6;
            case 6:
                rtq0 rtq0Var7 = new rtq0((u3s0) obj2, yjeVar, (byte) 6);
                rtq0Var7.j = obj;
                return rtq0Var7;
            case 7:
                rtq0 rtq0Var8 = new rtq0((k4s0) obj2, yjeVar, (byte) 7);
                rtq0Var8.j = obj;
                return rtq0Var8;
            case 8:
                rtq0 rtq0Var9 = new rtq0((n6s0) obj2, yjeVar, (byte) 8);
                rtq0Var9.j = obj;
                return rtq0Var9;
            case 9:
                rtq0 rtq0Var10 = new rtq0((l7s0) obj2, yjeVar, (byte) 9);
                rtq0Var10.j = obj;
                return rtq0Var10;
            case 10:
                rtq0 rtq0Var11 = new rtq0((z8s0) obj2, yjeVar, (byte) 10);
                rtq0Var11.j = obj;
                return rtq0Var11;
            case 11:
                rtq0 rtq0Var12 = new rtq0((zes0) obj2, yjeVar, (byte) 11);
                rtq0Var12.j = obj;
                return rtq0Var12;
            case 12:
                return new rtq0((uks0) this.j, (yhs0) obj2, yjeVar, (byte) 12);
            case 13:
                rtq0 rtq0Var13 = new rtq0((nps0) obj2, yjeVar, (byte) 13);
                rtq0Var13.j = obj;
                return rtq0Var13;
            case 14:
                return new rtq0((rv2) this.j, (agk0) obj2, yjeVar, (byte) 14);
            case 15:
                return new rtq0((x0t0) this.j, (Request) obj2, yjeVar, (byte) 15);
            case 16:
                return new rtq0((zii0) this.j, (gzj) obj2, yjeVar, (byte) 16);
            case 17:
                rtq0 rtq0Var14 = new rtq0((czt0) obj2, yjeVar, (byte) 17);
                rtq0Var14.j = obj;
                return rtq0Var14;
            case 18:
                rtq0 rtq0Var15 = new rtq0((tzt0) obj2, yjeVar, (byte) 18);
                rtq0Var15.j = obj;
                return rtq0Var15;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rtq0 rtq0Var16 = new rtq0((abu0) obj2, yjeVar, (byte) 19);
                rtq0Var16.j = obj;
                return rtq0Var16;
            case 20:
                return new rtq0((sd5) this.j, (ExoPlayer) obj2, yjeVar, (byte) 20);
            case 21:
                return new rtq0((cpu0) this.j, (dqu0) obj2, yjeVar, (byte) 21);
            case 22:
                return new rtq0((dyu0) this.j, (e7a) obj2, yjeVar, (byte) 22);
            case 23:
                rtq0 rtq0Var17 = new rtq0((dyu0) obj2, yjeVar, (byte) 23);
                rtq0Var17.j = obj;
                return rtq0Var17;
            case 24:
                rtq0 rtq0Var18 = new rtq0((xzu0) obj2, yjeVar, (byte) 24);
                rtq0Var18.j = obj;
                return rtq0Var18;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                rtq0 rtq0Var19 = new rtq0((a2v0) obj2, yjeVar, (byte) 25);
                rtq0Var19.j = obj;
                return rtq0Var19;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rtq0 rtq0Var20 = new rtq0((h2v0) obj2, yjeVar, (byte) 26);
                rtq0Var20.j = obj;
                return rtq0Var20;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rtq0 rtq0Var21 = new rtq0((u3v0) obj2, yjeVar, (byte) 27);
                rtq0Var21.j = obj;
                return rtq0Var21;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                rtq0 rtq0Var22 = new rtq0((vcv0) obj2, yjeVar, (byte) 28);
                rtq0Var22.j = obj;
                return rtq0Var22;
            default:
                rtq0 rtq0Var23 = new rtq0((tmv0) obj2, yjeVar, (byte) 29);
                rtq0Var23.j = obj;
                return rtq0Var23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rtq0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((rtq0) create((sar0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((rtq0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((rtq0) create((rur0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((rtq0) create((d7j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((rtq0) create((m6j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((rtq0) create((t6j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((rtq0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((rtq0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((rtq0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((rtq0) create((m7j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((rtq0) create((sfs0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((rtq0) create((zps0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((rtq0) create((hzt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((rtq0) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((rtq0) create((cau0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((rtq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((rtq0) create((pyu0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((rtq0) create((i0v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((rtq0) create((g2v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((rtq0) create((l2v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((rtq0) create((b4v0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((rtq0) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rtq0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:120:0x031d  */
    /* JADX WARN: Code duplicated, block: B:127:0x033b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0342 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0344  */
    /* JADX WARN: Code duplicated, block: B:130:0x0350  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v47 java.lang.Object, still in use, count: 2, list:
          (r4v47 java.lang.Object) from 0x02f3: PHI (r4 I:??) = (r4v42 java.lang.Object), (r4v47 java.lang.Object) binds: [B:114:0x02f2, B:372:0x02f3] A[DONT_GENERATE, DONT_INLINE]
          (r4v47 java.lang.Object) from 0x02e9: CHECK_CAST (a.nyg) (r4v47 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rtq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtq0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
