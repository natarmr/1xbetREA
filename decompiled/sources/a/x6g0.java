package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/x6g0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x6g0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final boolean M1;
    public final phf0 N1;
    public final r34 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(x6g0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(x6g0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(x6g0.class, "sportId", "getSportId()J", 0)};
    public static final lme0 Q1 = new lme0((byte) 8);

    public x6g0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, w6g0.f38623a);
        this.M1 = true;
        this.N1 = new phf0("GAME_ID_KEY");
        this.O1 = new r34("SPORT_ID_KEY");
        this.P1 = xbc.b0(this, sre0.f32672a.b(m8g0.class), new tie0(this, (byte) 29));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v6g0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v6g0 v6g0Var = (v6g0) (ze3Var instanceof v6g0 ? ze3Var : null);
            if (v6g0Var != null) {
                iiy[] iiyVarArr = R1;
                this.L1 = v6g0Var.a(this.O1.n(this, iiyVarArr[2]).longValue(), a4n0.f(this), this.N1.n(this, iiyVarArr[1]), "").o();
                return;
            }
        }
        jf4.n(b1j.i(v6g0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(-386822857, true, new dke0(this, (byte) 13)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
