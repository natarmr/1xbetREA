package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yq6;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yq6 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public poq0 M1;
    public ii N1;
    public wdk0 O1;
    public final s0r P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(yq6.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gl5 R1 = new gl5((byte) 4);

    public yq6() {
        super(R.layout.compose_fragment);
        this.K1 = hnm0.f13359a;
        this.P1 = ltt0.o(this, xq6.f41301a);
        this.Q1 = xbc.b0(this, sre0.f32672a.b(wr6.class), new vq6(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        vcc.g0(this, "REQUEST_TEAM_SELECTOR_KEY_NEW", new Function2(this) { // from class: a.wq6
            public final /* synthetic */ yq6 b;

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
                        gl5 gl5Var = yq6.R1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            yq6 yq6Var = this.b;
                            pz40 pz40VarY = ((i3t0) yq6Var.G0()).y(fetVar);
                            k3t0 k3t0VarG0 = yq6Var.G0();
                            boolean zI = fetVar.i(yq6Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new os5(yq6Var, (byte) 12);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(yq6Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(k3t0VarG0, yq6Var, pz40VarF, null, (byte) 28);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, yq6Var, (Function2) objP2);
                            k3t0 k3t0VarG1 = yq6Var.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                yj5 yj5Var = new yj5(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                                fetVar.o0(yj5Var);
                                objP3 = yj5Var;
                            }
                            wha0.f(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = yq6.R1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_TEAM_SELECTOR_KEY_NEW")) {
                            if (bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ojp0.class);
                                } else {
                                    Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                    if (!(serializable2 instanceof ojp0)) {
                                        serializable2 = null;
                                    }
                                    serializable = (ojp0) serializable2;
                                }
                                ojp0 ojp0Var = (ojp0) serializable;
                                if (ojp0Var != null) {
                                    this.b.G0().x(new rq6(ojp0Var));
                                }
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_KEY_EXIT_NEW", new vq6(this, (byte) 2));
        qcc.W(this, this, new vq6(this, (byte) 1));
        final byte b2 = 0;
        Object objN = this.P1.n(S1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1577701107, true, new Function2(this) { // from class: a.wq6
            public final /* synthetic */ yq6 b;

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
                        gl5 gl5Var = yq6.R1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            yq6 yq6Var = this.b;
                            pz40 pz40VarY = ((i3t0) yq6Var.G0()).y(fetVar);
                            k3t0 k3t0VarG0 = yq6Var.G0();
                            boolean zI = fetVar.i(yq6Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                objP = new os5(yq6Var, (byte) 12);
                                fetVar.o0(objP);
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(yq6Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                l10 l10Var = new l10(k3t0VarG0, yq6Var, pz40VarF, null, (byte) 28);
                                fetVar.o0(l10Var);
                                objP2 = l10Var;
                            }
                            m0x0.t(fetVar, yq6Var, (Function2) objP2);
                            k3t0 k3t0VarG1 = yq6Var.G0();
                            boolean zI3 = fetVar.i(k3t0VarG1);
                            Object objP3 = fetVar.P();
                            if (zI3 || objP3 == cl5Var) {
                                yj5 yj5Var = new yj5(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                                fetVar.o0(yj5Var);
                                objP3 = yj5Var;
                            }
                            wha0.f(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP3));
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        gl5 gl5Var2 = yq6.R1;
                        if (h97.B(bundle2, (String) obj, "REQUEST_TEAM_SELECTOR_KEY_NEW")) {
                            if (bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ojp0.class);
                                } else {
                                    Object serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                    if (!(serializable2 instanceof ojp0)) {
                                        serializable2 = null;
                                    }
                                    serializable = (ojp0) serializable2;
                                }
                                ojp0 ojp0Var = (ojp0) serializable;
                                if (ojp0Var != null) {
                                    this.b.G0().x(new rq6(ojp0Var));
                                }
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
        G0().x(iq6.f15193a);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ar6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ar6 ar6Var = (ar6) (ze3Var instanceof ar6 ? ze3Var : null);
            if (ar6Var != null) {
                v9i v9iVarA = ar6Var.a(a4n0.f(this));
                this.L1 = v9iVarA.e();
                this.M1 = (poq0) v9iVarA.n;
                this.N1 = (ii) v9iVarA.v;
                this.O1 = (wdk0) v9iVarA.w;
                return;
            }
        }
        jf4.n(b1j.i(ar6.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(kq6.f18705a);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
