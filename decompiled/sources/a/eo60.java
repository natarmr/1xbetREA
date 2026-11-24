package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eo60;", "La/yx5;", "<init>", "()V", "a/atz", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eo60 extends yx5 {
    public final i9o0 K1;
    public l6i L1;
    public final s0r M1;
    public final kiu0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(eo60.class, "binding", "getBinding()Lorg/xplatform/core/databinding/OnexGameTitleFragmentBinding;", 0)};
    public static final atz O1 = new atz();

    public eo60() {
        super(R.layout.onex_game_title_fragment);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, bo60.f2917a);
        pu50 pu50Var = new pu50(this, (byte) 17);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ej50(this, (byte) 11), (byte) 12));
        this.N1 = agc.G(this, sre0.f32672a.b(zo70.class), new co60(a8zVarA, (byte) 0), new co60(a8zVarA, (byte) 1), pu50Var);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        bn70 bn70Var = fragment instanceof bn70 ? (bn70) fragment : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.f(this);
    }

    public final rm70 G0() {
        Object objN = this.M1.n(P1[0], this);
        objN.getClass();
        return (rm70) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        kiu0 kiu0Var = this.N1;
        itb itbVarV = xkb.V(((zo70) kiu0Var.getValue()).g);
        do60 do60Var = new do60(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60(itbVarV, clzVarW, do60Var, (yje) null), 3);
        p7m0 p7m0Var = ((zo70) kiu0Var.getValue()).h;
        do60 do60Var2 = new do60(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new yd60(p7m0Var, clzVarW2, do60Var2, (yje) null), 3);
        zo70 zo70Var = (zo70) kiu0Var.getValue();
        qjj.W(jiu0.a(zo70Var), zo70Var.f, null, new c670(zo70Var, null, (byte) 5), 2);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
