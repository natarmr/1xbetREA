package a;

import android.content.ComponentCallbacks2;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/ymd0;", "La/stl;", "La/r3r;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ymd0 extends stl<r3r> {
    public final nae0 g2 = ltt0.p(this, wmd0.f39402a);
    public fiu0 h2;
    public wdk0 i2;
    public final kiu0 j2;
    public final oac k2;
    public final n0o0 l2;
    public final z0i m2;
    public final phf0 n2;
    public static final /* synthetic */ iiy[] p2 = {new j0d0(ymd0.class, "binding", "getBinding()Lorg/xplatform/quickbet/impl/databinding/FragmentQuickBetDialogBinding;", 0), new ez40(ymd0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final fl70 o2 = new fl70();

    public ymd0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.umd0
            public final /* synthetic */ ymd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ymd0 ymd0Var = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = ymd0Var.h2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        fl70 fl70Var = ymd0.o2;
                        return new da0(new tmd0(ymd0Var, (byte) 1));
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 21), (byte) 22));
        this.j2 = agc.G(this, sre0.f32672a.b(tod0.class), new ync0(a8zVarA, (byte) 24), new ync0(a8zVarA, (byte) 25), function0);
        this.k2 = new oac(this, (byte) 5);
        final byte b2 = 1;
        this.l2 = maz.b(new Function0(this) { // from class: a.umd0
            public final /* synthetic */ ymd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ymd0 ymd0Var = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = ymd0Var.h2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        fl70 fl70Var = ymd0.o2;
                        return new da0(new tmd0(ymd0Var, (byte) 1));
                }
            }
        });
        this.m2 = new z0i(this, (byte) 3);
        this.n2 = new phf0("REQUEST_KEY");
    }

    @Override // a.stl
    public final void S0() {
        Window window;
        View decorView;
        String strH = H(R.string.one_click_bet_title);
        strH.getClass();
        I0(new kp8(strH, R.style.TextStyle_Title_Bold_M));
        Q0().c.setFilters(new InputFilter[]{new tjj(13, 2)});
        dyb.O(Q0().b, new tmd0(this, (byte) 0));
        Q0().e.setOnCheckedChangeListener(this.k2);
        DsPresetTextFieldBasic dsPresetTextFieldBasic = Q0().c;
        da0 da0Var = (da0) this.l2.getValue();
        da0Var.getClass();
        dsPresetTextFieldBasic.b.a(da0Var);
        Q0().c.setOnFocusChangeListener(new qd7(this, (byte) 4));
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
        kxq kxqVarB = B();
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new wss(this, (byte) 23));
        }
        Q0().d.requestFocus();
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(zmd0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            zmd0 zmd0Var = (zmd0) (ze3Var instanceof zmd0 ? ze3Var : null);
            if (zmd0Var != null) {
                a4n0.f(this).getClass();
                cad cadVar = zmd0Var.f44621a;
                ctf0 ctf0Var = zmd0Var.b;
                duj dujVar = zmd0Var.c;
                vwb0 vwb0Var = zmd0Var.h;
                fnd0 fnd0Var = zmd0Var.g;
                d1p d1pVar = zmd0Var.f;
                wsf0 wsf0Var = zmd0Var.d;
                wdk0 wdk0Var = zmd0Var.e;
                s31 s31Var = zmd0Var.i;
                d1pVar.getClass();
                vwb0Var.getClass();
                fnd0Var.getClass();
                ctf0Var.getClass();
                wdk0Var.getClass();
                this.h2 = new fiu0(Collections.singletonMap(tod0.class, (ppi) new rrd(cadVar, wsf0Var, d1pVar, fnd0Var, ctf0Var, dujVar, wdk0Var, s31Var).i));
                this.i2 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(zmd0.class, "Cannot create dependency "));
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final r3r Q0() {
        Object objN = this.g2.n(p2[0], this);
        objN.getClass();
        return (r3r) objN;
    }

    public final void W0(boolean z) {
        if (z) {
            gnm0.s(F());
        } else {
            gnm0.i(F());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        gnm0.i(F());
        vcc.f0(i120.U(), this, this.n2.n(this, p2[1]));
        this.j1 = true;
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        Q0().e.setOnCheckedChangeListener(null);
        n0().getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.m2);
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        if (Q0().e.isChecked()) {
            DsTextField dsTextField = Q0().c.b;
            TextView textView = dsTextField.getTextView();
            if (textView != null) {
                textView.clearFocus();
            }
            CharSequence text = dsTextField.getText();
            dsTextField.setSelection(text != null ? text.length() : 0);
        }
        this.j1 = true;
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void e0() throws Exception {
        super.e0();
        if (Q0().e.isChecked()) {
            Q0().c.a();
        }
        kiu0 kiu0Var = this.j2;
        ol60 ol60Var = ((tod0) kiu0Var.getValue()).n;
        yje yjeVar = null;
        xmd0 xmd0Var = new xmd0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(ol60Var, clzVarW, xmd0Var, (yje) null), 3);
        p7m0 p7m0Var = ((tod0) kiu0Var.getValue()).m;
        xmd0 xmd0Var2 = new xmd0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(p7m0Var, clzVarW2, xmd0Var2, (yje) null, (byte) 0), 3);
    }
}
