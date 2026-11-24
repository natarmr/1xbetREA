package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y8;", "La/yx5;", "<init>", "()V", "a/qek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y8 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final a8z N1;
    public final kiu0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(y8.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentAccordionMenuBinding;", 0)};
    public static final qek0 P1 = new qek0();

    public y8() {
        super(R.layout.fragment_accordion_menu);
        this.K1 = true;
        this.L1 = ltt0.o(this, w8.f38697a);
        u8 u8Var = new u8(this, (byte) 0);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, u8Var);
        this.N1 = maz.a(wezVar, new u8(this, (byte) 1));
        o5 o5Var = new o5(new u8(this, (byte) 2), (byte) 6);
        a8z a8zVarA = maz.a(wezVar, new o5(new o5(this, (byte) 7), (byte) 8));
        this.O1 = agc.G(this, sre0.f32672a.b(ab.class), new k8(a8zVarA, (byte) 2), new k8(a8zVarA, (byte) 3), o5Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setItemAnimator(null);
        G0().b.setHasFixedSize(true);
        G0().b.setAdapter((t8) this.M1.getValue());
        RecyclerView recyclerView = G0().b;
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize4 = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_24);
        int dimensionPixelSize5 = recyclerView.getResources().getDimensionPixelSize(R.dimen.radius_16);
        int dimensionPixelSize6 = recyclerView.getResources().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        int dimensionPixelSize7 = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_48);
        int dimensionPixelSize8 = recyclerView.getResources().getDimensionPixelSize(R.dimen.space_1);
        int dimensionPixelSize9 = recyclerView.getResources().getDimensionPixelSize(R.dimen.size_1);
        recyclerView.m(new mmk0(0, dimensionPixelSize6 + dimensionPixelSize4, dimensionPixelSize6, dimensionPixelSize8, q3d.j(g140.class, w140.class, a240.class, d240.class, n140.class, k140.class, e240.class, l140.class, h140.class, m140.class, j140.class, b240.class, v140.class)));
        int i = dimensionPixelSize6 + dimensionPixelSize3;
        recyclerView.m(new mmk0(0, i, i, dimensionPixelSize2, kotlin.collections.a.c(c240.class)));
        recyclerView.m(new mmk0(dimensionPixelSize2, dimensionPixelSize6, dimensionPixelSize6, 0, q3d.j(i140.class, x140.class)));
        recyclerView.m(new dvl(new k9b(dimensionPixelSize2, q3d.j(g140.class, w140.class, a240.class, d240.class, n140.class, k140.class, e240.class, l140.class, h140.class, c240.class, m140.class, j140.class, b240.class, v140.class), dimensionPixelSize6, dimensionPixelSize3, dimensionPixelSize9, kotlin.collections.a.c(new Pair(c240.class, Integer.valueOf(dimensionPixelSize3))), dimensionPixelSize, m5d.b(R.attr.uikitBackgroundContent, o0()), dimensionPixelSize5)));
        recyclerView.m(new evl(q3d.j(g140.class, w140.class, a240.class, d240.class, n140.class, k140.class, e240.class, l140.class, h140.class, m140.class, j140.class, b240.class, v140.class), dimensionPixelSize8, dimensionPixelSize7, cy7.c(), m5d.b(R.attr.uikitSeparator60, o0())));
        knm0.i(G0().b, true);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarX = H0().x(q3d.j(r040.SPORTS, r040.SINGLE_SPORTS, r040.GAMES, r040.SINGLE_GAMES, r040.AGGREGATOR, r040.SINGLE_AGGREGATOR, r040.TOP, r040.SINGLE_TOP, r040.VIRTUAL, r040.SINGLE_VIRTUAL, r040.OTHER, r040.SINGLE_OTHER));
        lkz lkzVar = lkz.f20223a;
        yje yjeVar = null;
        qjj.W(x0x.Q(this.u1), null, null, new m1((a1g) gmqVarX, this, new i8(2, (t8) this.M1.getValue(), t8.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 1), (yje) null), 3);
        p7m0 p7m0Var = H0().v0;
        x8 x8Var = new x8(this, yjeVar, (byte) 0);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(p7m0Var, clzVarW, x8Var, (yje) null), 3);
        ol60 ol60Var = H0().w0;
        x8 x8Var2 = new x8(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new m1((gmq) ol60Var, clzVarW2, x8Var2, (yje) null, (byte) 0), 3);
    }

    public final fxq G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (fxq) objN;
    }

    public final ab H0() {
        return (ab) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F().u0("UPDATED_BALANCE_KEY", this, new gne(this, (byte) 2));
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
