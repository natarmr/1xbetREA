package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/wzv0;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wzv0 extends yx5 implements tah0 {
    public final boolean K1;
    public final s0r L1;
    public final kiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(wzv0.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentXGamesSectionMenuBinding;", 0)};
    public static final wxs0 O1 = new wxs0((byte) 18);

    public wzv0() {
        super(R.layout.fragment_x_games_section_menu);
        this.K1 = true;
        this.L1 = ltt0.o(this, tzv0.f34823a);
        avs0 avs0Var = new avs0(0, this, wzv0.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 14);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new uzv0(avs0Var, (byte) 0));
        this.M1 = agc.G(this, sre0.f32672a.b(rio0.class), new w6u0(a8zVarA, (byte) 24), new w6u0(a8zVarA, (byte) 25), new vzv0(this, a8zVarA, (byte) 0));
        this.N1 = maz.a(wezVar, new jmv0(this, (byte) 14));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setItemAnimator(null);
        G0().b.setHasFixedSize(true);
        RecyclerView recyclerView = G0().b;
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView.m(new gvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, (byte) 2));
        vvw.o(G0().b, true, 1);
        G0().b.setAdapter((szv0) this.N1.getValue());
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarY = ((rio0) this.M1.getValue()).y(r040.GAMES);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new npu0(gmqVarY, this, new k5r0(2, (szv0) this.N1.getValue(), szv0.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 24), (yje) null), 3);
    }

    public final s6r G0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (s6r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.setAdapter(null);
        super.Z();
    }

    @Override // a.tah0
    public final boolean p() {
        return G0().b.canScrollVertically(-1);
    }

    @Override // a.tah0
    public final void w() {
        kcx.G(G0().b, 0);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
