package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/xc80;", "La/yx5;", "La/tah0;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xc80 extends yx5 implements tah0 {
    public final boolean K1;
    public final s0r L1;
    public final kiu0 M1;
    public final a8z N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(xc80.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTabbedOtherBinding;", 0)};
    public static final mi70 O1 = new mi70();

    public xc80() {
        super(R.layout.fragment_tabbed_other);
        this.K1 = true;
        this.L1 = ltt0.o(this, wc80.f38914a);
        cz60 cz60Var = new cz60(0, this, xc80.class, "requireParentFragment", "requireParentFragment()Landroidx/fragment/app/Fragment;", 0, (byte) 11);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new gg70(cz60Var, (byte) 25));
        this.M1 = agc.G(this, sre0.f32672a.b(rio0.class), new ph70(a8zVarA, (byte) 22), new ph70(a8zVarA, (byte) 23), new ha30(this, a8zVarA, (byte) 18));
        this.N1 = maz.a(wezVar, new pl70(this, (byte) 8));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        RecyclerView recyclerView = G0().b;
        a8z a8zVar = this.N1;
        sio0 sio0Var = (sio0) a8zVar.getValue();
        sio0Var.getClass();
        recyclerView.addOnAttachStateChangeListener(new j14(sio0Var, new l5g(recyclerView, (byte) 6), (byte) 3));
        G0().b.setItemAnimator(null);
        G0().b.setHasFixedSize(true);
        RecyclerView recyclerView2 = G0().b;
        int dimensionPixelSize = recyclerView2.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView2.m(new gvl(recyclerView2.getResources().getDimensionPixelSize(R.dimen.space_8), dimensionPixelSize, dimensionPixelSize, (byte) 0));
        vvw.o(G0().b, true, 1);
        G0().b.setAdapter((sio0) a8zVar.getValue());
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarY = ((rio0) this.M1.getValue()).y(r040.OTHER);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new zm70(gmqVarY, this, new hi70(2, (sio0) this.N1.getValue(), sio0.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 12), (yje) null), 3);
    }

    public final p5r G0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (p5r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().b.setAdapter(null);
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
