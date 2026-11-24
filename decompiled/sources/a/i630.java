package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/i630;", "La/by5;", "La/zzq;", "<init>", "()V", "a/evz", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i630 extends by5<zzq> {
    public wsz b2;
    public fiu0 c2;
    public ii d2;
    public final int e2 = R.attr.uikitBackgroundContent;
    public final kiu0 f2;
    public final nae0 g2;
    public final a8z h2;
    public vyx i2;
    public final a8z j2;
    public static final /* synthetic */ iiy[] l2 = {new j0d0(i630.class, "binding", "getBinding()Lorg/xplatform/cyber/game/core/databinding/FragmentFilterMarketsBinding;", 0)};
    public static final evz k2 = new evz();

    public i630() {
        e630 e630Var = new e630(this, (byte) 1);
        pv10 pv10Var = new pv10(this, (byte) 15);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new pv10(pv10Var, (byte) 16));
        this.f2 = agc.G(this, sre0.f32672a.b(f730.class), new y620(a8zVarA, (byte) 6), new y620(a8zVarA, (byte) 7), e630Var);
        this.g2 = ltt0.p(this, g630.f10744a);
        this.h2 = maz.a(wezVar, new e630(this, (byte) 2));
        this.j2 = maz.a(wezVar, new e630(this, (byte) 3));
    }

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        return new a630(this, n0(), this.M1, (byte) 1);
    }

    @Override // a.by5
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final int getE2() {
        return this.e2;
    }

    @Override // a.by5
    public final void K0() throws Exception {
        byte b = 0;
        qcc.X(this, new e630(this, b));
        yje yjeVar = null;
        if (this.b2 == null) {
            Intrinsics.h("marketSettingsToolbarFragmentDelegate");
            throw null;
        }
        zzq zzqVarI0 = I0();
        f730 f730VarT0 = T0();
        du20 du20Var = new du20(1, this, i630.class, "applyTouchHelper", "applyTouchHelper(Z)V", 0, (byte) 10);
        MaterialToolbar materialToolbar = zzqVarI0.e;
        materialToolbar.setNavigationOnClickListener(new l910(f730VarT0, (byte) 3));
        MenuItem menuItemFindItem = materialToolbar.getMenu().findItem(R.id.search);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        SearchMaterialViewNew searchMaterialViewNew = actionView instanceof SearchMaterialViewNew ? (SearchMaterialViewNew) actionView : null;
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setOnFocusChangeListener(new km00(f730VarT0, (byte) 26));
        }
        byte b2 = 1;
        menuItemFindItem.setOnActionExpandListener(new lw20(f730VarT0, b2));
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setOnQueryTextListener(new nw20(du20Var, f730VarT0));
        }
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setText(R.string.search_by_markets);
        }
        if (searchMaterialViewNew != null) {
            searchMaterialViewNew.setIconifiedByDefault(true);
        }
        ConstraintLayout constraintLayout = zzqVarI0.c;
        constraintLayout.getClass();
        jw20 jw20Var = new jw20(searchMaterialViewNew, b);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(constraintLayout, jw20Var);
        materialToolbar.getMenu().findItem(R.id.search).setOnActionExpandListener(new lw20(f730VarT0, b));
        p7m0 p7m0Var = f730VarT0.q;
        ow20 ow20Var = new ow20(menuItemFindItem, yjeVar, b2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new mw20(p7m0Var, clzVarW, ow20Var, (yje) null), 3);
        I0().d.setAdapter((u530) this.j2.getValue());
        R0(true);
        sj3.t0(this, "REQUEST_FILTER_DIALOG_KEY", new f630(this, b2));
        p7m0 p7m0Var2 = T0().r;
        w620 w620Var = new w620((Object) this, yjeVar, (byte) 7);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new mw20((gmq) p7m0Var2, clzVarW2, w620Var, (yje) null, (byte) 0), 3);
        ol60 ol60Var = T0().s;
        h630 h630Var = new h630(this, yjeVar, b);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new mw20(ol60Var, clzVarW3, h630Var, (yje) null), 3);
        p7m0 p7m0Var3 = T0().p;
        h630 h630Var2 = new h630(this, yjeVar, b2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new mw20((gmq) p7m0Var3, clzVarW4, h630Var2, (yje) null, (byte) 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(j630.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            j630 j630Var = (j630) (ze3Var instanceof j630 ? ze3Var : null);
            if (j630Var != null) {
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof drs) {
                        xhi xhiVarQ = ((drs) fragment).q();
                        mne mneVar = j630Var.f15966a;
                        g2v g2vVar = j630Var.b;
                        ii iiVar = j630Var.f;
                        duj dujVar = j630Var.c;
                        kt2 kt2Var = j630Var.d;
                        d1p d1pVar = j630Var.e;
                        d1pVar.getClass();
                        iiVar.getClass();
                        kt2Var.getClass();
                        ywq0 ywq0Var = new ywq0();
                        ywq0Var.f43384a = xhiVarQ;
                        ywq0Var.b = g2vVar;
                        ywq0Var.c = dujVar;
                        ywq0Var.d = kt2Var;
                        ywq0Var.e = d1pVar;
                        ywq0Var.f = mneVar;
                        ywq0Var.g = new rki(ywq0Var, (byte) 8);
                        this.b2 = new wsz();
                        this.c2 = new fiu0(Collections.singletonMap(f730.class, (rki) ywq0Var.g));
                        this.d2 = iiVar;
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(j630.class, "Cannot create dependency "));
    }

    public final void R0(boolean z) {
        vyx vyxVar = this.i2;
        if (!z) {
            if (vyxVar != null) {
                vyxVar.i(null);
            }
            this.i2 = null;
        } else if (vyxVar == null) {
            vyx vyxVar2 = new vyx((xx6) this.h2.getValue());
            this.i2 = vyxVar2;
            vyxVar2.i(I0().d);
        }
    }

    @Override // a.by5
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final zzq I0() {
        Object objN = this.g2.n(l2[0], this);
        objN.getClass();
        return (zzq) objN;
    }

    public final f730 T0() {
        return (f730) this.f2.getValue();
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
