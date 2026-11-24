package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/d2b0;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d2b0 extends yx5 implements tah0 {
    public fiu0 K1;
    public final a8z L1;
    public final s0r M1;
    public ii N1;
    public wdk0 O1;
    public roq0 P1;
    public final boolean Q1;
    public tah0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(d2b0.class, "binding", "getBinding()Lorg/xplatform/aggregator/popular/classic/impl/databinding/FragmentPopularClassicAggregatorBinding;", 0)};
    public static final rl70 S1 = new rl70();

    public d2b0() {
        super(R.layout.fragment_popular_classic_aggregator);
        this.L1 = xbc.b0(this, sre0.f32672a.b(v3b0.class), new ssa0(this, (byte) 3));
        this.M1 = ltt0.o(this, c2b0.f3618a);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(iza0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            iza0 iza0Var = (iza0) (ze3Var instanceof iza0 ? ze3Var : null);
            if (iza0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ok50 ok50Var = iza0Var.b;
                jw20 jw20Var = iza0Var.c;
                poq0 poq0Var = iza0Var.d;
                cad cadVar = iza0Var.f15626a;
                m1e m1eVar = iza0Var.f;
                duj dujVar = iza0Var.g;
                ii iiVar = iza0Var.x;
                wsf0 wsf0Var = iza0Var.w;
                iqt iqtVar = iza0Var.i;
                kc60 kc60Var = iza0Var.j;
                u58 u58Var = iza0Var.k;
                bn6 bn6Var = iza0Var.l;
                pru pruVar = iza0Var.m;
                gii0 gii0Var = iza0Var.e;
                uyu uyuVar = iza0Var.h;
                oeg0 oeg0Var = iza0Var.n;
                btt0 btt0Var = iza0Var.o;
                ctf0 ctf0Var = iza0Var.p;
                knf0 knf0Var = iza0Var.q;
                j1q0 j1q0Var = iza0Var.r;
                gg5 gg5Var = iza0Var.s;
                ix0 ix0Var = iza0Var.t;
                x2c0 x2c0Var = iza0Var.y;
                b3c0 b3c0Var = iza0Var.z;
                peg0 peg0Var = iza0Var.u;
                wdk0 wdk0Var = iza0Var.A;
                nr00 nr00Var = iza0Var.B;
                ouu ouuVar = iza0Var.C;
                kib0 kib0Var = iza0Var.v;
                wsf0 wsf0Var2 = iza0Var.D;
                r9u r9uVar = iza0Var.E;
                bzt bztVar = iza0Var.F;
                c5k c5kVar = iza0Var.G;
                nw20 nw20Var = iza0Var.H;
                jdk0 jdk0Var = iza0Var.I;
                ytt yttVar = iza0Var.J;
                kib0Var.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                gii0Var.getClass();
                oeg0Var.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                j1q0Var.getClass();
                x2c0Var.getClass();
                b3c0Var.getClass();
                wdk0Var.getClass();
                r9uVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(v3b0.class, (eni) new o9i(cadVar, jw20Var, ok50Var, wsf0Var, peg0Var, nr00Var, wsf0Var2, poq0Var, iiVar, i1w0VarF, m1eVar, dujVar, iqtVar, kc60Var, bn6Var, u58Var, pruVar, gii0Var, uyuVar, ctf0Var, knf0Var, j1q0Var, gg5Var, ix0Var, x2c0Var, wdk0Var, ouuVar, bztVar, c5kVar, nw20Var, jdk0Var, yttVar).D));
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                x1x.x(((yzn0) peg0Var.b).i());
                this.P1 = new roq0();
                return;
            }
        }
        jf4.n(b1j.i(iza0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        n0().r().g("REQUEST_KEY_CLOSE_GAME");
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new ex60(this, (byte) 11));
        Object objN = this.M1.n(U1[0], this);
        objN.getClass();
        pkd.h(((u2r) objN).f34960a, new owp0(this), null, new ugd(-470423145, true, new lma0(this, (byte) 7)));
    }

    @Override // a.tah0
    public final boolean p() {
        tah0 tah0Var = this.R1;
        return tah0Var != null && tah0Var.p();
    }

    @Override // a.tah0
    public final void w() {
        tah0 tah0Var = this.R1;
        if (tah0Var != null) {
            tah0Var.w();
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.Q1;
    }
}
