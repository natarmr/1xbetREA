package a;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ikc0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ikc0 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(ikc0.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/PromoGamesInfoFragmentBinding;", 0)};
    public final i9o0 K1;
    public iki L1;
    public final kiu0 M1;
    public final s0r N1;

    public ikc0() {
        super(R.layout.promo_games_info_fragment);
        this.K1 = i9o0.f14396a;
        ssa0 ssa0Var = new ssa0(this, (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 19), (byte) 20));
        this.M1 = agc.G(this, sre0.f32672a.b(nkc0.class), new x6b0(a8zVarA, (byte) 22), new x6b0(a8zVarA, (byte) 23), ssa0Var);
        this.N1 = ltt0.o(this, hkc0.f13200a);
    }

    @Override // a.yx5
    public final void C0() {
        kki kkiVar;
        Fragment fragment = this.y;
        kjc0 kjc0Var = fragment instanceof kjc0 ? (kjc0) fragment : null;
        if (kjc0Var == null || (kkiVar = kjc0Var.M1) == null) {
            return;
        }
        switch (kkiVar.f18441a) {
            case 0:
                this.L1 = (iki) ((n5d0) kkiVar.d).get();
                break;
            case 1:
            default:
                this.L1 = (iki) ((n5d0) kkiVar.d).get();
                break;
            case 2:
                this.L1 = (iki) ((n5d0) kkiVar.d).get();
                break;
        }
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((nkc0) this.M1.getValue()).b;
        s9c0 s9c0Var = new s9c0(this, null, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(p7m0Var, clzVarW, s9c0Var, (yje) null, (byte) 0), 3);
    }

    public final jkc0 G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (jkc0) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
