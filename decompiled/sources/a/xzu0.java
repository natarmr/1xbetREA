package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/xzu0;", "La/yx5;", "<init>", "()V", "a/uxs0", "La/n0v0;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xzu0 extends yx5 {
    public final f9o0 K1;
    public fiu0 L1;
    public ynb M1;
    public ii N1;
    public wdk0 O1;
    public final phf0 P1;
    public final a8z Q1;
    public final s0r R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(xzu0.class, "navigatePath", "getNavigatePath()Ljava/lang/String;", 0), new j0d0(xzu0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final uxs0 S1 = new uxs0((byte) 11);

    public xzu0() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.P1 = new phf0("NAVIGATE_PATH_KEY", "");
        this.Q1 = xbc.b0(this, sre0.f32672a.b(u0v0.class), new tzu0(this, (byte) 0));
        this.R1 = ltt0.o(this, vzu0.f38315a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        ccq0.V(this, "DELETE_CONFIRM_DIALOG_KEY", new tzu0(this, (byte) 1));
        final byte b2 = 2;
        C().u0("REQUEST_ACCOUNT_ACTIONS_DIALOG_KEY", this, new k4r(this) { // from class: a.uzu0
            public final /* synthetic */ xzu0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                xzu0 xzu0Var = this.b;
                switch (b3) {
                    case 0:
                        uxs0 uxs0Var = xzu0.S1;
                        str.getClass();
                        xzu0Var.G0().x(new fzu0());
                        break;
                    case 1:
                        uxs0 uxs0Var2 = xzu0.S1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            xzu0Var.G0().x(new lzu0(bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY")));
                        }
                        break;
                    default:
                        uxs0 uxs0Var3 = xzu0.S1;
                        str.getClass();
                        if (bundle2.containsKey("SELECT_ACTIVE_ACTION_KEY")) {
                            xzu0Var.G0().x(new hzu0(bundle2.getLong("SELECT_ACTIVE_ACTION_KEY")));
                        } else if (bundle2.containsKey("SELECT_REMOVE_ACTION_KEY")) {
                            xzu0Var.G0().x(new ozu0(bundle2.getLong("SELECT_REMOVE_ACTION_KEY")));
                        }
                        break;
                }
            }
        });
        sj3.t0(this, "REQUEST_BONUS_ACCOUNT_ACTION_DIALOG_KEY", new npt0(this, (byte) 20));
        C().u0("CHANGE_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.uzu0
            public final /* synthetic */ xzu0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b;
                xzu0 xzu0Var = this.b;
                switch (b3) {
                    case 0:
                        uxs0 uxs0Var = xzu0.S1;
                        str.getClass();
                        xzu0Var.G0().x(new fzu0());
                        break;
                    case 1:
                        uxs0 uxs0Var2 = xzu0.S1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            xzu0Var.G0().x(new lzu0(bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY")));
                        }
                        break;
                    default:
                        uxs0 uxs0Var3 = xzu0.S1;
                        str.getClass();
                        if (bundle2.containsKey("SELECT_ACTIVE_ACTION_KEY")) {
                            xzu0Var.G0().x(new hzu0(bundle2.getLong("SELECT_ACTIVE_ACTION_KEY")));
                        } else if (bundle2.containsKey("SELECT_REMOVE_ACTION_KEY")) {
                            xzu0Var.G0().x(new ozu0(bundle2.getLong("SELECT_REMOVE_ACTION_KEY")));
                        }
                        break;
                }
            }
        });
        final byte b3 = 0;
        n0().r().u0("ADD_BALANCE_KEY", K(), new k4r(this) { // from class: a.uzu0
            public final /* synthetic */ xzu0 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b4 = b3;
                xzu0 xzu0Var = this.b;
                switch (b4) {
                    case 0:
                        uxs0 uxs0Var = xzu0.S1;
                        str.getClass();
                        xzu0Var.G0().x(new fzu0());
                        break;
                    case 1:
                        uxs0 uxs0Var2 = xzu0.S1;
                        str.getClass();
                        if (!bundle2.containsKey("NEGATIVE_CLICK_REQUEST_KEY")) {
                            xzu0Var.G0().x(new lzu0(bundle2.getBoolean("CHANGE_BALANCE_REQUEST_KEY")));
                        }
                        break;
                    default:
                        uxs0 uxs0Var3 = xzu0.S1;
                        str.getClass();
                        if (bundle2.containsKey("SELECT_ACTIVE_ACTION_KEY")) {
                            xzu0Var.G0().x(new hzu0(bundle2.getLong("SELECT_ACTIVE_ACTION_KEY")));
                        } else if (bundle2.containsKey("SELECT_REMOVE_ACTION_KEY")) {
                            xzu0Var.G0().x(new ozu0(bundle2.getLong("SELECT_REMOVE_ACTION_KEY")));
                        }
                        break;
                }
            }
        });
        Object objN = this.R1.n(U1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1849467069, true, new ggt0(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(b0v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            b0v0 b0v0Var = (b0v0) (ze3Var instanceof b0v0 ? ze3Var : null);
            if (b0v0Var != null) {
                String strN = this.P1.n(this, U1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = b0v0Var.f1778a;
                btt0 btt0Var = b0v0Var.b;
                zx10 zx10Var = b0v0Var.c;
                peg0 peg0Var = b0v0Var.d;
                zg zgVar = b0v0Var.e;
                m1e m1eVar = b0v0Var.f;
                wxs0 wxs0Var = b0v0Var.j;
                oct octVar = b0v0Var.k;
                g2v g2vVar = b0v0Var.g;
                pru pruVar = b0v0Var.h;
                duj dujVar = b0v0Var.i;
                ii iiVar = b0v0Var.s;
                dq00 dq00Var = b0v0Var.l;
                cmt cmtVar = b0v0Var.m;
                z220 z220Var = b0v0Var.n;
                yqc yqcVar = b0v0Var.o;
                psc pscVar = b0v0Var.p;
                wsf0 wsf0Var = b0v0Var.q;
                peg0 peg0Var2 = b0v0Var.r;
                peu peuVar = b0v0Var.t;
                eqx eqxVar = b0v0Var.u;
                wdk0 wdk0Var = b0v0Var.v;
                d1p d1pVar = b0v0Var.w;
                peg0 peg0Var3 = b0v0Var.x;
                ctf0 ctf0Var = b0v0Var.y;
                d1pVar.getClass();
                iiVar.getClass();
                btt0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(u0v0.class, (yxi) new v9i(cadVar, wsf0Var, d1pVar, peg0Var3, iiVar, wxs0Var, octVar, zx10Var, peg0Var, zgVar, m1eVar, g2vVar, pruVar, dujVar, dq00Var, cmtVar, z220Var, yqcVar, pscVar, peg0Var2, peuVar, i1w0VarF, eqxVar, wdk0Var, strN, ctf0Var).y));
                ynb ynbVarI = ((yzn0) peg0Var3.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(b0v0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        rtq0 rtq0Var = new rtq0(this, null, (byte) 24);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new npu0((i89) gmqVarC, clzVarW, rtq0Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    public final boolean H0() {
        androidx.fragment.app.e eVarC = C();
        qc.n2.getClass();
        if (eVarC.J(qc.p2) != null) {
            return false;
        }
        androidx.fragment.app.e eVarC2 = C();
        wb8.n2.getClass();
        return eVarC2.J(wb8.p2) == null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
