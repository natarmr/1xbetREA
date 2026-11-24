package a;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dvs0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dvs0 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public final s0r M1;
    public final a8z N1;
    public final kiu0 O1;
    public final phf0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(dvs0.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentConfirmTwoFactorAuthenticationBinding;", 0), new ez40(dvs0.class, "resultKey", "getResultKey()Ljava/lang/String;", 0)};
    public static final g9m0 Q1 = new g9m0();

    public dvs0() {
        super(R.layout.fragment_confirm_two_factor_authentication);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.M1 = ltt0.o(this, zus0.f45024a);
        xus0 xus0Var = new xus0(this, (byte) 3);
        wez wezVar = wez.b;
        this.N1 = maz.a(wezVar, xus0Var);
        cvs0 cvs0Var = new cvs0(new xus0(this, (byte) 4), (byte) 0);
        a8z a8zVarA = maz.a(wezVar, new cvs0(new cvs0(this, (byte) 1), (byte) 2));
        this.O1 = agc.G(this, sre0.f32672a.b(dws0.class), new p7r0(a8zVarA, (byte) 24), new p7r0(a8zVarA, (byte) 25), cvs0Var);
        this.P1 = new phf0("RESULT_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().d.setInputType(2);
        final byte b = 0;
        G0().e.b(new xus0(this, (byte) 0));
        G0().c.setOnClickListener(dyb.V(new Function1(this) { // from class: a.yus0
            public final /* synthetic */ dvs0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                dvs0 dvs0Var = this.b;
                switch (b2) {
                    case 0:
                        g9m0 g9m0Var = dvs0.Q1;
                        ((View) obj).getClass();
                        dws0 dws0VarH0 = dvs0Var.H0();
                        SupportMenuScreenParams supportMenuScreenParams = new SupportMenuScreenParams(false, pjn0.f27099a, SupportMenuScreenParams.AdditionalParams.None.f47112a);
                        i1w0 i1w0Var = dws0VarH0.f;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        dws0VarH0.g.getClass();
                        FragmentScreen fragmentScreenF = s9m0.f(supportMenuScreenParams);
                        if (fragmentScreenF instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenF)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenF)));
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
                        Editable editable = (Editable) obj;
                        g9m0 g9m0Var2 = dvs0.Q1;
                        editable.getClass();
                        dvs0Var.H0().w(editable);
                        break;
                }
                return Unit.f46060a;
            }
        }));
        final byte b2 = 1;
        DsBottomBar.u(G0().b, new xus0(this, (byte) 1));
        DsBottomBar.v(G0().b, new xus0(this, (byte) 2));
        uvw.R(G0().b, this, null);
        G0().d.a(new da0(new Function1(this) { // from class: a.yus0
            public final /* synthetic */ dvs0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                dvs0 dvs0Var = this.b;
                switch (b3) {
                    case 0:
                        g9m0 g9m0Var = dvs0.Q1;
                        ((View) obj).getClass();
                        dws0 dws0VarH0 = dvs0Var.H0();
                        SupportMenuScreenParams supportMenuScreenParams = new SupportMenuScreenParams(false, pjn0.f27099a, SupportMenuScreenParams.AdditionalParams.None.f47112a);
                        i1w0 i1w0Var = dws0VarH0.f;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        dws0VarH0.g.getClass();
                        FragmentScreen fragmentScreenF = s9m0.f(supportMenuScreenParams);
                        if (fragmentScreenF instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenF)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenF)));
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
                        Editable editable = (Editable) obj;
                        g9m0 g9m0Var2 = dvs0.Q1;
                        editable.getClass();
                        dvs0Var.H0().w(editable);
                        break;
                }
                return Unit.f46060a;
            }
        }));
        qcc.X(this, new avs0(0, H0(), dws0.class, "onBackClicked", "onBackClicked()V", 0, (byte) 0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        H0().w(G0().d.getText());
        p7m0 p7m0Var = H0().i;
        yje yjeVar = null;
        bvs0 bvs0Var = new bvs0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0(p7m0Var, clzVarW, bvs0Var, (yje) null), 3);
        ol60 ol60Var = H0().j;
        bvs0 bvs0Var2 = new bvs0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tsr0(ol60Var, clzVarW2, bvs0Var2, (yje) null, (byte) 0), 3);
    }

    public final izq G0() {
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        return (izq) objN;
    }

    public final dws0 H0() {
        return (dws0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new xus0(this, (byte) 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(G0().f15647a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        Object value;
        super.e0();
        hxm0.n(G0().f15647a);
        dws0 dws0VarH0 = H0();
        boolean zR = v3c.R(D(), "com.google.android.apps.authenticator2");
        ctf0 ctf0Var = dws0VarH0.d;
        String str = String.format(Locale.ENGLISH, ctf0Var.f(R.string.google_authenticator, new Object[0]), Arrays.copyOf(new Object[]{ctf0Var.f(zR ? R.string.open_app : R.string.install, new Object[0])}, 1));
        p7m0 p7m0Var = dws0VarH0.i;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, bws0.a((bws0) value, false, str, null, null, false, false, 61)));
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
