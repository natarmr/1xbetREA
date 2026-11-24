package a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ce00;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ce00 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final kiu0 N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ce00.class, "binding", "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentListLineItemsBinding;", 0)};
    public static final wsz P1 = new wsz();

    public ce00() {
        super(R.layout.fragment_list_line_items);
        byte b = 1;
        this.K1 = true;
        this.L1 = ltt0.o(this, yd00.f42409a);
        byte b2 = 0;
        xd00 xd00Var = new xd00(this, b2);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, xd00Var);
        be00 be00Var = new be00(new xd00(this, b), b2);
        byte b3 = 2;
        a8z a8zVarA = maz.a(wezVar, new be00(new be00(this, b), b3));
        this.N1 = agc.G(this, sre0.f32672a.b(ef00.class), new qwv(a8zVarA, (byte) 24), new qwv(a8zVarA, (byte) 25), be00Var);
        this.O1 = maz.a(wezVar, new xd00(this, b3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        o2t.d(F(), this, "", new wd00(this, (byte) 0));
        G0().b.setItemAnimator(null);
        G0().b.setHasFixedSize(true);
        RecyclerView recyclerView = G0().b;
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize2 = G().getDimensionPixelSize(R.dimen.large_horizontal_margin_dynamic);
        recyclerView.m(new gvl(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, (byte) 2));
        knm0.i(G0().b, true);
        G0().b.setAdapter((vd00) this.O1.getValue());
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ef00 ef00VarH0 = H0();
        yje yjeVar = null;
        a1g a1gVarF0 = dub.f0(ef00VarH0.v0, ef00VarH0.d0.a(), ef00VarH0.e0.a(), new xo1(ef00VarH0, yjeVar, (byte) 4));
        ae00 ae00Var = new ae00(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new c6y(a1gVarF0, clzVarW, ae00Var, (yje) null), 3);
        xae0 xae0VarN = vtb.N(H0().w0);
        ae00 ae00Var2 = new ae00(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zd00(xae0VarN, clzVarW2, ae00Var2, (yje) null), 3);
        ol60 ol60Var = H0().x0;
        ae00 ae00Var3 = new ae00(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zd00(ol60Var, clzVarW3, ae00Var3, (yje) null), 3);
    }

    public final d1r G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (d1r) objN;
    }

    public final ef00 H0() {
        return (ef00) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        F().u0("UPDATED_BALANCE_KEY", this, new viq(this, (byte) 16));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        o2t.a(F());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().y();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.K1;
    }
}
