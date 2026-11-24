package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/oiw;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oiw extends yx5 {
    public fiu0 K1;
    public ujd L1;
    public final a8z M1;
    public final a8z N1;
    public final qdz O1;
    public final boolean P1;
    public final e9o0 Q1;

    public oiw() {
        super(R.layout.compose_fragment);
        final byte b = 0;
        this.M1 = maz.a(wez.b, new Function0(this) { // from class: a.liw
            public final /* synthetic */ oiw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                oiw oiwVar = this.b;
                switch (b2) {
                    case 0:
                        ComponentCallbacks2 application = oiwVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(qiw.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof qiw)) {
                                ze3Var = null;
                            }
                            qiw qiwVar = (qiw) ze3Var;
                            if (qiwVar != null) {
                                i1w0 i1w0VarF = a4n0.f(oiwVar);
                                i1w0VarF.getClass();
                                cad cadVar = qiwVar.f28808a;
                                iip iipVar = qiwVar.b;
                                lsn lsnVar = qiwVar.c;
                                itr itrVar = qiwVar.d;
                                ugf0 ugf0Var = qiwVar.e;
                                xri xriVar = qiwVar.f;
                                gii0 gii0Var = qiwVar.h;
                                oeg0 oeg0Var = qiwVar.g;
                                g2v g2vVar = qiwVar.i;
                                m1e m1eVar = qiwVar.j;
                                ctf0 ctf0Var = qiwVar.k;
                                pru pruVar = qiwVar.l;
                                b3c0 b3c0Var = qiwVar.m;
                                knf0 knf0Var = qiwVar.n;
                                uzc uzcVar = qiwVar.o;
                                gst0 gst0Var = qiwVar.p;
                                y78 y78Var = qiwVar.q;
                                r9u r9uVar = qiwVar.r;
                                lbu lbuVar = qiwVar.s;
                                wiu wiuVar = qiwVar.t;
                                uxs0 uxs0Var = qiwVar.u;
                                kys0 kys0Var = qiwVar.v;
                                y9g y9gVar = qiwVar.w;
                                gle0 gle0Var = qiwVar.x;
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
                                y9gVar.getClass();
                                return new xii(cadVar, iipVar, lsnVar, itrVar, ugf0Var, xriVar, i1w0VarF, gii0Var, g2vVar, m1eVar, ctf0Var, pruVar, b3c0Var, knf0Var, uzcVar, gst0Var, y78Var, r9uVar, lbuVar, wiuVar, uxs0Var, kys0Var, y9gVar, gle0Var);
                            }
                        }
                        jf4.n(b1j.i(qiw.class, "Cannot create dependency "));
                        return null;
                    default:
                        fiu0 fiu0Var = oiwVar.K1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.N1 = xbc.b0(this, sre0.f32672a.b(tkw.class), new Function0(this) { // from class: a.liw
            public final /* synthetic */ oiw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                oiw oiwVar = this.b;
                switch (b3) {
                    case 0:
                        ComponentCallbacks2 application = oiwVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(qiw.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof qiw)) {
                                ze3Var = null;
                            }
                            qiw qiwVar = (qiw) ze3Var;
                            if (qiwVar != null) {
                                i1w0 i1w0VarF = a4n0.f(oiwVar);
                                i1w0VarF.getClass();
                                cad cadVar = qiwVar.f28808a;
                                iip iipVar = qiwVar.b;
                                lsn lsnVar = qiwVar.c;
                                itr itrVar = qiwVar.d;
                                ugf0 ugf0Var = qiwVar.e;
                                xri xriVar = qiwVar.f;
                                gii0 gii0Var = qiwVar.h;
                                oeg0 oeg0Var = qiwVar.g;
                                g2v g2vVar = qiwVar.i;
                                m1e m1eVar = qiwVar.j;
                                ctf0 ctf0Var = qiwVar.k;
                                pru pruVar = qiwVar.l;
                                b3c0 b3c0Var = qiwVar.m;
                                knf0 knf0Var = qiwVar.n;
                                uzc uzcVar = qiwVar.o;
                                gst0 gst0Var = qiwVar.p;
                                y78 y78Var = qiwVar.q;
                                r9u r9uVar = qiwVar.r;
                                lbu lbuVar = qiwVar.s;
                                wiu wiuVar = qiwVar.t;
                                uxs0 uxs0Var = qiwVar.u;
                                kys0 kys0Var = qiwVar.v;
                                y9g y9gVar = qiwVar.w;
                                gle0 gle0Var = qiwVar.x;
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
                                y9gVar.getClass();
                                return new xii(cadVar, iipVar, lsnVar, itrVar, ugf0Var, xriVar, i1w0VarF, gii0Var, g2vVar, m1eVar, ctf0Var, pruVar, b3c0Var, knf0Var, uzcVar, gst0Var, y78Var, r9uVar, lbuVar, wiuVar, uxs0Var, kys0Var, y9gVar, gle0Var);
                            }
                        }
                        jf4.n(b1j.i(qiw.class, "Cannot create dependency "));
                        return null;
                    default:
                        fiu0 fiu0Var = oiwVar.K1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        this.O1 = new qdz();
        this.P1 = true;
        this.Q1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
    }

    @Override // a.yx5
    public final void C0() {
        xii xiiVar = (xii) this.M1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(tkw.class, xiiVar.B));
        ujd ujdVarD = xiiVar.r.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
    }

    @Override // a.yx5
    public final void D0() {
        ujd ujdVar = this.L1;
        if (ujdVar != null) {
            ujdVar.c(this, new ls2(), new adw(this, (byte) 1));
        } else {
            Intrinsics.h("composeGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        xii xiiVar = (xii) this.M1.getValue();
        this.K1 = new fiu0(Collections.singletonMap(tkw.class, xiiVar.B));
        ujd ujdVarD = xiiVar.r.d();
        x1x.x(ujdVarD);
        this.L1 = ujdVarD;
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        pkd.h(composeView, new owp0(this), null, new ugd(1820366060, true, new xxv(this, (byte) 5)));
        return composeView;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getP1() {
        return this.P1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.Q1;
    }
}
