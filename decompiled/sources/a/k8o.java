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
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/k8o;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k8o extends yx5 {
    public final boolean K1;
    public final e9o0 L1;
    public fiu0 M1;
    public ujd N1;
    public wdk0 O1;
    public final a8z P1;
    public final qdz Q1;

    public k8o() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.P1 = xbc.b0(this, sre0.f32672a.b(k9o.class), new j8o(this, (byte) 0));
        this.Q1 = new qdz();
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(l8o.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            l8o l8oVar = (l8o) (ze3Var instanceof l8o ? ze3Var : null);
            if (l8oVar != null) {
                byte b = CyberGamesPage.Real.INSTANCE.f46556a;
                xri xriVar = l8oVar.f19614a;
                iip iipVar = l8oVar.b;
                oeg0 oeg0Var = l8oVar.c;
                pru pruVar = l8oVar.d;
                itr itrVar = l8oVar.e;
                g2v g2vVar = l8oVar.f;
                ctf0 ctf0Var = l8oVar.g;
                lbu lbuVar = l8oVar.h;
                y78 y78Var = l8oVar.i;
                cad cadVar = l8oVar.j;
                m1e m1eVar = l8oVar.k;
                gst0 gst0Var = l8oVar.l;
                lsn lsnVar = l8oVar.m;
                knf0 knf0Var = l8oVar.n;
                gii0 gii0Var = l8oVar.o;
                ugf0 ugf0Var = l8oVar.p;
                rou rouVar = l8oVar.q;
                b3u b3uVar = l8oVar.r;
                pyg pygVar = l8oVar.s;
                vqc vqcVar = l8oVar.t;
                n2u n2uVar = l8oVar.x;
                ih5 ih5Var = l8oVar.u;
                zr1 zr1Var = l8oVar.v;
                wdk0 wdk0Var = l8oVar.w;
                vby vbyVar = l8oVar.y;
                viu viuVar = l8oVar.z;
                pyg0 pyg0Var = l8oVar.A;
                qyg0 qyg0Var = l8oVar.B;
                kuy kuyVar = l8oVar.C;
                epi0 epi0Var = l8oVar.D;
                xriVar.getClass();
                iipVar.getClass();
                itrVar.getClass();
                pygVar.getClass();
                oeg0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                vbyVar.getClass();
                kuyVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(k9o.class, (yei) new v8i(xriVar, iipVar, itrVar, cadVar, lsnVar, ugf0Var, pygVar, vqcVar, epi0Var, pruVar, g2vVar, ctf0Var, lbuVar, y78Var, m1eVar, gst0Var, knf0Var, gii0Var, rouVar, b3uVar, n2uVar, ih5Var, zr1Var, wdk0Var, vbyVar, viuVar, pyg0Var, qyg0Var, kuyVar).C));
                ujd ujdVarD = itrVar.d();
                x1x.x(ujdVarD);
                this.N1 = ujdVarD;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(l8o.class, "Cannot create dependency "));
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
        wdk0.l(wdk0Var, this, this.K1);
        pkd.h(composeView, new owp0(this), null, new ugd(-1886679527, true, new f5o(this, (byte) 3)));
        return composeView;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.N1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new i8o(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.L1;
    }
}
