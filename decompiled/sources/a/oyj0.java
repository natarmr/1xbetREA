package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oyj0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oyj0 extends yx5 {
    public final i9o0 K1;
    public final s0r L1;
    public fiu0 M1;
    public ii N1;
    public wdk0 O1;
    public ynb P1;
    public lgn0 Q1;
    public rd7 R1;
    public final kiu0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(oyj0.class, "binding", "getBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentSimpleDsBetTotoBetBinding;", 0)};
    public static final gle0 U1 = new gle0();

    public oyj0() {
        super(R.layout.fragment_simple_ds_bet_toto_bet);
        this.K1 = i9o0.f14396a;
        this.L1 = ltt0.o(this, lyj0.f20865a);
        kyj0 kyj0Var = new kyj0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 23), (byte) 24));
        this.S1 = agc.G(this, sre0.f32672a.b(wyj0.class), new s9i0(a8zVarA, (byte) 20), new s9i0(a8zVarA, (byte) 21), kyj0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new kyj0(this, (byte) 2));
        ccq0.T(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new kyj0(this, (byte) 3));
        G0().e.setOnMakeBetButtonClickListener(new kyj0(this, (byte) 0));
        G0().b.setAddDepositClickListener(new lph0(0, H0(), wyj0.class, "onPaymentClicked", "onPaymentClicked()V", 0, (byte) 17));
        G0().e.setFormatParams(new sd7(13, 2));
        int i = 1;
        G0().e.setAfterTextChangedListener(new gvj0(i, H0(), wyj0.class, "changeBetSum", "changeBetSum(Ljava/lang/String;)V", 0, (byte) 8));
        G0().b.setChangeBalanceClickListener(new jpe0(this, (byte) 8));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kkr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kkr0 kkr0Var = (kkr0) (ze3Var instanceof kkr0 ? ze3Var : null);
            if (kkr0Var != null) {
                o9i o9iVarA = kkr0Var.a(a4n0.f(this));
                this.M1 = o9iVarA.e();
                this.N1 = (ii) o9iVarA.A;
                this.O1 = (wdk0) o9iVarA.B;
                ynb ynbVarI = ((yzn0) ((peg0) o9iVarA.l).b).i();
                x1x.x(ynbVarI);
                this.P1 = ynbVarI;
                this.Q1 = (lgn0) o9iVarA.m;
                return;
            }
        }
        jf4.n(b1j.i(kkr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        wyj0 wyj0VarH0 = H0();
        omi0 omi0Var = new omi0(vtb.N(wyj0VarH0.E), wyj0VarH0, (byte) 3);
        yje yjeVar = null;
        nyj0 nyj0Var = new nyj0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zmj0(omi0Var, clzVarW, nyj0Var, (yje) null), 3);
        i89 i89Var = new i89(vtb.N(H0().G), (byte) 22);
        nyj0 nyj0Var2 = new nyj0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zmj0(i89Var, clzVarW2, nyj0Var2, (yje) null), 3);
        xae0 xae0VarN = vtb.N(H0().F);
        nyj0 nyj0Var3 = new nyj0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new myj0(xae0VarN, clzVarW3, nyj0Var3, (yje) null), 3);
        gmq gmqVarS = sj3.S(H0().C, 100L);
        nyj0 nyj0Var4 = new nyj0(this, yjeVar, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new myj0(gmqVarS, clzVarW4, nyj0Var4, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().H);
        nyj0 nyj0Var5 = new nyj0(this, yjeVar, (byte) 4);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new myj0(xae0VarN2, clzVarW5, nyj0Var5, (yje) null, (byte) 0), 3);
    }

    public final u4r G0() {
        Object objN = this.L1.n(V1[0], this);
        objN.getClass();
        return (u4r) objN;
    }

    public final wyj0 H0() {
        return (wyj0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().b.w();
        this.R1 = null;
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
