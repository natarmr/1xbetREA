package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/qfl;", "La/yx5;", "<init>", "()V", "dragons_gold"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qfl extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(qfl.class, "binding", "getBinding()Lorg/xplatform/dragons_gold/databinding/FragmentDragonsGoldBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;

    public qfl() {
        super(R.layout.fragment_dragons_gold);
        this.K1 = i9o0.f14396a;
        ucj ucjVar = new ucj(this, (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 1), (byte) 2));
        this.M1 = agc.G(this, sre0.f32672a.b(cgl.class), new b9k(a8zVarA, (byte) 20), new b9k(a8zVarA, (byte) 21), ucjVar);
        this.N1 = ltt0.o(this, nfl.f23442a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        tzq tzqVarG0 = G0();
        tzqVarG0.b.x(new ngh(tzqVarG0, this, (byte) 22), new mfl(tzqVarG0, this, (byte) 0), new mfl(tzqVarG0, this, (byte) 1), new mfl(tzqVarG0, this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ufi ufiVar;
        Fragment fragment = this.y;
        kfl kflVar = fragment instanceof kfl ? (kfl) fragment : null;
        if (kflVar == null || (ufiVar = (ufi) kflVar.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(cgl.class, ufiVar.j0));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().z;
        d7e d7eVar = new d7e(2, this, qfl.class, "handleConnectionState", "handleConnectionState(Z)V", 4, (byte) 29);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj((gmq) p7m0Var, clzVarW, d7eVar, (yje) null, (char) 0), 3);
        p7m0 p7m0Var2 = H0().y;
        pfl pflVar = new pfl(2, this, qfl.class, "handleDragonsGoldScreen", "handleDragonsGoldScreen(Lorg/xplatform/dragons_gold/presentation/models/DragonsGoldScreenState;)V", 4, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new ofl(p7m0Var2, clzVarW2, pflVar, (yje) null), 3);
    }

    public final tzq G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (tzq) objN;
    }

    public final cgl H0() {
        return (cgl) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        cgl cglVarH0 = H0();
        p7m0 p7m0Var = cglVarH0.y;
        p7m0 p7m0Var2 = cglVarH0.x;
        if (p7m0Var2.getValue() == lfl.c) {
            cglVarH0.E();
        } else if (p7m0Var2.getValue() == lfl.e) {
            rgl rglVar = new rgl(new ugl(cglVarH0.w, cglVarH0.r.i()));
            p7m0Var.getClass();
            p7m0Var.o(null, rglVar);
            p7m0Var2.o(null, lfl.f);
        } else {
            Object value = p7m0Var2.getValue();
            lfl lflVar = lfl.f19962a;
            if (value == lflVar) {
                p7m0Var.getClass();
                p7m0Var.o(null, sgl.f32167a);
                p7m0Var2.o(null, lflVar);
            }
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        cgl cglVarH0 = H0();
        if (cglVarH0.x.getValue() == lfl.c) {
            cglVarH0.E();
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
