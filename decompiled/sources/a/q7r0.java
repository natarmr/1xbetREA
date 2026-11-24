package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/q7r0;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q7r0 extends yx5 implements tah0 {
    public final boolean K1;
    public final s0r L1;
    public final kiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(q7r0.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTopGridSectionMenuBinding;", 0)};
    public static final y2m0 O1 = new y2m0((byte) 23);

    public q7r0() {
        super(R.layout.fragment_top_grid_section_menu);
        this.K1 = true;
        this.L1 = ltt0.o(this, new t6q0((byte) 26));
        cym0 cym0Var = new cym0(0, this, q7r0.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 17);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new moq0(cym0Var, (byte) 8));
        this.M1 = agc.G(this, sre0.f32672a.b(fho0.class), new p7r0(a8zVarA, (byte) 0), new p7r0(a8zVarA, (byte) 1), new ywm0(this, a8zVarA, (byte) 16));
        this.N1 = maz.a(wezVar, new h3q0((Object) this, (byte) 25));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setItemAnimator(null);
        G0().b.setHasFixedSize(true);
        knm0.i(G0().b, true);
        RecyclerView recyclerView = G0().b;
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView.m(new fvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize, cy7.c(), iun.f15405a));
        RecyclerView recyclerView2 = G0().b;
        a8z a8zVar = this.N1;
        recyclerView2.setAdapter((n7r0) a8zVar.getValue());
        RecyclerView recyclerView3 = G0().b;
        tre0 tre0Var = sre0.f32672a;
        dtb.u(recyclerView3, q3d.j(tre0Var.b(w140.class), tre0Var.b(a240.class), tre0Var.b(g140.class)), (n7r0) a8zVar.getValue());
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarY = ((fho0) this.M1.getValue()).y(r040.TOP);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new hlq0((utb) gmqVarY, this, new k5r0(2, (n7r0) this.N1.getValue(), n7r0.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 1), (yje) null), 3);
    }

    public final b6r G0() {
        return (b6r) this.L1.n(P1[0], this);
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
    public final boolean getW1() {
        return this.K1;
    }
}
