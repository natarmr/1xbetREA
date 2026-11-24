package a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteCell;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;
import org.xplatform.core.presentation.views.cards.LuckyCardButton;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackChoiceView;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.chips.DsChipGroup;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.password_requirement.DsBulletList;
import org.xplatform.uikit.components.password_requirement.DsPasswordRequirement;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wg implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39090a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg(cp cpVar, rer rerVar, byte b) {
        this.f39090a = b;
        this.b = cpVar;
        this.c = rerVar;
    }

    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        BetHistoryFilterItemModel betHistoryFilterItemModel;
        byte b = this.f39090a;
        Object obj = null;
        final byte b2 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((t0) obj3).invoke(Long.valueOf(((ug) ((cp) obj2).u()).f35599a));
                return;
            case 1:
                ((pf10) obj3).invoke(((cp) obj2).u());
                return;
            case 2:
                ((i80) ((v70) obj3).v).invoke((t70) obj2);
                return;
            case 3:
                ((AfricanRouletteCell) obj3).b.invoke((z70) obj2);
                return;
            case 4:
                ((z6e) obj3).invoke(((m14) ((cp) obj2).u()).f20986a);
                return;
            case 5:
                ((ur6) ((p77) obj3).w).invoke((m77) obj2);
                return;
            case 6:
                ((w6q0) obj3).invoke(Integer.valueOf(((jp9) ((cp) obj2).u()).f16890a));
                return;
            case 7:
                CashbackChoiceView cashbackChoiceView = (CashbackChoiceView) obj3;
                cashbackChoiceView.b = 0;
                cashbackChoiceView.b();
                ((Function0) obj2).invoke();
                return;
            case 8:
                zac.b((zac) obj3, (Chip) obj2, view);
                return;
            case 9:
                e7e e7eVar = (e7e) obj3;
                kwd kwdVar = e7e.d2;
                fae faeVarJ0 = e7eVar.J0();
                TextInputEditText textInputEditText = ((kzq) obj2).f;
                String strValueOf = String.valueOf(textInputEditText.getText());
                Date date = new Date();
                rei0 qei0Var = new qei0(strValueOf, h8d.b, date);
                bby bbyVar = faeVarJ0.R;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                f9e f9eVar = (f9e) faeVarJ0.A.getValue();
                if (f9eVar != null) {
                    if (f9eVar instanceof d9e) {
                        qei0Var = new pei0(strValueOf, ((d9e) f9eVar).f5696a, date);
                    } else if (f9eVar instanceof c9e) {
                        qei0Var = new pei0(strValueOf, kotlin.collections.a.c(((c9e) f9eVar).f3957a), date);
                    }
                }
                faeVarJ0.D(qei0Var, new w8e(faeVarJ0, b2));
                if (e7eVar.H0().s.getProgress() == 0) {
                    textInputEditText.setText("");
                    return;
                }
                return;
            case 10:
                cp cpVar = (cp) obj2;
                z6e z6eVar = (z6e) obj3;
                if (((ra8) cpVar.u()).e) {
                    z6eVar.invoke(Integer.valueOf(((ra8) cpVar.u()).f30121a));
                    return;
                }
                return;
            case 11:
                cp cpVar2 = (cp) obj2;
                ((xwe) obj3).O(Long.valueOf(((vte) cpVar2.u()).c), Long.valueOf(((vte) cpVar2.u()).d), Long.valueOf(((vte) cpVar2.u()).e), Long.valueOf(((vte) cpVar2.u()).f), Boolean.valueOf(((vte) cpVar2.u()).h));
                return;
            case 12:
                cp cpVar3 = (cp) obj2;
                mhc mhcVar = (mhc) obj3;
                view.getClass();
                ckb.Z(view, !((k7g) cpVar3.u).b.c ? 21 : 22);
                mhcVar.invoke(Long.valueOf(((a7g) cpVar3.u()).f367a), Boolean.valueOf(((a7g) cpVar3.u()).d));
                return;
            case 13:
                ((jxh) obj3).m.invoke(((vwh) ((y8b) obj2)).g);
                return;
            case 14:
                final org.xplatform.uikit.components.text_field.end.b bVar = (org.xplatform.uikit.components.text_field.end.b) obj3;
                final Function1 function1 = (Function1) obj2;
                if (bVar.f == 0) {
                    bVar.b(new Function0() { // from class: a.x4i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            org.xplatform.uikit.components.text_field.end.b bVar2 = bVar;
                            Function1 function2 = function1;
                            switch (b3) {
                                case 0:
                                    function2.invoke(Boolean.valueOf(bVar2.f == 0));
                                    break;
                                default:
                                    function2.invoke(Boolean.valueOf(bVar2.f == 0));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                } else {
                    final byte b3 = 1;
                    bVar.c(new Function0() { // from class: a.x4i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            org.xplatform.uikit.components.text_field.end.b bVar2 = bVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(Boolean.valueOf(bVar2.f == 0));
                                    break;
                                default:
                                    function2.invoke(Boolean.valueOf(bVar2.f == 0));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    return;
                }
            case 15:
                DsChipGroup.a((DsChipGroup) obj3, (DsChip) obj2, view);
                return;
            case 16:
                ((Function1) obj3).invoke(new au30(new dz10(((nz30) obj2).b)));
                return;
            case 17:
                ((Function1) obj3).invoke(((j240) obj2).f15765a);
                return;
            case 18:
                View.OnClickListener onClickListener = (View.OnClickListener) obj3;
                DsPasswordRequirement dsPasswordRequirement = (DsPasswordRequirement) obj2;
                dc3 dc3Var = dsPasswordRequirement.f47255a;
                if (onClickListener != null) {
                    int i = DsPasswordRequirement.c;
                    onClickListener.onClick(view);
                }
                boolean expanded = ((DsAccordion) dc3Var.c).getExpanded();
                boolean z = !expanded;
                if (dsPasswordRequirement.b) {
                    ((DsAccordion) dc3Var.c).setExpanded(z);
                    ((DsBulletList) dc3Var.d).setVisibility(expanded ? (byte) 8 : (byte) 0);
                    return;
                }
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                DsTabs.d((FrameLayout) obj3, (DsTabs) obj2);
                return;
            case 20:
                ((k4p) obj3).invoke(((cp) obj2).u());
                return;
            case 21:
                dxv dxvVar = (dxv) obj3;
                dxvVar.g2 = (vlq0) obj2;
                ii iiVar = dxvVar.i2;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = dxvVar.H(R.string.history_hide);
                String strH2 = dxvVar.H(R.string.hide_history_dialog_description);
                String strH3 = dxvVar.H(R.string.ok);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, dxvVar.H(R.string.cancel), (String) null, "CONFIRM_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = dxvVar.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                return;
            case 22:
                ((vft) obj3).invoke(((u0w) ((cp) obj2).u()).f34874a);
                return;
            case 23:
                ((li8) obj3).invoke(Long.valueOf(((l8w) ((cp) obj2).u()).f19623a));
                return;
            case 24:
                ((t3t) obj3).invoke(((e4w) ((cp) obj2).u()).c);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((t3t) obj3).invoke((BetHistoryFilterItemModel) obj2);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                art artVar = x6w.k2;
                wnm0 wnm0VarU0 = ((x6w) obj3).U0();
                boolean zIsChecked = ((DsCheckBoxOld) ((jk3) obj2).c).isChecked();
                ArrayList arrayList = wnm0VarU0.h;
                p7m0 p7m0Var = wnm0VarU0.j;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, o9h0.a((o9h0) value, zIsChecked, false, 2)));
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(BetHistoryFilterItemModel.a((BetHistoryFilterItemModel) it.next(), zIsChecked, false, 5));
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                wnm0VarU0.w();
                if (zIsChecked) {
                    wnm0VarU0.x();
                    return;
                }
                for (Object obj4 : arrayList) {
                    if (((BetHistoryFilterItemModel) obj4).f46411a == ((BetHistoryFilterItemModel) CollectionsKt.U(arrayList)).f46411a) {
                        obj = obj4;
                        betHistoryFilterItemModel = (BetHistoryFilterItemModel) obj;
                        if (betHistoryFilterItemModel != null) {
                            wnm0VarU0.y(betHistoryFilterItemModel);
                            return;
                        }
                        return;
                    }
                }
                betHistoryFilterItemModel = (BetHistoryFilterItemModel) obj;
                if (betHistoryFilterItemModel != null) {
                    wnm0VarU0.y(betHistoryFilterItemModel);
                    return;
                }
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int[] iArr = LuckyCardButton.c;
                ((View.OnClickListener) obj3).onClick((LuckyCardButton) obj2);
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar4 = (cp) obj2;
                ((p730) obj3).invoke(Boolean.valueOf(((dx20) cpVar4.u()).d), Long.valueOf(((dx20) cpVar4.u()).b));
                return;
            default:
                zr50 zr50Var = (zr50) obj3;
                ((jt50) zr50Var.w).invoke((ct5) obj2, (String) zr50Var.y);
                return;
        }
    }

    public /* synthetic */ wg(Object obj, Object obj2, byte b) {
        this.f39090a = b;
        this.c = obj;
        this.b = obj2;
    }
}
