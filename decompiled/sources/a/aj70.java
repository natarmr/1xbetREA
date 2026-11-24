package a;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/aj70;", "La/yx5;", "<init>", "()V", "a/xi70", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class aj70 extends yx5 {
    public final i9o0 K1;
    public wdk0 L1;
    public q6i M1;
    public final kiu0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(aj70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesOptionsBinding;", 0)};
    public static final xi70 P1 = new xi70();

    public aj70() {
        super(R.layout.fragment_games_options);
        this.K1 = i9o0.f14396a;
        pu50 pu50Var = new pu50(this, (byte) 28);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 8), (byte) 9));
        this.N1 = agc.G(this, sre0.f32672a.b(tj70.class), new ph70(a8zVarA, (byte) 4), new ph70(a8zVarA, (byte) 5), pu50Var);
        this.O1 = ltt0.o(this, yi70.f42674a);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVarO = sac.O(this);
        if (h5tVarO != null) {
            h5tVarO.p(this);
        }
    }

    public final m0r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (m0r) objN;
    }

    public final tj70 H0() {
        return (tj70) this.N1.getValue();
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
        H0().x();
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
        G0().b.setOnClickListener(new l910(this, (byte) 10));
        G0().g.setEnabled(false);
        LinearLayout linearLayout = G0().g;
        ymx ymxVar = ymx.INTERVAL_500;
        final Object[] objArr = 0 == true ? 1 : 0;
        dyb.b0(linearLayout, ymxVar, new Function1(this) { // from class: a.wi70
            public final /* synthetic */ aj70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b = objArr;
                aj70 aj70Var = this.b;
                View view2 = (View) obj;
                switch (b) {
                    case 0:
                        xi70 xi70Var = aj70.P1;
                        view2.getClass();
                        tj70 tj70VarH0 = aj70Var.H0();
                        j5t j5tVar = tj70VarH0.b.f13432a.f26724a;
                        boolean z = !j5tVar.g;
                        j5tVar.g = z;
                        j5t.a(Boolean.valueOf(z), "instantBetVisibility");
                        tj70VarH0.E();
                        break;
                    default:
                        xi70 xi70Var2 = aj70.P1;
                        view2.getClass();
                        tj70 tj70VarH1 = aj70Var.H0();
                        if (!tj70VarH1.g.a()) {
                            tj70VarH1.w(gle.f11486a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b = 1;
        dyb.b0(G0().k, ymxVar, new Function1(this) { // from class: a.wi70
            public final /* synthetic */ aj70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                aj70 aj70Var = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        xi70 xi70Var = aj70.P1;
                        view2.getClass();
                        tj70 tj70VarH0 = aj70Var.H0();
                        j5t j5tVar = tj70VarH0.b.f13432a.f26724a;
                        boolean z = !j5tVar.g;
                        j5tVar.g = z;
                        j5t.a(Boolean.valueOf(z), "instantBetVisibility");
                        tj70VarH0.E();
                        break;
                    default:
                        xi70 xi70Var2 = aj70.P1;
                        view2.getClass();
                        tj70 tj70VarH1 = aj70Var.H0();
                        if (!tj70VarH1.g.a()) {
                            tj70VarH1.w(gle.f11486a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        itb itbVarV = xkb.V(H0().p);
        yje yjeVar = null;
        zi70 zi70Var = new zi70(this, yjeVar, 0 == true ? 1 : 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(itbVarV, clzVarW, zi70Var, (yje) null), 3);
        p7m0 p7m0Var = H0().q;
        zi70 zi70Var2 = new zi70(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(p7m0Var, clzVarW2, zi70Var2, (yje) null), 3);
        tj70 tj70VarH0 = H0();
        if (tj70VarH0.t) {
            return;
        }
        tj70VarH0.z(new cj70(tj70VarH0.f.a() == vrs.f37917a));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
