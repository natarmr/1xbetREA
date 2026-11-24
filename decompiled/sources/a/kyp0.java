package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kyp0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kyp0 extends yx5 {
    public vwi K1;
    public ii L1;
    public final s0r M1;
    public final a8z N1;
    public final phf0 O1;
    public final boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(kyp0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(kyp0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0)};
    public static final y2m0 Q1 = new y2m0((byte) 17);

    public kyp0() {
        super(R.layout.compose_fragment);
        this.M1 = ltt0.o(this, jyp0.f17371a);
        this.N1 = xbc.a0(this, sre0.f32672a.b(pyp0.class), null, new hyp0(this, (byte) 0), 14);
        this.O1 = new phf0("player_id");
        this.P1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lyp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lyp0 lyp0Var = (lyp0) (ze3Var instanceof lyp0 ? ze3Var : null);
            if (lyp0Var != null) {
                String strN = this.O1.n(this, R1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = lyp0Var.f20874a;
                gii0 gii0Var = lyp0Var.b;
                knf0 knf0Var = lyp0Var.c;
                ctf0 ctf0Var = lyp0Var.d;
                typ0 typ0Var = lyp0Var.e;
                kuy kuyVar = lyp0Var.f;
                ii iiVar = lyp0Var.g;
                gii0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                typ0Var.getClass();
                kuyVar.getClass();
                iiVar.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = cadVar;
                ruVar.b = i1w0VarF;
                ruVar.e = ctf0Var;
                ruVar.c = gii0Var;
                ruVar.d = knf0Var;
                ruVar.f = typ0Var;
                ruVar.g = kuyVar;
                byte b = 19;
                ruVar.h = mbl.b(new psi(ruVar, 2, b));
                ruVar.i = mbl.b(new psi(ruVar, 1, b));
                ruVar.j = n0k0.a(new psi(ruVar, 0, b));
                this.K1 = (vwi) ((n5d0) ruVar.j).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(lyp0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 1;
        ccq0.V(this, "REQUEST_RESET_FILTERS_DIALOG_KEY", new hyp0(this, (byte) 1));
        final byte b2 = 0;
        C().u0("REQUEST_SEASONS_DIALOG_KEY", this, new k4r(this) { // from class: a.iyp0
            public final /* synthetic */ kyp0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                String string2;
                byte b3 = b2;
                kyp0 kyp0Var = this.b;
                switch (b3) {
                    case 0:
                        y2m0 y2m0Var = kyp0.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SEASONS_DIALOG_KEY") && bundle2.containsKey("RESULT_ON_CHOSE_FILTER_LISTENER_KEY") && (string = bundle2.getString("RESULT_ON_CHOSE_FILTER_LISTENER_KEY")) != null) {
                            kyp0Var.G0().x(new dyp0(string));
                        }
                        break;
                    default:
                        y2m0 y2m0Var2 = kyp0.Q1;
                        str.getClass();
                        if (bundle2.containsKey("RESULT_ON_CHOSE_FILTER_LISTENER_KEY") && (string2 = bundle2.getString("RESULT_ON_CHOSE_FILTER_LISTENER_KEY")) != null) {
                            kyp0Var.G0().x(new fyp0(string2));
                            break;
                        }
                        break;
                }
            }
        });
        C().u0("REQUEST_SURFACE_TYPES_DIALOG_KEY", this, new k4r(this) { // from class: a.iyp0
            public final /* synthetic */ kyp0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                String string;
                String string2;
                byte b3 = b;
                kyp0 kyp0Var = this.b;
                switch (b3) {
                    case 0:
                        y2m0 y2m0Var = kyp0.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SEASONS_DIALOG_KEY") && bundle2.containsKey("RESULT_ON_CHOSE_FILTER_LISTENER_KEY") && (string = bundle2.getString("RESULT_ON_CHOSE_FILTER_LISTENER_KEY")) != null) {
                            kyp0Var.G0().x(new dyp0(string));
                        }
                        break;
                    default:
                        y2m0 y2m0Var2 = kyp0.Q1;
                        str.getClass();
                        if (bundle2.containsKey("RESULT_ON_CHOSE_FILTER_LISTENER_KEY") && (string2 = bundle2.getString("RESULT_ON_CHOSE_FILTER_LISTENER_KEY")) != null) {
                            kyp0Var.G0().x(new fyp0(string2));
                            break;
                        }
                        break;
                }
            }
        });
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1446568998, true, new l7p0(this, (byte) 11)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getU1() {
        return this.P1;
    }
}
