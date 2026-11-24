package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/cha0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cha0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final phf0 M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(cha0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(cha0.class, "gameId", "getGameId()Ljava/lang/String;", 0)};
    public static final xi70 P1 = new xi70();

    public cha0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, bha0.f2595a);
        this.M1 = new phf0("GAME_ID");
        this.N1 = xbc.b0(this, sre0.f32672a.b(iha0.class), new l3a0(this, (byte) 13));
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(428734842, true, new cz90(this, (byte) 15)));
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
                String strN = this.M1.n(this, Q1[1]);
                i1w0VarF.getClass();
                strN.getClass();
                this.L1 = new fiu0(Collections.singletonMap(iha0.class, (gji) wba0Var.a(i1w0VarF, strN, false).p));
                return;
            }
        }
        jf4.n(b1j.i(wba0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
