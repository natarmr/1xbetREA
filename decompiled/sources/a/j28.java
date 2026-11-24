package a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/j28;", "La/yx5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j28 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public wdk0 M1;
    public final khf0 N1;
    public final s0r O1;
    public final a8z P1;
    public final kiu0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(j28.class, "screenParams", "getScreenParams()Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;", 0), new j0d0(j28.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentBindEmailBinding;", 0)};
    public static final kj5 R1 = new kj5();

    public j28() {
        super(R.layout.fragment_bind_email);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.N1 = new khf0("TYPE_KEY");
        this.O1 = ltt0.o(this, h28.f12319a);
        g28 g28Var = new g28(this, (byte) 0);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, g28Var);
        p46 p46Var = new p46(new g28(this, (byte) 1), (byte) 18);
        a8z a8zVarA = maz.a(wezVar, new p46(new p46(this, (byte) 19), (byte) 20));
        this.Q1 = agc.G(this, sre0.f32672a.b(z28.class), new rt6(a8zVarA, (byte) 6), new rt6(a8zVarA, (byte) 7), p46Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().c.b(new g28(this, (byte) 2));
        DsBottomBar dsBottomBar = G0().b;
        uvw.R(dsBottomBar, this, null);
        dsBottomBar.setFirstButtonEnabled(false);
        DsBottomBar.u(dsBottomBar, new g28(this, (byte) 3));
        G0().d.a(new da0(new os5(this, (byte) 28)));
    }

    @Override // a.yx5
    public final void C0() {
        this.M1 = ((gai) this.P1.getValue()).f;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.Q1;
        ol60 ol60Var = ((z28) kiu0Var.getValue()).h;
        yje yjeVar = null;
        byte b = 0;
        i28 i28Var = new i28(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new u47(ol60Var, clzVarW, i28Var, (yje) null), 3);
        z28 z28Var = (z28) kiu0Var.getValue();
        dnq dnqVar = new dnq(new fnq(z28Var.i, new w28(z28Var, yjeVar, b)), new e00(z28Var, yjeVar, (byte) 6), (byte) 0);
        i28 i28Var2 = new i28(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new u47(dnqVar, clzVarW2, i28Var2, (yje) null), 3);
    }

    public final oyq G0() {
        Object objN = this.O1.n(S1[1], this);
        objN.getClass();
        return (oyq) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new g28(this, (byte) 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        View currentFocus;
        IBinder windowToken;
        kxq kxqVarB = B();
        if (kxqVarB != null && (currentFocus = kxqVarB.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
            Context contextD = D();
            Object systemService = contextD != null ? contextD.getSystemService("input_method") : null;
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        hxm0.m(G0().f26069a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(G0().f26069a);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
