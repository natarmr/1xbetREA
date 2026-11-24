package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xpb;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xpb extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public fci M1;
    public gl5 N1;
    public ii O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(xpb.class, "binding", "getBinding()Lorg/xplatform/personal/impl/databinding/FragmentChangeLoginBinding;", 0)};
    public static final gl5 S1 = new gl5((byte) 22);

    public xpb() {
        super(R.layout.fragment_change_login);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        spb spbVar = new spb(this, (byte) 0);
        h79 h79Var = new h79(this, (byte) 16);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new h79(h79Var, (byte) 17));
        this.P1 = agc.G(this, sre0.f32672a.b(eqb.class), new wpb(a8zVarA, (byte) 0), new wpb(a8zVarA, (byte) 1), spbVar);
        this.Q1 = ltt0.o(this, upb.f36056a);
        this.R1 = maz.a(wezVar, new spb(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().c.b(new spb(this, (byte) 3));
        ccq0.V(this, "LOGIN_CHANGED_REQUEST_KEY", new spb(this, (byte) 4));
        uvw.R(G0().b, this, null);
        G0().b.setFirstButtonEnabled(false);
        DsBottomBar.u(G0().b, new spb(this, (byte) 2));
        G0().e.setErrorIconDrawable(epv0.U(R.drawable.ic_error_edit_profile, o0()));
        G0().e.setFilters((InputFilter[]) qx3.r(G0().e.getFilters(), new InputFilter[]{new tpb((byte) 0)}));
        G0().e.a((vpb) this.R1.getValue());
        G0().e.clearFocus();
        if (this.N1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new spb(this, (byte) 5), new lya(this, (byte) 11));
        if (bundle != null) {
            eqb eqbVarH0 = H0();
            String str = (String) eqbVarH0.b.a("SAVED_LOGIN_STATE_KEY");
            if (str != null) {
                eqbVarH0.t.f(str);
            }
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rpb.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rpb rpbVar = (rpb) (ze3Var instanceof rpb ? ze3Var : null);
            if (rpbVar != null) {
                oeg0 oeg0Var = rpbVar.f30878a;
                duj dujVar = rpbVar.b;
                cyh cyhVar = rpbVar.c;
                btt0 btt0Var = rpbVar.g;
                z4w0 z4w0Var = rpbVar.d;
                ii iiVar = rpbVar.k;
                ort ortVar = rpbVar.f;
                cad cadVar = rpbVar.i;
                m1e m1eVar = rpbVar.j;
                knf0 knf0Var = rpbVar.e;
                gii0 gii0Var = rpbVar.h;
                pru pruVar = rpbVar.l;
                ctf0 ctf0Var = rpbVar.m;
                rou rouVar = rpbVar.n;
                zg zgVar = rpbVar.o;
                au0 au0Var = rpbVar.p;
                iiVar.getClass();
                oeg0Var.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                this.M1 = (fci) ((n5d0) new h6i(zgVar, iiVar, au0Var, cadVar, m1eVar, cyhVar, dujVar, ortVar, rouVar, pruVar, knf0Var, ctf0Var, oeg0Var, gii0Var, btt0Var, z4w0Var).c).get();
                this.N1 = new gl5((byte) 17);
                this.O1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(rpb.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        eqb eqbVarH0 = H0();
        yje yjeVar = null;
        fnq fnqVar = new fnq(eqbVarH0.q, new d09((Object) eqbVarH0, yjeVar, (byte) 26));
        Class<xpb> cls = xpb.class;
        c48 c48Var = new c48(2, this, cls, "setNavigationBarTitle", "setNavigationBarTitle(Ljava/lang/String;)V", 4, (byte) 16);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yxa(fnqVar, clzVarW, c48Var, (yje) null), 3);
        qoj0 qoj0Var = H0().w;
        wib wibVar = new wib(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yxa(qoj0Var, clzVarW2, wibVar, (yje) null), 3);
        qoj0 qoj0Var2 = H0().v;
        c48 c48Var2 = new c48(2, this, cls, "showErrorMessage", "showErrorMessage(Ljava/lang/String;)V", 4, (byte) 17);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new yxa(qoj0Var2, clzVarW3, c48Var2, (yje) null, 0), 3);
        p7m0 p7m0Var = H0().r;
        c48 c48Var3 = new c48(2, this, cls, "showRequirements", "showRequirements(Ljava/lang/String;)V", 4, (byte) 18);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new yxa((gmq) p7m0Var, clzVarW4, c48Var3, (yje) null, (short) 0), 3);
        p7m0 p7m0Var2 = H0().u;
        c48 c48Var4 = new c48(2, this, cls, "showProgress", "showProgress(Z)V", 4, (byte) 19);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new yxa((gmq) p7m0Var2, clzVarW5, c48Var4, (yje) null, (byte) 0, false), 3);
        ol60 ol60Var = H0().t;
        c48 c48Var5 = new c48(2, this, cls, "setLogin", "setLogin(Ljava/lang/String;)V", 4, (byte) 20);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new yxa(ol60Var, clzVarW6, c48Var5, (yje) null, (byte) 0, (byte) 0), 3);
        eqb eqbVarH1 = H0();
        byte b = 2;
        fnq fnqVar2 = new fnq(eqbVarH1.s, new wib(eqbVarH1, yjeVar, b));
        c48 c48Var6 = new c48(2, this, cls, "setSaveButtonEnabled", "setSaveButtonEnabled(Z)V", 4, (byte) 21);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new yxa(fnqVar2, clzVarW7, c48Var6, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().p;
        fob fobVar = new fob(this, yjeVar, b);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new yxa((gmq) p7m0Var3, clzVarW8, fobVar, (yje) null, (byte) 0), 3);
        qoj0 qoj0Var3 = H0().x;
        c48 c48Var7 = new c48(2, this, cls, "showCaptchaDialog", "showCaptchaDialog(Lorg/xplatform/captcha/api/domain/model/CaptchaResult$UserActionRequired;)V", 4, (byte) 22);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new yxa((gmq) qoj0Var3, clzVarW9, c48Var7, (yje) null, (byte) 0, (char) 0), 3);
    }

    public final yyq G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (yyq) objN;
    }

    public final eqb H0() {
        return (eqb) this.P1.getValue();
    }

    public final void I0(boolean z) {
        ii iiVar = this.O1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String string = G().getString(R.string.attention);
        String strH = H(z ? R.string.login_changed_suc_esful_notify_res_0x7f130b50 : R.string.successful_login);
        String strH2 = H(R.string.ok);
        strH2.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) string, (CharSequence) strH, (CharSequence) strH2, (String) null, (String) null, "LOGIN_CHANGED_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().e.c((vpb) this.R1.getValue());
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        Context contextO0 = o0();
        View currentFocus = n0().getCurrentFocus();
        t32 t32Var = new t32((byte) 28);
        if (currentFocus != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new b1(contextO0, currentFocus.getWindowToken(), t32Var, (byte) 2), 0L);
        }
        n0().getWindow().setSoftInputMode(32);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        n0().getWindow().setSoftInputMode(16);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
