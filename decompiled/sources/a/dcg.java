package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dcg;", "La/yx5;", "<init>", "()V", "a/nwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dcg extends yx5 {
    public final i9o0 K1;
    public fiu0 L1;
    public final boolean M1;
    public final kiu0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(dcg.class, "binding", "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesFragmentChampDescriptionBinding;", 0)};
    public static final nwd P1 = new nwd();

    public dcg() {
        super(R.layout.cybergames_fragment_champ_description);
        this.K1 = i9o0.f14396a;
        this.M1 = true;
        e8g e8gVar = new e8g(this, (byte) 5);
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 8), (byte) 9));
        this.N1 = agc.G(this, sre0.f32672a.b(ecg.class), new r7g(a8zVarA, (byte) 8), new r7g(a8zVarA, (byte) 9), e8gVar);
        this.O1 = ltt0.o(this, ccg.f4109a);
    }

    @Override // a.yx5
    public final void C0() {
        this.L1 = t9x.K(this).a();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ecg ecgVar = (ecg) this.N1.getValue();
        s6n0 s6n0Var = new s6n0(ecgVar.e, new wib(ecgVar, null, (byte) 18));
        lkz lkzVar = lkz.f20223a;
        e9g e9gVar = new e9g(this, null, (byte) 1);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g8g(s6n0Var, clzVarW, e9gVar, (yje) null), 3);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        dyb.c0(((tth) objN).b, new ejd(this, (byte) 28));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.M1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
