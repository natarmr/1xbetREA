package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wn6;", "La/yx5;", "<init>", "()V", "a/bj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wn6 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public cge0 N1;
    public lgn0 O1;
    public xi70 P1;
    public wdk0 Q1;
    public final s0r R1;
    public final cgk0 S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(wn6.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bj5 V1 = new bj5();

    public wn6() {
        super(R.layout.compose_fragment);
        this.K1 = hnm0.f13359a;
        this.R1 = ltt0.o(this, vn6.f37703a);
        this.S1 = androidx.compose.runtime.e.b(0);
        this.U1 = xbc.b0(this, sre0.f32672a.b(vp6.class), new tn6(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        ccq0.V(this, "REQUEST_BALANCE_ERROR_DIALOG_KEY_NEW", new tn6(this, (byte) 1));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY_NEW", new tn6(this, (byte) 2));
        vcc.g0(this, "REQUEST_TEAM_ACTION_KEY_NEW", new Function2(this) { // from class: a.sn6
            public final /* synthetic */ wn6 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object serializable;
                switch (b) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        bj5 bj5Var = wn6.V1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            wn6 wn6Var = this.b;
                            pz40 pz40VarY = ((i3t0) wn6Var.G0()).y(fetVar);
                            k3t0 k3t0VarG0 = wn6Var.G0();
                            boolean zI = fetVar.i(wn6Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new os5(wn6Var, (byte) 8);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(wn6Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(k3t0VarG0, wn6Var, pz40VarF, null, (byte) 27);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, wn6Var, (Function2) objP2);
                            k3t0 k3t0VarG1 = wn6Var.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                yj5 yj5Var = new yj5(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                                fetVar.o0(yj5Var);
                                objP3 = yj5Var;
                            }
                            gq80.j(null, pz40VarY, wn6Var.S1.l(), (Function1) ((jhy) objP3), u1c.M(-1031235728, new un6(wn6Var, (byte) 0), fetVar), fetVar, 24576);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        bj5 bj5Var2 = wn6.V1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_TEAM_ACTION_KEY_NEW")) {
                            if (bundle2.containsKey("RESULT_ON_ITEM_ACTION_LISTENER_KEY")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializable = bundle2.getSerializable("RESULT_ON_ITEM_ACTION_LISTENER_KEY", ojp0.class);
                                } else {
                                    Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_ACTION_LISTENER_KEY");
                                    if (!(serializable2 instanceof ojp0)) {
                                        serializable2 = null;
                                    }
                                    serializable = (ojp0) serializable2;
                                }
                                ojp0 ojp0Var = (ojp0) serializable;
                                if (ojp0Var != null) {
                                    this.b.G0().x(new on6(ojp0Var));
                                }
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 0;
        Object objN = this.R1.n(W1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1958001370, true, new Function2(this) { // from class: a.sn6
            public final /* synthetic */ wn6 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object serializable;
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        bj5 bj5Var = wn6.V1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            wn6 wn6Var = this.b;
                            pz40 pz40VarY = ((i3t0) wn6Var.G0()).y(fetVar);
                            k3t0 k3t0VarG0 = wn6Var.G0();
                            boolean zI = fetVar.i(wn6Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new os5(wn6Var, (byte) 8);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(wn6Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(k3t0VarG0, wn6Var, pz40VarF, null, (byte) 27);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, wn6Var, (Function2) objP2);
                            k3t0 k3t0VarG1 = wn6Var.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                yj5 yj5Var = new yj5(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                                fetVar.o0(yj5Var);
                                objP3 = yj5Var;
                            }
                            gq80.j(null, pz40VarY, wn6Var.S1.l(), (Function1) ((jhy) objP3), u1c.M(-1031235728, new un6(wn6Var, (byte) 0), fetVar), fetVar, 24576);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        bj5 bj5Var2 = wn6.V1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_TEAM_ACTION_KEY_NEW")) {
                            if (bundle2.containsKey("RESULT_ON_ITEM_ACTION_LISTENER_KEY")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializable = bundle2.getSerializable("RESULT_ON_ITEM_ACTION_LISTENER_KEY", ojp0.class);
                                } else {
                                    Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_ACTION_LISTENER_KEY");
                                    if (!(serializable2 instanceof ojp0)) {
                                        serializable2 = null;
                                    }
                                    serializable = (ojp0) serializable2;
                                }
                                ojp0 ojp0Var = (ojp0) serializable;
                                if (ojp0Var != null) {
                                    this.b.G0().x(new on6(ojp0Var));
                                }
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
        G0().x(cn6.f4638a);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yn6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yn6 yn6Var = (yn6) (ze3Var instanceof yn6 ? ze3Var : null);
            if (yn6Var != null) {
                g7i g7iVarA = yn6Var.a(a4n0.f(this));
                this.L1 = g7iVarA.e();
                this.M1 = (ii) g7iVarA.G;
                this.N1 = new cge0((byte) 6);
                this.O1 = (lgn0) g7iVarA.H;
                this.P1 = ((rmd0) g7iVarA.r).f();
                this.Q1 = (wdk0) g7iVarA.I;
                return;
            }
        }
        jf4.n(b1j.i(yn6.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.U1.getValue();
    }

    public final void H0(String str) {
        wdk0 wdk0Var = this.Q1;
        if (wdk0Var != null) {
            wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), this, null, null, false, null, 1020);
        } else {
            Intrinsics.h("snackbarManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        G0().x(en6.f8077a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(fn6.f9818a);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
