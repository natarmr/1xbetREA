package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xsq0;", "La/yx5;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xsq0 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public final kiu0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(xsq0.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentTitledGridMenuBinding;", 0)};
    public static final y2m0 P1 = new y2m0((byte) 22);

    public xsq0() {
        super(R.layout.fragment_titled_grid_menu);
        this.K1 = true;
        this.L1 = ltt0.o(this, vsq0.f37964a);
        tsq0 tsq0Var = new tsq0(this, (byte) 0);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, tsq0Var);
        this.N1 = maz.a(wezVar, new tsq0(this, (byte) 1));
        moq0 moq0Var = new moq0(new tsq0(this, (byte) 2), (byte) 5);
        a8z a8zVarA = maz.a(wezVar, new moq0(new moq0(this, (byte) 6), (byte) 7));
        this.O1 = agc.G(this, sre0.f32672a.b(xtq0.class), new r5p0(a8zVarA, (byte) 28), new r5p0(a8zVarA, (byte) 29), moq0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        o2t.d(F(), this, "", new usq0(this, (byte) 0));
        G0().c.setItemAnimator(null);
        G0().c.setHasFixedSize(true);
        RecyclerView recyclerView = G0().c;
        a8z a8zVar = this.M1;
        recyclerView.setAdapter((orq0) a8zVar.getValue());
        RecyclerView recyclerView2 = G0().c;
        int dimensionPixelSize = recyclerView2.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = recyclerView2.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView2.m(new fvl(0, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, cy7.c(), q3d.j(cc.class, i140.class)));
        RecyclerView recyclerView3 = G0().c;
        tre0 tre0Var = sre0.f32672a;
        dtb.u(recyclerView3, q3d.j(tre0Var.b(g140.class), tre0Var.b(w140.class), tre0Var.b(h140.class), tre0Var.b(l140.class), tre0Var.b(k140.class), tre0Var.b(n140.class), tre0Var.b(d240.class), tre0Var.b(a240.class), tre0Var.b(c240.class), tre0Var.b(m140.class), tre0Var.b(j140.class), tre0Var.b(b240.class), tre0Var.b(v140.class)), (orq0) a8zVar.getValue());
        knm0.i(G0().c, true);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xtq0 xtq0VarH0 = H0();
        List listJ = q3d.j(r040.SPORTS, r040.GAMES, r040.AGGREGATOR, r040.TOP, r040.VIRTUAL, r040.OTHER);
        listJ.getClass();
        yje yjeVar = null;
        a1g a1gVarF0 = dub.f0(xtq0VarH0.D0, xtq0VarH0.d0.a(), xtq0VarH0.c0.a(), new uu2(xtq0VarH0, listJ, xtq0VarH0.c.a().d.f27973a.b, null));
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new hlq0(a1gVarF0, this, new bdl0(2, (orq0) this.M1.getValue(), orq0.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 28), (yje) null), 3);
        p7m0 p7m0Var = H0().B0;
        wsq0 wsq0Var = new wsq0(this, yjeVar, (byte) 0);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hlq0(p7m0Var, clzVarW, wsq0Var, (yje) null), 3);
        ol60 ol60Var = H0().C0;
        wsq0 wsq0Var2 = new wsq0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hlq0(ol60Var, clzVarW2, wsq0Var2, (yje) null, (byte) 0), 3);
    }

    public final a6r G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (a6r) objN;
    }

    public final xtq0 H0() {
        return (xtq0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F().u0("UPDATED_BALANCE_KEY", this, new b0l0(this, (byte) 20));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().c.setAdapter(null);
        super.Z();
        o2t.a(F());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.K1;
    }
}
