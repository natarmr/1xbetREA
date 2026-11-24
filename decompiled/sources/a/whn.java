package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/whn;", "La/yx5;", "<init>", "()V", "eastern_nights"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class whn extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(whn.class, "binding", "getBinding()Lorg/xplatform/eastern_nights/databinding/FragmentEasternNightsBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;

    public whn() {
        super(R.layout.fragment_eastern_nights);
        this.K1 = i9o0.f14396a;
        ntl ntlVar = new ntl(this, (byte) 12);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 3), (byte) 4));
        this.M1 = agc.G(this, sre0.f32672a.b(kin.class), new b9k(a8zVarA, (byte) 22), new b9k(a8zVarA, (byte) 23), ntlVar);
        this.N1 = ltt0.o(this, vhn.f37439a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.y();
        uzq uzqVarG0 = G0();
        uzqVarG0.b.x(new dpl(uzqVarG0, this, (byte) 26), new uhn(uzqVarG0, this, (byte) 0), new uhn(uzqVarG0, this, (byte) 1), new uhn(uzqVarG0, this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        xfi xfiVar;
        Fragment fragment = this.y;
        min minVar = fragment instanceof min ? (min) fragment : null;
        if (minVar == null || (xfiVar = (xfi) minVar.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(kin.class, xfiVar.h0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kin kinVarH0 = H0();
        u6n0 u6n0Var = new u6n0(kinVarH0.w, new cin(kinVarH0, null, (byte) 0));
        pfl pflVar = new pfl(2, this, whn.class, "handleEasternNightsScreen", "handleEasternNightsScreen(Lorg/xplatform/eastern_nights/presentation/models/EasternNightsScreenState;)V", 4, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ofl(u6n0Var, clzVarW, pflVar, (yje) null), 3);
        p7m0 p7m0Var = H0().x;
        pfl pflVar2 = new pfl(2, this, whn.class, "handleConnection", "handleConnection(Z)V", 4, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new ofl(p7m0Var, clzVarW2, pflVar2, (yje) null, (byte) 0), 3);
    }

    public final uzq G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (uzq) objN;
    }

    public final kin H0() {
        return (kin) this.M1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
