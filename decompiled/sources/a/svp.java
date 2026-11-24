package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ufc.api.fighter.FighterParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/svp;", "La/yx5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class svp extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public ujd N1;
    public wdk0 O1;
    public final a8z P1;
    public final qdz Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(svp.class, "params", "getParams()Lorg/xplatform/ufc/api/fighter/FighterParams;", 0)};
    public static final ddk S1 = new ddk();

    public svp() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.L1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(typ.class), new rvp(this, (byte) 0));
        this.Q1 = new qdz();
        this.R1 = new khf0("FIGHTER_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tvp.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            tvp tvpVar = (tvp) (ze3Var instanceof tvp ? ze3Var : null);
            if (tvpVar != null) {
                FighterParams fighterParams = (FighterParams) this.R1.n(this, U1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = tvpVar.f34611a;
                iip iipVar = tvpVar.b;
                lsn lsnVar = tvpVar.c;
                ugf0 ugf0Var = tvpVar.d;
                epi0 epi0Var = tvpVar.e;
                itr itrVar = tvpVar.f;
                g2v g2vVar = tvpVar.g;
                ctf0 ctf0Var = tvpVar.h;
                gii0 gii0Var = tvpVar.i;
                knf0 knf0Var = tvpVar.j;
                uzc uzcVar = tvpVar.k;
                b3c0 b3c0Var = tvpVar.l;
                gst0 gst0Var = tvpVar.m;
                pru pruVar = tvpVar.n;
                y78 y78Var = tvpVar.o;
                lbu lbuVar = tvpVar.p;
                wdk0 wdk0Var = tvpVar.q;
                m1e m1eVar = tvpVar.r;
                kys0 kys0Var = tvpVar.s;
                viu viuVar = tvpVar.t;
                iipVar.getClass();
                itrVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                uzcVar.getClass();
                b3c0Var.getClass();
                gst0Var.getClass();
                wdk0Var.getClass();
                m1eVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(typ.class, (f7i) new gud(cadVar, iipVar, lsnVar, ugf0Var, epi0Var, itrVar, fighterParams, i1w0VarF, g2vVar, ctf0Var, gii0Var, knf0Var, uzcVar, b3c0Var, gst0Var, pruVar, y78Var, lbuVar, wdk0Var, m1eVar, kys0Var, viuVar).w));
                ujd ujdVarD = itrVar.d();
                x1x.x(ujdVarD);
                this.N1 = ujdVarD;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(tvp.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        wdk0 wdk0Var = this.O1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.L1);
        pkd.h(composeView, new owp0(this), null, new ugd(-759838898, true, new f5o(this, (byte) 22)));
        return composeView;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.N1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new g7p((Object) this, (byte) 4));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getV1() {
        return this.L1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
