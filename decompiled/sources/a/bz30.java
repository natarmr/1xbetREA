package a;

import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bz30;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bz30 extends yx5 {
    public final yzn0 K1;
    public final a8z L1;
    public final s0r M1;
    public final a8z N1;
    public final hnm0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(bz30.class, "settings", "getSettings()Lorg/xplatform/main_menu/api/presentation/models/MenuScreenSettings;", 0), new j0d0(bz30.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wsz P1 = new wsz();

    public bz30() {
        super(R.layout.compose_fragment);
        this.K1 = new yzn0("MENU_SETTINGS_KEY");
        this.L1 = maz.a(wez.b, new yy30(this, (byte) 0));
        this.M1 = ltt0.o(this, az30.f1698a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(j340.class), null, new yy30(this, (byte) 1), 14);
        this.O1 = hnm0.f13359a;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(Q1[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-210258266, true, new b120(this, (byte) 20)));
    }

    public final pli G0() {
        return (pli) this.L1.getValue();
    }

    public final k3t0 H0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        final byte b = 1;
        C().u0("SELECT_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.zy30
            public final /* synthetic */ bz30 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b2 = b;
                bz30 bz30Var = this.b;
                switch (b2) {
                    case 0:
                        wsz wszVar = bz30.P1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            bz30Var.H0().x(new mu30(z));
                            bz30Var.H0().x(new ku30((ql5) serializable));
                        } else {
                            bz30Var.H0().x(nu30.f24130a);
                        }
                        break;
                    default:
                        wsz wszVar2 = bz30.P1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            bz30Var.H0().x(new lu30((ql5) serializable2));
                        }
                        break;
                }
            }
        });
        final byte b2 = 0;
        C().u0("CHANGE_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.zy30
            public final /* synthetic */ bz30 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                bz30 bz30Var = this.b;
                switch (b3) {
                    case 0:
                        wsz wszVar = bz30.P1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            boolean z = bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY");
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("GET_BALANCE_REQUEST_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            bz30Var.H0().x(new mu30(z));
                            bz30Var.H0().x(new ku30((ql5) serializable));
                        } else {
                            bz30Var.H0().x(nu30.f24130a);
                        }
                        break;
                    default:
                        wsz wszVar2 = bz30.P1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable2 = (ql5) (serializable4 instanceof ql5 ? serializable4 : null);
                            }
                            bz30Var.H0().x(new lu30((ql5) serializable2));
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "NEED_IDENTIFICATION_TJ_DIALOG_REQUEST_KEY", new yy30(this, (byte) 2));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.O1;
    }
}
