package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/f9;", "La/yx5;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f9 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public final kiu0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(f9.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentAccordionGridMenuBinding;", 0)};
    public static final rek0 P1 = new rek0((byte) 9);

    public f9() {
        super(R.layout.fragment_accordion_grid_menu);
        this.K1 = true;
        this.L1 = ltt0.o(this, d9.f5674a);
        b9 b9Var = new b9(this, (byte) 0);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, b9Var);
        this.N1 = maz.a(wezVar, new b9(this, (byte) 1));
        o5 o5Var = new o5(new b9(this, (byte) 2), (byte) 9);
        a8z a8zVarA = maz.a(wezVar, new o5(new o5(this, (byte) 10), (byte) 11));
        this.O1 = agc.G(this, sre0.f32672a.b(ab.class), new k8(a8zVarA, (byte) 4), new k8(a8zVarA, (byte) 5), o5Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setItemAnimator(null);
        G0().b.setHasFixedSize(true);
        RecyclerView recyclerView = G0().b;
        a8z a8zVar = this.M1;
        recyclerView.setAdapter((a9) a8zVar.getValue());
        RecyclerView recyclerView2 = G0().b;
        int dimensionPixelSize = recyclerView2.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = recyclerView2.getResources().getDimensionPixelSize(R.dimen.radius_16);
        int dimensionPixelSize3 = recyclerView2.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        int dimensionPixelSize4 = recyclerView2.getResources().getDimensionPixelSize(R.dimen.space_12);
        int iB = m5d.b(R.attr.uikitBackgroundContent, o0());
        int iB2 = m5d.b(R.attr.uikitBackground, o0());
        List listJ = q3d.j(l140.class, k140.class, m140.class);
        List listJ2 = q3d.j(g140.class, w140.class, d240.class, n140.class, k140.class, e240.class, l140.class, h140.class, a240.class, c240.class, m140.class, j140.class, b240.class, v140.class);
        boolean zC = cy7.c();
        cl5 cl5Var = sw5.b;
        recyclerView2.m(new dvl(new l9b(listJ2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize, iB, iB2, listJ, dimensionPixelSize2, zC)));
        recyclerView2.m(new mmk0(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize3, 0, q3d.j(i140.class, x140.class)));
        RecyclerView recyclerView3 = G0().b;
        tre0 tre0Var = sre0.f32672a;
        dtb.u(recyclerView3, q3d.j(tre0Var.b(w140.class), tre0Var.b(g140.class), tre0Var.b(h140.class), tre0Var.b(l140.class), tre0Var.b(a240.class), tre0Var.b(k140.class), tre0Var.b(n140.class), tre0Var.b(d240.class), tre0Var.b(c240.class), tre0Var.b(m140.class), tre0Var.b(j140.class), tre0Var.b(b240.class), tre0Var.b(v140.class)), (a9) a8zVar.getValue());
        knm0.i(G0().b, true);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarX = H0().x(q3d.j(r040.SPORTS, r040.SINGLE_SPORTS, r040.GAMES, r040.SINGLE_GAMES, r040.AGGREGATOR, r040.SINGLE_AGGREGATOR, r040.TOP, r040.SINGLE_TOP, r040.VIRTUAL, r040.SINGLE_VIRTUAL, r040.OTHER, r040.SINGLE_OTHER));
        lkz lkzVar = lkz.f20223a;
        yje yjeVar = null;
        qjj.W(x0x.Q(this.u1), null, null, new m1((a1g) gmqVarX, this, new i8(2, (a9) this.M1.getValue(), a9.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 2), (yje) null), 3);
        p7m0 p7m0Var = H0().v0;
        e9 e9Var = new e9(this, yjeVar, (byte) 0);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(p7m0Var, clzVarW, e9Var, (yje) null), 3);
        ol60 ol60Var = H0().w0;
        e9 e9Var2 = new e9(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new m1((gmq) ol60Var, clzVarW2, e9Var2, (yje) null, (byte) 0), 3);
    }

    public final exq G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (exq) objN;
    }

    public final ab H0() {
        return (ab) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F().u0("UPDATED_BALANCE_KEY", this, new gne(this, (byte) 3));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().y();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
