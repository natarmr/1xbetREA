package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ol5;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ol5 extends yx5 {
    public l9i K1;
    public ynb L1;
    public ii M1;
    public wdk0 N1;
    public String O1;
    public final kiu0 P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ol5.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final kl5 R1 = new kl5();

    public ol5() {
        super(R.layout.compose_fragment);
        this.O1 = "";
        zo4 zo4Var = new zo4(this, (byte) 11);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 25), (byte) 26));
        this.P1 = agc.G(this, sre0.f32672a.b(dk5.class), new qw4(a8zVarA, (byte) 14), new qw4(a8zVarA, (byte) 15), zo4Var);
        this.Q1 = ltt0.o(this, ll5.f20230a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        C().u0("CHANGE_BALANCE_KEY", this, new k4r(this) { // from class: a.jl5
            public final /* synthetic */ ol5 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b2 = b;
                ol5 ol5Var = this.b;
                switch (b2) {
                    case 0:
                        kl5 kl5Var = ol5.R1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            ol5Var.G0().w((ql5) serializable);
                            ((vlk) ol5Var.G0().E.b).f37628a.e("changeBalance", z);
                        } else {
                            ol5Var.G0().D();
                        }
                        break;
                    default:
                        kl5 kl5Var2 = ol5.R1;
                        str.getClass();
                        if (str.equals("CHANGE_BALANCE_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            ol5Var.G0().E((ql5) serializable2);
                        }
                        break;
                }
            }
        });
        final byte b2 = 0;
        C().u0("CHANGE_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.jl5
            public final /* synthetic */ ol5 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                ol5 ol5Var = this.b;
                switch (b3) {
                    case 0:
                        kl5 kl5Var = ol5.R1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            ol5Var.G0().w((ql5) serializable);
                            ((vlk) ol5Var.G0().E.b).f37628a.e("changeBalance", z);
                        } else {
                            ol5Var.G0().D();
                        }
                        break;
                    default:
                        kl5 kl5Var2 = ol5.R1;
                        str.getClass();
                        if (str.equals("CHANGE_BALANCE_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            ol5Var.G0().E((ql5) serializable2);
                        }
                        break;
                }
            }
        });
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-1201189232, true, new fa2((Object) this, (byte) 22)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ti5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ti5)) {
                ze3Var = null;
            }
            ti5 ti5Var = (ti5) ze3Var;
            if (ti5Var != null) {
                n9i n9iVarA = ti5.a(ti5Var, null, false, this.O1, 7);
                this.K1 = (l9i) n9iVarA.J.get();
                ynb ynbVarI = ((yzn0) n9iVarA.H.b).i();
                x1x.x(ynbVarI);
                this.L1 = ynbVarI;
                this.M1 = n9iVarA.F;
                this.N1 = n9iVarA.G;
                return;
            }
        }
        jf4.n(b1j.i(ti5.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = G0().b0;
        yje yjeVar = null;
        nl5 nl5Var = new nl5(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(ol60Var, clzVarW, nl5Var, (yje) null), 3);
        xae0 xae0VarN = vtb.N(G0().a0);
        nl5 nl5Var2 = new nl5(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new me5(xae0VarN, clzVarW2, nl5Var2, (yje) null), 3);
    }

    public final dk5 G0() {
        return (dk5) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x();
    }
}
