package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextWatcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ik30;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ik30 extends yx5 {
    public final hnm0 K1;
    public final boolean L1;
    public final zz2 M1;
    public kli N1;
    public final s0r O1;
    public final bg5 P1;
    public final kiu0 Q1;
    public LinearLayoutManager R1;
    public final v62 S1;
    public final bp U1;
    public final n0o0 V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(ik30.class, "eventId", "getEventId()I", 0), new j0d0(ik30.class, "viewBinding", "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentMedalStatisticBinding;", 0)};
    public static final atz W1 = new atz();
    public static final String Y1 = ik30.class.getSimpleName();

    public ik30() {
        super(R.layout.fragment_medal_statistic);
        this.K1 = hnm0.f13359a;
        final byte b = 1;
        this.L1 = true;
        this.M1 = new zz2("SPECIAL_EVENT_ID_BUNDLE_KEY");
        this.O1 = ltt0.o(this, hk30.f13191a);
        bg5 bg5Var = new bg5();
        bg5Var.d.b(new gbn(new ei20((byte) 22), new tvx(3, (byte) 24), new tr20((byte) 10), gvy.z));
        this.P1 = bg5Var;
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.gk30
            public final /* synthetic */ ik30 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ik30 ik30Var = this.b;
                switch (b3) {
                    case 0:
                        kli kliVar = ik30Var.N1;
                        if (kliVar != null) {
                            return new q0h0(kliVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        atz atzVar = ik30.W1;
                        return new da0(new b530(ik30Var, (byte) 3));
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 19), (byte) 20));
        this.Q1 = agc.G(this, sre0.f32672a.b(zk30.class), new y620(a8zVarA, (byte) 10), new y620(a8zVarA, (byte) 11), function0);
        this.S1 = new v62(this, (byte) 12);
        this.U1 = new bp(new fk30(this, (byte) 1), new p0z(this, (byte) 14), 11);
        this.V1 = maz.b(new Function0(this) { // from class: a.gk30
            public final /* synthetic */ ik30 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                ik30 ik30Var = this.b;
                switch (b3) {
                    case 0:
                        kli kliVar = ik30Var.N1;
                        if (kliVar != null) {
                            return new q0h0(kliVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        atz atzVar = ik30.W1;
                        return new da0(new b530(ik30Var, (byte) 3));
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ArrayList<gc50> arrayList = new ArrayList<>();
        ic50 ic50Var = ic50.b;
        arrayList.add(new gc50("SEARCH_NAV_ITEM_KEY", ic50Var, R.drawable.ic_glyph_search, new gj30((byte) 4), 1008));
        arrayList.add(new gc50("FILTER_NAV_ITEM_ID", ic50Var, R.drawable.ic_glyph_filter_inactive, new o0t(0, H0(), zk30.class, "onDisciplineFilterClick", "onDisciplineFilterClick()V", 0, (byte) 27), 2032));
        DsNavigationBarBasic dsNavigationBarBasic = G0().g;
        String string = dsNavigationBarBasic.getResources().getString(R.string.search_by_country);
        string.getClass();
        dsNavigationBarBasic.setSearchHint(string);
        dsNavigationBarBasic.setNavigationBarButtons(arrayList);
        o0t o0tVar = new o0t(0, H0(), zk30.class, "onSearchClick", "onSearchClick()V", 0, (byte) 25);
        s96 s96Var = dsNavigationBarBasic.b;
        if (s96Var != null) {
            s96Var.h(o0tVar);
        }
        Context context = dsNavigationBarBasic.getContext();
        context.getClass();
        dsNavigationBarBasic.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context)));
        dsNavigationBarBasic.b(new o0t(0, H0(), zk30.class, "onBackPressed", "onBackPressed()V", 0, (byte) 26));
        TextWatcher textWatcher = (TextWatcher) this.V1.getValue();
        textWatcher.getClass();
        s96 s96Var2 = dsNavigationBarBasic.b;
        if (s96Var2 != null) {
            s96Var2.f(textWatcher);
        }
        G0().f.setOnRefreshListener(new viq(this, (byte) 20));
        this.R1 = new LinearLayoutManager(o0(), 1, false);
        bp bpVar = this.U1;
        bg5 bg5Var = this.P1;
        bg5Var.v(bpVar);
        G0().e.setLayoutManager(this.R1);
        G0().e.setItemAnimator(null);
        G0().e.setAdapter(bg5Var);
        vvw.o(G0().e, true, 1);
        sj3.A0(this, "KEY_PICKER_SELECTED_DISCIPLINE_REQUEST", new fk30(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ek30.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ek30 ek30Var = (ek30) (ze3Var instanceof ek30 ? ze3Var : null);
            if (ek30Var != null) {
                Integer numN = this.M1.n(this, X1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                String simpleName = ik30.class.getSimpleName();
                i1w0VarF.getClass();
                cad cadVar = ek30Var.f7936a;
                knf0 knf0Var = ek30Var.b;
                gii0 gii0Var = ek30Var.c;
                ctf0 ctf0Var = ek30Var.d;
                g2v g2vVar = ek30Var.e;
                ygm0 ygm0Var = ek30Var.g;
                m1e m1eVar = ek30Var.f;
                d1p d1pVar = ek30Var.h;
                yo4 yo4Var = ek30Var.i;
                d1pVar.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                ygm0Var.getClass();
                this.N1 = (kli) ((n5d0) new daf(cadVar, d1pVar, simpleName, i1w0VarF, numN, knf0Var, gii0Var, g2vVar, m1eVar, ygm0Var, yo4Var).m).get();
                return;
            }
        }
        jf4.n(b1j.i(ek30.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        wk30 wk30Var = new wk30(H0().n, (byte) 0);
        vf20 vf20Var = new vf20(2, this, ik30.class, "handleUiState", "handleUiState(Lorg/xplatform/special_event/impl/medal_statistic/presentation/MedalStatisticUiStateModel;)V", 4, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new mw20(wk30Var, clzVarW, vf20Var, (yje) null), 3);
        p7m0 p7m0Var = H0().o;
        vf20 vf20Var2 = new vf20(2, this, ik30.class, "handleSingleEvents", "handleSingleEvents(Lorg/xplatform/special_event/impl/medal_statistic/presentation/SingleEvent;)V", 4, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new mw20(p7m0Var, clzVarW2, vf20Var2, (yje) null), 3);
    }

    public final a2r G0() {
        Object objN = this.O1.n(X1[1], this);
        objN.getClass();
        return (a2r) objN;
    }

    public final zk30 H0() {
        return (zk30) this.Q1.getValue();
    }

    public final void I0() {
        G0().c.b.setVisibility(8);
        x0x.O(G0().c.b);
    }

    public final void J0(boolean z) {
        s96 s96Var = G0().g.b;
        ukm ukmVarB = s96Var != null ? s96Var.b("FILTER_NAV_ITEM_ID") : null;
        if (ukmVarB != null) {
            ukmVarB.setNavigationBarButtonAlpha(!z);
        }
        s96 s96Var2 = G0().g.b;
        ukm ukmVarB2 = s96Var2 != null ? s96Var2.b("FILTER_NAV_ITEM_ID") : null;
        if (ukmVarB2 != null) {
            ukmVarB2.setNavigationBarButtonEnable(z);
        }
        s96 s96Var3 = G0().g.b;
        ukm ukmVarB3 = s96Var3 != null ? s96Var3.b("SEARCH_NAV_ITEM_KEY") : null;
        if (ukmVarB3 != null) {
            ukmVarB3.setNavigationBarButtonAlpha(!z);
        }
        s96 s96Var4 = G0().g.b;
        ukm ukmVarB4 = s96Var4 != null ? s96Var4.b("SEARCH_NAV_ITEM_KEY") : null;
        if (ukmVarB4 != null) {
            ukmVarB4.setNavigationBarButtonEnable(z);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        this.P1.y(this.U1);
        DsNavigationBarBasic dsNavigationBarBasic = G0().g;
        TextWatcher textWatcher = (TextWatcher) this.V1.getValue();
        textWatcher.getClass();
        s96 s96Var = dsNavigationBarBasic.b;
        if (s96Var != null) {
            s96Var.d(textWatcher);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        this.S1.e();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        n0().k().b(this.S1);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.L1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
