package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ni8;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ni8 extends yx5 {
    public kai K1;
    public ynb L1;
    public wdk0 M1;
    public uxs0 N1;
    public sxs0 O1;
    public final hnm0 P1;
    public final phf0 Q1;
    public final s0r R1;
    public final a8z S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(ni8.class, "umResultKey", "getUmResultKey()Ljava/lang/String;", 0), new j0d0(ni8.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final yk5 U1 = new yk5();

    public ni8() {
        super(R.layout.compose_fragment);
        this.P1 = hnm0.f13359a;
        this.Q1 = new phf0("OneXGamesBonusesFragment.UM_RESULT_KEY", "");
        this.R1 = ltt0.o(this, mi8.f21831a);
        this.S1 = xbc.a0(this, sre0.f32672a.b(jm8.class), null, new hi8(this, (byte) 0), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        C().u0("SELECT_BALANCE_REQUEST_KEY", this, new k4r(this) { // from class: a.ii8
            public final /* synthetic */ ni8 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b2 = b;
                ni8 ni8Var = this.b;
                switch (b2) {
                    case 0:
                        yk5 yk5Var = ni8.U1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ni8Var.G0().x(new lh8(ql5Var));
                            }
                            break;
                        }
                        break;
                    default:
                        yk5 yk5Var2 = ni8.U1;
                        str.getClass();
                        if (str.equals("OneXGames.BONUS_NOT_USED_RESULT_KEY") && bundle2.containsKey("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY", csr.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY");
                                serializable2 = (csr) (serializable4 instanceof csr ? serializable4 : null);
                            }
                            csr csrVar = (csr) serializable2;
                            if (csrVar == null) {
                                csrVar = csr.e;
                            }
                            ni8Var.G0().x(new nh8(csrVar));
                        }
                        break;
                }
            }
        });
        if (this.O1 == null) {
            Intrinsics.h("wildFreeBetResultListener");
            throw null;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        sxs0.d(eVarC, this, new Function1(this) { // from class: a.ji8
            public final /* synthetic */ ni8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                ni8 ni8Var = this.b;
                switch (b2) {
                    case 0:
                        long jLongValue = ((Long) obj).longValue();
                        yk5 yk5Var = ni8.U1;
                        ni8Var.G0().x(new rh8(jLongValue));
                        return Unit.f46060a;
                    default:
                        GamesActionsFragmentResultModel gamesActionsFragmentResultModel = (GamesActionsFragmentResultModel) obj;
                        yk5 yk5Var2 = ni8.U1;
                        gamesActionsFragmentResultModel.getClass();
                        phf0 phf0Var = ni8Var.Q1;
                        iiy[] iiyVarArr = ni8.V1;
                        if (phf0Var.n(ni8Var, iiyVarArr[0]).length() > 0) {
                            o2t.c(ni8Var.F(), gamesActionsFragmentResultModel, phf0Var.n(ni8Var, iiyVarArr[0]));
                        }
                        if (gamesActionsFragmentResultModel instanceof GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance) {
                            ni8Var.G0().x(new mh8(((GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance) gamesActionsFragmentResultModel).f46721a));
                        } else if (gamesActionsFragmentResultModel.equals(GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a)) {
                            ni8Var.G0().x(oh8.f25255a);
                        } else if (!gamesActionsFragmentResultModel.equals(GamesActionsFragmentResultModel.PreviewActionBonusGamesUnderMaintenance.f46722a)) {
                            t9f.b();
                            return null;
                        }
                        return Unit.f46060a;
                }
            }
        });
        final byte b2 = 1;
        o2t.d(F(), this, "", new Function1(this) { // from class: a.ji8
            public final /* synthetic */ ni8 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                ni8 ni8Var = this.b;
                switch (b3) {
                    case 0:
                        long jLongValue = ((Long) obj).longValue();
                        yk5 yk5Var = ni8.U1;
                        ni8Var.G0().x(new rh8(jLongValue));
                        return Unit.f46060a;
                    default:
                        GamesActionsFragmentResultModel gamesActionsFragmentResultModel = (GamesActionsFragmentResultModel) obj;
                        yk5 yk5Var2 = ni8.U1;
                        gamesActionsFragmentResultModel.getClass();
                        phf0 phf0Var = ni8Var.Q1;
                        iiy[] iiyVarArr = ni8.V1;
                        if (phf0Var.n(ni8Var, iiyVarArr[0]).length() > 0) {
                            o2t.c(ni8Var.F(), gamesActionsFragmentResultModel, phf0Var.n(ni8Var, iiyVarArr[0]));
                        }
                        if (gamesActionsFragmentResultModel instanceof GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance) {
                            ni8Var.G0().x(new mh8(((GamesActionsFragmentResultModel.OneXGamesGameUnderMaintenance) gamesActionsFragmentResultModel).f46721a));
                        } else if (gamesActionsFragmentResultModel.equals(GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a)) {
                            ni8Var.G0().x(oh8.f25255a);
                        } else if (!gamesActionsFragmentResultModel.equals(GamesActionsFragmentResultModel.PreviewActionBonusGamesUnderMaintenance.f46722a)) {
                            t9f.b();
                            return null;
                        }
                        return Unit.f46060a;
                }
            }
        });
        F().u0("OneXGames.BONUS_NOT_USED_RESULT_KEY", this, new k4r(this) { // from class: a.ii8
            public final /* synthetic */ ni8 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                ni8 ni8Var = this.b;
                switch (b3) {
                    case 0:
                        yk5 yk5Var = ni8.U1;
                        str.getClass();
                        if (str.equals("SELECT_BALANCE_REQUEST_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                            } else {
                                Object serializable3 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                                serializable = (ql5) (serializable3 instanceof ql5 ? serializable3 : null);
                            }
                            ql5 ql5Var = (ql5) serializable;
                            if (ql5Var != null) {
                                ni8Var.G0().x(new lh8(ql5Var));
                            }
                            break;
                        }
                        break;
                    default:
                        yk5 yk5Var2 = ni8.U1;
                        str.getClass();
                        if (str.equals("OneXGames.BONUS_NOT_USED_RESULT_KEY") && bundle2.containsKey("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable2 = bundle2.getSerializable("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY", csr.class);
                            } else {
                                Object serializable4 = bundle2.getSerializable("OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY");
                                serializable2 = (csr) (serializable4 instanceof csr ? serializable4 : null);
                            }
                            csr csrVar = (csr) serializable2;
                            if (csrVar == null) {
                                csrVar = csr.e;
                            }
                            ni8Var.G0().x(new nh8(csrVar));
                        }
                        break;
                }
            }
        });
        Object objN = this.R1.n(V1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-1796993422, true, new tx(this, (byte) 10)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ei8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ei8 ei8Var = (ei8) (ze3Var instanceof ei8 ? ze3Var : null);
            if (ei8Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ls lsVar = ei8Var.f7845a;
                k9c k9cVar = ei8Var.b;
                p4u p4uVar = ei8Var.c;
                kyg0 kyg0Var = ei8Var.d;
                yoc yocVar = ei8Var.e;
                yoc yocVar2 = ei8Var.f;
                cdu cduVar = ei8Var.g;
                ntu ntuVar = ei8Var.h;
                lbu lbuVar = ei8Var.i;
                ycu ycuVar = ei8Var.j;
                dcu dcuVar = ei8Var.k;
                ix0 ix0Var = ei8Var.l;
                l7k l7kVar = ei8Var.m;
                ih5 ih5Var = ei8Var.n;
                hs60 hs60Var = ei8Var.o;
                ih5 ih5Var2 = ei8Var.p;
                duj dujVar = ei8Var.q;
                ctf0 ctf0Var = ei8Var.r;
                ocl oclVar = ei8Var.s;
                m1e m1eVar = ei8Var.t;
                gii0 gii0Var = ei8Var.u;
                q7d0 q7d0Var = ei8Var.v;
                btt0 btt0Var = ei8Var.w;
                pbt pbtVar = ei8Var.x;
                gst0 gst0Var = ei8Var.y;
                wdk0 wdk0Var = ei8Var.z;
                v88 v88Var = ei8Var.A;
                mct mctVar = ei8Var.B;
                cad cadVar = ei8Var.C;
                wsf0 wsf0Var = ei8Var.D;
                sxs0 sxs0Var = ei8Var.E;
                peg0 peg0Var = ei8Var.F;
                svs0 svs0Var = ei8Var.G;
                iw20 iw20Var = ei8Var.H;
                cmt cmtVar = ei8Var.I;
                ctf0Var.getClass();
                wdk0Var.getClass();
                m1eVar.getClass();
                gii0Var.getClass();
                q7d0Var.getClass();
                btt0Var.getClass();
                pbtVar.getClass();
                gst0Var.getClass();
                mctVar.getClass();
                this.K1 = (kai) new mai(cadVar, mctVar, wsf0Var, sxs0Var, peg0Var, svs0Var, iw20Var, lsVar, k9cVar, p4uVar, kyg0Var, yocVar, yocVar2, cduVar, ntuVar, lbuVar, ycuVar, dcuVar, ix0Var, l7kVar, ih5Var, hs60Var, ih5Var2, dujVar, ctf0Var, oclVar, wdk0Var, m1eVar, gii0Var, btt0Var, pbtVar, gst0Var, v88Var, i1w0VarF, cmtVar).j.get();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.L1 = ynbVarI;
                this.M1 = wdk0Var;
                byte b = 15;
                this.N1 = new uxs0(b);
                this.O1 = new sxs0(b);
                return;
            }
        }
        jf4.n(b1j.i(ei8.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        Serializable serializable;
        super.g0();
        Bundle bundle = this.g;
        Serializable serializable2 = null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("BonusesFeature.SOURCE_SCREEN", w3t.class);
            } else {
                Serializable serializable3 = bundle.getSerializable("BonusesFeature.SOURCE_SCREEN");
                serializable = (w3t) (serializable3 instanceof w3t ? serializable3 : null);
            }
            serializable2 = (w3t) serializable;
        }
        E0(serializable2 instanceof u3t);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.P1;
    }
}
