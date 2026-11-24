package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/r810;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r810 extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(r810.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/FragmentLotteryBinding;", 0)};
    public final i9o0 K1;
    public eki L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;

    public r810() {
        super(R.layout.fragment_lottery);
        this.K1 = i9o0.f14396a;
        rx00 rx00Var = new rx00(this, (byte) 3);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 10), (byte) 11));
        this.N1 = agc.G(this, sre0.f32672a.b(e910.class), new j210(a8zVarA, (byte) 2), new j210(a8zVarA, (byte) 3), rx00Var);
        this.O1 = ltt0.o(this, p810.f26533a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.W(this, this, new o0t(0, I0(), e910.class, "onBackPressed", "onBackPressed()V", 0, (byte) 16));
        G0(false);
        H0().b.setListener(new nr00(this));
    }

    @Override // a.yx5
    public final void C0() {
        fki fkiVar;
        Fragment fragment = this.y;
        g910 g910Var = fragment instanceof g910 ? (g910) fragment : null;
        if (g910Var == null || (fkiVar = (fki) g910Var.S1.getValue()) == null) {
            return;
        }
        this.L1 = (eki) fkiVar.i.get();
        this.M1 = fkiVar.f9693a.j();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        qoj0 qoj0Var = I0().l;
        yje yjeVar = null;
        q810 q810Var = new q810(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00(qoj0Var, clzVarW, q810Var, (yje) null), 3);
        p7m0 p7m0Var = I0().k;
        q810 q810Var2 = new q810(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zd00(p7m0Var, clzVarW2, q810Var2, (yje) null, (byte) 0), 3);
    }

    public final void G0(boolean z) {
        LotteryView lotteryView = H0().b;
        egi0 egi0VarA = igi0.a((Function2) phu0.M(lotteryView).b);
        while (egi0VarA.hasNext()) {
            ((View) egi0VarA.next()).setEnabled(z);
        }
        for (sdq0 sdq0Var : lotteryView.f46440a) {
            if (sdq0Var != null) {
                sdq0Var.f(z);
            }
        }
    }

    public final e1r H0() {
        Object objN = this.O1.n(P1[0], this);
        objN.getClass();
        return (e1r) objN;
    }

    public final e910 I0() {
        return (e910) this.N1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        try {
            e0g0 e0g0Var = j0g0.b;
            bundle.putBundle("_lottery", H0().b.c());
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void j0(Bundle bundle) {
        Bundle bundle2;
        rdq0 rdq0Var;
        this.j1 = true;
        if (bundle == null || (bundle2 = bundle.getBundle("_lottery")) == null) {
            return;
        }
        LotteryView lotteryView = H0().b;
        sdq0[] sdq0VarArr = lotteryView.f46440a;
        int i = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            Bundle bundle3 = bundle2.getBundle("_ticket_" + i);
            if (bundle3 != null && (rdq0Var = sdq0VarArr[i]) != 0) {
                rdq0Var.i(bundle3);
            }
            boolean z = bundle2.getBoolean("_ticket_visibility" + i);
            Object[] objArr = sdq0VarArr[i];
            objArr.getClass();
            ((View) objArr).setVisibility(z ? 8 : 0);
            if (z) {
                lotteryView.c++;
            }
            i++;
        }
        int i2 = bundle2.getInt("_selected");
        if (i2 != -1) {
            lotteryView.f = n910.c;
            rdq0 rdq0Var2 = sdq0VarArr[i2];
            lotteryView.b = rdq0Var2;
            rdq0Var2.getClass();
            rdq0Var2.setTranslationX(0.0f);
            Object obj = lotteryView.b;
            obj.getClass();
            ((View) obj).setTranslationY(0.0f);
            Object obj2 = lotteryView.b;
            obj2.getClass();
            ((View) obj2).setScaleY(1.0f);
            Object obj3 = lotteryView.b;
            obj3.getClass();
            ((View) obj3).setScaleY(1.0f);
            Object obj4 = lotteryView.b;
            obj4.getClass();
            ((View) obj4).setRotation(0.0f);
            lotteryView.removeView((View) lotteryView.b);
            lotteryView.addView((View) lotteryView.b);
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
