package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/usr0;", "La/iw5;", "La/i620;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class usr0 extends iw5 implements i620 {
    public static final /* synthetic */ int r2 = 0;
    public fiu0 k2;
    public lgn0 l2;
    public ynb m2;
    public wdk0 n2;
    public ii o2;
    public wjk p2;
    public final a8z q2 = xbc.b0(this, sre0.f32672a.b(ltr0.class), new ssr0(this, (byte) 0));

    /* JADX WARN: Multi-variable type inference failed */
    public static e920 P0(Fragment fragment) {
        Fragment fragment2 = fragment.y;
        if (fragment2 != 0) {
            return fragment2 instanceof e920 ? (e920) fragment2 : P0(fragment2);
        }
        jf4.n("MakeBetLoader not found");
        return null;
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        lel lelVar;
        long backgroundContent;
        fetVar.e0(1117168781);
        d820 d820Var = (d820) ((i3t0) Q0()).y(fetVar).getValue();
        zbr zbrVar = d820Var.d;
        cw5 cw5VarO0 = iw5.O0(1, fetVar);
        ug20 ug20Var = d820Var.f5623a;
        int iOrdinal = ug20Var.ordinal();
        ugd ugdVarM = null;
        if (iOrdinal == 0) {
            lelVar = kel.f18158a;
        } else if (iOrdinal == 1) {
            lelVar = jel.f16379a;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            lelVar = iel.f14638a;
        }
        lel lelVar2 = lelVar;
        ug20 ug20Var2 = ug20.c;
        if (ug20Var == ug20Var2) {
            pz40 pz40Var = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackground();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
        }
        cw5 cw5VarA = cw5.a(cw5VarO0, false, false, false, lelVar2, backgroundContent, 7);
        if (ug20Var != ug20Var2 || zbrVar == null) {
            fetVar.e0(-125059791);
            fetVar.r(false);
        } else {
            fetVar.e0(-125273474);
            ugdVarM = u1c.M(942596255, new nhl0(zbrVar, this, (byte) 28), fetVar);
            fetVar.r(false);
        }
        bw5 bw5Var = new bw5(cw5VarA, (xdr) null, ugdVarM, u1c.M(227610942, new gcn0(this, (byte) 13), fetVar), 6);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 Q0() {
        return (k3t0) this.q2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.p2 = (wjk) context;
        }
        wjk wjkVar = this.p2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kkr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kkr0 kkr0Var = (kkr0) (ze3Var instanceof kkr0 ? ze3Var : null);
            if (kkr0Var != null) {
                o9i o9iVarA = kkr0Var.a(a4n0.f(this));
                this.k2 = o9iVarA.e();
                this.l2 = (lgn0) o9iVarA.m;
                ynb ynbVarI = ((yzn0) ((peg0) o9iVarA.l).b).i();
                x1x.x(ynbVarI);
                this.m2 = ynbVarI;
                this.n2 = (wdk0) o9iVarA.B;
                this.o2 = (ii) o9iVarA.A;
                return;
            }
        }
        jf4.n(b1j.i(kkr0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        wjk wjkVar = this.p2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new ssr0(this, (byte) 1));
    }
}
