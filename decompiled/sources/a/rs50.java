package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rs50;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rs50 extends yx5 {
    public fiu0 K1;
    public final a8z L1;
    public final zz2 M1;
    public final cgx0 N1;
    public final boolean O1;
    public final s0r P1;
    public final v62 Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(rs50.class, "bannerId", "getBannerId()I", 0), new ez40(rs50.class, "fromDeepLink", "getFromDeepLink()Z", 0), new j0d0(rs50.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentComposeBinding;", 0)};
    public static final atz R1 = new atz();

    public rs50() {
        super(R.layout.fragment_compose);
        this.L1 = xbc.b0(this, sre0.f32672a.b(gt50.class), new ps50(this, (byte) 0));
        this.M1 = new zz2("ID", 0);
        this.N1 = new cgx0("FROM_DEEP_LINK", false);
        this.O1 = true;
        this.P1 = ltt0.o(this, qs50.f29244a);
        this.Q1 = new v62(this, (byte) 16);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0q n0qVar = o7k0.c;
        Object objN = this.P1.n(S1[2], this);
        objN.getClass();
        b1j.t(((ezq) objN).b, new ugd(2102310744, true, new ba30(this, n0qVar, (byte) 28)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xr50.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xr50 xr50Var = (xr50) (ze3Var instanceof xr50 ? ze3Var : null);
            if (xr50Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                iiy iiyVar = iiyVarArr[0];
                zz2 zz2Var = this.M1;
                this.K1 = xr50Var.a(zz2Var.n(this, iiyVar).intValue(), i1w0VarF, this.N1.n(this, iiyVarArr[1]).booleanValue()).x();
                zz2Var.I(this, iiyVarArr[0], 0);
                return;
            }
        }
        jf4.n(b1j.i(xr50.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.L1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        n0().k().a(this, this.Q1);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.O1;
    }
}
