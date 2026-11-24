package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.impl.presentation.password.change.input_password.PasswordChangeViewModel$ScreenUiState;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xz80;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xz80 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public ini M1;
    public gl5 N1;
    public ii O1;
    public wdk0 P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final yzn0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(xz80.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentChangePasswordBinding;", 0), new ez40(xz80.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0)};
    public static final xi70 U1 = new xi70();

    public xz80() {
        super(R.layout.fragment_change_password);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        sz80 sz80Var = new sz80(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 0), (byte) 1));
        this.Q1 = agc.G(this, sre0.f32672a.b(org.xplatform.security.impl.presentation.password.change.input_password.f.class), new ph70(a8zVarA, (byte) 28), new ph70(a8zVarA, (byte) 29), sz80Var);
        this.R1 = ltt0.o(this, uz80.f36525a);
        this.S1 = new yzn0("EXTRA_NAVIGATION_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().d.setTitle(H(R.string.change_password_title));
        G0().d.b(new sz80(this, (byte) 3));
        ccq0.V(this, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", new cz60(0, H0(), org.xplatform.security.impl.presentation.password.change.input_password.f.class, "onTokenExpiredConfirmed", "onTokenExpiredConfirmed()V", 0, (byte) 14));
        if (this.N1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        final byte b = 2;
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new sz80(this, (byte) 4), new Function1(this) { // from class: a.tz80
            public final /* synthetic */ xz80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                xz80 xz80Var = this.b;
                switch (b2) {
                    case 0:
                        Editable editable = (Editable) obj;
                        xi70 xi70Var = xz80.U1;
                        editable.getClass();
                        org.xplatform.security.impl.presentation.password.change.input_password.f fVarH0 = xz80Var.H0();
                        vzg0 vzg0Var = fVarH0.b;
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = fVarH0.o;
                        Boolean boolValueOf = Boolean.valueOf(string.length() > 0);
                        p7m0Var.getClass();
                        p7m0Var.o(null, boolValueOf);
                        if (string.length() == 0) {
                            vzg0Var.e("current_password_key", PasswordChangeViewModel$ScreenUiState.Default.b);
                        } else if (!Intrinsics.d(((PasswordChangeViewModel$ScreenUiState) fVarH0.n.f40549a.getValue()).getF46956a(), string)) {
                            vzg0Var.e("current_password_key", new PasswordChangeViewModel$ScreenUiState.PasswordInputted(string));
                        }
                        break;
                    case 1:
                        xi70 xi70Var2 = xz80.U1;
                        ((View) obj).getClass();
                        org.xplatform.security.impl.presentation.password.change.input_password.f fVarH1 = xz80Var.H0();
                        mxg0 mxg0Var = fVarH1.e;
                        pwf0 pwf0Var = pwf0.f27709a;
                        mxg0Var.b();
                        i1w0 i1w0Var = fVarH1.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenG0 = fVarH1.f.G0(fVarH1.d);
                        if (fragmentScreenG0 instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG0)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG0)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        xi70 xi70Var3 = xz80.U1;
                        iqt0Var.getClass();
                        xz80Var.H0().j.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        });
        uvw.R(G0().c, this, null);
        final byte b2 = 0;
        G0().f.a(new da0(new Function1(this) { // from class: a.tz80
            public final /* synthetic */ xz80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                xz80 xz80Var = this.b;
                switch (b3) {
                    case 0:
                        Editable editable = (Editable) obj;
                        xi70 xi70Var = xz80.U1;
                        editable.getClass();
                        org.xplatform.security.impl.presentation.password.change.input_password.f fVarH0 = xz80Var.H0();
                        vzg0 vzg0Var = fVarH0.b;
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = fVarH0.o;
                        Boolean boolValueOf = Boolean.valueOf(string.length() > 0);
                        p7m0Var.getClass();
                        p7m0Var.o(null, boolValueOf);
                        if (string.length() == 0) {
                            vzg0Var.e("current_password_key", PasswordChangeViewModel$ScreenUiState.Default.b);
                        } else if (!Intrinsics.d(((PasswordChangeViewModel$ScreenUiState) fVarH0.n.f40549a.getValue()).getF46956a(), string)) {
                            vzg0Var.e("current_password_key", new PasswordChangeViewModel$ScreenUiState.PasswordInputted(string));
                        }
                        break;
                    case 1:
                        xi70 xi70Var2 = xz80.U1;
                        ((View) obj).getClass();
                        org.xplatform.security.impl.presentation.password.change.input_password.f fVarH1 = xz80Var.H0();
                        mxg0 mxg0Var = fVarH1.e;
                        pwf0 pwf0Var = pwf0.f27709a;
                        mxg0Var.b();
                        i1w0 i1w0Var = fVarH1.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenG0 = fVarH1.f.G0(fVarH1.d);
                        if (fragmentScreenG0 instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG0)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG0)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        xi70 xi70Var3 = xz80.U1;
                        iqt0Var.getClass();
                        xz80Var.H0().j.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        }));
        DsBottomBar.u(G0().c, new sz80(this, b));
        final byte b3 = 1;
        dyb.O(G0().b, new Function1(this) { // from class: a.tz80
            public final /* synthetic */ xz80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                xz80 xz80Var = this.b;
                switch (b4) {
                    case 0:
                        Editable editable = (Editable) obj;
                        xi70 xi70Var = xz80.U1;
                        editable.getClass();
                        org.xplatform.security.impl.presentation.password.change.input_password.f fVarH0 = xz80Var.H0();
                        vzg0 vzg0Var = fVarH0.b;
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = fVarH0.o;
                        Boolean boolValueOf = Boolean.valueOf(string.length() > 0);
                        p7m0Var.getClass();
                        p7m0Var.o(null, boolValueOf);
                        if (string.length() == 0) {
                            vzg0Var.e("current_password_key", PasswordChangeViewModel$ScreenUiState.Default.b);
                        } else if (!Intrinsics.d(((PasswordChangeViewModel$ScreenUiState) fVarH0.n.f40549a.getValue()).getF46956a(), string)) {
                            vzg0Var.e("current_password_key", new PasswordChangeViewModel$ScreenUiState.PasswordInputted(string));
                        }
                        break;
                    case 1:
                        xi70 xi70Var2 = xz80.U1;
                        ((View) obj).getClass();
                        org.xplatform.security.impl.presentation.password.change.input_password.f fVarH1 = xz80Var.H0();
                        mxg0 mxg0Var = fVarH1.e;
                        pwf0 pwf0Var = pwf0.f27709a;
                        mxg0Var.b();
                        i1w0 i1w0Var = fVarH1.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenG0 = fVarH1.f.G0(fVarH1.d);
                        if (fragmentScreenG0 instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG0)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG0)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        iqt0 iqt0Var = (iqt0) obj;
                        xi70 xi70Var3 = xz80.U1;
                        iqt0Var.getClass();
                        xz80Var.H0().j.a(iqt0Var);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rz80.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rz80 rz80Var = (rz80) (ze3Var instanceof rz80 ? ze3Var : null);
            if (rz80Var != null) {
                we50 we50Var = (we50) this.S1.n(this, V1[1]);
                fsd fsdVar = rz80Var.f31346a;
                oeg0 oeg0Var = rz80Var.b;
                duj dujVar = rz80Var.c;
                ii iiVar = rz80Var.e;
                cad cadVar = rz80Var.d;
                cyh cyhVar = rz80Var.f;
                z4w0 z4w0Var = rz80Var.g;
                ort ortVar = rz80Var.h;
                m1e m1eVar = rz80Var.i;
                lef0 lef0Var = rz80Var.j;
                wdk0 wdk0Var = rz80Var.k;
                knf0 knf0Var = rz80Var.l;
                at4 at4Var = rz80Var.m;
                btt0 btt0Var = rz80Var.n;
                gii0 gii0Var = rz80Var.o;
                zn00 zn00Var = rz80Var.p;
                iiVar.getClass();
                fsdVar.getClass();
                oeg0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                knf0Var.getClass();
                at4Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = we50Var;
                ruVar.e = lef0Var;
                ruVar.f = zn00Var;
                ruVar.g = ortVar;
                ruVar.c = cyhVar;
                ruVar.d = z4w0Var;
                ruVar.i = cadVar;
                ruVar.b = dujVar;
                ruVar.h = m1eVar;
                ruVar.j = n0k0.a(new eni(ruVar, (byte) 4));
                this.M1 = (ini) ((n5d0) ruVar.j).get();
                this.N1 = new gl5((byte) 17);
                this.O1 = iiVar;
                this.P1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(rz80.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0Var = H0().n;
        org.xplatform.security.impl.presentation.password.change.input_password.a aVar = new org.xplatform.security.impl.presentation.password.change.input_password.a(this, null);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zm70(xae0Var, clzVarW, aVar, (yje) null), 3);
        p7m0 p7m0Var = H0().o;
        vz80 vz80Var = new vz80(this, null, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zm70(p7m0Var, clzVarW2, vz80Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().m;
        vz80 vz80Var2 = new vz80(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zm70(p7m0Var2, clzVarW3, vz80Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().p;
        s980 s980Var = new s980(this, null, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zm70(ol60Var, clzVarW4, s980Var, (yje) null), 3);
    }

    public final zyq G0() {
        Object objN = this.R1.n(V1[0], this);
        objN.getClass();
        return (zyq) objN;
    }

    public final org.xplatform.security.impl.presentation.password.change.input_password.f H0() {
        return (org.xplatform.security.impl.presentation.password.change.input_password.f) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new sz80(this, (byte) 1));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(G0().f45217a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        G0().f.clearFocus();
        super.e0();
        hxm0.n(G0().f45217a);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
