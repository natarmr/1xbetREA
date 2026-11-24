package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/po50;", "La/yx5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class po50 extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public final a8z M1;
    public final zz2 N1;
    public final cgx0 O1;
    public final boolean P1;
    public final s0r Q1;
    public final v62 R1;
    public static final /* synthetic */ iiy[] U1 = {new ez40(po50.class, "bannerId", "getBannerId()I", 0), new ez40(po50.class, "fromDeepLink", "getFromDeepLink()Z", 0), new j0d0(po50.class, "binding", "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentComposeBinding;", 0)};
    public static final htz S1 = new htz();

    public po50() {
        super(R.layout.fragment_compose);
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 12);
        this.M1 = xbc.b0(this, sre0.f32672a.b(ip50.class), new no50(this, (byte) 0));
        this.N1 = new zz2("ID", 0);
        this.O1 = new cgx0("FROM_DEEP_LINK", false);
        this.P1 = true;
        this.Q1 = ltt0.o(this, oo50.f25577a);
        this.R1 = new v62(this, (byte) 13);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0q n0qVar = o7k0.c;
        Object objN = this.Q1.n(U1[2], this);
        objN.getClass();
        pkd.i(((ezq) objN).b, null, new ugd(-335219520, true, new ba30(this, n0qVar, (byte) 19)));
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
                iiy[] iiyVarArr = U1;
                iiy iiyVar = iiyVarArr[0];
                zz2 zz2Var = this.N1;
                this.L1 = xr50Var.a(zz2Var.n(this, iiyVar).intValue(), i1w0VarF, this.O1.n(this, iiyVarArr[1]).booleanValue()).x();
                zz2Var.I(this, iiyVarArr[0], 0);
                return;
            }
        }
        jf4.n(b1j.i(xr50.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        n0().k().a(this, this.R1);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
