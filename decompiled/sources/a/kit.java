package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kit;", "La/yx5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kit extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public gii M1;
    public ii N1;
    public final es O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(kit.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(kit.class, "teamList", "getTeamList()Ljava/util/List;", 0)};
    public static final bek Q1 = new bek();

    public kit() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, jit.f16592a);
        this.O1 = new es("TEAM_LIST_KEY");
        this.P1 = xbc.a0(this, sre0.f32672a.b(sit.class), null, new jcs(this, (byte) 18), 14);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bht.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bht bhtVar = (bht) (ze3Var instanceof bht ? ze3Var : null);
            if (bhtVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                List listN = this.O1.n(this, R1[1]);
                i1w0VarF.getClass();
                cad cadVar = bhtVar.f2624a;
                gii0 gii0Var = bhtVar.b;
                m1e m1eVar = bhtVar.c;
                ocl oclVar = bhtVar.d;
                ctf0 ctf0Var = bhtVar.e;
                duj dujVar = bhtVar.f;
                ouu ouuVar = bhtVar.g;
                gst0 gst0Var = bhtVar.i;
                wsf0 wsf0Var = bhtVar.m;
                qu quVar = bhtVar.h;
                zfo zfoVar = bhtVar.j;
                edo edoVar = bhtVar.k;
                ulk ulkVar = bhtVar.l;
                knf0 knf0Var = bhtVar.n;
                lye lyeVar = bhtVar.o;
                m0f m0fVar = bhtVar.p;
                ave aveVar = bhtVar.q;
                us3 us3Var = bhtVar.r;
                pru pruVar = bhtVar.s;
                r9u r9uVar = bhtVar.t;
                vqc vqcVar = bhtVar.u;
                vwb0 vwb0Var = bhtVar.v;
                q7d0 q7d0Var = bhtVar.w;
                rrc rrcVar = bhtVar.x;
                ii iiVar = bhtVar.y;
                vby vbyVar = bhtVar.z;
                x20 x20Var = bhtVar.A;
                etj etjVar = bhtVar.B;
                j1q0 j1q0Var = bhtVar.C;
                x0u x0uVar = bhtVar.D;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                zfoVar.getClass();
                edoVar.getClass();
                knf0Var.getClass();
                lyeVar.getClass();
                m0fVar.getClass();
                aveVar.getClass();
                us3Var.getClass();
                r9uVar.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                iiVar.getClass();
                vbyVar.getClass();
                etjVar.getClass();
                j1q0Var.getClass();
                this.M1 = (gii) new mai(cadVar, wsf0Var, vqcVar, listN, gii0Var, oclVar, m1eVar, ctf0Var, i1w0VarF, dujVar, ouuVar, quVar, gst0Var, zfoVar, edoVar, ulkVar, knf0Var, lyeVar, m0fVar, aveVar, us3Var, pruVar, r9uVar, vwb0Var, q7d0Var, rrcVar, iiVar, vbyVar, x20Var, etjVar, j1q0Var, x0uVar).j.get();
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(bht.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        final byte b = 1;
        C().u0("EXTRA_REQUEST_KEY_TIME", this, new k4r(this) { // from class: a.iit
            public final /* synthetic */ kit b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b2 = b;
                kit kitVar = this.b;
                switch (b2) {
                    case 0:
                        bek bekVar = kit.Q1;
                        str.getClass();
                        if (str.equals("EXTRA_REQUEST_KEY_TYPE")) {
                            kitVar.G0().x(new sgt(bundle2.getInt("EXTRA_REQUEST_KEY_TYPE", 0)));
                            break;
                        }
                        break;
                    default:
                        bek bekVar2 = kit.Q1;
                        str.getClass();
                        if (str.equals("EXTRA_REQUEST_KEY_TIME")) {
                            kitVar.G0().x(new pgt(bundle2.getInt("EXTRA_REQUEST_KEY_TIME", 0)));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 0;
        C().u0("EXTRA_REQUEST_KEY_TYPE", this, new k4r(this) { // from class: a.iit
            public final /* synthetic */ kit b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                kit kitVar = this.b;
                switch (b3) {
                    case 0:
                        bek bekVar = kit.Q1;
                        str.getClass();
                        if (str.equals("EXTRA_REQUEST_KEY_TYPE")) {
                            kitVar.G0().x(new sgt(bundle2.getInt("EXTRA_REQUEST_KEY_TYPE", 0)));
                            break;
                        }
                        break;
                    default:
                        bek bekVar2 = kit.Q1;
                        str.getClass();
                        if (str.equals("EXTRA_REQUEST_KEY_TIME")) {
                            kitVar.G0().x(new pgt(bundle2.getInt("EXTRA_REQUEST_KEY_TIME", 0)));
                            break;
                        }
                        break;
                }
            }
        });
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-542387151, true, new jar(this, (byte) 20)));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
