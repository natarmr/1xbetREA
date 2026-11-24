package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/q21;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q21 extends yx5 implements tah0 {
    public final boolean K1;
    public final s0r L1;
    public final kiu0 M1;
    public final n0o0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(q21.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentGridAggregatorSectionBinding;", 0)};
    public static final rek0 O1 = new rek0((byte) 15);

    public q21() {
        super(R.layout.fragment_grid_aggregator_section);
        this.K1 = true;
        this.L1 = ltt0.o(this, p21.f26230a);
        a8z a8zVarA = maz.a(wez.b, new f80(new f8(0, this, q21.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 6), (byte) 5));
        this.M1 = agc.G(this, sre0.f32672a.b(fho0.class), new k8(a8zVarA, (byte) 26), new k8(a8zVarA, (byte) 27), new h5((Object) this, (Object) a8zVarA, (byte) 3));
        this.N1 = maz.b(new nc((Object) this, (byte) 15));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        RecyclerView recyclerView = G0().b;
        n0o0 n0o0Var = this.N1;
        recyclerView.setAdapter((o21) n0o0Var.getValue());
        RecyclerView recyclerView2 = G0().b;
        int dimensionPixelSize = recyclerView2.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = recyclerView2.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView2.m(new fvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize, cy7.c(), iun.f15405a));
        knm0.i(G0().b, true);
        RecyclerView recyclerView3 = G0().b;
        tre0 tre0Var = sre0.f32672a;
        dtb.u(recyclerView3, q3d.j(tre0Var.b(w140.class), tre0Var.b(h140.class)), (o21) n0o0Var.getValue());
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarY = ((fho0) this.M1.getValue()).y(r040.AGGREGATOR);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new kz((utb) gmqVarY, this, new i8(2, (o21) this.N1.getValue(), o21.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 11), (yje) null), 3);
    }

    public final o0r G0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (o0r) objN;
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
