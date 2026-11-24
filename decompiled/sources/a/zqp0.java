package a;

import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zqp0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zqp0 extends yx5 {
    public final hnm0 K1;
    public ii L1;
    public qwi M1;
    public final boolean N1;
    public final zz2 O1;
    public final r34 P1;
    public final s0r Q1;
    public final kiu0 R1;
    public final a8z S1;
    public final v62 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(zqp0.class, "eventId", "getEventId()I", 0), new ez40(zqp0.class, "sportId", "getSportId()J", 0), new j0d0(zqp0.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentTeamsSelectorBinding;", 0)};
    public static final y2m0 V1 = new y2m0((byte) 16);
    public static final String X1 = zqp0.class.getSimpleName();

    public zqp0() {
        super(R.layout.fragment_teams_selector);
        this.K1 = hnm0.f13359a;
        this.N1 = true;
        this.O1 = new zz2("BUNDLE_EVENT_ID");
        this.P1 = new r34("BUNDLE_SPORT_ID");
        this.Q1 = ltt0.o(this, yqp0.f43086a);
        wqp0 wqp0Var = new wqp0(this, (byte) 0);
        mfo0 mfo0Var = new mfo0(this, (byte) 11);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new mfo0(mfo0Var, (byte) 12));
        this.R1 = agc.G(this, sre0.f32672a.b(urp0.class), new r5p0(a8zVarA, (byte) 4), new r5p0(a8zVarA, (byte) 5), wqp0Var);
        this.S1 = maz.a(wezVar, new wqp0(this, (byte) 2));
        this.U1 = new v62(this, (byte) 24);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        int i;
        t5r t5rVarG0 = G0();
        RecyclerView recyclerView = t5rVarG0.e;
        DsNavigationBarBasic dsNavigationBarBasic = t5rVarG0.d;
        DsBottomBar dsBottomBar = t5rVarG0.b;
        recyclerView.setAdapter((vqp0) this.S1.getValue());
        recyclerView.setItemAnimator(null);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize3 = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.space_24);
        if (o0().getResources().getBoolean(R.bool.isTablet)) {
            i = R.bool.isTablet;
            recyclerView.m(new qmk0(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, 1, null, null, 448));
        } else {
            i = R.bool.isTablet;
            recyclerView.m(new qmk0(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 1, null, null, 448));
        }
        if (o0().getResources().getBoolean(i)) {
            int dimensionPixelSize4 = o0().getResources().getDimensionPixelSize(R.dimen.space_24);
            G0().f.b.setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
        } else {
            G0().f.b.setPadding(0, 0, 0, 0);
        }
        dsNavigationBarBasic.setTitle(H(R.string.choice_teams));
        dsBottomBar.setFirstButtonStyle(R.style.DSButton_Large_Secondary);
        dsBottomBar.setSecondButtonText(R.string.apply_action);
        dsBottomBar.setFirstButtonText(R.string.discard);
        DsBottomBar.u(dsBottomBar, new wqp0(this, (byte) 3));
        DsBottomBar.v(dsBottomBar, new wqp0(this, (byte) 4));
        G0().d.setNavigationBarButtons(q3d.e(new gc50("CLEAR_BUTTON", ic50.b, R.drawable.ic_glyph_clear, new wqp0(this, (byte) 5), 2032)));
        G0().d.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, o0())));
        DsBottomBar dsBottomBar2 = G0().b;
        b0l0 b0l0Var = new b0l0(this, (byte) 16);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(dsBottomBar2, b0l0Var);
        dsNavigationBarBasic.b(new wqp0(this, (byte) 6));
        ccq0.V(this, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", new cym0(0, H0(), urp0.class, "resetSelectedTeams", "resetSelectedTeams()V", 0, (byte) 11));
        ccq0.T(this, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", new wqp0(this, (byte) 1));
        ccq0.V(this, "REQUEST_CLEAR_TEAMS_DIALOG_KEY", new cym0(0, H0(), urp0.class, "onClearTeams", "onClearTeams()V", 0, (byte) 10));
        ccq0.T(this, "REQUEST_CLEAR_TEAMS_DIALOG_KEY", new wqp0(this, (byte) 9));
        ccq0.V(this, "REQUEST_APPLY_CHANGES_DIALOG_KEY", new wqp0(this, (byte) 7));
        ccq0.T(this, "REQUEST_APPLY_CHANGES_DIALOG_KEY", new wqp0(this, (byte) 8));
        n0().k().b(this.U1);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(arp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            arp0 arp0Var = (arp0) (ze3Var instanceof arp0 ? ze3Var : null);
            if (arp0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = W1;
                Integer numN = this.O1.n(this, iiyVarArr[0]);
                Long lN = this.P1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                j1q0 j1q0Var = arp0Var.f1358a;
                vby vbyVar = arp0Var.f;
                ii iiVar = arp0Var.k;
                knf0 knf0Var = arp0Var.d;
                q7d0 q7d0Var = arp0Var.e;
                gii0 gii0Var = arp0Var.g;
                cad cadVar = arp0Var.b;
                ctf0 ctf0Var = arp0Var.c;
                duj dujVar = arp0Var.j;
                m1e m1eVar = arp0Var.i;
                g2v g2vVar = arp0Var.h;
                aqp0 aqp0Var = arp0Var.l;
                d1p d1pVar = arp0Var.m;
                yo4 yo4Var = arp0Var.n;
                d1pVar.getClass();
                j1q0Var.getClass();
                iiVar.getClass();
                knf0Var.getClass();
                vbyVar.getClass();
                m1eVar.getClass();
                q7d0Var.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                aqp0Var.getClass();
                v7i v7iVar = new v7i(cadVar, d1pVar, iiVar, numN, lN, knf0Var, m1eVar, gii0Var, ctf0Var, g2vVar, dujVar, i1w0VarF, aqp0Var, yo4Var);
                this.L1 = iiVar;
                this.M1 = (qwi) ((n5d0) v7iVar.o).get();
                return;
            }
        }
        jf4.n(b1j.i(arp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        urp0 urp0VarH0 = H0();
        dnq dnqVar = new dnq(new fnq(urp0VarH0.p, new tmg0(urp0VarH0, null, (byte) 29)), new sye0(urp0VarH0, null, (byte) 14), (byte) 0);
        bdl0 bdl0Var = new bdl0(2, this, zqp0.class, "onTeamsSelectorUiState", "onTeamsSelectorUiState(Lorg/xplatform/special_event/impl/teams/presentation/TeamsSelectorViewModel$TeamsSelectorUiState;)V", 4, (byte) 6);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0(dnqVar, clzVarW, bdl0Var, (yje) null), 3);
        p7m0 p7m0Var = H0().q;
        bdl0 bdl0Var2 = new bdl0(2, this, zqp0.class, "onSelectedTeamsUiState", "onSelectedTeamsUiState(Lorg/xplatform/special_event/impl/teams/presentation/TeamsSelectorViewModel$SelectedTeamsUiState;)V", 4, (byte) 7);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new lto0((gmq) p7m0Var, clzVarW2, bdl0Var2, (yje) null), 3);
        ol60 ol60Var = H0().t;
        bdl0 bdl0Var3 = new bdl0(2, this, zqp0.class, "onSingleEventHandled", "onSingleEventHandled(Lorg/xplatform/special_event/impl/teams/presentation/TeamsSelectorViewModel$SingleEvent;)V", 4, (byte) 8);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new lto0((gmq) ol60Var, clzVarW3, bdl0Var3, (yje) null, (byte) 0), 3);
    }

    public final t5r G0() {
        Object objN = this.Q1.n(W1[2], this);
        objN.getClass();
        return (t5r) objN;
    }

    public final urp0 H0() {
        return (urp0) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().e.setAdapter(null);
        this.U1.e();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
