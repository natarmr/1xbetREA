package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/kc80;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kc80 extends yx5 implements tah0 {
    public final boolean K1;
    public final s0r L1;
    public final kiu0 M1;
    public final n0o0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(kc80.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentOtherGridSectionBinding;", 0)};
    public static final nh70 O1 = new nh70();

    public kc80() {
        super(R.layout.fragment_other_grid_section);
        this.K1 = true;
        this.L1 = ltt0.o(this, jc80.f16264a);
        a8z a8zVarA = maz.a(wez.b, new gg70(new cz60(0, this, kc80.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 9), (byte) 24));
        this.M1 = agc.G(this, sre0.f32672a.b(fho0.class), new ph70(a8zVarA, (byte) 20), new ph70(a8zVarA, (byte) 21), new ha30(this, a8zVarA, (byte) 17));
        this.N1 = maz.b(new pl70(this, (byte) 7));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        RecyclerView recyclerView = G0().b;
        n0o0 n0o0Var = this.N1;
        recyclerView.setAdapter((ic80) n0o0Var.getValue());
        RecyclerView recyclerView2 = G0().b;
        ic80 ic80Var = (ic80) n0o0Var.getValue();
        ic80Var.getClass();
        recyclerView2.addOnAttachStateChangeListener(new j14(ic80Var, new l5g(recyclerView2, (byte) 6), (byte) 3));
        G0().b.setHasFixedSize(true);
        knm0.i(G0().b, true);
        RecyclerView recyclerView3 = G0().b;
        int dimensionPixelSize = recyclerView3.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = recyclerView3.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView3.m(new fvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize, cy7.c(), iun.f15405a));
        G0().b.setItemAnimator(null);
        RecyclerView recyclerView4 = G0().b;
        tre0 tre0Var = sre0.f32672a;
        dtb.u(recyclerView4, q3d.j(tre0Var.b(w140.class), tre0Var.b(a240.class), tre0Var.b(h140.class), tre0Var.b(g140.class)), (ic80) n0o0Var.getValue());
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarY = ((fho0) this.M1.getValue()).y(r040.OTHER);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new zm70((utb) gmqVarY, this, new hi70(2, (ic80) this.N1.getValue(), ic80.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 11), (yje) null), 3);
    }

    public final n2r G0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (n2r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F().u0("UPDATED_BALANCE_KEY", this, new ex60(this, (byte) 5));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ((fho0) this.M1.getValue()).B();
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
    public final boolean getL1() {
        return this.K1;
    }
}
