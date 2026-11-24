package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\r²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"La/ccb0;", "La/yx5;", "La/e1j;", "<init>", "()V", "a/mi70", "", "hasTabs", "La/a4x;", "La/ylb0;", "contentTypeList", "", "currentTabPos", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ccb0 extends yx5 implements e1j {
    public hpi K1;
    public poq0 L1;
    public lme0 M1;
    public ii N1;
    public r12 O1;
    public wdk0 P1;
    public ib50 Q1;
    public final boolean R1;
    public final a8z S1;
    public final a8z U1;
    public final a8z V1;
    public final s0r W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(ccb0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final mi70 X1 = new mi70();
    public static final String Z1 = ccb0.class.getSimpleName();

    public ccb0() {
        super(R.layout.compose_fragment);
        this.R1 = true;
        this.S1 = xbc.a0(this, sre0.f32672a.b(pmb0.class), null, new xbb0(this, (byte) 5), 14);
        xbb0 xbb0Var = new xbb0(this, (byte) 10);
        wez wezVar = wez.b;
        this.U1 = maz.a(wezVar, xbb0Var);
        this.V1 = maz.a(wezVar, new xbb0(this, (byte) 13));
        this.W1 = ltt0.o(this, bcb0.f2349a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.W1.n(Y1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).b, qek0.h, new shd((byte) 14), new ugd(1732283724, true, new wbb0(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mhb0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mhb0 mhb0Var = (mhb0) (ze3Var instanceof mhb0 ? ze3Var : null);
            if (mhb0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                epi0 epi0Var = mhb0Var.f0;
                ngb0 ngb0Var = mhb0Var.W;
                iqt iqtVar = mhb0Var.V;
                fvt0 fvt0Var = mhb0Var.b;
                cad cadVar = mhb0Var.f21783a;
                nr00 nr00Var = mhb0Var.c;
                pyg pygVar = mhb0Var.d;
                zx10 zx10Var = mhb0Var.e;
                ljf0 ljf0Var = mhb0Var.f;
                pmi0 pmi0Var = mhb0Var.g;
                ii iiVar = mhb0Var.G;
                m1e m1eVar = mhb0Var.h;
                pru pruVar = mhb0Var.i;
                ctf0 ctf0Var = mhb0Var.j;
                ih5 ih5Var = mhb0Var.k;
                u58 u58Var = mhb0Var.l;
                vqc vqcVar = mhb0Var.m;
                uyu uyuVar = mhb0Var.n;
                wyu wyuVar = mhb0Var.o;
                lbu lbuVar = mhb0Var.p;
                v88 v88Var = mhb0Var.q;
                gst0 gst0Var = mhb0Var.r;
                duj dujVar = mhb0Var.t;
                wsf0 wsf0Var = mhb0Var.I;
                zpu zpuVar = mhb0Var.u;
                bf3 bf3Var = mhb0Var.v;
                poq0 poq0Var = mhb0Var.w;
                std stdVar = mhb0Var.x;
                sd60 sd60Var = mhb0Var.s;
                oct octVar = mhb0Var.y;
                qe50 qe50Var = mhb0Var.z;
                ouu ouuVar = mhb0Var.A;
                s31 s31Var = mhb0Var.B;
                zg zgVar = mhb0Var.C;
                zpu zpuVar2 = mhb0Var.D;
                onv onvVar = mhb0Var.E;
                bzt bztVar = mhb0Var.F;
                ljf0 ljf0Var2 = mhb0Var.H;
                ytt yttVar = mhb0Var.J;
                j1q0 j1q0Var = mhb0Var.K;
                kl5 kl5Var = mhb0Var.L;
                c8c c8cVar = mhb0Var.M;
                wdk0 wdk0Var = mhb0Var.N;
                btt0 btt0Var = mhb0Var.O;
                b3c0 b3c0Var = mhb0Var.P;
                drm0 drm0Var = mhb0Var.Q;
                hn4 hn4Var = mhb0Var.R;
                p12 p12Var = mhb0Var.S;
                wdd0 wdd0Var = mhb0Var.T;
                d1p d1pVar = mhb0Var.U;
                o2j0 o2j0Var = mhb0Var.X;
                vwb0 vwb0Var = mhb0Var.Y;
                q7d0 q7d0Var = mhb0Var.Z;
                mi70 mi70Var = mhb0Var.b0;
                svs0 svs0Var = mhb0Var.a0;
                kib0 kib0Var = mhb0Var.c0;
                nw20 nw20Var = mhb0Var.d0;
                qho qhoVar = mhb0Var.e0;
                e1u e1uVar = mhb0Var.g0;
                Set set = mhb0Var.h0;
                n4u n4uVar = mhb0Var.i0;
                pygVar.getClass();
                hn4Var.getClass();
                wdd0Var.getClass();
                d1pVar.getClass();
                ngb0Var.getClass();
                o2j0Var.getClass();
                kib0Var.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                wyuVar.getClass();
                gst0Var.getClass();
                qe50Var.getClass();
                j1q0Var.getClass();
                c8cVar.getClass();
                wdk0Var.getClass();
                btt0Var.getClass();
                b3c0Var.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                set.getClass();
                this.K1 = (hpi) new jdi(fvt0Var, cadVar, zx10Var, nr00Var, pygVar, hn4Var, wsf0Var, ljf0Var, ljf0Var2, p12Var, wdd0Var, d1pVar, ngb0Var, o2j0Var, kib0Var, epi0Var, onvVar, mi70Var, svs0Var, iiVar, pmi0Var, i1w0VarF, sd60Var, pruVar, ctf0Var, ih5Var, u58Var, vqcVar, uyuVar, lbuVar, v88Var, gst0Var, dujVar, zpuVar, bf3Var, poq0Var, stdVar, octVar, ouuVar, s31Var, zgVar, zpuVar2, bztVar, yttVar, kl5Var, c8cVar, wdk0Var, b3c0Var, drm0Var, iqtVar, vwb0Var, q7d0Var, nw20Var, qhoVar, e1uVar, set, n4uVar).a0.get();
                this.L1 = poq0Var;
                this.M1 = new lme0((byte) 7);
                this.N1 = iiVar;
                r12 r12Var = (r12) ((p12) p12Var.b).b;
                x1x.x(r12Var);
                this.O1 = r12Var;
                this.P1 = wdk0Var;
                this.Q1 = new ib50(set);
                return;
            }
        }
        jf4.n(b1j.i(mhb0.class, "Cannot create dependency "));
    }

    public final ii G0() {
        ii iiVar = this.N1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final wdk0 H0() {
        wdk0 wdk0Var = this.P1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final k3t0 I0() {
        return (k3t0) this.S1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.R1;
    }
}
