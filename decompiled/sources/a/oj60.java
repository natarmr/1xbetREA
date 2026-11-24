package a;

import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/oj60;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oj60 extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(oj60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(oj60.class, "hideScreenBundle", "getHideScreenBundle()Z", 0)};
    public final f9o0 K1;
    public final s0r L1;
    public final a8z M1;
    public final kiu0 N1;
    public final cgx0 O1;

    public oj60() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, nj60.f23619a);
        mj60 mj60Var = new mj60(this, (byte) 0);
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, mj60Var);
        ej50 ej50Var = new ej50(new mj60(this, (byte) 1), (byte) 4);
        a8z a8zVarA = maz.a(wezVar, new ej50(new ej50(this, (byte) 5), (byte) 6));
        this.N1 = agc.G(this, sre0.f32672a.b(hl60.class), new y620(a8zVarA, (byte) 24), new y620(a8zVarA, (byte) 25), ej50Var);
        this.O1 = new cgx0("HIDE_SCREEN_EXTRA");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new mj60(this, (byte) 2));
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, new shd((byte) 15), new ugd(-944841881, true, new pi40(this, (byte) 26)));
        ccq0.V(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new mj60(this, (byte) 3));
        ccq0.T(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new mj60(this, (byte) 4));
        ((imi) this.M1.getValue()).getClass();
        F().u0("REQUEST_CAPTCHA_CODE_DIALOG_KEY", this, new hi("REQUEST_CAPTCHA_CODE_DIALOG_KEY", new mj60(this, (byte) 5), new cd60((Object) this, (byte) 4)));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = G0().v;
        nf60 nf60Var = new nf60(this, null, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yd60(ol60Var, clzVarW, nf60Var, (yje) null), 3);
    }

    public final hl60 G0() {
        return (hl60) this.N1.getValue();
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
