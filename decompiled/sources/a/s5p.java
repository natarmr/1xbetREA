package a;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s5p;", "La/yx5;", "<init>", "()V", "a/nek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s5p extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final a8z M1;
    public final kiu0 N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(s5p.class, "binding", "getBinding()Lorg/xplatform/favorites/impl/databinding/FragmentFavoriteChampsBinding;", 0)};
    public static final nek P1 = new nek();

    public s5p() {
        super(R.layout.fragment_favorite_champs);
        this.K1 = true;
        this.L1 = ltt0.o(this, q5p.f28163a);
        p5p p5pVar = new p5p(this, (byte) 1);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, p5pVar);
        jfl jflVar = new jfl(new p5p(this, (byte) 2), (byte) 10);
        a8z a8zVarA = maz.a(wezVar, new jfl(new jfl(this, (byte) 11), (byte) 12));
        this.N1 = agc.G(this, sre0.f32672a.b(k6p.class), new b9k(a8zVarA, (byte) 28), new b9k(a8zVarA, (byte) 29), jflVar);
        this.O1 = maz.a(wezVar, new p5p(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        View viewQ0 = q0();
        cad cadVar = new cad(this, (byte) 21);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, cadVar);
        G0().c.b(new p5p(this, (byte) 0));
        G0().d.setLayoutManager(new LinearLayoutManager(o0()));
        G0().d.setAdapter((o5p) this.O1.getValue());
        G0().d.m(new qmk0(G().getDimensionPixelSize(R.dimen.space_8), G().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic), G().getDimensionPixelSize(R.dimen.space_16), G().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic), G().getDimensionPixelSize(R.dimen.space_32), 1, null, null, 448));
    }

    @Override // a.yx5
    public final void C0() {
        ((igi) this.M1.getValue()).getClass();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.N1;
        k6p k6pVar = (k6p) kiu0Var.getValue();
        yje yjeVar = null;
        byte b = 0;
        dnq dnqVar = new dnq(new fnq(k6pVar.u, new g6p(k6pVar, yjeVar, b)), new e00(k6pVar, yjeVar, (byte) 28), (byte) 0);
        r5p r5pVar = new r5p(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ofl(dnqVar, clzVarW, r5pVar, (yje) null), 3);
        ol60 ol60Var = ((k6p) kiu0Var.getValue()).t;
        r5p r5pVar2 = new r5p(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new ofl(ol60Var, clzVarW2, r5pVar2, (yje) null), 3);
    }

    public final xzq G0() {
        Object objN = this.L1.n(Q1[0], this);
        objN.getClass();
        return (xzq) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.K1;
    }
}
