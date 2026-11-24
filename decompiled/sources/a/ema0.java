package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ema0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ema0 extends yx5 {
    public final s0r K1;
    public joi L1;
    public final e9o0 M1;
    public final phf0 N1;
    public final r34 O1;
    public final a8z P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ema0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ema0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(ema0.class, "sportId", "getSportId()J", 0)};
    public static final xi70 R1 = new xi70();

    public ema0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, dma0.f6314a);
        bp3 bp3Var = bp3.f2960a;
        this.M1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.N1 = new phf0("GAME_ID");
        this.O1 = new r34("SPORT_ID");
        this.P1 = xbc.a0(this, sre0.f32672a.b(dna0.class), null, new l3a0(this, (byte) 27), 14);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(1289180808, true, new cz90(this, (byte) 28)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fma0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fma0 fma0Var = (fma0) (ze3Var instanceof fma0 ? ze3Var : null);
            if (fma0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                this.L1 = (joi) ((n5d0) fma0Var.a(this.O1.n(this, iiyVarArr[2]).longValue(), i1w0VarF, this.N1.n(this, iiyVarArr[1]), "").d).get();
                return;
            }
        }
        jf4.n(b1j.i(fma0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.M1;
    }
}
