package a;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.daily_tournament.presentation.ForegroundImageView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/u2s0;", "La/yx5;", "La/a0s0;", "<init>", "()V", "a/s2m0", "daily_tournament"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u2s0 extends yx5 implements a0s0 {
    public final hnm0 K1;
    public final e9o0 L1;
    public cyi M1;
    public final kiu0 N1;
    public final n0o0 O1;
    public final cgx0 P1;
    public final phf0 Q1;
    public final phf0 R1;
    public final phf0 S1;
    public final s0r U1;
    public final n0o0 V1;
    public final n0o0 W1;
    public static final /* synthetic */ iiy[] Y1 = {new ez40(u2s0.class, "fromGames", "getFromGames()Z", 0), new ez40(u2s0.class, "tournamentTitle", "getTournamentTitle()Ljava/lang/String;", 0), new ez40(u2s0.class, "tournamentBgName", "getTournamentBgName()Ljava/lang/String;", 0), new ez40(u2s0.class, "tournamentPrizeName", "getTournamentPrizeName()Ljava/lang/String;", 0), new j0d0(u2s0.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/daily_tournament/databinding/FragmentPagerDailyTournamentBinding;", 0)};
    public static final s2m0 X1 = new s2m0();

    public u2s0() {
        super(R.layout.fragment_pager_daily_tournament);
        this.K1 = hnm0.f13359a;
        bp3 bp3Var = bp3.f2960a;
        this.L1 = new e9o0(R.attr.uikitBackgroundDark, R.attr.uikitBackground, 8);
        s2s0 s2s0Var = new s2s0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 18), (byte) 19));
        this.N1 = agc.G(this, sre0.f32672a.b(o6j.class), new p7r0(a8zVarA, (byte) 12), new p7r0(a8zVarA, (byte) 13), s2s0Var);
        this.O1 = maz.b(new s2s0(this, (byte) 2));
        this.P1 = new cgx0("FROM_GAMES");
        this.Q1 = new phf0("TOURNAMENT_TITLE");
        this.R1 = new phf0("TOURNAMENT_BG_NAME");
        this.S1 = new phf0("TOURNAMENT_PRIZE_NAME");
        this.U1 = ltt0.o(this, t2s0.f33231a);
        this.V1 = maz.b(new s2s0(this, (byte) 3));
        this.W1 = maz.b(new s2s0(this, (byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new s2s0(this, (byte) 0));
        G0().i.l(R.menu.menu_one_x_games_fg);
        G0().i.setNavigationIcon(epv0.U(R.drawable.ic_back_games, o0()));
        G0().i.setNavigationOnClickListener(new jpe0(this, (byte) 14));
        G0().i.setOnMenuItemClickListener(new b0l0(this, (byte) 21));
        CollapsingToolbarLayout collapsingToolbarLayout = G0().e;
        iiy[] iiyVarArr = Y1;
        collapsingToolbarLayout.setTitle(this.Q1.n(this, iiyVarArr[1]));
        CollapsingToolbarLayout collapsingToolbarLayout2 = G0().e;
        TypedValue typedValue = j5d.f15927a;
        collapsingToolbarLayout2.setContentScrimColor(j5d.a(o0(), R.attr.uikitBackgroundDark, false));
        G0().e.setExpandedTitleTextAppearance(R.style.TextAppearance_AppTheme_New_AppBar);
        G0().e.setCollapsedTitleTextAppearance(R.style.TextAppearance_AppTheme_New_AppBar);
        G0().e.setStatusBarScrimColor(-1);
        G0().b.a((ub3) this.V1.getValue());
        List list = u0d.f34849a;
        ForegroundImageView foregroundImageView = G0().f;
        String strQ = ghm0.q(this.R1.n(this, iiyVarArr[2]));
        h2x h2xVar = h2x.f12357a;
        u0d.j(foregroundImageView, strQ, R.drawable.plug_news, 0, kotlin.collections.a.c(h2xVar), null, null, 460);
        ImageView imageView = G0().g;
        iiy iiyVar = iiyVarArr[3];
        phf0 phf0Var = this.S1;
        if (phf0Var.n(this, iiyVar).length() > 0) {
            u0d.j(imageView, ghm0.q(phf0Var.n(this, iiyVarArr[3])), R.drawable.plug_news, 0, kotlin.collections.a.c(h2xVar), null, null, 460);
        }
        imageView.setVisibility(phf0Var.n(this, iiyVarArr[3]).length() == 0 ? 4 : 0);
        G0().l.setAdapter(new u7s0(C(), this.u1));
        G0().l.c((nju0) this.W1.getValue());
        new uii(G0().h, G0().l, new lcr0(this, (byte) 8)).b();
        knm0.i(G0().c, false);
    }

    @Override // a.yx5
    public final void C0() {
        this.M1 = (cyi) ((dyi) this.O1.getValue()).f.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().k;
        rtq0 rtq0Var = new rtq0(this, null, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0((gmq) p7m0Var, clzVarW, rtq0Var, (yje) null, (byte) 0), 3);
    }

    public final o2r G0() {
        Object objN = this.U1.n(Y1[4], this);
        objN.getClass();
        return (o2r) objN;
    }

    public final o6j H0() {
        return (o6j) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.f((ub3) this.V1.getValue());
        G0().l.g((nju0) this.W1.getValue());
        p7m0 p7m0Var = H0().j;
        Boolean bool = Boolean.FALSE;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        super.Z();
    }

    @Override // a.a0s0
    public final dyi s() {
        return (dyi) this.O1.getValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.L1;
    }
}
