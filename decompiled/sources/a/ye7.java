package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.bets_on_players.impl.presentation.model.ChooseSubGameParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ye7 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42474a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye7(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f42474a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 3;
        byte b2 = 7;
        final byte b3 = 0;
        switch (this.f42474a) {
            case 0:
                ve7 ve7Var = (ve7) obj;
                ve7Var.getClass();
                ((k3t0) this.receiver).x(ve7Var);
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                uf7 uf7Var = (uf7) this.receiver;
                uf7Var.i.b(th, new m87(uf7Var, b));
                return Unit.f46060a;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                uf7 uf7Var2 = (uf7) this.receiver;
                uf7Var2.i.b(th2, new m87(uf7Var2, b));
                return Unit.f46060a;
            case 3:
                kl7 kl7Var = (kl7) obj;
                kl7Var.getClass();
                final gk7 gk7Var = (gk7) this.receiver;
                kl5 kl5Var = gk7.U1;
                gk7Var.getClass();
                qek0 qek0Var = qek0.f28589a;
                rek0 rek0Var = rek0.b;
                if (kl7Var.equals(zk7.f44515a)) {
                    ynb ynbVar = gk7Var.N1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.c;
                    androidx.fragment.app.e eVarC = gk7Var.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "REQUEST_CHANGE_BALANCE_KEY", 462);
                } else if (kl7Var instanceof il7) {
                    wdk0.k(gk7Var.H0(), new xdk0(rek0Var, ((il7) kl7Var).f14962a, null, null, null, null, 124), gk7Var, null, null, false, null, 1020);
                } else if (kl7Var instanceof dl7) {
                    wdk0 wdk0VarH0 = gk7Var.H0();
                    String strH = gk7Var.H(R.string.sale_error);
                    strH.getClass();
                    wdk0.k(wdk0VarH0, new xdk0(rek0Var, strH, ((dl7) kl7Var).f6263a, null, null, null, 120), gk7Var, null, null, false, null, 1020);
                } else if (kl7Var instanceof al7) {
                    ii iiVarG0 = gk7Var.G0();
                    String strH2 = gk7Var.H(R.string.coupon_has_items);
                    String strH3 = gk7Var.H(R.string.duplicate_coupon_not_empty_error);
                    String strH4 = gk7Var.H(R.string.ok_new);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH2, (CharSequence) strH3, (CharSequence) strH4, gk7Var.H(R.string.cancel), (String) null, "REQUEST_COUPON_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = gk7Var.C();
                    eVarC2.getClass();
                    iiVarG0.d(dialogFields, eVarC2);
                    final String str = ((al7) kl7Var).f1054a;
                    ccq0.V(gk7Var, "REQUEST_COUPON_DIALOG_KEY", new Function0() { // from class: a.ck7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            String str2 = str;
                            gk7 gk7Var2 = gk7Var;
                            switch (b4) {
                                case 0:
                                    kl5 kl5Var2 = gk7.U1;
                                    k3t0 k3t0VarI0 = gk7Var2.I0();
                                    str2.getClass();
                                    k3t0VarI0.x(new ij7(str2));
                                    break;
                                case 1:
                                    kl5 kl5Var3 = gk7.U1;
                                    k3t0 k3t0VarI1 = gk7Var2.I0();
                                    str2.getClass();
                                    k3t0VarI1.x(new mi7(str2));
                                    break;
                                default:
                                    kl5 kl5Var4 = gk7.U1;
                                    k3t0 k3t0VarI2 = gk7Var2.I0();
                                    str2.getClass();
                                    k3t0VarI2.x(new ti7(str2));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                } else if (kl7Var instanceof gl7) {
                    gl7 gl7Var = (gl7) kl7Var;
                    wdk0.k(gk7Var.H0(), new xdk0(qek0Var, gl7Var.f11476a, gl7Var.b, null, null, Integer.valueOf(gl7Var.c), 88), gk7Var, null, null, false, null, 1020);
                } else if (kl7Var instanceof fl7) {
                    tqt tqtVar = c4w.n2;
                    androidx.fragment.app.e eVarC3 = gk7Var.C();
                    eVarC3.getClass();
                    fl7 fl7Var = (fl7) kl7Var;
                    ArrayList arrayList = fl7Var.f9724a;
                    String str2 = fl7Var.b;
                    tqtVar.getClass();
                    tqt.i(eVarC3, arrayList, str2, "REQUEST_BET_HISTORY_MENU_KEY");
                } else if (kl7Var.equals(wk7.f39294a)) {
                    ii iiVarG1 = gk7Var.G0();
                    String strH5 = gk7Var.H(R.string.confirmation);
                    String strH6 = gk7Var.H(R.string.system_push_notification_setting);
                    String strH7 = gk7Var.H(R.string.open_settings);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, gk7Var.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC4 = gk7Var.C();
                    eVarC4.getClass();
                    iiVarG1.d(dialogFields2, eVarC4);
                } else if (kl7Var.equals(cl7.f4542a)) {
                    ii iiVarG2 = gk7Var.G0();
                    String strH8 = gk7Var.H(R.string.confirmation);
                    String strH9 = gk7Var.H(R.string.push_tracking_alert_message);
                    String strH10 = gk7Var.H(R.string.activate);
                    strH10.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, gk7Var.H(R.string.cancel), (String) null, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = gk7Var.C();
                    eVarC5.getClass();
                    iiVarG2.d(dialogFields3, eVarC5);
                } else if (kl7Var.equals(xk7.f41018a)) {
                    ii iiVarG3 = gk7Var.G0();
                    String strH11 = gk7Var.H(R.string.attention);
                    String strH12 = gk7Var.H(R.string.self_exclusion_changes_prohibited);
                    String strH13 = gk7Var.H(R.string.ok_new);
                    strH13.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH11, (CharSequence) strH12, (CharSequence) strH13, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                    androidx.fragment.app.e eVarC6 = gk7Var.C();
                    eVarC6.getClass();
                    iiVarG3.d(dialogFields4, eVarC6);
                } else if (kl7Var instanceof jl7) {
                    wdk0 wdk0VarH1 = gk7Var.H0();
                    String str3 = ((jl7) kl7Var).f16701a;
                    wdk0.k(wdk0VarH1, new xdk0(rek0Var, str3, str3, null, null, null, 120), gk7Var, null, null, false, null, 1020);
                } else if (kl7Var instanceof hl7) {
                    gl5 gl5Var = tj7.t2;
                    androidx.fragment.app.e eVarC7 = gk7Var.C();
                    eVarC7.getClass();
                    hl7 hl7Var = (hl7) kl7Var;
                    gl5.o(gl5Var, eVarC7, hl7Var.f13243a, hl7Var.b, hl7Var.c, 104);
                } else if (kl7Var instanceof bl7) {
                    bl7 bl7Var = (bl7) kl7Var;
                    wdk0.k(gk7Var.H0(), new xdk0(qek0Var, bl7Var.f2780a, bl7Var.b, null, null, null, 120), gk7Var, null, null, false, null, 1020);
                } else if (kl7Var instanceof tk7) {
                    wdk0 wdk0VarH2 = gk7Var.H0();
                    tk7 tk7Var = (tk7) kl7Var;
                    String str4 = tk7Var.b;
                    String str5 = tk7Var.f34080a;
                    String strH14 = gk7Var.H(R.string.copy_history_bet_number_copy);
                    strH14.getClass();
                    j120.M(gk7Var, wdk0VarH2, "Bet Number", str4, strH14, str5, Integer.valueOf(R.drawable.data_copy_icon), null, 64);
                    gk7Var = gk7Var;
                } else if (kl7Var instanceof vk7) {
                    vk7 vk7Var = (vk7) kl7Var;
                    String str6 = vk7Var.b;
                    byte[] bArr = vk7Var.f37560a;
                    kxq kxqVarB = gk7Var.B();
                    if (kxqVarB != null && !kxqVarB.isFinishing()) {
                        try {
                            Object systemService = kxqVarB.getSystemService("print");
                            PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                            if (printManager != null) {
                                int i = qb90.e;
                                printManager.print(str6, xvw.D(gk7Var.o0(), str6, bArr), new PrintAttributes.Builder().build());
                            }
                        } catch (ActivityNotFoundException unused) {
                            wdk0 wdk0VarH3 = gk7Var.H0();
                            String string = kxqVarB.getString(R.string.error_not_installed_v2, "PDFReader");
                            string.getClass();
                            wdk0.k(wdk0VarH3, new xdk0(rek0Var, string, null, null, null, null, 124), gk7Var, null, null, false, null, 1020);
                        }
                    }
                    break;
                } else if (kl7Var instanceof uk7) {
                    ii iiVarG4 = gk7Var.G0();
                    String strH15 = gk7Var.H(R.string.confirmation);
                    String strH16 = gk7Var.H(R.string.order_already_exist_message);
                    String strH17 = gk7Var.H(R.string.yes);
                    strH17.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, gk7Var.H(R.string.no), (String) null, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC8 = gk7Var.C();
                    eVarC8.getClass();
                    iiVarG4.d(dialogFields5, eVarC8);
                    final String str7 = ((uk7) kl7Var).f35813a;
                    final byte b4 = 1;
                    ccq0.V(gk7Var, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY", new Function0() { // from class: a.ck7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            String str8 = str7;
                            gk7 gk7Var2 = gk7Var;
                            switch (b5) {
                                case 0:
                                    kl5 kl5Var2 = gk7.U1;
                                    k3t0 k3t0VarI0 = gk7Var2.I0();
                                    str8.getClass();
                                    k3t0VarI0.x(new ij7(str8));
                                    break;
                                case 1:
                                    kl5 kl5Var3 = gk7.U1;
                                    k3t0 k3t0VarI1 = gk7Var2.I0();
                                    str8.getClass();
                                    k3t0VarI1.x(new mi7(str8));
                                    break;
                                default:
                                    kl5 kl5Var4 = gk7.U1;
                                    k3t0 k3t0VarI2 = gk7Var2.I0();
                                    str8.getClass();
                                    k3t0VarI2.x(new ti7(str8));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                } else if (kl7Var.equals(yk7.f42774a)) {
                    ii iiVarG5 = gk7Var.G0();
                    String strH18 = gk7Var.H(R.string.error);
                    String strH19 = gk7Var.H(R.string.request_error);
                    String strH20 = gk7Var.H(R.string.ok_new);
                    strH20.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH18, (CharSequence) strH19, (CharSequence) strH20, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC9 = gk7Var.C();
                    eVarC9.getClass();
                    iiVarG5.d(dialogFields6, eVarC9);
                } else if (kl7Var instanceof el7) {
                    ii iiVarG6 = gk7Var.G0();
                    el7 el7Var = (el7) kl7Var;
                    String str8 = el7Var.f7983a;
                    String strH21 = gk7Var.H(R.string.hide_history_dialog_message);
                    String strH22 = gk7Var.H(R.string.ok_new);
                    strH22.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) str8, (CharSequence) strH21, (CharSequence) strH22, gk7Var.H(R.string.cancel), (String) null, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC10 = gk7Var.C();
                    eVarC10.getClass();
                    iiVarG6.d(dialogFields7, eVarC10);
                    final String str9 = el7Var.b;
                    final byte b5 = 2;
                    ccq0.V(gk7Var, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY", new Function0() { // from class: a.ck7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b5;
                            String str10 = str9;
                            gk7 gk7Var2 = gk7Var;
                            switch (b6) {
                                case 0:
                                    kl5 kl5Var2 = gk7.U1;
                                    k3t0 k3t0VarI0 = gk7Var2.I0();
                                    str10.getClass();
                                    k3t0VarI0.x(new ij7(str10));
                                    break;
                                case 1:
                                    kl5 kl5Var3 = gk7.U1;
                                    k3t0 k3t0VarI1 = gk7Var2.I0();
                                    str10.getClass();
                                    k3t0VarI1.x(new mi7(str10));
                                    break;
                                default:
                                    kl5 kl5Var4 = gk7.U1;
                                    k3t0 k3t0VarI2 = gk7Var2.I0();
                                    str10.getClass();
                                    k3t0VarI2.x(new ti7(str10));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                } else if (kl7Var.equals(sk7.f32333a)) {
                    wdk0 wdk0VarH4 = gk7Var.H0();
                    String strH23 = gk7Var.H(R.string.cancel_autobet_request);
                    strH23.getClass();
                    wdk0.k(wdk0VarH4, new xdk0(qek0Var, strH23, null, null, null, null, 124), gk7Var, null, null, false, null, 1020);
                }
                gk7Var.I0().x(ri7.f30526a);
                return Unit.f46060a;
            case 4:
                mj7 mj7Var = (mj7) obj;
                mj7Var.getClass();
                ((k3t0) this.receiver).x(mj7Var);
                return Unit.f46060a;
            case 5:
                mj7 mj7Var2 = (mj7) obj;
                mj7Var2.getClass();
                ((k3t0) this.receiver).x(mj7Var2);
                return Unit.f46060a;
            case 6:
                mj7 mj7Var3 = (mj7) obj;
                mj7Var3.getClass();
                ((k3t0) this.receiver).x(mj7Var3);
                return Unit.f46060a;
            case 7:
                mj7 mj7Var4 = (mj7) obj;
                mj7Var4.getClass();
                ((k3t0) this.receiver).x(mj7Var4);
                return Unit.f46060a;
            case 8:
                mj7 mj7Var5 = (mj7) obj;
                mj7Var5.getClass();
                ((k3t0) this.receiver).x(mj7Var5);
                return Unit.f46060a;
            case 9:
                yp7 yp7Var = (yp7) obj;
                yp7Var.getClass();
                mp7 mp7Var = (mp7) this.receiver;
                bj5 bj5Var = mp7.S1;
                mp7Var.getClass();
                if (!(yp7Var instanceof yp7)) {
                    t9f.b();
                    return null;
                }
                Context contextD = mp7Var.D();
                if (contextD != null) {
                    j120.c0(contextD, "open/sports?type=line");
                }
                mp7Var.G0().x(zo7.f44706a);
                return Unit.f46060a;
            case 10:
                jp7 jp7Var = (jp7) obj;
                jp7Var.getClass();
                ((k3t0) this.receiver).x(jp7Var);
                return Unit.f46060a;
            case 11:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                hq7 hq7Var = (hq7) this.receiver;
                hq7Var.q.b(th3, new m87(hq7Var, b2));
                return Unit.f46060a;
            case 12:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                hq7 hq7Var2 = (hq7) this.receiver;
                hq7Var2.q.b(th4, new m87(hq7Var2, b2));
                return Unit.f46060a;
            case 13:
                ou7 ou7Var = (ou7) obj;
                ou7Var.getClass();
                au7 au7Var = (au7) this.receiver;
                yk5 yk5Var = au7.U1;
                au7Var.getClass();
                if (!ou7Var.equals(ou7.f25864a)) {
                    t9f.b();
                    return null;
                }
                kj5 kj5Var = dic.n2;
                androidx.fragment.app.e eVarC11 = au7Var.C();
                eVarC11.getClass();
                ChooseSubGameParams chooseSubGameParams = new ChooseSubGameParams(au7Var.G0().f46987a, au7Var.G0().c);
                kj5Var.getClass();
                if (eVarC11.J("ChooseSubGameBottomSheetFragment") == null) {
                    dic dicVar = new dic();
                    dicVar.l2.J(dicVar, dic.o2[0], chooseSubGameParams);
                    dicVar.H0(eVarC11, "ChooseSubGameBottomSheetFragment");
                }
                au7Var.H0().x(ht7.f13620a);
                return Unit.f46060a;
            case 14:
                String str10 = (String) obj;
                str10.getClass();
                ((d48) this.receiver).x(str10);
                return Unit.f46060a;
            case 15:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((d48) this.receiver).z(th5);
                return Unit.f46060a;
            case 16:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((d48) this.receiver).z(th6);
                return Unit.f46060a;
            case 17:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((d48) this.receiver).z(th7);
                return Unit.f46060a;
            case 18:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((d48) this.receiver).z(th8);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((d48) this.receiver).z(th9);
                return Unit.f46060a;
            case 20:
                ub8 ub8Var = (ub8) obj;
                ub8Var.getClass();
                ((k3t0) this.receiver).x(ub8Var);
                return Unit.f46060a;
            case 21:
                gd8 gd8Var = (gd8) obj;
                gd8Var.getClass();
                uc8 uc8Var = (uc8) this.receiver;
                yk5 yk5Var2 = uc8.P1;
                uc8Var.getClass();
                if (gd8Var instanceof dd8) {
                    dd8 dd8Var = (dd8) gd8Var;
                    ii iiVar = uc8Var.L1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH24 = uc8Var.H(R.string.caution);
                    String str11 = dd8Var.f5883a;
                    String strH25 = uc8Var.H(R.string.cancel);
                    strH25.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH24, (CharSequence) str11, (CharSequence) strH25, uc8Var.H(R.string.ok_upper), (String) null, "REQUEST_SELECTED_BONUS_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC12 = uc8Var.C();
                    eVarC12.getClass();
                    iiVar.d(dialogFields8, eVarC12);
                } else if (gd8Var instanceof fd8) {
                    fd8 fd8Var = (fd8) gd8Var;
                    wdk0 wdk0Var = uc8Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(qek0.f28589a, fd8Var.f9345a, null, null, null, null, 124), uc8Var, null, null, false, null, 1020);
                } else {
                    if (!(gd8Var instanceof ed8)) {
                        t9f.b();
                        return null;
                    }
                    ed8 ed8Var = (ed8) gd8Var;
                    wdk0 wdk0Var2 = uc8Var.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, ed8Var.f7603a, null, null, null, null, 124), uc8Var, null, null, false, null, 1020);
                }
                uc8Var.G0().x(lc8.f19787a);
                return Unit.f46060a;
            case 22:
                rc8 rc8Var = (rc8) obj;
                rc8Var.getClass();
                ((k3t0) this.receiver).x(rc8Var);
                return Unit.f46060a;
            case 23:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((lf8) this.receiver).O(th10);
                return Unit.f46060a;
            case 24:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((lf8) this.receiver).O(th11);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((lf8) this.receiver).O(th12);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((lf8) this.receiver).O(th13);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((lf8) this.receiver).O(th14);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                il8 il8Var = (il8) obj;
                il8Var.getClass();
                ni8 ni8Var = (ni8) this.receiver;
                yk5 yk5Var3 = ni8.U1;
                ni8Var.getClass();
                if (il8Var instanceof zk8) {
                    csr csrVar = ((zk8) il8Var).f44517a;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("BonusesFeature.BONUS_RESULT_DATA_KEY", csrVar);
                    vcc.f0(bundle, ni8Var, "BonusesFeature.BONUS_RESULT_KEY");
                } else if (il8Var instanceof al8) {
                    al8 al8Var = (al8) il8Var;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("BonusesFeature.BONUS_RESULT_GAME_ID_KEY", al8Var.f1055a);
                    bundle2.putSerializable("BonusesFeature.BONUS_RESULT_DATA_KEY", al8Var.b);
                    vcc.f0(bundle2, ni8Var, "BonusesFeature.BONUS_RESULT_KEY");
                } else if (il8Var.equals(bl8.f2782a)) {
                    ynb ynbVar2 = ni8Var.L1;
                    if (ynbVar2 == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var2 = bm5.d;
                    androidx.fragment.app.e eVarC13 = ni8Var.C();
                    eVarC13.getClass();
                    ynb.b(ynbVar2, bm5Var2, null, eVarC13, false, "SELECT_BALANCE_REQUEST_KEY", 494);
                } else if (il8Var.equals(el8.f7985a)) {
                    wdk0 wdk0Var3 = ni8Var.M1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var2 = rek0.b;
                    String strH26 = ni8Var.H(R.string.get_balance_list_error);
                    strH26.getClass();
                    wdk0.k(wdk0Var3, new xdk0(rek0Var2, strH26, null, null, null, null, 124), ni8Var, null, null, false, null, 1020);
                } else {
                    if (!il8Var.equals(hl8.f13244a)) {
                        t9f.b();
                        return null;
                    }
                    if (ni8Var.N1 == null) {
                        Intrinsics.h("wildFreeBetScreenFactory");
                        throw null;
                    }
                    new ffv0().H0(ni8Var.C(), "WILD_FREE_BET_SELECTOR_TAG");
                }
                ni8Var.G0().x(kh8.f18277a);
                return Unit.f46060a;
            default:
                jl8 jl8Var = (jl8) obj;
                jl8Var.getClass();
                oi8 oi8Var = (oi8) this.receiver;
                cl5 cl5Var = oi8.P1;
                oi8Var.getClass();
                if (jl8Var.equals(fl8.f9725a)) {
                    ii iiVar2 = oi8Var.L1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH27 = oi8Var.H(R.string.refuse);
                    String strH28 = oi8Var.H(R.string.refuse_bonus);
                    String strH29 = oi8Var.H(R.string.cancel);
                    String strH30 = oi8Var.H(R.string.ok_upper);
                    strH30.getClass();
                    DialogFields dialogFields9 = new DialogFields((CharSequence) strH27, (CharSequence) strH28, (CharSequence) strH30, strH29, (String) null, "REQUEST_REFUSE_BONUS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC14 = oi8Var.C();
                    eVarC14.getClass();
                    iiVar2.d(dialogFields9, eVarC14);
                } else if (jl8Var instanceof gl8) {
                    gl8 gl8Var = (gl8) jl8Var;
                    wdk0 wdk0Var4 = oi8Var.M1;
                    if (wdk0Var4 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var4, new xdk0(rek0.b, gl8Var.f11478a, null, null, null, null, 124), oi8Var, null, null, false, null, 1020);
                } else if (jl8Var.equals(cl8.f4543a)) {
                    ii iiVar3 = oi8Var.L1;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH31 = oi8Var.H(R.string.claim_bonus_failed_message);
                    String strH32 = oi8Var.H(R.string.ok_new);
                    strH32.getClass();
                    DialogFields dialogFields10 = new DialogFields((CharSequence) null, (CharSequence) strH31, (CharSequence) strH32, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1529);
                    androidx.fragment.app.e eVarC15 = oi8Var.C();
                    eVarC15.getClass();
                    iiVar3.d(dialogFields10, eVarC15);
                } else {
                    if (!jl8Var.equals(dl8.f6265a)) {
                        t9f.b();
                        return null;
                    }
                    ii iiVar4 = oi8Var.L1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH33 = oi8Var.H(R.string.claim_bonus_success_message);
                    String strH34 = oi8Var.H(R.string.ok_new);
                    strH34.getClass();
                    DialogFields dialogFields11 = new DialogFields((CharSequence) null, (CharSequence) strH33, (CharSequence) strH34, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1529);
                    androidx.fragment.app.e eVarC16 = oi8Var.C();
                    eVarC16.getClass();
                    iiVar4.d(dialogFields11, eVarC16);
                }
                oi8Var.G0().x(lk8.f20188a);
                return Unit.f46060a;
        }
    }
}
