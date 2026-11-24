package a;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.tile_matching.presentation.views.TileMatchingCoeffView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/weq0;", "La/yx5;", "<init>", "()V", "a/s9m0", "tile_matching"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class weq0 extends yx5 {
    public final i9o0 K1;
    public exi L1;
    public final s0r M1;
    public final kiu0 N1;
    public List O1;
    public final n0o0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(weq0.class, "binding", "getBinding()Lorg/xplatform/tile_matching/databinding/FragmentTileMatchingBinding;", 0)};
    public static final s9m0 Q1 = new s9m0();

    public weq0() {
        super(R.layout.fragment_tile_matching);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, teq0.f33834a);
        seq0 seq0Var = new seq0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 23), (byte) 24));
        this.N1 = agc.G(this, sre0.f32672a.b(wfq0.class), new r5p0(a8zVarA, (byte) 16), new r5p0(a8zVarA, (byte) 17), seq0Var);
        this.O1 = iun.f15405a;
        this.P1 = maz.b(new seq0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        wfq0 wfq0VarJ0 = J0();
        wfq0VarJ0.x();
        p7m0 p7m0Var = wfq0VarJ0.z;
        y5s y5sVar = wfq0VarJ0.r;
        efq0 efq0Var = new efq0(y5sVar.f42064a);
        p7m0Var.getClass();
        p7m0Var.o(null, efq0Var);
        p7m0 p7m0Var2 = wfq0VarJ0.x;
        s470 s470Var = y5sVar.f42064a;
        bfq0 bfq0Var = new bfq0(s470Var);
        p7m0Var2.getClass();
        p7m0Var2.o(null, bfq0Var);
        p7m0 p7m0Var3 = wfq0VarJ0.y;
        ifq0 ifq0Var = new ifq0(s470Var);
        p7m0Var3.getClass();
        p7m0Var3.o(null, ifq0Var);
        this.O1 = q3d.j(I0().f, I0().i, I0().h, I0().e, I0().d, I0().g);
    }

    @Override // a.yx5
    public final void C0() {
        gxi gxiVar;
        Fragment fragment = this.y;
        qeq0 qeq0Var = fragment instanceof qeq0 ? (qeq0) fragment : null;
        if (qeq0Var == null || (gxiVar = (gxi) qeq0Var.X1.getValue()) == null) {
            return;
        }
        this.L1 = (exi) gxiVar.j0.get();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = J0().w;
        yje yjeVar = null;
        veq0 veq0Var = new veq0(this, yjeVar, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0(p7m0Var, clzVarW, veq0Var, (yje) null, 0), 3);
        p7m0 p7m0Var2 = J0().x;
        veq0 veq0Var2 = new veq0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new lto0(p7m0Var2, clzVarW2, veq0Var2, (yje) null), 3);
        p7m0 p7m0Var3 = J0().y;
        veq0 veq0Var3 = new veq0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new lto0((gmq) p7m0Var3, clzVarW3, veq0Var3, (yje) null, (char) 0), 3);
        p7m0 p7m0Var4 = J0().z;
        veq0 veq0Var4 = new veq0(this, yjeVar, (byte) 1);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new lto0((gmq) p7m0Var4, clzVarW4, veq0Var4, (yje) null, (byte) 0), 3);
    }

    public final void G0(double d, int i, boolean z) {
        TileMatchingCoeffView tileMatchingCoeffView = (TileMatchingCoeffView) this.O1.get(i);
        iab iabVar = tileMatchingCoeffView.q;
        if (z) {
            ((TextView) iabVar.h).setText("");
            return;
        }
        Object objValueOf = d % 1.0d == 0.0d ? Integer.valueOf(si30.a(d)) : Double.valueOf(d);
        ((TextView) iabVar.h).setText(objValueOf.equals(0) ? tileMatchingCoeffView.getContext().getString(R.string.bonus) : tileMatchingCoeffView.getContext().getString(R.string.factor, objValueOf));
    }

    public final void H0(int i, s470 s470Var) {
        int i2;
        int i3;
        m3e m3eVar;
        r3e r3eVar = new r3e();
        r3eVar.e(I0().j);
        Integer numValueOf = Integer.valueOf(R.id.tvCombination);
        HashMap map = r3eVar.g;
        if (map.containsKey(numValueOf) && (m3eVar = (m3e) map.get(numValueOf)) != null) {
            n3e n3eVar = m3eVar.e;
            n3eVar.n = -1;
            n3eVar.m = -1;
            n3eVar.I = 0;
            n3eVar.O = Integer.MIN_VALUE;
        }
        Resources resourcesG = G();
        int iOrdinal = s470Var.ordinal();
        if (iOrdinal == 15) {
            i2 = R.dimen.space_10;
        } else {
            if (iOrdinal != 16) {
                throw new EnumConstantNotPresentException(s470.class, s470Var.name());
            }
            i2 = R.dimen.space_2;
        }
        int dimensionPixelSize = resourcesG.getDimensionPixelSize(i2) + i;
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new m3e());
        }
        m3e m3eVar2 = (m3e) map.get(numValueOf);
        if (m3eVar2 != null) {
            n3e n3eVar2 = m3eVar2.e;
            n3eVar2.n = R.id.coeffFour;
            n3eVar2.m = -1;
            n3eVar2.q = -1;
            n3eVar2.r = -1;
            n3eVar2.s = -1;
            n3eVar2.I = dimensionPixelSize;
        }
        r3eVar.b(I0().j);
        TextView textView = I0().m;
        int iOrdinal2 = s470Var.ordinal();
        if (iOrdinal2 == 15) {
            i3 = R.string.odyssey_collect_crystals;
        } else {
            if (iOrdinal2 != 16) {
                throw new EnumConstantNotPresentException(s470.class, s470Var.name());
            }
            i3 = R.string.fruit_combination_info;
        }
        textView.setText(H(i3));
    }

    public final w5r I0() {
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        return (w5r) objN;
    }

    public final wfq0 J0() {
        return (wfq0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        this.O1 = iun.f15405a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        I0().e.getViewTreeObserver().removeOnGlobalLayoutListener((ueq0) this.P1.getValue());
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        wfq0 wfq0VarJ0 = J0();
        p7m0 p7m0Var = wfq0VarJ0.z;
        p7m0 p7m0Var2 = wfq0VarJ0.w;
        p7m0 p7m0Var3 = wfq0VarJ0.y;
        wfq0VarJ0.x();
        p7m0 p7m0Var4 = wfq0VarJ0.x;
        bfq0 bfq0Var = new bfq0(wfq0VarJ0.r.f42064a);
        p7m0Var4.getClass();
        p7m0Var4.o(null, bfq0Var);
        xeq0 xeq0Var = ((kgq0) wfq0VarJ0.i.f32888a).c.f2464a.b;
        int iOrdinal = wfq0VarJ0.n.a().ordinal();
        if (iOrdinal == 0) {
            wfq0VarJ0.w(xeq0Var.b);
            nfq0 nfq0Var = new nfq0(xeq0Var.f40755a);
            p7m0Var3.getClass();
            p7m0Var3.o(null, nfq0Var);
            qfq0 qfq0Var = new qfq0(true);
            p7m0Var2.getClass();
            p7m0Var2.o(null, qfq0Var);
            gfq0 gfq0Var = new gfq0(false);
            p7m0Var.getClass();
            p7m0Var.o(null, gfq0Var);
            return;
        }
        if (iOrdinal == 1) {
            wfq0VarJ0.w(xeq0Var.b);
            nfq0 nfq0Var2 = new nfq0(xeq0Var.f40755a, xeq0Var.c);
            p7m0Var3.getClass();
            p7m0Var3.o(null, nfq0Var2);
            qfq0 qfq0Var2 = new qfq0(false);
            p7m0Var2.getClass();
            p7m0Var2.o(null, qfq0Var2);
            gfq0 gfq0Var2 = new gfq0(true);
            p7m0Var.getClass();
            p7m0Var.o(null, gfq0Var2);
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        wfq0VarJ0.w(xeq0Var.b);
        nfq0 nfq0Var3 = new nfq0(xeq0Var.f40755a);
        p7m0Var3.getClass();
        p7m0Var3.o(null, nfq0Var3);
        qfq0 qfq0Var3 = new qfq0(false);
        p7m0Var2.getClass();
        p7m0Var2.o(null, qfq0Var3);
        gfq0 gfq0Var3 = new gfq0(false);
        p7m0Var.getClass();
        p7m0Var.o(null, gfq0Var3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
