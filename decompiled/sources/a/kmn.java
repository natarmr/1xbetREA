package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kmn;", "La/yx5;", "<init>", "()V", "a/xak", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kmn extends yx5 {
    public final r34 K1;
    public fiu0 L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(kmn.class, "balanceId", "getBalanceId()J", 0), new j0d0(kmn.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xak Q1 = new xak((byte) 6);

    public kmn() {
        super(R.layout.compose_fragment);
        this.K1 = new r34("BALANCE_ID");
        this.O1 = ltt0.o(this, jmn.f16774a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(wnn.class), new hmn(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        jg60 jg60VarK = n0().k();
        jg60VarK.getClass();
        final byte b = 1;
        bdx.O(jg60VarK, K(), new yhn(this, b));
        ccq0.V(this, "REQUEST_CONFIRM_DELETE_DIALOG_KEY", new hmn(this, (byte) 3));
        ccq0.T(this, "REQUEST_CANCEL_DELETE_DIALOG_KEY", new hmn(this, (byte) 4));
        C().u0("REQUEST_SELECT_COUPON_TYPE_DIALOG_KEY", this, new k4r(this) { // from class: a.imn
            public final /* synthetic */ kmn b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b2 = b;
                kmn kmnVar = this.b;
                switch (b2) {
                    case 0:
                        xak xakVar = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_COEF_CHECK_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new pkn(bundle2.getInt("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                    case 1:
                        xak xakVar2 = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_COUPON_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new qkn(bundle2.getInt("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                    default:
                        xak xakVar3 = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_BET_SYSTEM_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new ukn(bundle2.getInt("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                }
            }
        });
        final byte b2 = 0;
        C().u0("REQUEST_SELECT_COEF_CHECK_TYPE_DIALOG_KEY", this, new k4r(this) { // from class: a.imn
            public final /* synthetic */ kmn b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                kmn kmnVar = this.b;
                switch (b3) {
                    case 0:
                        xak xakVar = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_COEF_CHECK_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new pkn(bundle2.getInt("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                    case 1:
                        xak xakVar2 = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_COUPON_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new qkn(bundle2.getInt("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                    default:
                        xak xakVar3 = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_BET_SYSTEM_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new ukn(bundle2.getInt("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                }
            }
        });
        final byte b3 = 2;
        C().u0("REQUEST_SELECT_BET_SYSTEM_TYPE_DIALOG_KEY", this, new k4r(this) { // from class: a.imn
            public final /* synthetic */ kmn b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b4 = b3;
                kmn kmnVar = this.b;
                switch (b4) {
                    case 0:
                        xak xakVar = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_COEF_CHECK_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new pkn(bundle2.getInt("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                    case 1:
                        xak xakVar2 = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_COUPON_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new qkn(bundle2.getInt("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_COUPON_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                    default:
                        xak xakVar3 = kmn.Q1;
                        str.getClass();
                        if (str.equals("REQUEST_SELECT_BET_SYSTEM_TYPE_DIALOG_KEY") && bundle2.containsKey("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY")) {
                            kmnVar.G0().x(new ukn(bundle2.getInt("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY")));
                            bundle2.remove("SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY");
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "REQUEST_CONFIRM_EXIT_DIALOG_KEY", new hmn(this, (byte) 7));
        ccq0.V(this, "REQUEST_BET_EXISTS_ERROR_DIALOG_KEY", new hmn(this, (byte) 1));
        ccq0.V(this, "REQUEST_SAVE_COUPON_CONFIRM_DIALOG_KEY", new hmn(this, (byte) 2));
        iiy[] iiyVarArr = R1;
        iiy iiyVar = iiyVarArr[1];
        s0r s0rVar = this.O1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(961343231, true, new mxm(this, (byte) 22)));
        Object objN2 = s0rVar.n(iiyVarArr[1], this);
        objN2.getClass();
        knm0.h(((aid) objN2).b, false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lmn.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lmn lmnVar = (lmn) (ze3Var instanceof lmn ? ze3Var : null);
            if (lmnVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                Long lN = this.K1.n(this, R1[0]);
                i1w0VarF.getClass();
                cad cadVar = lmnVar.f20304a;
                gii0 gii0Var = lmnVar.b;
                m1e m1eVar = lmnVar.c;
                btt0 btt0Var = lmnVar.d;
                sln slnVar = lmnVar.e;
                xkn xknVar = lmnVar.f;
                u0f u0fVar = lmnVar.g;
                ii iiVar = lmnVar.o;
                gst0 gst0Var = lmnVar.h;
                kt2 kt2Var = lmnVar.i;
                iw20 iw20Var = lmnVar.j;
                ctf0 ctf0Var = lmnVar.k;
                ouu ouuVar = lmnVar.l;
                edo edoVar = lmnVar.m;
                zfo zfoVar = lmnVar.n;
                b3c0 b3c0Var = lmnVar.p;
                wdk0 wdk0Var = lmnVar.u;
                knf0 knf0Var = lmnVar.q;
                drm0 drm0Var = lmnVar.r;
                vqc vqcVar = lmnVar.s;
                wsf0 wsf0Var = lmnVar.t;
                duj dujVar = lmnVar.v;
                d1p d1pVar = lmnVar.w;
                sue sueVar = lmnVar.x;
                bzu bzuVar = lmnVar.y;
                o2j0 o2j0Var = lmnVar.z;
                j1q0 j1q0Var = lmnVar.A;
                b8u b8uVar = lmnVar.B;
                x0u x0uVar = lmnVar.C;
                fsd fsdVar = lmnVar.D;
                epi0 epi0Var = lmnVar.E;
                aln alnVar = lmnVar.F;
                rpt rptVar = lmnVar.G;
                jnn jnnVar = lmnVar.H;
                qp qpVar = lmnVar.I;
                mii0 mii0Var = lmnVar.J;
                d1pVar.getClass();
                sueVar.getClass();
                o2j0Var.getClass();
                iiVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                slnVar.getClass();
                xknVar.getClass();
                u0fVar.getClass();
                gst0Var.getClass();
                kt2Var.getClass();
                ctf0Var.getClass();
                edoVar.getClass();
                zfoVar.getClass();
                b3c0Var.getClass();
                wdk0Var.getClass();
                knf0Var.getClass();
                j1q0Var.getClass();
                fsdVar.getClass();
                alnVar.getClass();
                jnnVar.getClass();
                qpVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(wnn.class, (yei) new dbi(cadVar, iw20Var, drm0Var, vqcVar, wsf0Var, d1pVar, sueVar, o2j0Var, bzuVar, epi0Var, iiVar, lN, gii0Var, m1eVar, i1w0VarF, btt0Var, slnVar, xknVar, u0fVar, gst0Var, kt2Var, ctf0Var, ouuVar, edoVar, b3c0Var, wdk0Var, dujVar, j1q0Var, b8uVar, x0uVar, fsdVar, alnVar, rptVar, jnnVar, qpVar, mii0Var).I));
                this.M1 = iiVar;
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(lmn.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        E0(false);
    }
}
