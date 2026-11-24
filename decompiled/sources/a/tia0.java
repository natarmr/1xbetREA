package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tia0;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tia0 extends yx5 {
    public final e9o0 K1;
    public final s0r L1;
    public foi M1;
    public final phf0 N1;
    public final cgx0 O1;
    public final a8z P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(tia0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(tia0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(tia0.class, "fromPlayersMenu", "getFromPlayersMenu()Z", 0)};
    public static final fl70 R1 = new fl70();

    public tia0() {
        super(R.layout.compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.L1 = ltt0.o(this, sia0.f32253a);
        this.N1 = new phf0("GAME_ID");
        this.O1 = new cgx0("FROM_PLAYERS_MENU");
        this.P1 = xbc.a0(this, sre0.f32672a.b(xja0.class), null, new l3a0(this, (byte) 19), 14);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(S1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-980177248, true, new cz90(this, (byte) 19)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wba0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wba0 wba0Var = (wba0) (ze3Var instanceof wba0 ? ze3Var : null);
            if (wba0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                this.M1 = (foi) ((n5d0) wba0Var.a(i1w0VarF, this.N1.n(this, iiyVarArr[1]), this.O1.n(this, iiyVarArr[2]).booleanValue()).c).get();
                return;
            }
        }
        jf4.n(b1j.i(wba0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
