package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ul70;", "La/yx5;", "<init>", "()V", "a/rl70", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class ul70 extends yx5 {
    public final i9o0 K1;
    public wdk0 L1;
    public y6i M1;
    public final s0r N1;
    public final kiu0 O1;
    public final cgx0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(ul70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesOptionsBinding;", 0), new ez40(ul70.class, "raiseGame", "getRaiseGame()Z", 0)};
    public static final rl70 Q1 = new rl70();

    public ul70() {
        super(R.layout.fragment_games_options);
        this.K1 = i9o0.f14396a;
        this.N1 = ltt0.o(this, sl70.f32385a);
        pl70 pl70Var = new pl70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 18), (byte) 19));
        this.O1 = agc.G(this, sre0.f32672a.b(nm70.class), new ph70(a8zVarA, (byte) 14), new ph70(a8zVarA, (byte) 15), pl70Var);
        this.P1 = new cgx0("RAISE_GAME_BUNDLE");
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        Fragment fragment2 = fragment != null ? fragment.y : null;
        bn70 bn70Var = fragment2 instanceof bn70 ? (bn70) fragment2 : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.e(this);
    }

    public final m0r G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (m0r) objN;
    }

    public final nm70 H0() {
        return (nm70) this.O1.getValue();
    }

    public final void I0(boolean z) {
        if (z && G0().l.getVisibility() == 0 && G0().h.getVisibility() == 0) {
            return;
        }
        G0().k.setVisibility(z ? 0 : 8);
        G0().g.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        H0().y();
        this.j1 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            G0().j.setForceDarkAllowed(false);
        }
        G0().b.setOnClickListener(new l910(this, (byte) 11));
        G0().g.setEnabled(false);
        LinearLayout linearLayout = G0().g;
        ymx ymxVar = ymx.INTERVAL_500;
        final Object[] objArr = 0 == true ? 1 : 0;
        dyb.b0(linearLayout, ymxVar, new Function1(this) { // from class: a.ql70
            public final /* synthetic */ ul70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b = objArr;
                ul70 ul70Var = this.b;
                View view2 = (View) obj;
                switch (b) {
                    case 0:
                        rl70 rl70Var = ul70.Q1;
                        view2.getClass();
                        nm70 nm70VarH0 = ul70Var.H0();
                        j5t j5tVar = nm70VarH0.b.f13432a.f26724a;
                        boolean z = !j5tVar.g;
                        j5tVar.g = z;
                        j5t.a(Boolean.valueOf(z), "instantBetVisibility");
                        nm70VarH0.F();
                        break;
                    default:
                        rl70 rl70Var2 = ul70.Q1;
                        view2.getClass();
                        nm70 nm70VarH1 = ul70Var.H0();
                        if (!nm70VarH1.g.a() || nm70VarH1.m) {
                            nm70VarH1.w(gle.f11486a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b = 1;
        dyb.b0(G0().k, ymxVar, new Function1(this) { // from class: a.ql70
            public final /* synthetic */ ul70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                ul70 ul70Var = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        rl70 rl70Var = ul70.Q1;
                        view2.getClass();
                        nm70 nm70VarH0 = ul70Var.H0();
                        j5t j5tVar = nm70VarH0.b.f13432a.f26724a;
                        boolean z = !j5tVar.g;
                        j5tVar.g = z;
                        j5t.a(Boolean.valueOf(z), "instantBetVisibility");
                        nm70VarH0.F();
                        break;
                    default:
                        rl70 rl70Var2 = ul70.Q1;
                        view2.getClass();
                        nm70 nm70VarH1 = ul70Var.H0();
                        if (!nm70VarH1.g.a() || nm70VarH1.m) {
                            nm70VarH1.w(gle.f11486a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        itb itbVarV = xkb.V(H0().s);
        yje yjeVar = null;
        tl70 tl70Var = new tl70(this, yjeVar, 0 == true ? 1 : 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(itbVarV, clzVarW, tl70Var, (yje) null), 3);
        p7m0 p7m0Var = H0().t;
        tl70 tl70Var2 = new tl70(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(p7m0Var, clzVarW2, tl70Var2, (yje) null), 3);
        nm70 nm70VarH0 = H0();
        if (nm70VarH0.w) {
            return;
        }
        nm70VarH0.A(new wl70(nm70VarH0.f.a() == vrs.f37917a || nm70VarH0.m));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
