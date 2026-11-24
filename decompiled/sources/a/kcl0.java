package a;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kcl0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18066a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kcl0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f18066a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 0;
        byte b2 = 16;
        switch (this.f18066a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ncl0 ncl0Var = (ncl0) this.receiver;
                ncl0Var.u.f(th, new hbl0(ncl0Var, b));
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((ndl0) this.receiver).d.b(th2, new gcl0((byte) 3));
                return Unit.f46060a;
            case 2:
                vol0 vol0Var = (vol0) obj;
                vol0Var.getClass();
                ((k3t0) this.receiver).x(vol0Var);
                return Unit.f46060a;
            case 3:
                ksl0 ksl0Var = (ksl0) obj;
                ksl0Var.getClass();
                url0 url0Var = (url0) this.receiver;
                cge0 cge0Var = url0.R1;
                url0Var.getClass();
                if (ksl0Var instanceof hsl0) {
                    ii iiVar = url0Var.P1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = url0Var.H(R.string.caution);
                    String strH2 = url0Var.H(R.string.select_one_sport);
                    String strH3 = url0Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC = url0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (ksl0Var instanceof fsl0) {
                    ii iiVar2 = url0Var.P1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = url0Var.H(R.string.caution);
                    String strH5 = url0Var.H(R.string.apply_changes);
                    String strH6 = url0Var.H(R.string.yes);
                    strH6.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, url0Var.H(R.string.no), (String) null, "REQUEST_CHANGES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = url0Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else if (ksl0Var instanceof gsl0) {
                    ii iiVar3 = url0Var.P1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH7 = url0Var.H(R.string.caution);
                    String strH8 = url0Var.H(R.string.clear_selected_sports);
                    String strH9 = url0Var.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, url0Var.H(R.string.cancel), (String) null, "REQUEST_CLEAR_SELECTED_SPORTS_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC3 = url0Var.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                } else if (ksl0Var instanceof isl0) {
                    ii iiVar4 = url0Var.P1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH10 = url0Var.H(R.string.caution);
                    String strH11 = url0Var.H(R.string.reset_to_default_values);
                    String strH12 = url0Var.H(R.string.ok_new);
                    strH12.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, url0Var.H(R.string.cancel), (String) null, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC4 = url0Var.C();
                    eVarC4.getClass();
                    iiVar4.d(dialogFields4, eVarC4);
                } else if ((ksl0Var instanceof esl0) || (ksl0Var instanceof dsl0)) {
                    j120.Y(url0Var);
                } else {
                    if (!(ksl0Var instanceof jsl0)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var = url0Var.O1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((jsl0) ksl0Var).f17059a, null, null, null, null, 124), url0Var, null, null, true, null, 1004);
                }
                url0Var.G0().x(arl0.f1352a);
                return Unit.f46060a;
            case 4:
                rrl0 rrl0Var = (rrl0) obj;
                rrl0Var.getClass();
                ((k3t0) this.receiver).x(rrl0Var);
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                vsl0 vsl0Var = (vsl0) this.receiver;
                vsl0Var.r.b(th3, new edk0(vsl0Var, b2));
                return Unit.f46060a;
            case 6:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                vsl0 vsl0Var2 = (vsl0) this.receiver;
                vsl0Var2.r.b(th4, new edk0(vsl0Var2, b2));
                return Unit.f46060a;
            case 7:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                vsl0 vsl0Var3 = (vsl0) this.receiver;
                vsl0Var3.r.b(th5, new edk0(vsl0Var3, b2));
                return Unit.f46060a;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                vsl0 vsl0Var4 = (vsl0) this.receiver;
                vsl0Var4.r.b(th6, new edk0(vsl0Var4, b2));
                return Unit.f46060a;
            case 9:
                hvl0 hvl0Var = (hvl0) obj;
                hvl0Var.getClass();
                ((k3t0) this.receiver).x(hvl0Var);
                return Unit.f46060a;
            case 10:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                zxl0 zxl0Var = (zxl0) this.receiver;
                zxl0Var.getClass();
                th7.printStackTrace();
                if (th7 instanceof ff5) {
                    zxl0Var.H(new gcl0((byte) 24));
                } else {
                    zxl0Var.H(new gcl0((byte) 25));
                }
                return Unit.f46060a;
            case 11:
                e2m0 e2m0Var = (e2m0) obj;
                e2m0Var.getClass();
                ((k3t0) this.receiver).x(e2m0Var);
                return Unit.f46060a;
            case 12:
                wzl0 wzl0Var = (wzl0) obj;
                wzl0Var.getClass();
                ((k3t0) this.receiver).x(wzl0Var);
                return Unit.f46060a;
            case 13:
                wzl0 wzl0Var2 = (wzl0) obj;
                wzl0Var2.getClass();
                ((k3t0) this.receiver).x(wzl0Var2);
                return Unit.f46060a;
            case 14:
                int iIntValue = ((Number) obj).intValue();
                j2m0 j2m0Var = (j2m0) this.receiver;
                iab iabVar = j2m0Var.f15787a;
                if (iabVar == null) {
                    Intrinsics.h("binding");
                    throw null;
                }
                ((NonScrollableRecyclerView) iabVar.c).scrollBy(0, iIntValue);
                LinearLayoutManager linearLayoutManager = j2m0Var.f;
                j2m0Var.g(linearLayoutManager != null ? linearLayoutManager.f1() : -1, false);
                return Unit.f46060a;
            case 15:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                w3m0 w3m0Var = (w3m0) this.receiver;
                w3m0Var.getClass();
                th8.printStackTrace();
                w3m0Var.H(new gcl0((byte) 28));
                return Unit.f46060a;
            case 16:
                xhe0 xhe0Var = (xhe0) obj;
                xhe0Var.getClass();
                r9m0 r9m0Var = (r9m0) this.receiver;
                r9m0Var.getClass();
                vyx vyxVar = r9m0Var.f30090a;
                if (vyxVar != null) {
                    vyxVar.s(xhe0Var);
                }
                return Unit.f46060a;
            case 17:
                ccm0 ccm0Var = (ccm0) obj;
                ccm0Var.getClass();
                ubm0 ubm0Var = (ubm0) this.receiver;
                y2m0 y2m0Var = ubm0.R1;
                ubm0Var.getClass();
                j6m0 j6m0Var = fcm0.n2;
                String str = ccm0Var.f4119a;
                ArrayList arrayList = ccm0Var.b;
                j6m0Var.getClass();
                fcm0 fcm0Var = new fcm0();
                iiy[] iiyVarArr = fcm0.o2;
                fcm0Var.k2.x(fcm0Var, iiyVarArr[0], str);
                fcm0Var.l2.D(fcm0Var, iiyVarArr[1], arrayList);
                fcm0Var.m2.x(fcm0Var, iiyVarArr[2], "SELECT_MENU_REQUEST_KEY");
                androidx.fragment.app.e eVarC5 = ubm0Var.C();
                eVarC5.getClass();
                sj3.D0(fcm0Var, eVarC5);
                ubm0Var.G0().x(lbm0.f19761a);
                return Unit.f46060a;
            case 18:
                sbm0 sbm0Var = (sbm0) obj;
                sbm0Var.getClass();
                ((k3t0) this.receiver).x(sbm0Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ybm0 ybm0Var = (ybm0) this.receiver;
                ybm0Var.s.b(th9, new o3m0(th9, ybm0Var, (byte) 6));
                return Unit.f46060a;
            case 20:
                exm0 exm0Var = (exm0) obj;
                exm0Var.getClass();
                ((k3t0) this.receiver).x(exm0Var);
                return Unit.f46060a;
            case 21:
                d0n0 d0n0Var = (d0n0) obj;
                d0n0Var.getClass();
                ((k3t0) this.receiver).x(d0n0Var);
                return Unit.f46060a;
            case 22:
                ybn0 ybn0Var = (ybn0) obj;
                ybn0Var.getClass();
                dbn0 dbn0Var = (dbn0) this.receiver;
                j6m0 j6m0Var2 = dbn0.S1;
                dbn0Var.getClass();
                if (ybn0Var instanceof vbn0) {
                    ujd ujdVar = dbn0Var.O1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(dbn0Var, ((vbn0) ybn0Var).f37149a);
                } else if (ybn0Var instanceof wbn0) {
                    ii iiVar5 = dbn0Var.L1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH13 = dbn0Var.H(R.string.confirmation);
                    String strH14 = dbn0Var.H(R.string.subscriptions_confirm_delete_all);
                    String strH15 = dbn0Var.H(R.string.yes);
                    strH15.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, dbn0Var.H(R.string.no), (String) null, "REQUEST_SHOW_CONFIRM_DELETE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = dbn0Var.C();
                    eVarC6.getClass();
                    iiVar5.d(dialogFields5, eVarC6);
                } else if (ybn0Var instanceof xbn0) {
                    ii iiVar6 = dbn0Var.L1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH16 = dbn0Var.H(R.string.attention);
                    String strH17 = dbn0Var.H(R.string.self_exclusion_changes_prohibited);
                    String strH18 = dbn0Var.H(R.string.ok_new);
                    strH18.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH16, (CharSequence) strH17, (CharSequence) strH18, (String) null, (String) null, "REQUEST_SELF_EXCLUSION_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC7 = dbn0Var.C();
                    eVarC7.getClass();
                    iiVar6.d(dialogFields6, eVarC7);
                }
                dbn0Var.G0().x(lan0.f19713a);
                return Unit.f46060a;
            case 23:
                san0 san0Var = (san0) obj;
                san0Var.getClass();
                ((k3t0) this.receiver).x(san0Var);
                return Unit.f46060a;
            case 24:
                mcn0 mcn0Var = (mcn0) obj;
                mcn0Var.getClass();
                icn0 icn0Var = (icn0) this.receiver;
                g9m0 g9m0Var = icn0.W1;
                icn0Var.getClass();
                if (mcn0Var instanceof kcn0) {
                    ii iiVar7 = icn0Var.L1;
                    if (iiVar7 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH19 = icn0Var.H(R.string.confirmation);
                    String strH20 = icn0Var.H(R.string.subscriptions_confirm_delete_all);
                    String strH21 = icn0Var.H(R.string.yes);
                    strH21.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH19, (CharSequence) strH20, (CharSequence) strH21, icn0Var.H(R.string.no), (String) null, "CLEAR_EVENTS_CONFIRM_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC8 = icn0Var.C();
                    eVarC8.getClass();
                    iiVar7.d(dialogFields7, eVarC8);
                } else if (mcn0Var instanceof lcn0) {
                    ii iiVar8 = icn0Var.L1;
                    if (iiVar8 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH22 = icn0Var.H(R.string.confirmation);
                    String strH23 = icn0Var.H(R.string.subscriptions_confirm_delete_all_teams);
                    String strH24 = icn0Var.H(R.string.yes);
                    strH24.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH22, (CharSequence) strH23, (CharSequence) strH24, icn0Var.H(R.string.no), (String) null, "CLEAR_TEAMS_CONFIRM_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC9 = icn0Var.C();
                    eVarC9.getClass();
                    iiVar8.d(dialogFields8, eVarC9);
                }
                icn0Var.G0().x(zbn0.f44124a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gdn0 gdn0Var = (gdn0) obj;
                gdn0Var.getClass();
                icn0 icn0Var2 = (icn0) this.receiver;
                g9m0 g9m0Var2 = icn0.W1;
                icn0Var2.getClass();
                if (gdn0Var instanceof ddn0) {
                    ujd ujdVar2 = icn0Var2.M1;
                    if (ujdVar2 == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar2.b(icn0Var2, ((ddn0) gdn0Var).f5904a);
                } else if (gdn0Var instanceof fdn0) {
                    icn0Var2.I0();
                } else if (gdn0Var instanceof edn0) {
                    icn0Var2.G0().x(new acn0(((edn0) gdn0Var).f7627a));
                }
                icn0Var2.H0().x(scn0.f31995a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ien0 ien0Var = (ien0) obj;
                ien0Var.getClass();
                icn0 icn0Var3 = (icn0) this.receiver;
                g9m0 g9m0Var3 = icn0.W1;
                icn0Var3.getClass();
                if (ien0Var instanceof hen0) {
                    icn0Var3.I0();
                } else if (ien0Var instanceof gen0) {
                    icn0Var3.G0().x(new acn0(((gen0) ien0Var).f11165a));
                }
                ((k3t0) icn0Var3.S1.getValue()).x(udn0.f35489a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ecn0 ecn0Var = (ecn0) obj;
                ecn0Var.getClass();
                ((k3t0) this.receiver).x(ecn0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ycn0 ycn0Var = (ycn0) obj;
                ycn0Var.getClass();
                ((k3t0) this.receiver).x(ycn0Var);
                return Unit.f46060a;
            default:
                den0 den0Var = (den0) obj;
                den0Var.getClass();
                ((k3t0) this.receiver).x(den0Var);
                return Unit.f46060a;
        }
    }
}
