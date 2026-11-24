package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.responsible_game.impl.presentation.limits.deposit_limit.gambling_exam.models.DepositLimitScreenParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/u8k;", "La/yx5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u8k extends yx5 {
    public gfi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final khf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(u8k.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsDepositBinding;", 0), new ez40(u8k.class, "screenParams", "getScreenParams()Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;", 0)};
    public static final kwd Q1 = new kwd();

    public u8k() {
        super(R.layout.fragment_limits_deposit);
        r8k r8kVar = new r8k(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 26), (byte) 27));
        this.N1 = agc.G(this, sre0.f32672a.b(pak.class), new r7g(a8zVarA, (byte) 28), new r7g(a8zVarA, (byte) 29), r8kVar);
        this.O1 = ltt0.o(this, t8k.f33514a);
        this.P1 = new khf0("KEY_SCREEN_PARAMS");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        String strH;
        TextInputLayout textInputLayout = G0().e;
        final byte b = 1;
        int i = ((DepositLimitScreenParams) this.P1.n(this, R1[1])).f46893a;
        art artVar = LimitTypeEnum.b;
        if (i == 20) {
            strH = H(R.string.deposit_limit_day_enter_sum_euro);
            strH.getClass();
        } else if (i == 21) {
            String strH2 = H(R.string.deposit_limit_any_days_enter_sum_euro_v2);
            strH2.getClass();
            strH = String.format(strH2, Arrays.copyOf(new Object[]{7}, 1));
        } else if (i == 22) {
            String strH3 = H(R.string.deposit_limit_any_days_enter_sum_euro_v2);
            strH3.getClass();
            strH = String.format(strH3, Arrays.copyOf(new Object[]{30}, 1));
        } else {
            strH = "";
        }
        textInputLayout.setHint(strH);
        final byte b2 = 0;
        G0().f.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.s8k
            public final /* synthetic */ u8k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                u8k u8kVar = this.b;
                switch (b3) {
                    case 0:
                        kwd kwdVar = u8k.Q1;
                        i1w0 i1w0Var = ((pak) u8kVar.N1.getValue()).b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                        break;
                    default:
                        kwd kwdVar2 = u8k.Q1;
                        ii iiVar = u8kVar.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = u8kVar.H(R.string.caution);
                        String strH5 = u8kVar.H(R.string.change_the_limit_question);
                        strH5.getClass();
                        Spanned spannedFromHtml = Html.fromHtml(strH5, 0);
                        spannedFromHtml.getClass();
                        SpannableString spannableString = new SpannableString(spannedFromHtml);
                        String strH6 = u8kVar.H(R.string.yes);
                        strH6.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH4, (CharSequence) spannableString, (CharSequence) strH6, u8kVar.H(R.string.no), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = u8kVar.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        return;
                }
            }
        });
        G0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.s8k
            public final /* synthetic */ u8k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                u8k u8kVar = this.b;
                switch (b3) {
                    case 0:
                        kwd kwdVar = u8k.Q1;
                        i1w0 i1w0Var = ((pak) u8kVar.N1.getValue()).b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                        break;
                    default:
                        kwd kwdVar2 = u8k.Q1;
                        ii iiVar = u8kVar.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = u8kVar.H(R.string.caution);
                        String strH5 = u8kVar.H(R.string.change_the_limit_question);
                        strH5.getClass();
                        Spanned spannedFromHtml = Html.fromHtml(strH5, 0);
                        spannedFromHtml.getClass();
                        SpannableString spannableString = new SpannableString(spannedFromHtml);
                        String strH6 = u8kVar.H(R.string.yes);
                        strH6.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH4, (CharSequence) spannableString, (CharSequence) strH6, u8kVar.H(R.string.no), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = u8kVar.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        return;
                }
            }
        });
        G0().c.addTextChangedListener(new jt6(this, (byte) 5));
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new r8k(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v8k.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v8k v8kVar = (v8k) (ze3Var instanceof v8k ? ze3Var : null);
            if (v8kVar != null) {
                xio xioVar = v8kVar.f36988a;
                czz czzVar = v8kVar.b;
                duj dujVar = v8kVar.c;
                btt0 btt0Var = v8kVar.d;
                gii0 gii0Var = v8kVar.e;
                ii iiVar = v8kVar.f;
                dzz dzzVar = v8kVar.g;
                knf0 knf0Var = v8kVar.h;
                wdk0 wdk0Var = v8kVar.i;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                dzzVar.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                this.K1 = (gfi) ((n5d0) new rrd(iiVar, dujVar, xioVar, czzVar, dzzVar, knf0Var, gii0Var, wdk0Var, btt0Var).i).get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(v8k.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.N1;
        ol60 ol60Var = ((pak) kiu0Var.getValue()).g;
        e9g e9gVar = new e9g(this, null, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(ol60Var, clzVarW, e9gVar, (yje) null), 3);
        xae0 xae0VarN = vtb.N(((pak) kiu0Var.getValue()).f);
        hij hijVar = new hij(this, null, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj(xae0VarN, clzVarW2, hijVar, (yje) null), 3);
    }

    public final z0r G0() {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        return (z0r) objN;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Window window;
        View currentFocus;
        IBinder windowToken;
        kxq kxqVarB = B();
        if (kxqVarB != null && (currentFocus = kxqVarB.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            Context contextD = D();
            Object systemService = contextD != null ? contextD.getSystemService("input_method") : null;
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        kxq kxqVarB2 = B();
        if (kxqVarB2 != null && (window = kxqVarB2.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        if (Build.VERSION.SDK_INT <= 29) {
            n0().getWindow().setSoftInputMode(16);
        }
        super.e0();
    }
}
