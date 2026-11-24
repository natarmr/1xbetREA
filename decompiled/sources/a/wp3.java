package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/wp3;", "La/yx5;", "<init>", "()V", "apple_fortune"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wp3 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(wp3.class, "binding", "getBinding()Lorg/xplatform/apple_fortune/databinding/FragmentAppleFortuneBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;

    public wp3() {
        super(R.layout.fragment_apple_fortune);
        this.K1 = i9o0.f14396a;
        a13 a13Var = new a13(this, (byte) 17);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 22), (byte) 23));
        this.M1 = agc.G(this, sre0.f32672a.b(kq3.class), new t51(a8zVarA, (byte) 14), new t51(a8zVarA, (byte) 15), a13Var);
        this.N1 = ltt0.o(this, up3.f36043a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ayq ayqVarG0 = G0();
        ayqVarG0.b.x(new df1(ayqVarG0, this, (byte) 28), new tp3(ayqVarG0, this, (byte) 0), new tp3(ayqVarG0, this, (byte) 1), new tp3(ayqVarG0, this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        q8i q8iVar;
        Fragment fragment = this.y;
        rp3 rp3Var = fragment instanceof rp3 ? (rp3) fragment : null;
        if (rp3Var == null || (q8iVar = (q8i) rp3Var.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(kq3.class, q8iVar.j0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().y;
        vp3 vp3Var = new vp3(2, this, wp3.class, "handleConnectionState", "handleConnectionState(Z)V", 4, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tg3(p7m0Var, clzVarW, vp3Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().x;
        vp3 vp3Var2 = new vp3(2, this, wp3.class, "handleAppleFortuneScreen", "handleAppleFortuneScreen(Lorg/xplatform/apple_fortune/presentation/models/AppleFortuneScreenState;)V", 4, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tg3(p7m0Var2, clzVarW2, vp3Var2, (yje) null, (byte) 0), 3);
    }

    public final ayq G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (ayq) objN;
    }

    public final kq3 H0() {
        return (kq3) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        kq3 kq3VarH0 = H0();
        p7m0 p7m0Var = kq3VarH0.x;
        p7m0 p7m0Var2 = kq3VarH0.w;
        if (p7m0Var2.getValue() == sp3.c) {
            kq3VarH0.E();
        } else if (p7m0Var2.getValue() == sp3.e) {
            zq3 zq3Var = new zq3(new cr3(kq3VarH0.v, kq3VarH0.q.a()));
            p7m0Var.getClass();
            p7m0Var.o(null, zq3Var);
            p7m0Var2.o(null, sp3.f);
        } else {
            Object value = p7m0Var2.getValue();
            sp3 sp3Var = sp3.f32572a;
            if (value == sp3Var) {
                p7m0Var.getClass();
                p7m0Var.o(null, ar3.f1324a);
                p7m0Var2.o(null, sp3Var);
            }
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        kq3 kq3VarH0 = H0();
        if (kq3VarH0.w.getValue() == sp3.c) {
            kq3VarH0.E();
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
