package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.lucky_card.presentation.views.LuckyCardChoiceView;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/lj10;", "La/yx5;", "<init>", "()V", "lucky_card"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lj10 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(lj10.class, "viewBinding", "getViewBinding()Lorg/xplatform/lucky_card/databinding/FragmentLuckyCardBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;

    public lj10() {
        super(R.layout.fragment_lucky_card);
        this.K1 = i9o0.f14396a;
        ij10 ij10Var = new ij10(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 16), (byte) 17));
        this.M1 = agc.G(this, sre0.f32672a.b(uj10.class), new j210(a8zVarA, (byte) 8), new j210(a8zVarA, (byte) 9), ij10Var);
        this.N1 = ltt0.o(this, kj10.f18364a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ((LuckyCardChoiceView) G0().b.d).setListener(new yox(this));
    }

    @Override // a.yx5
    public final void C0() {
        lki lkiVar;
        Fragment fragment = this.y;
        hj10 hj10Var = fragment instanceof hj10 ? (hj10) fragment : null;
        if (hj10Var == null || (lkiVar = (lki) hj10Var.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(uj10.class, lkiVar.j0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        p7m0 p7m0Var = ((uj10) kiu0Var.getValue()).p;
        yje yjeVar = null;
        jj10 jj10Var = new jj10(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00(p7m0Var, clzVarW, jj10Var, (yje) null), 3);
        p7m0 p7m0Var2 = ((uj10) kiu0Var.getValue()).q;
        jj10 jj10Var2 = new jj10(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zd00(p7m0Var2, clzVarW2, jj10Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = ((uj10) kiu0Var.getValue()).r;
        jj10 jj10Var3 = new jj10(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zd00((gmq) p7m0Var3, clzVarW3, jj10Var3, (yje) null, (char) 0), 3);
    }

    public final f1r G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (f1r) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
