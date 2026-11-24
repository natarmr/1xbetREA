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
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/g9t0;", "La/yx5;", "<init>", "()V", "a/svs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g9t0 extends yx5 {
    public final e9o0 K1;
    public final boolean L1;
    public fiu0 M1;
    public ujd N1;
    public wdk0 O1;
    public poq0 P1;
    public final a8z Q1;
    public final qdz R1;
    public final khf0 S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(g9t0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;", 0)};
    public static final svs0 U1 = new svs0((byte) 2);

    public g9t0() {
        super(R.layout.compose_fragment);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.L1 = true;
        this.Q1 = xbc.b0(this, sre0.f32672a.b(jdt0.class), new f9t0(this, (byte) 0));
        this.R1 = new qdz();
        this.S1 = new khf0("UNIVERSAL_CHAMP_PARAMS");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h9t0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h9t0 h9t0Var = (h9t0) (ze3Var instanceof h9t0 ? ze3Var : null);
            if (h9t0Var != null) {
                UniversalChampParams universalChampParams = (UniversalChampParams) this.S1.n(this, V1[0]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = h9t0Var.f12694a;
                lsn lsnVar = h9t0Var.b;
                iip iipVar = h9t0Var.c;
                pyg pygVar = h9t0Var.d;
                vqc vqcVar = h9t0Var.e;
                ugf0 ugf0Var = h9t0Var.f;
                itr itrVar = h9t0Var.g;
                xri xriVar = h9t0Var.h;
                rrc rrcVar = h9t0Var.i;
                roi0 roi0Var = h9t0Var.j;
                gt5 gt5Var = h9t0Var.k;
                ctf0 ctf0Var = h9t0Var.l;
                pru pruVar = h9t0Var.m;
                rtu rtuVar = h9t0Var.n;
                lbu lbuVar = h9t0Var.o;
                y78 y78Var = h9t0Var.p;
                r9u r9uVar = h9t0Var.r;
                pmi pmiVar = h9t0Var.s;
                wiu wiuVar = h9t0Var.t;
                wdk0 wdk0Var = h9t0Var.u;
                grj grjVar = h9t0Var.v;
                knf0 knf0Var = h9t0Var.w;
                gii0 gii0Var = h9t0Var.x;
                g2v g2vVar = h9t0Var.y;
                m1e m1eVar = h9t0Var.z;
                kt2 kt2Var = h9t0Var.q;
                poq0 poq0Var = h9t0Var.A;
                zr1 zr1Var = h9t0Var.B;
                vby vbyVar = h9t0Var.C;
                iipVar.getClass();
                pygVar.getClass();
                itrVar.getClass();
                xriVar.getClass();
                gt5Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                kt2Var.getClass();
                wdk0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                vbyVar.getClass();
                this.M1 = new fiu0(Collections.singletonMap(jdt0.class, (msi) new mai(cadVar, lsnVar, iipVar, pygVar, vqcVar, ugf0Var, itrVar, xriVar, rrcVar, roi0Var, gt5Var, universalChampParams, i1w0VarF, ctf0Var, pruVar, rtuVar, lbuVar, y78Var, r9uVar, pmiVar, wiuVar, kt2Var, wdk0Var, grjVar, knf0Var, gii0Var, g2vVar, m1eVar, poq0Var, zr1Var, vbyVar).i));
                ujd ujdVarD = itrVar.d();
                x1x.x(ujdVarD);
                this.N1 = ujdVarD;
                this.O1 = wdk0Var;
                this.P1 = poq0Var;
                return;
            }
        }
        jf4.n(b1j.i(h9t0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
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
        pkd.h(composeView, new owp0(this), null, new ugd(-1023454561, true, new p6r0(this, (byte) 26)));
        return composeView;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ujd ujdVar = this.N1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new e9t0(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
