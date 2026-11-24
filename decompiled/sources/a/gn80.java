package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/gn80;", "La/yx5;", "<init>", "()V", "a/mi70", "La/ln80;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gn80 extends yx5 {
    public fiu0 K1;
    public final s0r L1;
    public final kiu0 M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(gn80.class, "binding", "getBinding()Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentPaletteBinding;", 0)};
    public static final mi70 N1 = new mi70();

    public gn80() {
        super(R.layout.fragment_palette);
        this.L1 = ltt0.o(this, fn80.f9822a);
        pl70 pl70Var = new pl70(this, (byte) 10);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 26), (byte) 27));
        this.M1 = agc.G(this, sre0.f32672a.b(tn80.class), new ph70(a8zVarA, (byte) 24), new ph70(a8zVarA, (byte) 25), pl70Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(O1[0], this);
        objN.getClass();
        b1j.t(((p2r) objN).b, new ugd(-1634553415, true, new ds60(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hn80.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hn80 hn80Var = (hn80) (ze3Var instanceof hn80 ? ze3Var : null);
            if (hn80Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                v6k v6kVar = hn80Var.f13338a;
                ctf0 ctf0Var = hn80Var.b;
                wyu wyuVar = hn80Var.c;
                peg0 peg0Var = hn80Var.d;
                fsd fsdVar = hn80Var.e;
                ctf0Var.getClass();
                wyuVar.getClass();
                fsdVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(tn80.class, (eni) new qgd(v6kVar, ctf0Var, i1w0VarF, wyuVar, peg0Var, fsdVar).h));
                return;
            }
        }
        jf4.n(b1j.i(hn80.class, "Cannot create dependency "));
    }
}
