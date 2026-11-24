package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xt60;", "La/yx5;", "<init>", "()V", "a/xuz", "cashback"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xt60 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public fiu0 M1;
    public ii N1;
    public wdk0 O1;
    public peg0 P1;
    public final kiu0 Q1;
    public final a8z R1;
    public final hnm0 S1;
    public final n0o0 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(xt60.class, "umResultKey", "getUmResultKey()Ljava/lang/String;", 0), new j0d0(xt60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xuz V1 = new xuz();

    public xt60() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("UM_RESULT_KEY");
        this.L1 = ltt0.o(this, wt60.f39725a);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ut60(this, (byte) 0), (byte) 16));
        tre0 tre0Var = sre0.f32672a;
        this.Q1 = agc.G(this, tre0Var.b(k370.class), new co60(a8zVarA, (byte) 6), new co60(a8zVarA, (byte) 7), new ha30(this, a8zVarA, (byte) 13));
        this.R1 = xbc.b0(this, tre0Var.b(hv60.class), new ut60(this, (byte) 2));
        this.S1 = hnm0.f13359a;
        this.U1 = maz.b(new ut60(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_FREE_SPIN", new ut60(this, (byte) 4));
        Object objN = this.L1.n(W1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, qek0.h, new shd((byte) 14), new ugd(152470228, true, new ds60(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        rbi rbiVar = (rbi) this.U1.getValue();
        this.M1 = rbiVar.a();
        this.N1 = rbiVar.R;
        this.O1 = rbiVar.S;
        this.P1 = rbiVar.T;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = ((k370) this.Q1.getValue()).w();
        nf60 nf60Var = new nf60(this, null, (byte) 9);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60((i89) gmqVarW, clzVarW, nf60Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.S1;
    }
}
