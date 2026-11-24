package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ddl0;", "La/yx5;", "<init>", "()V", "a/cge0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ddl0 extends yx5 {
    public final hnm0 K1;
    public ii L1;
    public qui M1;
    public final boolean N1;
    public final khf0 O1;
    public final s0r P1;
    public final kiu0 Q1;
    public final a8z R1;
    public final a8z S1;
    public final v62 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(ddl0.class, "screenParams", "getScreenParams()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;", 0), new j0d0(ddl0.class, "binding", "getBinding()Lorg/xplatform/special_event/impl/databinding/FragmentSportGameFilterSelectionBinding;", 0)};
    public static final cge0 V1 = new cge0((byte) 27);
    public static final String X1 = ddl0.class.getSimpleName();

    public ddl0() {
        super(R.layout.fragment_sport_game_filter_selection);
        this.K1 = hnm0.f13359a;
        this.N1 = true;
        this.O1 = new khf0("BUNDLE_SCREEN_PARAMS");
        this.P1 = ltt0.o(this, adl0.f686a);
        zcl0 zcl0Var = new zcl0(this, (byte) 9);
        fyk0 fyk0Var = new fyk0(this, (byte) 3);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new fyk0(fyk0Var, (byte) 4));
        this.Q1 = agc.G(this, sre0.f32672a.b(ndl0.class), new cdl0(a8zVarA, (byte) 0), new cdl0(a8zVarA, (byte) 1), zcl0Var);
        this.R1 = maz.a(wezVar, new zcl0(this, (byte) 10));
        this.S1 = maz.a(wezVar, new zcl0(this, (byte) 1));
        this.U1 = new v62(this, (byte) 19);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.m(new qmk0(G().getDimensionPixelSize(R.dimen.space_8)));
        G0().d.setAdapter((rcl0) this.S1.getValue());
        DsNavigationBarBasic dsNavigationBarBasic = G0().e;
        TextWatcher textWatcher = (TextWatcher) this.R1.getValue();
        textWatcher.getClass();
        s96 s96Var = dsNavigationBarBasic.b;
        if (s96Var != null) {
            s96Var.f(textWatcher);
        }
        String strH = H(R.string.search);
        strH.getClass();
        dsNavigationBarBasic.setSearchHint(strH);
        ArrayList<gc50> arrayList = new ArrayList<>();
        ic50 ic50Var = ic50.c;
        byte b = 7;
        arrayList.add(new gc50("SEARCH_NAV_ITEM_KEY", ic50Var, R.drawable.ic_glyph_search, new fzk0((byte) 7), 1008));
        Class<ndl0> cls = ndl0.class;
        arrayList.add(new gc50("DISCARD_FILTERS_NAV_ITEM_KEY", ic50Var, R.drawable.ic_glyph_clear, new lph0(0, J0(), cls, "onClearBtnClicked", "onClearBtnClicked()V", 0, (byte) 18), 2032));
        G0().e.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, o0())));
        G0().e.setNavigationBarButtons(arrayList);
        dsNavigationBarBasic.setOnHideSearchBarClickListener(new zcl0(this, (byte) 4));
        dsNavigationBarBasic.b(new lph0(0, J0(), cls, "onBackClick", "onBackClick()V", 0, (byte) 19));
        zcl0 zcl0Var = new zcl0(this, (byte) 5);
        s96 s96Var2 = dsNavigationBarBasic.b;
        if (s96Var2 != null) {
            s96Var2.h(zcl0Var);
        }
        DsBottomBar dsBottomBar = G0().b;
        DsBottomBar dsBottomBar2 = G0().b;
        b0l0 b0l0Var = new b0l0(this, (byte) 1);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(dsBottomBar2, b0l0Var);
        dsBottomBar.setFirstButtonStyle(R.style.DSButton_Large_Secondary);
        dsBottomBar.setSecondButtonText(R.string.apply_action);
        dsBottomBar.setFirstButtonText(R.string.discard);
        DsBottomBar.u(dsBottomBar, new zcl0(this, (byte) 6));
        DsBottomBar.v(dsBottomBar, new zcl0(this, b));
        ccq0.V(this, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", new zcl0(this, (byte) 0));
        ccq0.V(this, "REQUEST_CLEAR_SPORT_GAMES_DIALOG_KEY", new zcl0(this, (byte) 8));
        ccq0.V(this, "REQUEST_APPLY_CHANGES_DIALOG_KEY", new zcl0(this, (byte) 2));
        ccq0.T(this, "REQUEST_APPLY_CHANGES_DIALOG_KEY", new zcl0(this, (byte) 3));
        n0().k().b(this.U1);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(scl0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            scl0 scl0Var = (scl0) (ze3Var instanceof scl0 ? ze3Var : null);
            if (scl0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParamsI0 = I0();
                LinkedHashMap linkedHashMap = xnk0.f41174a;
                String strB = xnk0.b(I0().f46965a, efx.v(this).f4046a);
                Application application2 = n0().getApplication();
                application2.getClass();
                xnk0.c(application2, strB);
                LinkedHashMap linkedHashMap2 = n8l0.f23096a;
                lui luiVar = (lui) n8l0.f23096a.get(n8l0.b(I0().f46965a, efx.v(this).f4046a, I0().b));
                if (luiVar == null) {
                    jf4.n("Can't find feature provider!");
                    return;
                }
                i1w0VarF.getClass();
                j1q0 j1q0Var = scl0Var.f31991a;
                d1p d1pVar = scl0Var.f;
                cad cadVar = scl0Var.b;
                duj dujVar = scl0Var.e;
                m1e m1eVar = scl0Var.d;
                ii iiVar = scl0Var.g;
                g2v g2vVar = scl0Var.c;
                yo4 yo4Var = scl0Var.h;
                sjl0 sjl0Var = scl0Var.i;
                b4j b4jVar = scl0Var.j;
                d1pVar.getClass();
                j1q0Var.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                sjl0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = sportGameFilterSelectionScreenParamsI0;
                ruVar.c = cadVar;
                ruVar.b = dujVar;
                ruVar.d = g2vVar;
                ruVar.e = i1w0VarF;
                ruVar.f = luiVar;
                ruVar.g = yo4Var;
                ruVar.h = d1pVar;
                ruVar.i = b4jVar;
                ruVar.j = n0k0.a(new rti(ruVar, (byte) 7));
                this.L1 = iiVar;
                this.M1 = (qui) ((n5d0) ruVar.j).get();
                return;
            }
        }
        jf4.n(b1j.i(scl0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = J0().m;
        Class<ddl0> cls = ddl0.class;
        bdl0 bdl0Var = new bdl0(2, this, cls, "onSportGameFilterSelectionEventHandled", "onSportGameFilterSelectionEventHandled(Lorg/xplatform/special_event/impl/filter/presentation/model/SportGameFilterSelectionEvent;)V", 4, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new myj0(p7m0Var, clzVarW, bdl0Var, (yje) null), 3);
        qaf0 qaf0Var = new qaf0(J0().n, (byte) 11);
        bdl0 bdl0Var2 = new bdl0(2, this, cls, "onSportGameFilterSelectionUiState", "onSportGameFilterSelectionUiState(Lorg/xplatform/special_event/impl/filter/presentation/model/SportGameFilterSelectionUiState;)V", 4, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new myj0(qaf0Var, clzVarW2, bdl0Var2, (yje) null), 3);
    }

    public final a5r G0() {
        Object objN = this.P1.n(W1[1], this);
        objN.getClass();
        return (a5r) objN;
    }

    public final ukm H0() {
        s96 s96Var = G0().e.b;
        if (s96Var != null) {
            return s96Var.b("DISCARD_FILTERS_NAV_ITEM_KEY");
        }
        return null;
    }

    public final SportGameFilterSelectionScreenParams I0() {
        return (SportGameFilterSelectionScreenParams) this.O1.n(this, W1[0]);
    }

    public final ndl0 J0() {
        return (ndl0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        a5r a5rVarG0 = G0();
        a5rVarG0.d.setAdapter(null);
        this.U1.e();
        DsNavigationBarBasic dsNavigationBarBasic = a5rVarG0.e;
        TextWatcher textWatcher = (TextWatcher) this.R1.getValue();
        textWatcher.getClass();
        s96 s96Var = dsNavigationBarBasic.b;
        if (s96Var != null) {
            s96Var.d(textWatcher);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.N1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
