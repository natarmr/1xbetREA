package a;

import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/au1;", "La/yx5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class au1 extends yx5 {
    public fiu0 K1;
    public ynb L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public final e9o0 P1;
    public final a8z Q1;
    public final n0o0 R1;
    public final r34 S1;
    public final phf0 U1;
    public final yzn0 V1;
    public final cgx0 W1;
    public final boolean X1;
    public final boolean Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(au1.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorTournamentFullInfoBinding;", 0), new ez40(au1.class, "tournamentId", "getTournamentId()J", 0), new ez40(au1.class, "tournamentTitle", "getTournamentTitle()Ljava/lang/String;", 0), new ez40(au1.class, "tournamentPage", "getTournamentPage()Lorg/xplatform/aggregator/api/navigation/TournamentsPage;", 0), new ez40(au1.class, "openSingleGame", "getOpenSingleGame()Z", 0)};
    public static final jdk0 Z1 = new jdk0();

    public au1() {
        super(R.layout.fragment_aggregator_tournament_full_info);
        this.O1 = ltt0.o(this, zt1.f44933a);
        this.P1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, 12);
        this.Q1 = xbc.b0(this, sre0.f32672a.b(uv1.class), new xt1(this, (byte) 1));
        this.R1 = maz.b(new xt1(this, (byte) 2));
        this.S1 = new r34("TOURNAMENT_ITEM");
        this.U1 = new phf0("TOURNAMENT_TITLE");
        this.V1 = new yzn0("TOURNAMENT_PAGE_ITEM");
        this.W1 = new cgx0("TOURNAMENT_SINGLE_GAME");
        this.X1 = true;
        this.Y1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getZ1() {
        return this.Y1;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        n0().r().u0("REQUEST_KEY_TOURNAMENT_ACTION", K(), new k4r(this) { // from class: a.yt1
            public final /* synthetic */ au1 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b2 = b;
                au1 au1Var = this.b;
                switch (b2) {
                    case 0:
                        jdk0 jdk0Var = au1.Z1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable("TOURNAMENT_PAGE_ITEM", s9s0.class);
                        } else {
                            Object serializable3 = bundle2.getSerializable("TOURNAMENT_PAGE_ITEM");
                            serializable = (s9s0) (serializable3 instanceof s9s0 ? serializable3 : null);
                        }
                        s9s0 s9s0Var = (s9s0) serializable;
                        if (s9s0Var != null) {
                            au1Var.G0().x(new qs1(s9s0Var.ordinal()));
                        }
                        break;
                    case 1:
                        jdk0 jdk0Var2 = au1.Z1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable2 = bundle2.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                        } else {
                            Object serializable4 = bundle2.getSerializable("RESULT_TOURNAMENT_PAGE");
                            serializable2 = (s9s0) (serializable4 instanceof s9s0 ? serializable4 : null);
                        }
                        s9s0 s9s0Var2 = (s9s0) serializable2;
                        if (s9s0Var2 != null) {
                            au1Var.G0().x(new qs1(s9s0Var2.ordinal()));
                        }
                        break;
                    default:
                        jdk0 jdk0Var3 = au1.Z1;
                        str.getClass();
                        au1Var.G0().x(js1.f17028a);
                        break;
                }
            }
        });
        final byte b2 = 0;
        n0().r().u0("REQUEST_KEY_CLOSE_OTHER_TOURNAMENTS_FRAGMENTS", K(), new k4r(this) { // from class: a.yt1
            public final /* synthetic */ au1 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b3 = b2;
                au1 au1Var = this.b;
                switch (b3) {
                    case 0:
                        jdk0 jdk0Var = au1.Z1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable("TOURNAMENT_PAGE_ITEM", s9s0.class);
                        } else {
                            Object serializable3 = bundle2.getSerializable("TOURNAMENT_PAGE_ITEM");
                            serializable = (s9s0) (serializable3 instanceof s9s0 ? serializable3 : null);
                        }
                        s9s0 s9s0Var = (s9s0) serializable;
                        if (s9s0Var != null) {
                            au1Var.G0().x(new qs1(s9s0Var.ordinal()));
                        }
                        break;
                    case 1:
                        jdk0 jdk0Var2 = au1.Z1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable2 = bundle2.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                        } else {
                            Object serializable4 = bundle2.getSerializable("RESULT_TOURNAMENT_PAGE");
                            serializable2 = (s9s0) (serializable4 instanceof s9s0 ? serializable4 : null);
                        }
                        s9s0 s9s0Var2 = (s9s0) serializable2;
                        if (s9s0Var2 != null) {
                            au1Var.G0().x(new qs1(s9s0Var2.ordinal()));
                        }
                        break;
                    default:
                        jdk0 jdk0Var3 = au1.Z1;
                        str.getClass();
                        au1Var.G0().x(js1.f17028a);
                        break;
                }
            }
        });
        final byte b3 = 2;
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new k4r(this) { // from class: a.yt1
            public final /* synthetic */ au1 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Object serializable;
                Object serializable2;
                byte b4 = b3;
                au1 au1Var = this.b;
                switch (b4) {
                    case 0:
                        jdk0 jdk0Var = au1.Z1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable = bundle2.getSerializable("TOURNAMENT_PAGE_ITEM", s9s0.class);
                        } else {
                            Object serializable3 = bundle2.getSerializable("TOURNAMENT_PAGE_ITEM");
                            serializable = (s9s0) (serializable3 instanceof s9s0 ? serializable3 : null);
                        }
                        s9s0 s9s0Var = (s9s0) serializable;
                        if (s9s0Var != null) {
                            au1Var.G0().x(new qs1(s9s0Var.ordinal()));
                        }
                        break;
                    case 1:
                        jdk0 jdk0Var2 = au1.Z1;
                        str.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializable2 = bundle2.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                        } else {
                            Object serializable4 = bundle2.getSerializable("RESULT_TOURNAMENT_PAGE");
                            serializable2 = (s9s0) (serializable4 instanceof s9s0 ? serializable4 : null);
                        }
                        s9s0 s9s0Var2 = (s9s0) serializable2;
                        if (s9s0Var2 != null) {
                            au1Var.G0().x(new qs1(s9s0Var2.ordinal()));
                        }
                        break;
                    default:
                        jdk0 jdk0Var3 = au1.Z1;
                        str.getClass();
                        au1Var.G0().x(js1.f17028a);
                        break;
                }
            }
        });
        Object objN = this.O1.n(a2[0], this);
        objN.getClass();
        pkd.h(((wxq) objN).f39942a, new owp0(this), null, new ugd(437217905, true, new o00(this, (byte) 19)));
    }

    @Override // a.yx5
    public final void C0() {
        w7i w7iVar = (w7i) this.R1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(uv1.class, w7iVar.C));
        ynb ynbVarI = ((yzn0) w7iVar.y.b).i();
        x1x.x(ynbVarI);
        this.L1 = ynbVarI;
        this.M1 = w7iVar.z;
        this.N1 = w7iVar.A;
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new xt1(this, (byte) 0));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.X1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.P1;
    }
}
