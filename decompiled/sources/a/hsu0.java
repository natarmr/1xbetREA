package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/hsu0;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/svs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hsu0 extends yx5 implements tah0 {
    public final boolean K1;
    public final s0r L1;
    public final kiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(hsu0.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedVirtualBinding;", 0)};
    public static final svs0 O1 = new svs0((byte) 10);

    public hsu0() {
        super(R.layout.fragment_tabbed_virtual);
        this.K1 = true;
        this.L1 = ltt0.o(this, gsu0.f11848a);
        avs0 avs0Var = new avs0(0, this, hsu0.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 8);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new cvs0(avs0Var, (byte) 20));
        this.M1 = agc.G(this, sre0.f32672a.b(rio0.class), new w6u0(a8zVarA, (byte) 12), new w6u0(a8zVarA, (byte) 13), new ywm0(this, a8zVarA, (byte) 26));
        this.N1 = maz.a(wezVar, new rbt0(this, (byte) 15));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setAdapter((tio0) this.N1.getValue());
        knm0.i(G0().b, true);
        RecyclerView recyclerView = G0().b;
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView.m(new gvl(recyclerView.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, dimensionPixelSize, (byte) 0));
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarY = ((rio0) this.M1.getValue()).y(r040.VIRTUAL);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new npu0(gmqVarY, this, new k5r0(2, (tio0) this.N1.getValue(), tio0.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 17), (yje) null), 3);
    }

    public final r5r G0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (r5r) objN;
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
