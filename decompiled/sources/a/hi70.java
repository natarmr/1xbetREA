package a;

import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hi70 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi70(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        yr10 yr10Var;
        j980 j980Var = (j980) obj;
        z880 z880Var = (z880) this.f41192a;
        xi70 xi70Var = z880.U1;
        if (j980Var instanceof g980) {
            g980 g980Var = (g980) j980Var;
            String str = g980Var.b;
            m2r m2rVarG0 = z880Var.G0();
            a8z a8zVar = z880Var.S1;
            m2rVarG0.d.setVisibility(0);
            DsBottomBar dsBottomBar = m2rVarG0.b;
            dsBottomBar.setVisibility(0);
            m2rVarG0.c.setVisibility(8);
            ((ProgressBar) m2rVarG0.f.c).setVisibility(8);
            DsTextField dsTextField = m2rVarG0.h;
            if (!Intrinsics.d(dsTextField.getText(), str)) {
                dsTextField.setText(str);
            }
            dsBottomBar.setFirstButtonEnabled(g980Var.e);
            f980 f980Var = g980Var.c;
            String str2 = f980Var.d;
            DsPhoneTextField dsPhoneTextField = z880Var.G0().e;
            String str3 = f980Var.f;
            String str4 = f980Var.g;
            String str5 = f980Var.c;
            if (str2.length() == 0) {
                InputFilter inputFilter = (InputFilter) a8zVar.getValue();
                inputFilter.getClass();
                DsTextField dsTextField2 = dsPhoneTextField.b;
                ArrayList arrayListJ0 = tx3.j0(dsTextField2.getFilters());
                arrayListJ0.add(inputFilter);
                dsTextField2.setFilters((InputFilter[]) arrayListJ0.toArray(new InputFilter[0]));
            } else {
                InputFilter inputFilter2 = (InputFilter) a8zVar.getValue();
                inputFilter2.getClass();
                DsTextField dsTextField3 = dsPhoneTextField.b;
                ArrayList arrayListJ1 = tx3.j0(dsTextField3.getFilters());
                arrayListJ1.remove(inputFilter2);
                dsTextField3.setFilters((InputFilter[]) arrayListJ1.toArray(new InputFilter[0]));
            }
            if (f980Var.b) {
                dsPhoneTextField.setCodeStartIcon(f980Var.f9144a);
            } else {
                dsPhoneTextField.e();
            }
            if (!str5.equals(dsPhoneTextField.getCode())) {
                dsPhoneTextField.setCodeText(str5);
            }
            dsPhoneTextField.setPhonePlaceholder(f980Var.e);
            z880Var.G0().e.setPhoneMask(str2);
            if (!str4.equals(dsPhoneTextField.getPhone())) {
                dsPhoneTextField.setPhoneText(str4);
            }
            dsPhoneTextField.b.f(str3.length() > 0);
            dsPhoneTextField.setPhoneErrorText(str3);
            dsPhoneTextField.setCodeEnabled(true);
            e980 e980Var = g980Var.d;
            DsTextField dsTextField4 = z880Var.G0().g;
            dsTextField4.setEnabled(e980Var.c);
            dsTextField4.setText(e980Var.b);
            dsTextField4.setVisibility(e980Var.f7408a ? 0 : 8);
            dsTextField4.setFocusable(false);
            Fragment fragment = z880Var.y;
            yr10Var = fragment instanceof yr10 ? (yr10) fragment : null;
            if (yr10Var != null) {
                yr10Var.H0(g980Var.f10902a);
            }
        } else if (j980Var instanceof h980) {
            m2r m2rVarG1 = z880Var.G0();
            m2rVarG1.d.setVisibility(8);
            m2rVarG1.b.setVisibility(8);
            LottieView lottieView = m2rVarG1.c;
            lottieView.w(((h980) j980Var).f12663a);
            lottieView.setVisibility(0);
            ((ProgressBar) m2rVarG1.f.c).setVisibility(8);
            Fragment fragment2 = z880Var.y;
            yr10Var = fragment2 instanceof yr10 ? (yr10) fragment2 : null;
            if (yr10Var != null) {
                yr10Var.H0(false);
            }
        } else {
            z880Var.getClass();
            if (!Intrinsics.d(j980Var, i980.f14376a)) {
                t9f.b();
                return null;
            }
            m2r m2rVarG2 = z880Var.G0();
            m2rVarG2.d.setVisibility(8);
            m2rVarG2.b.setVisibility(8);
            m2rVarG2.c.setVisibility(8);
            ((ProgressBar) m2rVarG2.f.c).setVisibility(0);
            Fragment fragment3 = z880Var.y;
            yr10Var = fragment3 instanceof yr10 ? (yr10) fragment3 : null;
            if (yr10Var != null) {
                yr10Var.H0(false);
            }
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        w880 w880Var = (w880) obj;
        z880 z880Var = (z880) this.f41192a;
        xi70 xi70Var = z880.U1;
        z880Var.getClass();
        q880 q880Var = q880.f28288a;
        if (!Intrinsics.d(w880Var, q880Var)) {
            if (w880Var instanceof s880) {
                d7a d7aVar = ((s880) w880Var).f31791a;
                if (z880Var.L1 == null) {
                    Intrinsics.h("captchaDialogDelegate");
                    throw null;
                }
                String strH = z880Var.H(R.string.call_back);
                strH.getClass();
                gl5.q(z880Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
            } else if (w880Var instanceof u880) {
                PickerParams.Phone phone = ((u880) w880Var).f35222a;
                rl70 rl70Var = z880Var.M1;
                if (rl70Var == null) {
                    Intrinsics.h("pickerDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC = z880Var.C();
                eVarC.getClass();
                rl70Var.e(eVarC, phone, AnalyticsEntryPoint.f46800a);
            } else if (w880Var instanceof r880) {
                List list = ((r880) w880Var).f30013a;
                s2m0 s2m0Var = gbq0.m2;
                androidx.fragment.app.e eVarC2 = z880Var.C();
                eVarC2.getClass();
                s2m0Var.getClass();
                s2m0.e(eVarC2, list);
            } else if (w880Var instanceof t880) {
                t880 t880Var = (t880) w880Var;
                wdk0 wdk0Var = z880Var.N1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                wdk0.k(wdk0Var, new xdk0(rek0.b, t880Var.f33503a, t880Var.b, null, null, null, 120), z880Var, null, null, false, null, 1020);
            } else if (w880Var instanceof p880) {
                vcc.f0(i120.U(), z880Var, z880Var.Q1.n(z880Var, z880.V1[1]));
                String str = ((p880) w880Var).f26542a;
                wdk0 wdk0Var2 = z880Var.N1;
                if (wdk0Var2 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                qek0 qek0Var = qek0.f28589a;
                String strH2 = z880Var.H(R.string.callback_ordered_snackbar_title);
                strH2.getClass();
                wdk0.k(wdk0Var2, new xdk0(qek0Var, strH2, str, null, null, null, 120), z880Var, null, null, false, null, 1020);
            } else {
                if (!(w880Var instanceof v880)) {
                    t9f.b();
                    return null;
                }
                PickerParams.Language language = ((v880) w880Var).f36970a;
                rl70 rl70Var2 = z880Var.M1;
                if (rl70Var2 == null) {
                    Intrinsics.h("pickerDialogFactory");
                    throw null;
                }
                androidx.fragment.app.e eVarC3 = z880Var.C();
                eVarC3.getClass();
                Parcelable.Creator<AnalyticsEntryPoint> creator = AnalyticsEntryPoint.CREATOR;
                rl70Var2.g(eVarC3, language);
            }
            p7m0 p7m0Var = z880Var.H0().A;
            p7m0Var.getClass();
            p7m0Var.o(null, q880Var);
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        oj90 oj90Var = (oj90) obj;
        aj90 aj90Var = (aj90) this.f41192a;
        fl70 fl70Var = aj90.S1;
        aj90Var.getClass();
        if (Intrinsics.d(oj90Var, jj90.f16610a)) {
            ii iiVar = aj90Var.M1;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH = aj90Var.H(R.string.caution);
            String strH2 = aj90Var.H(R.string.dialog_activate_email_for_password_restore);
            String strH3 = aj90Var.H(R.string.activate);
            strH3.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, aj90Var.H(R.string.cancel), (String) null, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC = aj90Var.C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
        } else if (Intrinsics.d(oj90Var, kj90.f18376a)) {
            ii iiVar2 = aj90Var.M1;
            if (iiVar2 == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH4 = aj90Var.H(R.string.caution);
            String strH5 = aj90Var.H(R.string.activation_phone_description);
            String strH6 = aj90Var.H(R.string.activate);
            strH6.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, aj90Var.H(R.string.cancel), (String) null, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC2 = aj90Var.C();
            eVarC2.getClass();
            iiVar2.d(dialogFields2, eVarC2);
        } else if (Intrinsics.d(oj90Var, nj90.f23624a)) {
            ii iiVar3 = aj90Var.M1;
            if (iiVar3 == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH7 = aj90Var.H(R.string.caution);
            String strH8 = aj90Var.H(R.string.change_email_description_contacts);
            String strH9 = aj90Var.H(R.string.info_contact);
            strH9.getClass();
            DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, aj90Var.H(R.string.cancel), (String) null, "REQUEST_CHANGE_EMAIL_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC3 = aj90Var.C();
            eVarC3.getClass();
            iiVar3.d(dialogFields3, eVarC3);
        } else if (Intrinsics.d(oj90Var, lj90.f20138a)) {
            ii iiVar4 = aj90Var.M1;
            if (iiVar4 == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH10 = aj90Var.H(R.string.caution);
            String strH11 = aj90Var.H(R.string.bind_phone_description);
            String strH12 = aj90Var.H(R.string.bind);
            strH12.getClass();
            DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, aj90Var.H(R.string.cancel), (String) null, "REQUEST_BIND_PHONE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
            androidx.fragment.app.e eVarC4 = aj90Var.C();
            eVarC4.getClass();
            iiVar4.d(dialogFields4, eVarC4);
        } else {
            if (!Intrinsics.d(oj90Var, mj90.f21885a)) {
                t9f.b();
                return null;
            }
            if (aj90Var.N1 == null) {
                Intrinsics.h("personalScreenFactory");
                throw null;
            }
            androidx.fragment.app.e eVarC5 = aj90Var.C();
            eVarC5.getClass();
            el90.m2.getClass();
            el90 el90Var = new el90();
            el90Var.l2.x(el90Var, el90.n2[0], "SELECT_PHONE_ACTION_DIALOG_KEY");
            el90Var.H0(eVarC5, "PHONE_ACTIONS_DIALOG_TAG");
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        tr90 tr90Var = (tr90) obj;
        zo90 zo90Var = (zo90) this.f41192a;
        fl70 fl70Var = zo90.p2;
        djk djkVarQ0 = zo90Var.Q0();
        n0o0 n0o0Var = zo90Var.k2;
        RecyclerView recyclerView = djkVarQ0.e;
        ir90 ir90VarA = tr90Var.a();
        LinearLayout linearLayout = zo90Var.Q0().d;
        boolean z = ir90VarA.d;
        boolean z2 = ir90VarA.i;
        String str = ir90VarA.g;
        String str2 = ir90VarA.h;
        String str3 = ir90VarA.f;
        linearLayout.setVisibility(z ? 0 : 8);
        zo90Var.Q0().c.setVisibility(ir90VarA.e ? 0 : 8);
        zo90Var.Q0().f.setVisibility(ir90VarA.f15245a ? 0 : 8);
        zo90Var.Q0().f.setHint(ir90VarA.b);
        zo90Var.Q0().g.f(str2.length() > 0);
        zo90Var.Q0().g.setErrorText(str2);
        zo90Var.W0().f.b(str3);
        Editable text = zo90Var.Q0().f.getEditText().getText();
        if (!str3.equals(text != null ? text.toString() : null)) {
            zo90Var.Q0().f.setText(str3);
        }
        if (!str.equals(zo90Var.Q0().g.getText())) {
            zo90Var.Q0().g.setText(str);
        }
        BottomSheetBehavior bottomSheetBehavior = zo90Var.c2;
        byte b = 4;
        if (bottomSheetBehavior != null && bottomSheetBehavior.P == 3 && !z2) {
            bottomSheetBehavior.N(4);
        } else if (bottomSheetBehavior != null && bottomSheetBehavior.P == 4 && z2) {
            bottomSheetBehavior.N(3);
        }
        zo90Var.Q0().j.setText(ir90VarA.c);
        if (tr90Var instanceof kr90) {
            zo90Var.Q0().i.setVisibility(8);
            ((vn90) n0o0Var.getValue()).B(((kr90) tr90Var).b, new oh60(tr90Var, recyclerView, b));
        } else {
            if (!(tr90Var instanceof lr90)) {
                t9f.b();
                return null;
            }
            zo90Var.Q0().i.setVisibility(0);
            ((vn90) n0o0Var.getValue()).A(iun.f15405a);
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        op90 op90Var = (op90) obj;
        zo90 zo90Var = (zo90) this.f41192a;
        fl70 fl70Var = zo90.p2;
        zo90Var.getClass();
        np90 np90Var = np90.f23901a;
        if (!Intrinsics.d(op90Var, np90Var)) {
            if (op90Var instanceof mp90) {
                mp90 mp90Var = (mp90) op90Var;
                phf0 phf0Var = zo90Var.n2;
                iiy[] iiyVarArr = zo90.q2;
                String strN = phf0Var.n(zo90Var, iiyVarArr[2]);
                if (strN.length() == 0) {
                    strN = "KEY_PICKER_MODEL_REQUEST";
                }
                vcc.f0(i120.V(new Pair(strN, Integer.valueOf(mp90Var.f22167a)), new Pair("PICKER_PARAMS_KEY", (PickerParams) zo90Var.m2.n(zo90Var, iiyVarArr[1]))), zo90Var, strN);
                p7m0 p7m0Var = zo90Var.W0().k;
                p7m0Var.getClass();
                p7m0Var.o(null, np90Var);
                zo90Var.x0();
            } else {
                if (!(op90Var instanceof lp90)) {
                    t9f.b();
                    return null;
                }
                lp90 lp90Var = (lp90) op90Var;
                vcc.f0(i120.V(new Pair("KEY_PICKER_COUNTRY_ID_REQUEST", Integer.valueOf(lp90Var.f20429a)), new Pair("KEY_PICKER_COUNTRY_ALLOWED_REQUEST", Boolean.valueOf(lp90Var.b))), zo90Var, "KEY_PICKER_COUNTRY_ID_REQUEST");
                p7m0 p7m0Var2 = zo90Var.W0().k;
                p7m0Var2.getClass();
                p7m0Var2.o(null, np90Var);
                zo90Var.x0();
            }
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2) {
        kla0 kla0Var = (kla0) obj;
        vka0 vka0Var = (vka0) this.f41192a;
        nh70 nh70Var = vka0.R1;
        vka0Var.getClass();
        if (kla0Var != null) {
            if (kla0Var instanceof jla0) {
                tha0 tha0Var = new tha0();
                androidx.fragment.app.e eVarC = vka0Var.C();
                eVarC.getClass();
                sj3.D0(tha0Var, eVarC);
            } else if (kla0Var instanceof ila0) {
                kia0 kia0Var = new kia0();
                androidx.fragment.app.e eVarC2 = vka0Var.C();
                eVarC2.getClass();
                sj3.D0(kia0Var, eVarC2);
            }
            ((k3t0) vka0Var.P1.getValue()).x(jka0.f16658a);
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object m(Object obj, Object obj2) {
        oma0 oma0Var = (oma0) obj;
        ema0 ema0Var = (ema0) this.f41192a;
        xi70 xi70Var = ema0.R1;
        ema0Var.getClass();
        if (oma0Var != null) {
            if (oma0Var instanceof nma0) {
                String str = ((nma0) oma0Var).f23762a;
                uia0.n2.getClass();
                uia0 uia0Var = new uia0();
                uia0Var.m2.x(uia0Var, uia0.o2[0], str);
                androidx.fragment.app.e eVarC = ema0Var.C();
                eVarC.getClass();
                sj3.D0(uia0Var, eVarC);
            } else if (oma0Var instanceof mma0) {
                String str2 = ((mma0) oma0Var).f22028a;
                lja0.n2.getClass();
                lja0 lja0Var = new lja0();
                lja0Var.m2.x(lja0Var, lja0.o2[0], str2);
                androidx.fragment.app.e eVarC2 = ema0Var.C();
                eVarC2.getClass();
                sj3.D0(lja0Var, eVarC2);
            }
            ((k3t0) ema0Var.P1.getValue()).x(aka0.f1013a);
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object o(Object obj, Object obj2) {
        ((f1b0) this.f41192a).Q((Throwable) obj);
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2) {
        ((f1b0) this.f41192a).Q((Throwable) obj);
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2) {
        ((f1b0) this.f41192a).Q((Throwable) obj);
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2) {
        n4b0 n4b0Var = (n4b0) obj;
        d4b0 d4b0Var = (d4b0) this.f41192a;
        jh70 jh70Var = d4b0.S1;
        d4b0Var.getClass();
        if (n4b0Var != null) {
            int i = 0;
            if (n4b0Var instanceof j4b0) {
                ArrayList arrayList = ((j4b0) n4b0Var).f15877a;
                d4b0Var.H0().b.setVisibility(8);
                if (d4b0Var.H0().d.b.getVisibility() == 0) {
                    d4b0Var.G0().B(arrayList, new wss(d4b0Var, (byte) 17));
                } else {
                    d4b0Var.G0().A(arrayList);
                }
                y3b0 y3b0Var = d4b0Var.P1;
                if (y3b0Var != null) {
                    ArrayList arrayList2 = new ArrayList();
                    IntRange intRange = null;
                    for (Object obj3 : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        p6t0 p6t0Var = (p6t0) obj3;
                        if (((Boolean) ((kma0) y3b0Var.l).invoke(p6t0Var)).booleanValue()) {
                            if (intRange != null) {
                                arrayList2.add(intRange);
                            }
                            intRange = new IntRange(i, i, 1);
                        } else if (!((Boolean) ((kma0) y3b0Var.m).invoke(p6t0Var)).booleanValue()) {
                            if (intRange != null) {
                                arrayList2.add(intRange);
                            }
                            intRange = null;
                        } else if (intRange != null) {
                            intRange = new IntRange(intRange.f46068a, i, 1);
                        }
                        i = i2;
                    }
                    if (intRange != null) {
                        arrayList2.add(intRange);
                    }
                    y3b0Var.h = arrayList2;
                }
            } else {
                byte b = 12;
                if (n4b0Var instanceof k4b0) {
                    jkm jkmVar = ((k4b0) n4b0Var).b;
                    d4b0Var.I0();
                    d4b0Var.G0().A(iun.f15405a);
                    DSLottieEmptyContainer dSLottieEmptyContainer = d4b0Var.H0().b;
                    int i3 = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh(b));
                    d4b0Var.H0().b.setVisibility(0);
                } else if (n4b0Var instanceof m4b0) {
                    jkm jkmVar2 = ((m4b0) n4b0Var).f21160a;
                    d4b0Var.I0();
                    d4b0Var.G0().A(iun.f15405a);
                    DSLottieEmptyContainer dSLottieEmptyContainer2 = d4b0Var.H0().b;
                    int i4 = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer2.b(jkmVar2, 10000L, new bmh(b));
                    d4b0Var.H0().b.setVisibility(0);
                } else if (n4b0Var instanceof l4b0) {
                    if (((l4b0) n4b0Var).f19396a) {
                        d4b0Var.H0().d.b.setVisibility(0);
                        x0x.s(d4b0Var.H0().d.b);
                        d4b0Var.H0().b.setVisibility(8);
                        d4b0Var.G0().A(iun.f15405a);
                    } else {
                        d4b0Var.I0();
                    }
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object v(Object obj, Object obj2) {
        h4b0 h4b0Var = (h4b0) obj;
        d4b0 d4b0Var = (d4b0) this.f41192a;
        jh70 jh70Var = d4b0.S1;
        if (h4b0Var == null) {
            d4b0Var.getClass();
            t9f.b();
            return null;
        }
        int i = h4b0Var.f12427a;
        wdk0 wdk0Var = d4b0Var.K1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        rek0 rek0Var = rek0.b;
        String strH = d4b0Var.H(i);
        strH.getClass();
        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), d4b0Var, null, null, false, null, 1020);
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2) {
        d5b0 d5b0Var = (d5b0) obj;
        w4b0 w4b0Var = (w4b0) this.f41192a;
        nh70 nh70Var = w4b0.Q1;
        w4b0Var.getClass();
        if (d5b0Var != null) {
            if (d5b0Var instanceof z4b0) {
                ArrayList arrayList = ((z4b0) d5b0Var).f43763a;
                w4b0Var.H0().b.setVisibility(8);
                if (w4b0Var.H0().d.b.getVisibility() == 0) {
                    w4b0Var.G0().B(arrayList, new wss(w4b0Var, (byte) 18));
                } else {
                    w4b0Var.G0().A(arrayList);
                }
            } else {
                byte b = 12;
                if (d5b0Var instanceof a5b0) {
                    jkm jkmVar = ((a5b0) d5b0Var).b;
                    w4b0Var.I0();
                    w4b0Var.G0().A(iun.f15405a);
                    DSLottieEmptyContainer dSLottieEmptyContainer = w4b0Var.H0().b;
                    int i = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh(b));
                    w4b0Var.H0().b.setVisibility(0);
                } else if (d5b0Var instanceof c5b0) {
                    jkm jkmVar2 = ((c5b0) d5b0Var).f3763a;
                    w4b0Var.I0();
                    w4b0Var.G0().A(iun.f15405a);
                    DSLottieEmptyContainer dSLottieEmptyContainer2 = w4b0Var.H0().b;
                    int i2 = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer2.b(jkmVar2, 10000L, new bmh(b));
                    w4b0Var.H0().b.setVisibility(0);
                } else if (d5b0Var instanceof b5b0) {
                    if (((b5b0) d5b0Var).f1995a) {
                        w4b0Var.G0().A(iun.f15405a);
                        w4b0Var.H0().d.b.setVisibility(0);
                        x0x.s(w4b0Var.H0().d.b);
                        w4b0Var.H0().b.setVisibility(8);
                    } else {
                        w4b0Var.I0();
                    }
                }
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v188 */
    /* JADX WARN: Type inference failed for: r0v189 */
    /* JADX WARN: Type inference failed for: r0v195 */
    /* JADX WARN: Type inference failed for: r1v144 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        bi70 bi70Var;
        boolean z;
        Object value3;
        Object value4;
        Object value5;
        bby bbyVar;
        byte b = this.h;
        byte b2 = 25;
        boolean z2 = true;
        yje yjeVar = null;
         = 0;
         = 0;
         = 0;
        ?? r7 = 0;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                zy5 zy5Var = (zy5) obj;
                ji70 ji70Var = (ji70) obj3;
                p7m0 p7m0Var = ji70Var.w;
                mne mneVar = ji70Var.l;
                if (zy5Var != null) {
                    if (zy5Var instanceof sy5) {
                        sac.V(jiu0.a(ji70Var), new cf70(1, ji70Var, ji70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.b, new e3p(ji70Var, yjeVar, b2), 10);
                        ji70.C(ji70Var, 0L, 1);
                    } else if (zy5Var instanceof fle) {
                        ji70Var.o.a(((bi70) p7m0Var.getValue()).e);
                        sac.V(jiu0.a(ji70Var), ci70.f4399a, null, mneVar.f22085a, new ku60(ji70Var, fy5.f10344a, yjeVar, (byte) 21), 10);
                    } else if (zy5Var instanceof hle) {
                        ji70Var.B(true, ((hle) zy5Var).f13255a.f28916a);
                    } else if (zy5Var instanceof oy5) {
                        ji70.C(ji70Var, ((oy5) zy5Var).f26045a, 2);
                    } else if (zy5Var instanceof ry5) {
                        if (ji70Var.k.a() || ji70Var.u) {
                            ji70Var.D();
                        } else {
                            ji70.C(ji70Var, 0L, 3);
                        }
                    } else if (zy5Var instanceof ty5) {
                        ji70Var.D();
                    } else if (zy5Var instanceof ly5) {
                        double d = ((ly5) zy5Var).d;
                        double dA = ji70Var.f.a();
                        do {
                            value2 = p7m0Var.getValue();
                            bi70Var = (bi70) value2;
                            z = bi70Var.e >= Math.min(d, dA);
                        } while (!p7m0Var.m(value2, bi70.a(bi70Var, 0.0d, 0.0d, null, 0.0d, false, z, z, false, false, false, false, 7999)));
                    } else if (zy5Var instanceof mle) {
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, bi70.a((bi70) value, 0.0d, 0.0d, null, 0.0d, false, false, false, false, false, false, ji70Var.p.a() == vrs.f37917a, 2047)));
                    }
                }
                return Unit.f46060a;
            case 1:
                zy5 zy5Var2 = (zy5) obj;
                vi70 vi70Var = (vi70) obj3;
                vi70Var.getClass();
                if (zy5Var2 != null) {
                    if (zy5Var2 instanceof ple) {
                        for (gxo gxoVar : gxo.values()) {
                            qjj.W(jiu0.a(vi70Var), null, null, new ui70(vi70Var, gxoVar, vi70Var.e.a(gxoVar), null, (byte) 0), 3);
                        }
                    } else if (zy5Var2 instanceof lle) {
                        lle lleVar = (lle) zy5Var2;
                        qjj.W(jiu0.a(vi70Var), null, null, new ui70(vi70Var, lleVar.f20243a, lleVar.b, null, (byte) 0), 3);
                    } else if ((zy5Var2 instanceof ry5) || (zy5Var2 instanceof ty5) || (zy5Var2 instanceof tle) || (zy5Var2 instanceof yle) || (zy5Var2 instanceof xle)) {
                        vi70Var.x(new pi70(true));
                    } else if (zy5Var2 instanceof hy5) {
                        vi70Var.x(new pi70(!((hy5) zy5Var2).f13844a));
                    }
                }
                return Unit.f46060a;
            case 2:
                zy5 zy5Var3 = (zy5) obj;
                tj70 tj70Var = (tj70) obj3;
                spx spxVar = tj70Var.g;
                oqt oqtVar = tj70Var.h;
                vcu vcuVar = tj70Var.f;
                if (zy5Var3 != null) {
                    if (zy5Var3 instanceof ele) {
                        tj70Var.A(new ej70(((ele) zy5Var3).f7992a));
                    } else {
                        boolean z3 = zy5Var3 instanceof yy5;
                        hj70 hj70Var = hj70.f13148a;
                        if (z3) {
                            if (oqtVar.a()) {
                                tj70Var.A(hj70Var);
                            } else {
                                tj70Var.B(false);
                            }
                        } else if (zy5Var3 instanceof ry5) {
                            tj70Var.y();
                            tj70Var.B(true);
                            tj70Var.D();
                            tj70Var.E();
                        } else if (zy5Var3 instanceof ty5) {
                            tj70Var.y();
                            tj70Var.A(new kj70(tj70Var.c.a()));
                        } else if (zy5Var3 instanceof ly5) {
                            if (!oqtVar.a()) {
                                tj70Var.u = false;
                            }
                            tj70Var.B(true);
                            tj70Var.A(new ij70(tj70Var.d.f27431a.f26724a.e));
                            tj70Var.D();
                        } else if (zy5Var3 instanceof jle) {
                            if (oqtVar.a()) {
                                tj70Var.u = true;
                            }
                            if (vcuVar.a() != vrs.f37917a && (vcuVar.a() != vrs.b || !oqtVar.a())) {
                                z2 = false;
                            }
                            tj70Var.B(z2);
                            tj70Var.A(new fj70(oqtVar.a()));
                        } else if (zy5Var3 instanceof tle) {
                            tj70Var.B(true);
                        } else if (zy5Var3 instanceof iy5) {
                            z2 = ((iy5) zy5Var3).f15573a.f4905a.f3145a == esr.FREE_BET;
                            if ((spxVar.a() || vcuVar.a() != vrs.f37917a) && z2) {
                                tj70Var.A(hj70Var);
                            }
                        } else if (zy5Var3 instanceof ple) {
                            p7m0 p7m0Var2 = tj70Var.s;
                            Boolean bool = Boolean.TRUE;
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, bool);
                            if (!spxVar.a()) {
                                tj70Var.B(true);
                            } else if (oqtVar.a()) {
                                tj70Var.A(hj70Var);
                            } else {
                                tj70Var.B(false);
                            }
                            tj70Var.A(new lj70());
                        } else if (zy5Var3 instanceof vle) {
                            tj70Var.A(nj70.f23621a);
                        } else if (zy5Var3 instanceof mle) {
                            tj70Var.t = false;
                            tj70Var.z(new cj70(vcuVar.a() == vrs.f37917a));
                        } else if (zy5Var3 instanceof ky5) {
                            tj70Var.x();
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                zy5 zy5Var4 = (zy5) obj;
                jk70 jk70Var = (jk70) obj3;
                ztt zttVar = jk70Var.p;
                mne mneVar2 = jk70Var.e;
                dqx dqxVar = jk70Var.h;
                if (zy5Var4 != null) {
                    if (zy5Var4 instanceof my5) {
                        if (dqxVar.a()) {
                            jk70Var.w(zttVar.a().f4905a.f3145a);
                        }
                    } else if (zy5Var4 instanceof ly5) {
                        ly5 ly5Var = (ly5) zy5Var4;
                        esr esrVar = ly5Var.f;
                        jk70Var.w(esrVar);
                        jk70Var.j.a(jk70Var.A);
                        if (!jk70Var.s.a()) {
                            boolean z4 = ((jk70Var.q.a() && jk70Var.r.a()) || (dqxVar.a() && esrVar.a())) ? false : true;
                            p7m0 p7m0Var3 = jk70Var.z;
                            do {
                                value3 = p7m0Var3.getValue();
                            } while (!p7m0Var3.m(value3, ck70.a((ck70) value3, false, 0.0d, null, false, false, 0.0d, z4, false, 191)));
                        }
                        jk70Var.y(new zj70(true));
                        sac.V(jiu0.a(jk70Var), new gk70(1, jk70Var, jk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, mneVar2.f22085a, new ik70(jk70Var, ly5Var, null), 10);
                    } else if ((zy5Var4 instanceof fy5) || (zy5Var4 instanceof xy5)) {
                        jk70Var.w(zttVar.a().f4905a.f3145a);
                    } else if ((zy5Var4 instanceof yle) || (zy5Var4 instanceof tle) || (zy5Var4 instanceof zle) || (zy5Var4 instanceof xle)) {
                        jk70Var.y(new zj70(true));
                    } else if (zy5Var4 instanceof hle) {
                        sac.V(jiu0.a(jk70Var), new gk70(1, jk70Var, jk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, mneVar2.f22085a, new hk70(jk70Var, ((hle) zy5Var4).f13255a.f28916a, (yje) null), 10);
                    }
                }
                return Unit.f46060a;
            case 4:
                zy5 zy5Var5 = (zy5) obj;
                yk70 yk70Var = (yk70) obj3;
                ztt zttVar2 = yk70Var.p;
                mne mneVar3 = yk70Var.e;
                dqx dqxVar2 = yk70Var.h;
                if (zy5Var5 != null) {
                    if (zy5Var5 instanceof my5) {
                        if (dqxVar2.a()) {
                            yk70Var.w(zttVar2.a().f4905a.f3145a);
                        }
                    } else if (zy5Var5 instanceof ly5) {
                        ly5 ly5Var2 = (ly5) zy5Var5;
                        esr esrVar2 = ly5Var2.f;
                        yk70Var.w(esrVar2);
                        yk70Var.j.a(yk70Var.z);
                        if (!yk70Var.s.a()) {
                            boolean z5 = ((yk70Var.q.a() && yk70Var.r.a()) || (dqxVar2.a() && esrVar2.a())) ? false : true;
                            p7m0 p7m0Var4 = yk70Var.y;
                            do {
                                value4 = p7m0Var4.getValue();
                            } while (!p7m0Var4.m(value4, sk70.a((sk70) value4, false, 0.0d, null, false, false, 0.0d, z5, 63)));
                        }
                        yk70Var.y(new pk70(true));
                        sac.V(jiu0.a(yk70Var), new gk70(1, yk70Var, yk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, mneVar3.f22085a, new xk70(yk70Var, ly5Var2, (yje) null), 10);
                    } else if ((zy5Var5 instanceof fy5) || (zy5Var5 instanceof xy5)) {
                        yk70Var.w(zttVar2.a().f4905a.f3145a);
                    } else if ((zy5Var5 instanceof yle) || (zy5Var5 instanceof tle) || (zy5Var5 instanceof zle) || (zy5Var5 instanceof xle)) {
                        yk70Var.y(new pk70(true));
                    } else if (zy5Var5 instanceof hle) {
                        sac.V(jiu0.a(yk70Var), new gk70(1, yk70Var, yk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar3.f22085a, new hk70(yk70Var, ((hle) zy5Var5).f13255a.f28916a, (yje) null), 10);
                    }
                }
                return Unit.f46060a;
            case 5:
                zy5 zy5Var6 = (zy5) obj;
                ol70 ol70Var = (ol70) obj3;
                ol70Var.getClass();
                if (zy5Var6 != null) {
                    if (zy5Var6 instanceof ple) {
                        for (gxo gxoVar2 : gxo.values()) {
                            ol70Var.x(gxoVar2, ol70Var.d.a(gxoVar2));
                        }
                    } else if (zy5Var6 instanceof lle) {
                        lle lleVar2 = (lle) zy5Var6;
                        ol70Var.x(lleVar2.f20243a, lleVar2.b);
                    } else if ((zy5Var6 instanceof ry5) || (zy5Var6 instanceof ty5) || (zy5Var6 instanceof tle) || (zy5Var6 instanceof yle) || (zy5Var6 instanceof xle)) {
                        ol70Var.z(new il70(true));
                    } else if (zy5Var6 instanceof hy5) {
                        ol70Var.z(new il70(!((hy5) zy5Var6).f13844a));
                    }
                }
                return Unit.f46060a;
            case 6:
                zy5 zy5Var7 = (zy5) obj;
                nm70 nm70Var = (nm70) obj3;
                boolean z6 = nm70Var.m;
                vcu vcuVar2 = nm70Var.f;
                oqt oqtVar2 = nm70Var.i;
                if (zy5Var7 != null) {
                    if (zy5Var7 instanceof ele) {
                        nm70Var.B(new yl70(((ele) zy5Var7).f7992a));
                    } else if (zy5Var7 instanceof yy5) {
                        nm70Var.x();
                    } else if (zy5Var7 instanceof ry5) {
                        nm70Var.z();
                        nm70Var.C(true);
                        nm70Var.E();
                        nm70Var.F();
                    } else if (zy5Var7 instanceof ty5) {
                        nm70Var.z();
                        nm70Var.B(new em70(nm70Var.c.a()));
                    } else if (zy5Var7 instanceof ly5) {
                        if (!oqtVar2.a()) {
                            nm70Var.x = false;
                        }
                        nm70Var.C(true);
                        nm70Var.B(new cm70(nm70Var.d.f27431a.f26724a.e));
                        nm70Var.E();
                    } else if (zy5Var7 instanceof jle) {
                        if (oqtVar2.a()) {
                            nm70Var.x = true;
                        }
                        if (vcuVar2.a() != vrs.f37917a && (vcuVar2.a() != vrs.b || !oqtVar2.a())) {
                            z2 = false;
                        }
                        nm70Var.C(z2);
                        nm70Var.B(new zl70(oqtVar2.a()));
                    } else if (zy5Var7 instanceof tle) {
                        nm70Var.C(true);
                    } else if (zy5Var7 instanceof iy5) {
                        ?? r0 = ((iy5) zy5Var7).f15573a.f4905a.f3145a == esr.FREE_BET;
                        ?? r4 = vcuVar2.a() == vrs.f37917a;
                        boolean zA = vcuVar2.a().a();
                        ?? r1 = z6 && !r0 == true;
                        if (nm70Var.e.a() && r0 == false && (r4 != false || (zA && oqtVar2.a()))) {
                            r7 = 1;
                        }
                        if (r4 == false && r1 == false) {
                            nm70Var.B(bm70.f2825a);
                        }
                        if (r1 != false) {
                            if (r7 != 0 && !nm70Var.w) {
                                nm70Var.B(new dm70(true));
                                nm70Var.B(new yl70(nm70Var.j.a()));
                                nm70Var.D();
                            }
                            nm70Var.C(true);
                        }
                    } else if (zy5Var7 instanceof ple) {
                        p7m0 p7m0Var5 = nm70Var.v;
                        Boolean bool2 = Boolean.TRUE;
                        p7m0Var5.getClass();
                        p7m0Var5.o(null, bool2);
                        if (nm70Var.g.a()) {
                            nm70Var.x();
                        } else {
                            nm70Var.C(true);
                        }
                        nm70Var.B(new fm70());
                    } else if (zy5Var7 instanceof vle) {
                        nm70Var.B(hm70.f13294a);
                    } else if (zy5Var7 instanceof mle) {
                        nm70Var.w = false;
                        if (vcuVar2.a() != vrs.f37917a && !z6) {
                            z2 = false;
                        }
                        nm70Var.A(new wl70(z2));
                    } else if (zy5Var7 instanceof ky5) {
                        nm70Var.y();
                    }
                }
                return Unit.f46060a;
            case 7:
                zy5 zy5Var8 = (zy5) obj;
                wm70 wm70Var = (wm70) obj3;
                wm70Var.getClass();
                itt ittVar = wm70Var.d;
                ztt zttVar3 = wm70Var.i;
                if (zy5Var8 != null) {
                    if (zy5Var8 instanceof ly5) {
                        wm70Var.e.a(zttVar3.a().f4905a.f3145a.a() ? 0.0d : ittVar.a());
                        ly5 ly5Var3 = (ly5) zy5Var8;
                        if (!wm70Var.l.a()) {
                            boolean z7 = ((wm70Var.j.a() && wm70Var.k.a()) || (wm70Var.c.a() && zttVar3.a().f4905a.f3145a.a())) ? false : true;
                            p7m0 p7m0Var6 = wm70Var.p;
                            do {
                                value5 = p7m0Var6.getValue();
                            } while (!p7m0Var6.m(value5, um70.a((um70) value5, false, 0.0d, null, false, false, 0.0d, 0, z7, 127)));
                        }
                        qjj.W(jiu0.a(wm70Var), null, null, new nf60(wm70Var, new tm70(true), yjeVar, b2), 3);
                        qjj.W(jiu0.a(wm70Var), wm70Var.n, null, new xk70(wm70Var, ly5Var3, (yje) null), 2);
                    } else if ((zy5Var8 instanceof fy5) || (zy5Var8 instanceof xy5)) {
                        if (!zttVar3.a().f4905a.f3145a.a()) {
                            ittVar.a();
                        }
                    } else if ((zy5Var8 instanceof yle) || (zy5Var8 instanceof tle) || (zy5Var8 instanceof zle) || (zy5Var8 instanceof xle)) {
                        qjj.W(jiu0.a(wm70Var), null, null, new nf60(wm70Var, new tm70(true), yjeVar, b2), 3);
                    }
                }
                return Unit.f46060a;
            case 8:
                zy5 zy5Var9 = (zy5) obj;
                to70 to70Var = (to70) obj3;
                ztt zttVar4 = to70Var.n;
                p7m0 p7m0Var7 = to70Var.W;
                oqt oqtVar3 = to70Var.i;
                if (zy5Var9 != null) {
                    if (zy5Var9 instanceof ry5) {
                        esr esrVar3 = zttVar4.a().f4905a.f3145a;
                        if (esrVar3 != esr.FREE_BET && esrVar3 != esr.WILD_FREE_BET) {
                            z2 = false;
                        }
                        to70Var.E(z2);
                    } else if (zy5Var9 instanceof iy5) {
                        iy5 iy5Var = (iy5) zy5Var9;
                        vcu vcuVar3 = to70Var.l;
                        if (vcuVar3.a() != vrs.c) {
                            esr esrVar4 = iy5Var.f15573a.f4905a.f3145a;
                            ?? r2 = esrVar4 == esr.FREE_BET || esrVar4 == esr.WILD_FREE_BET;
                            ?? r5 = vcuVar3.a() == vrs.b;
                            ?? r3 = vcuVar3.a() == vrs.f37917a;
                            y5s y5sVar = to70Var.z;
                            boolean z8 = (!r2 == true && (r3 == true || (y5sVar.b && r5 != false && oqtVar3.a()) == true)) || (y5sVar.e && r5 != false && r2 == false) == true;
                            ln70 ln70Var = new ln70(z8, (r2 != true || to70Var.s.a() || to70Var.t.a()) ? false : true);
                            p7m0Var7.getClass();
                            p7m0Var7.o(null, ln70Var);
                            to70Var.D(z8);
                        }
                    } else if (zy5Var9 instanceof wy5) {
                        on70 on70Var = new on70(((wy5) zy5Var9).f39960a);
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, on70Var);
                    } else if (zy5Var9 instanceof dme) {
                        to70Var.j.a(vpv0.b);
                        to70Var.F(go70.f11617a);
                    } else if (zy5Var9 instanceof bme) {
                        to70Var.F(fo70.f9868a);
                    } else if (zy5Var9 instanceof dle) {
                        dle dleVar = (dle) zy5Var9;
                        to70Var.S = sac.V(jiu0.a(to70Var), new gk70(1, to70Var, to70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, to70Var.g.b, new ro70(to70Var, dleVar.f6276a, dleVar.b, null), 10);
                    } else if (zy5Var9 instanceof jle) {
                        if (!oqtVar3.a() && (bbyVar = to70Var.S) != null) {
                            bbyVar.cancel(null);
                        }
                    } else if (zy5Var9 instanceof ty5) {
                        esr esrVar5 = ((ty5) zy5Var9).f34736a.f4905a.f3145a;
                        if (esrVar5 != esr.FREE_BET && esrVar5 != esr.WILD_FREE_BET) {
                            z2 = false;
                        }
                        if (z2) {
                            to70Var.k.f15165a.f26724a.g = false;
                            j5t.a(Boolean.FALSE, "instantBetVisibility");
                        }
                        to70Var.E(z2);
                    } else if (zy5Var9 instanceof yy5) {
                        pn70 pn70Var = new pn70(oqtVar3.a());
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, pn70Var);
                    } else if (zy5Var9 instanceof ly5) {
                        to70Var.T = (ly5) zy5Var9;
                        to70Var.G(!oqtVar3.a());
                        if (!zttVar4.a().a()) {
                            to70Var.w(new iy5(csr.e));
                        }
                    } else if (zy5Var9 instanceof yle) {
                        ql5 ql5VarA = to70Var.o.a();
                        to70Var.F(new do70(!(ql5VarA != null ? ql5VarA.i.a() : false)));
                    } else if (zy5Var9 instanceof xy5) {
                        if (((xy5) zy5Var9).f41691a) {
                            to70Var.w(new ile(false));
                            to70Var.F(ho70.f13381a);
                        } else {
                            to70Var.w(new ile(true));
                        }
                    } else if (zy5Var9 instanceof ule) {
                        to70Var.w(kle.f18481a);
                        to70Var.w(new iy5(to70Var.Q));
                        to70Var.F(new bo70(((ule) zy5Var9).f35868a));
                    } else if (zy5Var9 instanceof jy5) {
                        if (to70Var.U) {
                            to70Var.F(vn70.f37706a);
                            to70Var.U = false;
                        }
                    } else if (zy5Var9 instanceof zle) {
                        to70Var.F(eo70.f8126a);
                    } else if (zy5Var9 instanceof vy5) {
                        to70Var.D(false);
                    } else if (zy5Var9 instanceof sle) {
                        to70Var.F(new xn70(((sle) zy5Var9).f32395a));
                    }
                }
                return Unit.f46060a;
            case 9:
                return a(obj, obj2);
            case 10:
                return b(obj, obj2);
            case 11:
                ((ic80) obj3).A((List) obj);
                return Unit.f46060a;
            case 12:
                ((sio0) obj3).A((List) obj);
                return Unit.f46060a;
            case 13:
                ((fk80) obj3).c((Throwable) obj);
                return Unit.f46060a;
            case 14:
                d990 d990Var = (d990) obj;
                o890 o890Var = (o890) obj3;
                jh70 jh70Var = o890.f2;
                o890Var.getClass();
                if (Intrinsics.d(d990Var, d990.f5690a)) {
                    o890Var.I0(false);
                } else {
                    if (!Intrinsics.d(d990Var, d990.b)) {
                        t9f.b();
                        return null;
                    }
                    o890Var.I0(true);
                }
                return Unit.f46060a;
            case 15:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((rhy) obj3).set(bool3);
                return Unit.f46060a;
            case 16:
                rj90 rj90Var = (rj90) obj;
                aj90 aj90Var = (aj90) obj3;
                fl70 fl70Var = aj90.S1;
                aj90Var.getClass();
                if (Intrinsics.d(rj90Var, pj90.f27078a)) {
                    aj90Var.G0().e.setVisibility(0);
                    aj90Var.G0().b.setVisibility(8);
                } else {
                    if (!(rj90Var instanceof qj90)) {
                        t9f.b();
                        return null;
                    }
                    aj90Var.G0().b.v(((qj90) rj90Var).f28827a);
                    aj90Var.G0().e.setVisibility(8);
                    aj90Var.G0().b.setVisibility(0);
                }
                return Unit.f46060a;
            case 17:
                aj90 aj90Var2 = (aj90) obj3;
                fl70 fl70Var2 = aj90.S1;
                RecyclerView recyclerView = aj90Var2.G0().e;
                a8z a8zVar = aj90Var2.R1;
                recyclerView.setAdapter((ti90) a8zVar.getValue());
                ((ti90) a8zVar.getValue()).A((List) obj);
                aj90Var2.G0().e.setVisibility(0);
                return Unit.f46060a;
            case 18:
                return g(obj, obj2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h(obj, obj2);
            case 20:
                return i(obj, obj2);
            case 21:
                return l(obj, obj2);
            case 22:
                return m(obj, obj2);
            case 23:
                return o(obj, obj2);
            case 24:
                return r(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return s(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return v(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return w(obj, obj2);
            default:
                b8b0 b8b0Var = (b8b0) obj;
                u6b0 u6b0Var = (u6b0) obj3;
                xi70 xi70Var = u6b0.e2;
                u6b0Var.getClass();
                if (b8b0Var instanceof a8b0) {
                    a8b0 a8b0Var = (a8b0) b8b0Var;
                    String strValueOf = String.valueOf(a8b0Var.f419a);
                    boolean z9 = a8b0Var.b;
                    ii iiVar = u6b0Var.S1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = u6b0Var.H(R.string.min_age_alert_title_attention);
                    String strI = z9 ? u6b0Var.I(R.string.min_age_casino_alert_message_v2, strValueOf) : u6b0Var.I(R.string.min_age_alert_with_params_message_v2, strValueOf);
                    String strH2 = u6b0Var.H(R.string.min_age_alert_accept);
                    strH2.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strI, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = u6b0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                    p7m0 p7m0Var8 = u6b0Var.J0().K0;
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, z7b0.f43910a);
                }
                return Unit.f46060a;
        }
    }
}
