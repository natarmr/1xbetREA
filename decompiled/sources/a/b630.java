package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/b630;", "La/by5;", "La/yik;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b630 extends by5<yik> {
    public evz b2;
    public fiu0 c2;
    public ii d2;
    public final int e2 = R.attr.uikitBackgroundContent;
    public final kiu0 f2;
    public final phf0 g2;
    public final r34 h2;
    public final nae0 i2;
    public final a8z j2;
    public vyx k2;
    public final a8z l2;
    public static final /* synthetic */ iiy[] n2 = {new ez40(b630.class, "componentKey", "getComponentKey()Ljava/lang/String;", 0), new ez40(b630.class, "subGameId", "getSubGameId()J", 0), new j0d0(b630.class, "binding", "getBinding()Lorg/xplatform/sportgame/markets/settings/impl/databinding/DialogMarketsSettingsBinding;", 0)};
    public static final htz m2 = new htz();

    public b630() {
        w530 w530Var = new w530(this, (byte) 0);
        pv10 pv10Var = new pv10(this, (byte) 13);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new pv10(pv10Var, (byte) 14));
        this.f2 = agc.G(this, sre0.f32672a.b(e730.class), new y620(a8zVarA, (byte) 4), new y620(a8zVarA, (byte) 5), w530Var);
        this.g2 = new phf0("MARKET_SETTINGS_DIALOG_PARAMS_KEY");
        this.h2 = new r34("MARKET_SETTINGS_DIALOG_SUB_GAME_ID_KEY");
        this.i2 = ltt0.p(this, y530.f42030a);
        this.j2 = maz.a(wezVar, new w530(this, (byte) 1));
        this.l2 = maz.a(wezVar, new w530(this, (byte) 2));
    }

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        return new a630(this, n0(), this.M1, (byte) 0);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final int getE2() {
        return this.e2;
    }

    @Override // a.by5
    public final void K0() throws Exception {
        qcc.X(this, new w530(this, (byte) 3));
        yje yjeVar = null;
        if (this.b2 == null) {
            Intrinsics.h("marketSettingsToolbarFragmentDelegate");
            throw null;
        }
        yik yikVarI0 = I0();
        e730 e730VarT0 = T0();
        du20 du20Var = new du20(1, this, b630.class, "applyTouchHelper", "applyTouchHelper(Z)V", 0, (byte) 7);
        MaterialToolbar materialToolbar = yikVarI0.e;
        materialToolbar.setNavigationOnClickListener(new l910(e730VarT0, (byte) 2));
        MenuItem menuItemFindItem = materialToolbar.getMenu().findItem(R.id.search);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        SearchMaterialViewNew searchMaterialViewNew = actionView instanceof SearchMaterialViewNew ? (SearchMaterialViewNew) actionView : null;
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setOnFocusChangeListener(new km00(e730VarT0, (byte) 25));
        }
        byte b = 1;
        menuItemFindItem.setOnActionExpandListener(new kw20(e730VarT0, (byte) 1));
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setOnQueryTextListener(new ieu(du20Var, e730VarT0, (byte) 29));
        }
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setText(R.string.search_by_markets);
        }
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setIconifiedByDefault(true);
        }
        ConstraintLayout constraintLayout = yikVarI0.c;
        constraintLayout.getClass();
        iw20 iw20Var = new iw20(searchMaterialViewNew);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout, iw20Var);
        materialToolbar.getMenu().findItem(R.id.search).setOnActionExpandListener(new kw20(e730VarT0, (byte) 0));
        p7m0 p7m0Var = e730VarT0.t;
        ow20 ow20Var = new ow20(menuItemFindItem, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new v620(p7m0Var, clzVarW, ow20Var, (yje) null), 3);
        I0().d.setAdapter((t530) this.l2.getValue());
        R0(true);
        sj3.t0(this, "REQUEST_FILTER_DIALOG_KEY", new x530(this, (byte) 1));
        p7m0 p7m0Var2 = T0().u;
        w620 w620Var = new w620(this, (yje) null, (byte) 6);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new mw20(p7m0Var2, clzVarW2, w620Var, (yje) null), 3);
        qoj0 qoj0Var = T0().r;
        z530 z530Var = new z530(this, yjeVar, (byte) 0);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new mw20(qoj0Var, clzVarW3, z530Var, (yje) null), 3);
        p7m0 p7m0Var3 = T0().s;
        z530 z530Var2 = new z530(this, yjeVar, b);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new mw20((gmq) p7m0Var3, clzVarW4, z530Var2, (yje) null, (byte) 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(c630.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            c630 c630Var = (c630) (ze3Var instanceof c630 ? ze3Var : null);
            if (c630Var != null) {
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof ocl0) {
                        pcl0 pcl0VarU = ((ocl0) fragment).u(new w530(this, (byte) 4));
                        mne mneVar = c630Var.f3800a;
                        sa10 sa10Var = c630Var.b;
                        duj dujVar = c630Var.c;
                        s31 s31Var = c630Var.d;
                        kt2 kt2Var = c630Var.f;
                        ii iiVar = c630Var.e;
                        d1p d1pVar = c630Var.g;
                        jw20 jw20Var = c630Var.h;
                        d1pVar.getClass();
                        pcl0VarU.getClass();
                        iiVar.getClass();
                        kt2Var.getClass();
                        g45 g45Var = new g45();
                        g45Var.f10647a = pcl0VarU;
                        g45Var.b = jw20Var;
                        g45Var.c = sa10Var;
                        g45Var.d = dujVar;
                        g45Var.e = s31Var;
                        g45Var.f = kt2Var;
                        g45Var.g = d1pVar;
                        g45Var.h = mneVar;
                        g45Var.i = new rki(g45Var, (byte) 7);
                        this.b2 = new evz();
                        this.c2 = new fiu0(Collections.singletonMap(e730.class, (rki) g45Var.i));
                        this.d2 = iiVar;
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(c630.class, "Cannot create dependency "));
    }

    @Override // a.by5
    public final void M0() {
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        Object parent = q0().getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            nr00 nr00Var = new nr00(this);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view, nr00Var);
        }
    }

    public final void R0(boolean z) {
        vyx vyxVar = this.k2;
        if (!z) {
            if (vyxVar != null) {
                vyxVar.i(null);
            }
            this.k2 = null;
        } else if (vyxVar == null) {
            vyx vyxVar2 = new vyx((wx6) this.j2.getValue());
            this.k2 = vyxVar2;
            vyxVar2.i(I0().d);
        }
    }

    @Override // a.by5
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final yik I0() {
        Object objN = this.i2.n(n2[2], this);
        objN.getClass();
        return (yik) objN;
    }

    public final e730 T0() {
        return (e730) this.f2.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        Window window;
        this.j1 = true;
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(32);
    }

    @Override // a.by5, androidx.fragment.app.Fragment
    public final void e0() {
        Window window;
        super.e0();
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }
}
