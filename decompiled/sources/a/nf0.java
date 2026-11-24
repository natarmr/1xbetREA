package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nf0;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nf0 extends yx5 {
    public final yzn0 K1;
    public final yzn0 L1;
    public fiu0 M1;
    public ynb N1;
    public ii O1;
    public final a8z P1;
    public final s0r Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(nf0.class, "bundlePartitionToOpen", "getBundlePartitionToOpen()Lorg/xplatform/aggregator/api/navigation/PartTypeOneModel;", 0), new ez40(nf0.class, "bundleNavigationSource", "getBundleNavigationSource()Lorg/xplatform/aggregator/api/navigation/AggregatorNavigationSource;", 0), new j0d0(nf0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final hfk0 S1 = new hfk0((byte) 13);

    public nf0() {
        super(R.layout.compose_fragment);
        this.K1 = new yzn0("CATEGORY_TO_OPEN_ITEM");
        this.L1 = new yzn0("NAVIGATION_SOURCE_KEY");
        this.P1 = xbc.b0(this, sre0.f32672a.b(eh0.class), new lf0(this, (byte) 1));
        this.Q1 = ltt0.o(this, mf0.f21673a);
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.Q1.n(U1[2], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(-530915449, true, new o00(this, (byte) 7)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qh0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qh0 qh0Var = (qh0) (ze3Var instanceof qh0 ? ze3Var : null);
            if (qh0Var != null) {
                iiy[] iiyVarArr = U1;
                fs80 fs80Var = (fs80) this.K1.n(this, iiyVarArr[0]);
                q91 q91Var = (q91) this.L1.n(this, iiyVarArr[1]);
                cad cadVar = qh0Var.b;
                oeg0 oeg0Var = qh0Var.p;
                wsf0 wsf0Var = qh0Var.E;
                uzc0 uzc0Var = qh0Var.c;
                kt2 kt2Var = qh0Var.d;
                s31 s31Var = qh0Var.e;
                xk0 xk0Var = qh0Var.g;
                duj dujVar = qh0Var.h;
                o91 o91Var = qh0Var.i;
                s91 s91Var = qh0Var.j;
                ii iiVar = qh0Var.A;
                gii0 gii0Var = qh0Var.l;
                m1e m1eVar = qh0Var.m;
                v88 v88Var = qh0Var.n;
                g2v g2vVar = qh0Var.o;
                ehf0 ehf0Var = qh0Var.f28712a;
                r9u r9uVar = qh0Var.k;
                h03 h03Var = qh0Var.f;
                pru pruVar = qh0Var.q;
                btt0 btt0Var = qh0Var.r;
                peg0 peg0Var = qh0Var.F;
                wsf0 wsf0Var2 = qh0Var.G;
                peg0 peg0Var2 = qh0Var.H;
                ctf0 ctf0Var = qh0Var.s;
                xmt xmtVar = qh0Var.t;
                ix0 ix0Var = qh0Var.u;
                fsd fsdVar = qh0Var.v;
                gg5 gg5Var = qh0Var.w;
                l7k l7kVar = qh0Var.x;
                cyu cyuVar = qh0Var.y;
                wgu wguVar = qh0Var.z;
                gst0 gst0Var = qh0Var.B;
                wdk0 wdk0Var = qh0Var.D;
                wyu wyuVar = qh0Var.C;
                dmt dmtVar = qh0Var.I;
                b3c0 b3c0Var = qh0Var.J;
                grj grjVar = qh0Var.K;
                jlx jlxVar = qh0Var.L;
                pyt pytVar = qh0Var.M;
                qyg0 qyg0Var = qh0Var.N;
                pyg0 pyg0Var = qh0Var.O;
                knf0 knf0Var = qh0Var.Q;
                x0u x0uVar = qh0Var.R;
                r9s0 r9s0Var = qh0Var.P;
                gg5 gg5Var2 = qh0Var.S;
                s64 s64Var = qh0Var.T;
                cmt cmtVar = qh0Var.U;
                ytt yttVar = qh0Var.V;
                nr00 nr00Var = qh0Var.W;
                iiVar.getClass();
                oeg0Var.getClass();
                kt2Var.getClass();
                xk0Var.getClass();
                o91Var.getClass();
                s91Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                fsdVar.getClass();
                wguVar.getClass();
                gst0Var.getClass();
                wyuVar.getClass();
                wdk0Var.getClass();
                b3c0Var.getClass();
                knf0Var.getClass();
                r9s0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(eh0.class, (f7i) new g7i(cadVar, ehf0Var, wsf0Var, peg0Var, wsf0Var2, peg0Var2, nr00Var, fs80Var, q91Var, iiVar, oeg0Var, uzc0Var, kt2Var, s31Var, dujVar, s91Var, h03Var, m1eVar, v88Var, g2vVar, pruVar, ctf0Var, xmtVar, ix0Var, gg5Var, l7kVar, cyuVar, gst0Var, dmtVar, grjVar, jlxVar, pytVar, qyg0Var, pyg0Var, x0uVar, gg5Var2, s64Var, cmtVar, yttVar).L));
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.N1 = ynbVarI;
                this.O1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(qh0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        kxq kxqVarB = B();
        yc3 yc3Var = kxqVarB instanceof yc3 ? (yc3) kxqVarB : null;
        if (yc3Var != null) {
            ccq0.U(yc3Var, new lf0(this, (byte) 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        G0().x(df0.f5976a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(ff0.f9429a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.R1;
    }
}
