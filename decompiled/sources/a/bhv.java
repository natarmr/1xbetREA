package a;

import android.content.ComponentCallbacks2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTwoButtons;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/bhv;", "La/stl;", "La/chv;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bhv extends stl<chv> {
    public static final /* synthetic */ int k2 = 0;
    public fiu0 g2;
    public final kiu0 h2;
    public final n0o0 i2;
    public final n0o0 j2;

    public bhv() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.ahv
            public final /* synthetic */ bhv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                bhv bhvVar = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = bhvVar.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        int i = bhv.k2;
                        vft vftVar = new vft(1, (ghv) bhvVar.h2.getValue(), ghv.class, "onFilterSelected", "onFilterSelected(I)V", 0, (byte) 9);
                        mw40 mw40Var = new mw40();
                        ((dp) mw40Var.e).b(new gbn(new s3t((byte) 10), new atq(3, (byte) 29), new t3t(vftVar, (byte) 18), fvr.y));
                        return mw40Var;
                    default:
                        int i2 = bhv.k2;
                        View viewInflate = LayoutInflater.from(bhvVar.D()).inflate(R.layout.group_multi_select_bottom_sheet, (ViewGroup) null, false);
                        int i3 = R.id.actionButtons;
                        DsPresetTwoButtons dsPresetTwoButtons = (DsPresetTwoButtons) yum0.f(viewInflate, R.id.actionButtons);
                        if (dsPresetTwoButtons != null) {
                            i3 = R.id.rvFilters;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvFilters);
                            if (recyclerView != null) {
                                return new chv((LinearLayout) viewInflate, dsPresetTwoButtons, recyclerView);
                            }
                        }
                        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 12), (byte) 13));
        this.h2 = agc.G(this, sre0.f32672a.b(ghv.class), new r6p(a8zVarA, (byte) 26), new r6p(a8zVarA, (byte) 27), function0);
        final byte b2 = 1;
        this.i2 = maz.b(new Function0(this) { // from class: a.ahv
            public final /* synthetic */ bhv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                bhv bhvVar = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = bhvVar.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        int i = bhv.k2;
                        vft vftVar = new vft(1, (ghv) bhvVar.h2.getValue(), ghv.class, "onFilterSelected", "onFilterSelected(I)V", 0, (byte) 9);
                        mw40 mw40Var = new mw40();
                        ((dp) mw40Var.e).b(new gbn(new s3t((byte) 10), new atq(3, (byte) 29), new t3t(vftVar, (byte) 18), fvr.y));
                        return mw40Var;
                    default:
                        int i2 = bhv.k2;
                        View viewInflate = LayoutInflater.from(bhvVar.D()).inflate(R.layout.group_multi_select_bottom_sheet, (ViewGroup) null, false);
                        int i3 = R.id.actionButtons;
                        DsPresetTwoButtons dsPresetTwoButtons = (DsPresetTwoButtons) yum0.f(viewInflate, R.id.actionButtons);
                        if (dsPresetTwoButtons != null) {
                            i3 = R.id.rvFilters;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvFilters);
                            if (recyclerView != null) {
                                return new chv((LinearLayout) viewInflate, dsPresetTwoButtons, recyclerView);
                            }
                        }
                        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                        return null;
                }
            }
        });
        final byte b3 = 2;
        this.j2 = maz.b(new Function0(this) { // from class: a.ahv
            public final /* synthetic */ bhv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                bhv bhvVar = this.b;
                switch (b4) {
                    case 0:
                        fiu0 fiu0Var = bhvVar.g2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        int i = bhv.k2;
                        vft vftVar = new vft(1, (ghv) bhvVar.h2.getValue(), ghv.class, "onFilterSelected", "onFilterSelected(I)V", 0, (byte) 9);
                        mw40 mw40Var = new mw40();
                        ((dp) mw40Var.e).b(new gbn(new s3t((byte) 10), new atq(3, (byte) 29), new t3t(vftVar, (byte) 18), fvr.y));
                        return mw40Var;
                    default:
                        int i2 = bhv.k2;
                        View viewInflate = LayoutInflater.from(bhvVar.D()).inflate(R.layout.group_multi_select_bottom_sheet, (ViewGroup) null, false);
                        int i3 = R.id.actionButtons;
                        DsPresetTwoButtons dsPresetTwoButtons = (DsPresetTwoButtons) yum0.f(viewInflate, R.id.actionButtons);
                        if (dsPresetTwoButtons != null) {
                            i3 = R.id.rvFilters;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvFilters);
                            if (recyclerView != null) {
                                return new chv((LinearLayout) viewInflate, dsPresetTwoButtons, recyclerView);
                            }
                        }
                        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                        return null;
                }
            }
        });
    }

    @Override // a.stl
    public final yfu0 Q0() {
        Object value = this.j2.getValue();
        value.getClass();
        return (chv) value;
    }

    @Override // a.stl
    public final void S0() {
        n0o0 n0o0Var = this.j2;
        Object value = n0o0Var.getValue();
        value.getClass();
        RecyclerView recyclerView = ((chv) value).c;
        recyclerView.setLayoutManager(new LinearLayoutManager(o0()));
        recyclerView.setAdapter((mw40) this.i2.getValue());
        recyclerView.m(new vwk(epv0.U(R.drawable.divider_drawable, recyclerView.getContext()), recyclerView.getResources().getDimensionPixelSize(R.dimen.size_16)));
        String string = G().getString(R.string.group_filter);
        string.getClass();
        I0(new kp8(string, R.style.TextStyle_Title_Bold_M));
        Object value2 = n0o0Var.getValue();
        value2.getClass();
        DsPresetTwoButtons dsPresetTwoButtons = ((chv) value2).b;
        final byte b = 0;
        dsPresetTwoButtons.setFirstButtonClickListener(new View.OnClickListener(this) { // from class: a.zgv
            public final /* synthetic */ bhv b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                bhv bhvVar = this.b;
                switch (b2) {
                    case 0:
                        int i = bhv.k2;
                        ghv ghvVar = (ghv) bhvVar.h2.getValue();
                        zrc zrcVar = ghvVar.b;
                        List<phv> list = ((fhv) ghvVar.d.getValue()).f9561a;
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (phv phvVar : list) {
                            phvVar.getClass();
                            String str = phvVar.b;
                            str.getClass();
                            arrayList.add(new tyl0(str, true));
                        }
                        zrcVar.a(arrayList);
                        bhvVar.x0();
                        break;
                    default:
                        int i2 = bhv.k2;
                        ghv ghvVar2 = (ghv) bhvVar.h2.getValue();
                        zrc zrcVar2 = ghvVar2.b;
                        List<phv> list2 = ((fhv) ghvVar2.d.getValue()).f9561a;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (phv phvVar2 : list2) {
                            phvVar2.getClass();
                            arrayList2.add(new tyl0(phvVar2.b, phvVar2.c));
                        }
                        zrcVar2.a(arrayList2);
                        bhvVar.x0();
                        break;
                }
            }
        });
        final byte b2 = 1;
        dsPresetTwoButtons.setSecondButtonClickListener(new View.OnClickListener(this) { // from class: a.zgv
            public final /* synthetic */ bhv b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                bhv bhvVar = this.b;
                switch (b3) {
                    case 0:
                        int i = bhv.k2;
                        ghv ghvVar = (ghv) bhvVar.h2.getValue();
                        zrc zrcVar = ghvVar.b;
                        List<phv> list = ((fhv) ghvVar.d.getValue()).f9561a;
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (phv phvVar : list) {
                            phvVar.getClass();
                            String str = phvVar.b;
                            str.getClass();
                            arrayList.add(new tyl0(str, true));
                        }
                        zrcVar.a(arrayList);
                        bhvVar.x0();
                        break;
                    default:
                        int i2 = bhv.k2;
                        ghv ghvVar2 = (ghv) bhvVar.h2.getValue();
                        zrc zrcVar2 = ghvVar2.b;
                        List<phv> list2 = ((fhv) ghvVar2.d.getValue()).f9561a;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (phv phvVar2 : list2) {
                            phvVar2.getClass();
                            arrayList2.add(new tyl0(phvVar2.b, phvVar2.c));
                        }
                        zrcVar2.a(arrayList2);
                        bhvVar.x0();
                        break;
                }
            }
        });
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dhv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dhv dhvVar = (dhv) (ze3Var instanceof dhv ? ze3Var : null);
            if (dhvVar != null) {
                a4n0.f(this).getClass();
                cad cadVar = dhvVar.f6110a;
                gii0 gii0Var = dhvVar.b;
                m1e m1eVar = dhvVar.c;
                sjl0 sjl0Var = dhvVar.d;
                l2m0 l2m0Var = dhvVar.e;
                knf0 knf0Var = dhvVar.f;
                ctf0 ctf0Var = dhvVar.g;
                gii0Var.getClass();
                m1eVar.getClass();
                sjl0Var.getClass();
                l2m0Var.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = cadVar;
                esg0Var.b = gii0Var;
                esg0Var.c = l2m0Var;
                esg0Var.d = knf0Var;
                byte b = 26;
                esg0Var.e = mbl.b(new f7i(esg0Var, 1, b));
                esg0Var.f = new f7i(esg0Var, 0, b);
                this.g2 = new fiu0(Collections.singletonMap(ghv.class, (f7i) esg0Var.f));
                return;
            }
        }
        jf4.n(b1j.i(dhv.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        p7m0 p7m0Var = ((ghv) this.h2.getValue()).d;
        j0s j0sVar = new j0s(this, null, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hgv(p7m0Var, clzVarW, j0sVar, (yje) null), 3);
    }
}
