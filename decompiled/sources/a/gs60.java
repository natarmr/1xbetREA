package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gs60;", "La/yx5;", "<init>", "()V", "a/uuz", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gs60 extends yx5 {
    public final phf0 K1;
    public final s0r L1;
    public final n0o0 M1;
    public fiu0 N1;
    public ynb O1;
    public final kiu0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(gs60.class, "umResultKey", "getUmResultKey()Ljava/lang/String;", 0), new j0d0(gs60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final uuz R1 = new uuz();

    public gs60() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("UM_RESULT_KEY");
        this.L1 = ltt0.o(this, fs60.f10050a);
        this.M1 = maz.b(new es60(this, (byte) 0));
        a8z a8zVarA = maz.a(wez.b, new ej50(new es60(this, (byte) 1), (byte) 15));
        tre0 tre0Var = sre0.f32672a;
        this.P1 = agc.G(this, tre0Var.b(k370.class), new co60(a8zVarA, (byte) 4), new co60(a8zVarA, (byte) 5), new ha30(this, a8zVarA, (byte) 12));
        this.Q1 = xbc.b0(this, tre0Var.b(bs60.class), new es60(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        byte b = 3;
        o2t.e(F(), this, new cs60(this, b), new es60(this, b), null, 18);
        x1x.x(((z7i) this.M1.getValue()).j.b());
        byte b2 = 0;
        afm0.s(this, new cs60(this, b2));
        iiy[] iiyVarArr = S1;
        iiy iiyVar = iiyVarArr[1];
        s0r s0rVar = this.L1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((aid) objN).f919a.setFocusable(true);
        Object objN2 = s0rVar.n(iiyVarArr[1], this);
        objN2.getClass();
        pkd.h(((aid) objN2).f919a, qek0.h, new shd((byte) 14), new ugd(-1267481411, true, new ds60(this, b2)));
    }

    @Override // a.yx5
    public final void C0() {
        z7i z7iVar = (z7i) this.M1.getValue();
        this.N1 = new fiu0(Collections.singletonMap(bs60.class, z7iVar.I));
        ynb ynbVarI = ((yzn0) z7iVar.H.b).i();
        x1x.x(ynbVarI);
        this.O1 = ynbVarI;
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        o2t.a(F());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(pp60.f27363a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(op60.f25627a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getW1() {
        return true;
    }
}
