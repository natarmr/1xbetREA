package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/n9c0;", "La/yx5;", "La/e1j;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n9c0 extends yx5 implements e1j {
    public final e9o0 K1;
    public wdk0 L1;
    public q5j M1;
    public final zz2 N1;
    public final zz2 O1;
    public final s0r P1;
    public npi Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(n9c0.class, "bundleBonusesCount", "getBundleBonusesCount()I", 0), new ez40(n9c0.class, "bundleFreeSpinsCount", "getBundleFreeSpinsCount()I", 0), new j0d0(n9c0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/PromoCheckFragmentBinding;", 0)};
    public static final fl70 S1 = new fl70();

    public n9c0() {
        super(R.layout.promo_check_fragment);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitBackgroundContent, 12);
        this.N1 = new zz2("BONUSES_COUNT");
        this.O1 = new zz2("FREE_SPINS_COUNT");
        this.P1 = ltt0.o(this, m9c0.f21403a);
        this.R1 = xbc.a0(this, sre0.f32672a.b(org.xplatform.feature.promo_aggregator.impl.presentation.compose.b.class), null, new ssa0(this, (byte) 17), 14);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objPrevious;
        Object objN = this.P1.n(U1[2], this);
        objN.getClass();
        pkd.i(((y9c0) objN).f42238a, new shd((byte) 15), new ugd(-29531803, true, new iob0((Object) this, (byte) 2)));
        kxq kxqVarB = B();
        if (kxqVarB == null || !tdc.U(kxqVarB.r())) {
            return;
        }
        List listP = F().c.p();
        listP.getClass();
        ListIterator listIterator = listP.listIterator(listP.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((Fragment) objPrevious).Q());
        Fragment fragment = (Fragment) objPrevious;
        k3t0 k3t0Var = (k3t0) this.R1.getValue();
        String simpleName = fragment != null ? fragment.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "";
        }
        k3t0Var.x(new h9c0(simpleName));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(l9c0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            l9c0 l9c0Var = (l9c0) (ze3Var instanceof l9c0 ? ze3Var : null);
            if (l9c0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                eld0 eld0Var = new eld0(this.N1.n(this, iiyVarArr[0]).intValue(), this.O1.n(this, iiyVarArr[1]).intValue(), (byte) 5);
                i1w0VarF.getClass();
                duj dujVar = l9c0Var.f19644a;
                m1e m1eVar = l9c0Var.b;
                b4j b4jVar = l9c0Var.c;
                ix0 ix0Var = l9c0Var.d;
                knf0 knf0Var = l9c0Var.e;
                btt0 btt0Var = l9c0Var.f;
                peg0 peg0Var = l9c0Var.g;
                wsf0 wsf0Var = l9c0Var.i;
                gii0 gii0Var = l9c0Var.h;
                cad cadVar = l9c0Var.k;
                wdk0 wdk0Var = l9c0Var.l;
                lrc lrcVar = l9c0Var.m;
                poq0 poq0Var = l9c0Var.n;
                kc60 kc60Var = l9c0Var.o;
                b4j b4jVar2 = l9c0Var.p;
                je jeVar = l9c0Var.q;
                pru pruVar = l9c0Var.r;
                ctf0 ctf0Var = l9c0Var.j;
                m1eVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                gbi gbiVar = new gbi(cadVar, wsf0Var, lrcVar, poq0Var, eld0Var, dujVar, m1eVar, b4jVar, peg0Var, ix0Var, knf0Var, btt0Var, gii0Var, wdk0Var, b4jVar2, jeVar, kc60Var, pruVar, i1w0VarF, ctf0Var);
                this.L1 = wdk0Var;
                this.M1 = new q5j();
                this.Q1 = (npi) ((n5d0) gbiVar.b).get();
                return;
            }
        }
        jf4.n(b1j.i(l9c0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
