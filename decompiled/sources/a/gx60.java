package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gx60;", "La/yx5;", "<init>", "()V", "a/atz", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gx60 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public final n0o0 M1;
    public fiu0 N1;
    public ynb O1;
    public final kiu0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(gx60.class, "umResultKey", "getUmResultKey()Ljava/lang/String;", 0), new j0d0(gx60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final atz R1 = new atz();

    public gx60() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("UM_RESULT_KEY");
        this.L1 = ltt0.o(this, fx60.f10294a);
        this.M1 = maz.b(new dx60(this, (byte) 1));
        a8z a8zVarA = maz.a(wez.b, new ej50(new dx60(this, (byte) 2), (byte) 20));
        tre0 tre0Var = sre0.f32672a;
        this.P1 = agc.G(this, tre0Var.b(k370.class), new co60(a8zVarA, (byte) 12), new co60(a8zVarA, (byte) 13), new ha30(this, a8zVarA, (byte) 15));
        this.Q1 = xbc.b0(this, tre0Var.b(dy60.class), new dx60(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        x1x.x(((bii) this.M1.getValue()).q.b());
        afm0.s(this, new cx60(this, (byte) 0));
        iiy[] iiyVarArr = S1;
        iiy iiyVar = iiyVarArr[1];
        s0r s0rVar = this.L1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((aid) objN).f919a.setFocusable(true);
        Object objN2 = s0rVar.n(iiyVarArr[1], this);
        objN2.getClass();
        pkd.h(((aid) objN2).f919a, qek0.h, new shd((byte) 14), new ugd(2051019023, true, new ds60(this, (byte) 3)));
    }

    @Override // a.yx5
    public final void C0() {
        bii biiVar = (bii) this.M1.getValue();
        this.N1 = new fiu0(Collections.singletonMap(dy60.class, biiVar.A));
        ynb ynbVarI = ((yzn0) biiVar.z.b).i();
        x1x.x(ynbVarI);
        this.O1 = ynbVarI;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = ((k370) this.P1.getValue()).w();
        nf60 nf60Var = new nf60(this, null, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60((i89) gmqVarW, clzVarW, nf60Var, (yje) null, (byte) 0), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getM1() {
        return true;
    }
}
