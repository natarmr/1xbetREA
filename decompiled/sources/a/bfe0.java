package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bfe0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bfe0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public ii M1;
    public ynb N1;
    public wdk0 O1;
    public final a8z P1;
    public final r34 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(bfe0.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentRecommendedGamesBinding;", 0), new ez40(bfe0.class, "partitionId", "getPartitionId()J", 0)};
    public static final rl70 R1 = new rl70();

    public bfe0() {
        super(R.layout.fragment_recommended_games);
        this.K1 = ltt0.o(this, afe0.f775a);
        this.P1 = xbc.b0(this, sre0.f32672a.b(wfe0.class), new zee0(this, (byte) 1));
        this.Q1 = new r34("partitionId");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new ex60(this, (byte) 17));
        qcc.X(this, new zee0(this, (byte) 0));
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        pkd.h(((v3r) objN).f36744a, new owp0(this), null, new ugd(-1709466307, true, new nrc0(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tee0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            tee0 tee0Var = (tee0) (ze3Var instanceof tee0 ? ze3Var : null);
            if (tee0Var != null) {
                Long lN = this.Q1.n(this, S1[1]);
                ehf0 ehf0Var = tee0Var.f33817a;
                cad cadVar = tee0Var.b;
                oeg0 oeg0Var = tee0Var.l;
                gii0 gii0Var = tee0Var.c;
                btt0 btt0Var = tee0Var.d;
                s91 s91Var = tee0Var.e;
                wsf0 wsf0Var = tee0Var.g;
                kt2 kt2Var = tee0Var.f;
                m1e m1eVar = tee0Var.h;
                duj dujVar = tee0Var.i;
                v88 v88Var = tee0Var.j;
                ii iiVar = tee0Var.q;
                ctf0 ctf0Var = tee0Var.k;
                pru pruVar = tee0Var.m;
                ntu ntuVar = tee0Var.o;
                l7k l7kVar = tee0Var.p;
                x2c0 x2c0Var = tee0Var.n;
                knf0 knf0Var = tee0Var.r;
                gg5 gg5Var = tee0Var.s;
                peg0 peg0Var = tee0Var.u;
                wdk0 wdk0Var = tee0Var.t;
                dmt dmtVar = tee0Var.v;
                iqt iqtVar = tee0Var.w;
                r9u r9uVar = tee0Var.x;
                gst0 gst0Var = tee0Var.A;
                wsf0 wsf0Var2 = tee0Var.y;
                peg0 peg0Var2 = tee0Var.z;
                ytt yttVar = tee0Var.B;
                bzt bztVar = tee0Var.C;
                ix0 ix0Var = tee0Var.D;
                cmt cmtVar = tee0Var.E;
                iiVar.getClass();
                oeg0Var.getClass();
                gii0Var.getClass();
                btt0Var.getClass();
                s91Var.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                x2c0Var.getClass();
                wdk0Var.getClass();
                r9uVar.getClass();
                gst0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(wfe0.class, (gji) new v8i(cadVar, ehf0Var, wsf0Var, peg0Var, wsf0Var2, peg0Var2, lN, iiVar, oeg0Var, gii0Var, btt0Var, s91Var, kt2Var, m1eVar, dujVar, v88Var, ctf0Var, pruVar, ntuVar, l7kVar, knf0Var, gg5Var, x2c0Var, wdk0Var, dmtVar, iqtVar, gst0Var, yttVar, bztVar, ix0Var, cmtVar).C));
                this.M1 = iiVar;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.N1 = ynbVarI;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(tee0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getL1() {
        return true;
    }
}
