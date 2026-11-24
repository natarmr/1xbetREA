package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/st6;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class st6 extends yx5 {
    public yki K1;
    public ii L1;
    public ynb M1;
    public wdk0 N1;
    public lgn0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(st6.class, "binding", "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/SimpleMakeBetFragmentBinding;", 0)};
    public static final yk5 R1 = new yk5();

    public st6() {
        super(R.layout.simple_make_bet_fragment);
        p46 p46Var = new p46(new lt6(this, (byte) 2), (byte) 11);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 12), (byte) 13));
        this.P1 = agc.G(this, sre0.f32672a.b(rg20.class), new rt6(a8zVarA, (byte) 0), new rt6(a8zVarA, (byte) 1), p46Var);
        this.Q1 = ltt0.o(this, nt6.f24080a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.setChangeBalanceClickListener(new mt6(this, (byte) 0));
        G0().b.setAddDepositClickListener(new lt6(this, (byte) 1));
        BetInputView betInputView = G0().c;
        String string = betInputView.getResources().getString(R.string.bet_enter_sum);
        string.getClass();
        betInputView.setPlaceholder(string);
        betInputView.setPlusButtonClickListener(new lt6(this, (byte) 4));
        betInputView.setMinusButtonClickListener(new lt6(this, (byte) 5));
        betInputView.setFormatParams(new sd7(13, 2));
        betInputView.setAfterTextChangedListener(new ur6(1, H0(), rg20.class, "onStepInputChange", "onStepInputChange(Ljava/lang/String;)V", 0, (byte) 10));
        betInputView.setOnMakeBetButtonClickListener(new lt6(this, (byte) 6));
        betInputView.setVisibilityStepButtons(false);
        ccq0.V(this, "request_insufficient_founds_dialog_key", new lt6(this, (byte) 3));
        ccq0.V(this, "request_bet_exists_dialog_key", new lt6(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(v720.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            v720 v720Var = (v720) (ze3Var instanceof v720 ? ze3Var : null);
            if (v720Var != null) {
                zki zkiVarA = v720Var.a(a4n0.f(this));
                this.K1 = (yki) zkiVarA.M.get();
                this.L1 = zkiVarA.H;
                ynb ynbVarI = ((yzn0) zkiVarA.I.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = zkiVarA.s;
                this.O1 = zkiVarA.J;
                return;
            }
        }
        jf4.n(b1j.i(v720.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().G);
        yje yjeVar = null;
        ot6 ot6Var = new ot6(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new td6(xae0VarN, clzVarW, ot6Var, (yje) null, (byte) 0), 3);
        vae0 vae0VarM = vtb.M(H0().S);
        wa waVar = new wa(this, yjeVar, (byte) 25);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new td6(vae0VarM, clzVarW2, waVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().H);
        ot6 ot6Var2 = new ot6(this, yjeVar, (byte) 0);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new td6(xae0VarN2, clzVarW3, ot6Var2, (yje) null), 3);
        rg20 rg20VarH0 = H0();
        ewt ewtVar = new ewt(rg20VarH0.O, rg20VarH0, (byte) 27);
        ot6 ot6Var3 = new ot6(this, yjeVar, (byte) 4);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new td6(ewtVar, clzVarW4, ot6Var3, (yje) null), 3);
        xae0 xae0VarN3 = vtb.N(H0().I);
        ot6 ot6Var4 = new ot6(this, yjeVar, (byte) 5);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new td6(xae0VarN3, clzVarW5, ot6Var4, (yje) null, 0), 3);
        gmq gmqVarS = sj3.S(H0().L, 100L);
        ot6 ot6Var5 = new ot6(this, yjeVar, (byte) 6);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new td6(gmqVarS, clzVarW6, ot6Var5, (yje) null, (byte) 0), 3);
        xae0 xae0VarN4 = vtb.N(H0().N);
        pt6 pt6Var = new pt6(this, null);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new td6(xae0VarN4, clzVarW7, pt6Var, (yje) null), 3);
        xae0 xae0VarN5 = vtb.N(H0().J);
        lkz lkzVar2 = lkz.f20223a;
        ot6 ot6Var6 = new ot6(this, yjeVar, (byte) 3);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new td6(xae0VarN5, clzVarW8, ot6Var6, (yje) null, (char) 0), 3);
        ol60 ol60Var = H0().M;
        ot6 ot6Var7 = new ot6(this, yjeVar, (byte) 2);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new td6(ol60Var, clzVarW9, ot6Var7, (yje) null), 3);
    }

    public final xyj0 G0() {
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        return (xyj0) objN;
    }

    public final rg20 H0() {
        return (rg20) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.w();
        super.Z();
    }
}
