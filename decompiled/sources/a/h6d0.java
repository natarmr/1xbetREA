package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/h6d0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h6d0 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public fiu0 M1;
    public ii N1;
    public final kiu0 O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(h6d0.class, "viewBinding", "getViewBinding()Lorg/xplatform/proxy/impl/databinding/FragmentProxySettingsBinding;", 0)};
    public static final nh70 Q1 = new nh70();

    public h6d0() {
        super(R.layout.fragment_proxy_settings);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        f6d0 f6d0Var = new f6d0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 1), (byte) 2));
        this.O1 = agc.G(this, sre0.f32672a.b(r6d0.class), new ync0(a8zVarA, (byte) 4), new ync0(a8zVarA, (byte) 5), f6d0Var);
        this.P1 = ltt0.o(this, g6d0.f10758a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        DsNavigationBar dsNavigationBar = I0().d;
        String strH = H(R.string.proxy_settings_title);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        mc50.a(I0().d, new f6d0(this, (byte) 1));
        I0().f.setFilters(new InputFilter[]{new tpb((byte) 3)});
        H0(false);
        I0().c.setOnCheckedChangeListener(new oac(this, (byte) 4));
        uvw.R(I0().b, this, null);
        DsBottomBar.u(I0().b, new f6d0(this, (byte) 2));
        I0().e.setLabelText(H(R.string.password_title));
        ccq0.V(this, "PROXY_ERROR_DIALOG_KEY", new f6d0(this, (byte) 3));
        f6d0 f6d0Var = new f6d0(this, (byte) 4);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        ccq0.X(eVarC, "PROXY_ERROR_DIALOG_KEY", "THIRD", this, f6d0Var);
        C().u0("PROXY_CHECKING_DIALOG_REQUEST_KEY", this, new ex60(this, (byte) 16));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(i6d0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            i6d0 i6d0Var = (i6d0) (ze3Var instanceof i6d0 ? ze3Var : null);
            if (i6d0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                euc eucVar = i6d0Var.f14235a;
                pv00 pv00Var = i6d0Var.b;
                ntu ntuVar = i6d0Var.c;
                mne mneVar = i6d0Var.d;
                ii iiVar = i6d0Var.e;
                azj0 azj0Var = i6d0Var.f;
                s31 s31Var = i6d0Var.g;
                d1p d1pVar = i6d0Var.h;
                iiVar.getClass();
                eucVar.getClass();
                azj0Var.getClass();
                d1pVar.getClass();
                ru ruVar = new ru();
                ruVar.b = eucVar;
                ruVar.c = azj0Var;
                ruVar.f31100a = mneVar;
                ruVar.d = ntuVar;
                ruVar.e = pv00Var;
                ruVar.f = i1w0VarF;
                ruVar.g = s31Var;
                ruVar.h = d1pVar;
                ruVar.i = n0k0.a(new gji(ruVar, 1, (byte) 22));
                ruVar.j = new gji(ruVar, 0, (byte) 22);
                this.M1 = new fiu0(Collections.singletonMap(r6d0.class, (gji) ruVar.j));
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(i6d0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(J0().k);
        jjc0 jjc0Var = new jjc0(2, this, h6d0.class, "handleProxyState", "handleProxyState(Lorg/xplatform/proxy/presentation/ProxySettingsViewModel$ProxyState;)V", 4, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(xae0VarN, clzVarW, jjc0Var, (yje) null), 3);
    }

    public final void G0() {
        boolean z;
        Object value;
        bby bbyVar;
        CharSequence text = I0().g.getText();
        if ((text == null || StringsKt.W(text)) && I0().c.isChecked()) {
            I0().g.f(true);
            I0().g.setErrorText(H(R.string.empty_field));
            z = false;
        } else {
            z = true;
        }
        CharSequence text2 = I0().f.getText();
        if ((text2 == null || StringsKt.W(text2)) && I0().c.isChecked()) {
            I0().f.f(true);
            I0().f.setErrorText(H(R.string.empty_field));
            z = false;
        }
        if (!I0().c.isChecked()) {
            z = true;
        }
        if (z) {
            r6d0 r6d0VarJ0 = J0();
            boolean zIsChecked = I0().c.isChecked();
            u6d0 u6d0Var = u6d0.f35133a;
            String string = StringsKt.u0(String.valueOf(I0().g.getText())).toString();
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.u0(String.valueOf(I0().f.getText())).toString());
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            String string2 = StringsKt.u0(String.valueOf(I0().h.getText())).toString();
            String string3 = StringsKt.u0(String.valueOf(I0().e.getText())).toString();
            string.getClass();
            string2.getClass();
            string3.getClass();
            j6d0 j6d0Var = new j6d0(zIsChecked, u6d0Var, string, iIntValue, string2, string3);
            p7m0 p7m0Var = r6d0VarJ0.k;
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, o6d0.a((o6d0) value, j6d0Var, false, zIsChecked, 10)));
            if (!j6d0Var.f15979a) {
                r6d0VarJ0.z(j6d0Var);
                return;
            }
            bby bbyVar2 = r6d0VarJ0.j;
            if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = r6d0VarJ0.j) != null) {
                bbyVar.cancel(null);
            }
            r6d0VarJ0.j = sac.V(jiu0.a(r6d0VarJ0), new n6d0(r6d0VarJ0, (byte) 1), null, r6d0VarJ0.g.b, new q6d0(r6d0VarJ0, null, (byte) 0), 10);
        }
    }

    public final void H0(boolean z) {
        kxq kxqVarB;
        I0().b.setFirstButtonEnabled(z);
        if (!z && (kxqVarB = B()) != null) {
            View currentFocus = kxqVarB.getCurrentFocus();
            t32 t32Var = new t32((byte) 28);
            if (currentFocus != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b1(kxqVarB, currentFocus.getWindowToken(), t32Var, (byte) 2), 0L);
            }
        }
        for (DsTextField dsTextField : q3d.j(I0().g, I0().f, I0().h, I0().e)) {
            dsTextField.f(false);
            dsTextField.setErrorText(null);
            dsTextField.setEnabled(z);
            if (!z) {
                dsTextField.clearFocus();
            }
        }
    }

    public final i3r I0() {
        Object objN = this.P1.n(R1[0], this);
        objN.getClass();
        return (i3r) objN;
    }

    public final r6d0 J0() {
        return (r6d0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Object value;
        this.j1 = true;
        r6d0 r6d0VarJ0 = J0();
        boolean zIsChecked = I0().c.isChecked();
        u6d0 u6d0Var = u6d0.f35133a;
        String string = StringsKt.u0(String.valueOf(I0().g.getText())).toString();
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.u0(String.valueOf(I0().f.getText())).toString());
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        String string2 = StringsKt.u0(String.valueOf(I0().h.getText())).toString();
        String string3 = StringsKt.u0(String.valueOf(I0().e.getText())).toString();
        string.getClass();
        string2.getClass();
        string3.getClass();
        p7m0 p7m0Var = r6d0VarJ0.k;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, o6d0.a((o6d0) value, new j6d0(zIsChecked, u6d0Var, string, iIntValue, string2, string3), false, false, 14)));
        hxm0.m(I0().f14110a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(I0().f14110a);
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
