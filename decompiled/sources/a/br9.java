package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/br9;", "La/yx5;", "<init>", "()V", "a/kl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class br9 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final phf0 P1;
    public final cgx0 Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(br9.class, "binding", "getBinding()Lorg/xplatform/callback/impl/databinding/FragmentCallbackHistoryBinding;", 0), new ez40(br9.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(br9.class, "showNavBarArg", "getShowNavBarArg()Z", 0)};
    public static final kl5 S1 = new kl5();

    public br9() {
        super(R.layout.fragment_callback_history);
        zq9 zq9Var = new zq9(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new h79(new h79(this, (byte) 5), (byte) 6));
        this.N1 = agc.G(this, sre0.f32672a.b(mr9.class), new rt6(a8zVarA, (byte) 20), new rt6(a8zVarA, (byte) 21), zq9Var);
        this.O1 = ltt0.o(this, ar9.f1335a);
        this.P1 = new phf0("BUNDLE_REQUEST_KEY");
        this.Q1 = new cgx0("SHOW_NAV_BAR");
        this.R1 = maz.b(new zq9(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "CANCEL_REQUEST_DIALOG_KEY", new zq9(this, (byte) 2));
        ccq0.T(this, "CANCEL_REQUEST_DIALOG_KEY", new zq9(this, (byte) 3));
        vcc.g0(this, this.P1.n(this, U1[1]), new m87(this, (byte) 26));
        G0().c.setAdapter((cyv) this.R1.getValue());
        G0().c.m(new kq8(G().getDimensionPixelSize(R.dimen.space_8), (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(oq9.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            oq9 oq9Var = (oq9) (ze3Var instanceof oq9 ? ze3Var : null);
            if (oq9Var != null) {
                bbi bbiVarA = oq9Var.a(-1L);
                this.K1 = new fiu0(Collections.singletonMap(mr9.class, bbiVarA.o));
                this.L1 = bbiVarA.j;
                this.M1 = bbiVarA.k;
                return;
            }
        }
        jf4.n(b1j.i(oq9.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        mr9 mr9VarH0 = H0();
        c00 c00Var = new c00(mr9VarH0.l, mr9VarH0, (byte) 21);
        c48 c48Var = new c48(2, this, br9.class, "handleUiState", "handleUiState(Lorg/xplatform/callback/impl/presentation/history/model/CallbackHistoryUiState;)V", 4, (byte) 7);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new l19(c00Var, clzVarW, c48Var, (yje) null), 3);
        p7m0 p7m0Var = H0().n;
        c48 c48Var2 = new c48(2, this, br9.class, "handleEvent", "handleEvent(Lorg/xplatform/callback/impl/presentation/history/model/CallbackHistoryEvent;)V", 4, (byte) 8);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new l19((gmq) p7m0Var, clzVarW2, c48Var2, (yje) null, (byte) 0), 3);
    }

    public final wyq G0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (wyq) objN;
    }

    public final mr9 H0() {
        return (mr9) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        mr9 mr9VarH0 = H0();
        c4m0 c4m0Var = mr9VarH0.j;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            mr9VarH0.j = sac.T(new p6d(mr9VarH0.f.b(), mr9VarH0.m, new jr9(mr9VarH0, null, (byte) 0), (byte) 1), d5c.S(jiu0.a(mr9VarH0), mr9VarH0.e.c), kr9.h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        v3c.N(H0().j);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return this.Q1.n(this, U1[2]).booleanValue();
    }
}
