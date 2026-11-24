package a;

import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qib0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qib0 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public final a8z N1;
    public final s0r O1;
    public final n0o0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(qib0.class, "viewBinding", "getViewBinding()Lorg/xplatform/popular/setting/impl/databinding/FragmentPopularSettingsBinding;", 0)};
    public static final rl70 Q1 = new rl70();

    public qib0() {
        super(R.layout.fragment_popular_settings);
        this.K1 = hnm0.f13359a;
        this.N1 = xbc.b0(this, sre0.f32672a.b(xib0.class), new nib0(this, (byte) 3));
        this.O1 = ltt0.o(this, pib0.f27035a);
        this.P1 = maz.b(new nib0(this, (byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setNavigationBarButtons(q3d.e(new hc50("REFRESH_BUTTON", ybg0.f42342a, R.drawable.ic_setting_refresh, new nib0(this, (byte) 0), 2032)));
        G0().b.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, o0())));
        mc50.a(G0().b, new nib0(this, (byte) 1));
        qcc.X(this, new nib0(this, (byte) 2));
        byte b = 5;
        G0().c.m(new yrh(G().getDimensionPixelSize(R.dimen.space_4), G().getDimensionPixelSize(R.dimen.space_16), b));
        G0().c.setAdapter((iib0) this.P1.getValue());
        ccq0.V(this, "REQUEST_SET_DEFAULT_SETTINGS_DIALOG_KEY", new nib0(this, b));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sib0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sib0 sib0Var = (sib0) (ze3Var instanceof sib0 ? ze3Var : null);
            if (sib0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = sib0Var.f32255a;
                pru pruVar = sib0Var.b;
                ii iiVar = sib0Var.f;
                lbu lbuVar = sib0Var.c;
                v6j0 v6j0Var = sib0Var.d;
                ctf0 ctf0Var = sib0Var.e;
                q7d0 q7d0Var = sib0Var.g;
                kib0 kib0Var = sib0Var.h;
                ngb0 ngb0Var = sib0Var.i;
                nw20 nw20Var = sib0Var.j;
                dq00 dq00Var = sib0Var.k;
                kib0Var.getClass();
                ngb0Var.getClass();
                iiVar.getClass();
                q7d0Var.getClass();
                v6j0Var.getClass();
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(xib0.class, (eni) new o3c(cadVar, kib0Var, ngb0Var, iiVar, i1w0VarF, q7d0Var, pruVar, lbuVar, ctf0Var, nw20Var, dq00Var).k));
                this.M1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(sib0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() {
        k3t0 k3t0VarH0 = H0();
        final byte b = 0;
        Function1 function1 = new Function1(this) { // from class: a.oib0
            public final /* synthetic */ qib0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                qib0 qib0Var = this.b;
                switch (b2) {
                    case 0:
                        vib0 vib0Var = (vib0) obj;
                        rl70 rl70Var = qib0.Q1;
                        vib0Var.getClass();
                        ((iib0) qib0Var.P1.getValue()).A(vib0Var.f37471a);
                        return Unit.f46060a;
                    default:
                        tib0 tib0Var = (tib0) obj;
                        rl70 rl70Var2 = qib0.Q1;
                        tib0Var.getClass();
                        if (!tib0Var.equals(tib0.f34000a)) {
                            t9f.b();
                            return null;
                        }
                        ii iiVar = qib0Var.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = qib0Var.H(R.string.caution);
                        String strH2 = qib0Var.H(R.string.confirm_clear_all_popular_actions);
                        String strH3 = qib0Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, qib0Var.H(R.string.cancel), (String) null, "REQUEST_SET_DEFAULT_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = qib0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        qib0Var.H0().x(cib0.f4404a);
                        return Unit.f46060a;
                }
            }
        };
        final byte b2 = 1;
        Function1 function2 = new Function1(this) { // from class: a.oib0
            public final /* synthetic */ qib0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                qib0 qib0Var = this.b;
                switch (b3) {
                    case 0:
                        vib0 vib0Var = (vib0) obj;
                        rl70 rl70Var = qib0.Q1;
                        vib0Var.getClass();
                        ((iib0) qib0Var.P1.getValue()).A(vib0Var.f37471a);
                        return Unit.f46060a;
                    default:
                        tib0 tib0Var = (tib0) obj;
                        rl70 rl70Var2 = qib0.Q1;
                        tib0Var.getClass();
                        if (!tib0Var.equals(tib0.f34000a)) {
                            t9f.b();
                            return null;
                        }
                        ii iiVar = qib0Var.M1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = qib0Var.H(R.string.caution);
                        String strH2 = qib0Var.H(R.string.confirm_clear_all_popular_actions);
                        String strH3 = qib0Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, qib0Var.H(R.string.cancel), (String) null, "REQUEST_SET_DEFAULT_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = qib0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        qib0Var.H0().x(cib0.f4404a);
                        return Unit.f46060a;
                }
            }
        };
        lkz lkzVar = lkz.f20223a;
        Class<knx> cls = knx.class;
        qjj.W(x0x.Q(this.u1), null, null, new f8b0(k3t0VarH0.w(), this, new yn90(2, function1, cls, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 12), (yje) null), 3);
        gmq gmqVarC = ((i3t0) k3t0VarH0).C();
        qjj.W(x0x.Q(this.u1), null, null, new f8b0((i89) gmqVarC, this, new yn90(2, function2, cls, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 13), (yje) null), 3);
    }

    public final z2r G0() {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        return (z2r) objN;
    }

    public final k3t0 H0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
