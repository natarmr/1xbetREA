package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/lgf0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lgf0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final a8z M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(lgf0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final gle0 N1 = new gle0();

    public lgf0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, kgf0.f18236a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(rgf0.class), new tie0(this, (byte) 16));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        C().u0("FILTERS_BS_DIALOG_REQUEST_KEY", this, new k4r(this) { // from class: a.jgf0
            public final /* synthetic */ lgf0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b2 = b;
                lgf0 lgf0Var = this.b;
                switch (b2) {
                    case 0:
                        gle0 gle0Var = lgf0.N1;
                        str.getClass();
                        if (str.hashCode() == 959775042 && str.equals("FILTERS_BS_DIALOG_REQUEST_KEY")) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 33) {
                                serializable = bundle2.getSerializable("KEYS_FILTER_TYPE", nmy.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("KEYS_FILTER_TYPE");
                                if (!(serializable3 instanceof nmy)) {
                                    serializable3 = null;
                                }
                                serializable = (nmy) serializable3;
                            }
                            nmy nmyVar = (nmy) serializable;
                            if (nmyVar == null) {
                                nmyVar = nmy.ALL;
                            }
                            if (i >= 33) {
                                serializable2 = bundle2.getSerializable("KEYS_SORT_TYPE", cny.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("KEYS_SORT_TYPE");
                                serializable2 = (cny) (serializable4 instanceof cny ? serializable4 : null);
                            }
                            cny cnyVar = (cny) serializable2;
                            if (cnyVar == null) {
                                cnyVar = cny.A_Z;
                            }
                            lgf0Var.G0().x(new cgf0(nmyVar, cnyVar));
                        }
                        break;
                    default:
                        gle0 gle0Var2 = lgf0.N1;
                        str.getClass();
                        if (str.hashCode() == -443307479 && str.equals("CHANGE_VALUE_BS_DIALOG_REQUEST_KEY")) {
                            lgf0Var.G0().x(dgf0.f6040a);
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        C().u0("CHANGE_VALUE_BS_DIALOG_REQUEST_KEY", this, new k4r(this) { // from class: a.jgf0
            public final /* synthetic */ lgf0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                lgf0 lgf0Var = this.b;
                switch (b3) {
                    case 0:
                        gle0 gle0Var = lgf0.N1;
                        str.getClass();
                        if (str.hashCode() == 959775042 && str.equals("FILTERS_BS_DIALOG_REQUEST_KEY")) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 33) {
                                serializable = bundle2.getSerializable("KEYS_FILTER_TYPE", nmy.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("KEYS_FILTER_TYPE");
                                if (!(serializable3 instanceof nmy)) {
                                    serializable3 = null;
                                }
                                serializable = (nmy) serializable3;
                            }
                            nmy nmyVar = (nmy) serializable;
                            if (nmyVar == null) {
                                nmyVar = nmy.ALL;
                            }
                            if (i >= 33) {
                                serializable2 = bundle2.getSerializable("KEYS_SORT_TYPE", cny.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("KEYS_SORT_TYPE");
                                serializable2 = (cny) (serializable4 instanceof cny ? serializable4 : null);
                            }
                            cny cnyVar = (cny) serializable2;
                            if (cnyVar == null) {
                                cnyVar = cny.A_Z;
                            }
                            lgf0Var.G0().x(new cgf0(nmyVar, cnyVar));
                        }
                        break;
                    default:
                        gle0 gle0Var2 = lgf0.N1;
                        str.getClass();
                        if (str.hashCode() == -443307479 && str.equals("CHANGE_VALUE_BS_DIALOG_REQUEST_KEY")) {
                            lgf0Var.G0().x(dgf0.f6040a);
                        }
                        break;
                }
            }
        });
        Object objN = this.K1.n(O1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-227499748, true, new dke0(this, (byte) 9)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(igf0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            igf0 igf0Var = (igf0) (ze3Var instanceof igf0 ? ze3Var : null);
            if (igf0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = igf0Var.f14733a;
                ctf0 ctf0Var = igf0Var.b;
                epi0 epi0Var = igf0Var.d;
                iw20 iw20Var = igf0Var.c;
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(rgf0.class, (fri) new uii(cadVar, iw20Var, epi0Var, ctf0Var, i1w0VarF).f));
                return;
            }
        }
        jf4.n(b1j.i(igf0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }
}
