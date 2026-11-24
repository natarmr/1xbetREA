package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/g1d0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g1d0 extends yx5 {
    public fiu0 K1;
    public final kiu0 L1;
    public final s0r M1;
    public static final /* synthetic */ iiy[] O1 = {new j0d0(g1d0.class, "binding", "getBinding()Lorg/xplatform/prophylaxis/impl/databinding/FragmentProphylaxisBinding;", 0)};
    public static final xi70 N1 = new xi70();

    public g1d0() {
        super(R.layout.fragment_prophylaxis);
        ssa0 ssa0Var = new ssa0(this, (byte) 29);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new g8b0(this, (byte) 29), (byte) 0));
        this.L1 = agc.G(this, sre0.f32672a.b(g2d0.class), new ync0(a8zVarA, (byte) 2), new ync0(a8zVarA, (byte) 3), ssa0Var);
        this.M1 = ltt0.o(this, e1d0.f7032a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        xae0 xae0VarN = vtb.N(((g2d0) this.L1.getValue()).f);
        s9c0 s9c0Var = new s9c0(this, null, (byte) 7);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(xae0VarN, clzVarW, s9c0Var, (yje) null), 3);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h1d0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h1d0 h1d0Var = (h1d0) (ze3Var instanceof h1d0 ? ze3Var : null);
            if (h1d0Var != null) {
                c1d0 c1d0Var = h1d0Var.f12279a;
                m1e m1eVar = h1d0Var.b;
                mne mneVar = h1d0Var.c;
                c1d0Var.getClass();
                m1eVar.getClass();
                this.K1 = new fiu0(wcf0.h(g2d0.class, (ppi) new ali(c1d0Var, m1eVar, mneVar).d));
                return;
            }
        }
        jf4.n(b1j.i(h1d0.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        g2d0 g2d0Var = (g2d0) this.L1.getValue();
        c4m0 c4m0Var = g2d0Var.e;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            g2d0Var.e = slb.U(ulb.L(new dnq(new fnq(g2d0Var.c.a(), new o690((w46) g2d0Var, yjeVar, (byte) 29), (byte) 4), new pr60(3, yjeVar, (byte) 20), b), g2d0Var.d.b), jiu0.a(g2d0Var));
        }
    }
}
