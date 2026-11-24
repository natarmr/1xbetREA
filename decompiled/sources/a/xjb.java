package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xjb;", "La/yx5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xjb extends yx5 {
    public fiu0 K1;
    public ujd L1;
    public oll0 M1;
    public final khf0 N1;
    public final a8z O1;
    public final a8z P1;
    public final qdz Q1;
    public final boolean R1;
    public final e9o0 S1;
    public static final /* synthetic */ iiy[] V1 = {new ez40(xjb.class, "params", "getParams()Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;", 0)};
    public static final kj5 U1 = new kj5();

    public xjb() {
        super(R.layout.compose_fragment);
        this.N1 = new khf0("params_key");
        final byte b = 0;
        this.O1 = maz.a(wez.b, new Function0(this) { // from class: a.wjb
            public final /* synthetic */ xjb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                xjb xjbVar = this.b;
                switch (b2) {
                    case 0:
                        kj5 kj5Var = xjb.U1;
                        ComponentCallbacks2 application = xjbVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(yjb.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof yjb)) {
                                ze3Var = null;
                            }
                            yjb yjbVar = (yjb) ze3Var;
                            if (yjbVar != null) {
                                UfcChampionshipParams ufcChampionshipParams = (UfcChampionshipParams) xjbVar.N1.n(xjbVar, xjb.V1[0]);
                                i1w0 i1w0VarF = a4n0.f(xjbVar);
                                i1w0VarF.getClass();
                                cad cadVar = yjbVar.f42732a;
                                iip iipVar = yjbVar.b;
                                lsn lsnVar = yjbVar.c;
                                itr itrVar = yjbVar.d;
                                ugf0 ugf0Var = yjbVar.e;
                                xri xriVar = yjbVar.f;
                                zx10 zx10Var = yjbVar.g;
                                gii0 gii0Var = yjbVar.i;
                                oeg0 oeg0Var = yjbVar.h;
                                g2v g2vVar = yjbVar.j;
                                m1e m1eVar = yjbVar.k;
                                ctf0 ctf0Var = yjbVar.l;
                                pru pruVar = yjbVar.m;
                                b3c0 b3c0Var = yjbVar.n;
                                knf0 knf0Var = yjbVar.o;
                                uzc uzcVar = yjbVar.p;
                                gst0 gst0Var = yjbVar.q;
                                y78 y78Var = yjbVar.s;
                                r9u r9uVar = yjbVar.t;
                                lbu lbuVar = yjbVar.u;
                                wiu wiuVar = yjbVar.v;
                                x0u x0uVar = yjbVar.r;
                                kys0 kys0Var = yjbVar.w;
                                uxs0 uxs0Var = yjbVar.x;
                                iipVar.getClass();
                                itrVar.getClass();
                                xriVar.getClass();
                                oeg0Var.getClass();
                                gii0Var.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                b3c0Var.getClass();
                                knf0Var.getClass();
                                uzcVar.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                return new eci(cadVar, iipVar, lsnVar, itrVar, ugf0Var, xriVar, zx10Var, ufcChampionshipParams, i1w0VarF, gii0Var, g2vVar, m1eVar, ctf0Var, pruVar, b3c0Var, knf0Var, uzcVar, gst0Var, y78Var, r9uVar, lbuVar, wiuVar, x0uVar, kys0Var, uxs0Var);
                            }
                        }
                        jf4.n(b1j.i(yjb.class, "Cannot create dependency "));
                        return null;
                    default:
                        kj5 kj5Var2 = xjb.U1;
                        fiu0 fiu0Var = xjbVar.K1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.P1 = xbc.b0(this, sre0.f32672a.b(plb.class), new Function0(this) { // from class: a.wjb
            public final /* synthetic */ xjb b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                xjb xjbVar = this.b;
                switch (b3) {
                    case 0:
                        kj5 kj5Var = xjb.U1;
                        ComponentCallbacks2 application = xjbVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(yjb.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof yjb)) {
                                ze3Var = null;
                            }
                            yjb yjbVar = (yjb) ze3Var;
                            if (yjbVar != null) {
                                UfcChampionshipParams ufcChampionshipParams = (UfcChampionshipParams) xjbVar.N1.n(xjbVar, xjb.V1[0]);
                                i1w0 i1w0VarF = a4n0.f(xjbVar);
                                i1w0VarF.getClass();
                                cad cadVar = yjbVar.f42732a;
                                iip iipVar = yjbVar.b;
                                lsn lsnVar = yjbVar.c;
                                itr itrVar = yjbVar.d;
                                ugf0 ugf0Var = yjbVar.e;
                                xri xriVar = yjbVar.f;
                                zx10 zx10Var = yjbVar.g;
                                gii0 gii0Var = yjbVar.i;
                                oeg0 oeg0Var = yjbVar.h;
                                g2v g2vVar = yjbVar.j;
                                m1e m1eVar = yjbVar.k;
                                ctf0 ctf0Var = yjbVar.l;
                                pru pruVar = yjbVar.m;
                                b3c0 b3c0Var = yjbVar.n;
                                knf0 knf0Var = yjbVar.o;
                                uzc uzcVar = yjbVar.p;
                                gst0 gst0Var = yjbVar.q;
                                y78 y78Var = yjbVar.s;
                                r9u r9uVar = yjbVar.t;
                                lbu lbuVar = yjbVar.u;
                                wiu wiuVar = yjbVar.v;
                                x0u x0uVar = yjbVar.r;
                                kys0 kys0Var = yjbVar.w;
                                uxs0 uxs0Var = yjbVar.x;
                                iipVar.getClass();
                                itrVar.getClass();
                                xriVar.getClass();
                                oeg0Var.getClass();
                                gii0Var.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                b3c0Var.getClass();
                                knf0Var.getClass();
                                uzcVar.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                return new eci(cadVar, iipVar, lsnVar, itrVar, ugf0Var, xriVar, zx10Var, ufcChampionshipParams, i1w0VarF, gii0Var, g2vVar, m1eVar, ctf0Var, pruVar, b3c0Var, knf0Var, uzcVar, gst0Var, y78Var, r9uVar, lbuVar, wiuVar, x0uVar, kys0Var, uxs0Var);
                            }
                        }
                        jf4.n(b1j.i(yjb.class, "Cannot create dependency "));
                        return null;
                    default:
                        kj5 kj5Var2 = xjb.U1;
                        fiu0 fiu0Var = xjbVar.K1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        this.Q1 = new qdz();
        this.R1 = true;
        this.S1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
    }

    @Override // a.yx5
    public final void C0() {
        ((eci) this.O1.getValue()).a(this);
    }

    @Override // a.yx5
    public final void D0() {
        ujd ujdVar = this.L1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new vjb(this, (byte) 0));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ((eci) this.O1.getValue()).a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(-665048718, true, new bna(this, (byte) 19)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.S1;
    }
}
