package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fl5;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fl5 extends yx5 {
    public l9i K1;
    public wdk0 L1;
    public String M1;
    public final kiu0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(fl5.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final cl5 P1 = new cl5((byte) 0);

    public fl5() {
        super(R.layout.compose_fragment);
        this.M1 = "";
        zo4 zo4Var = new zo4(this, (byte) 9);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 21), (byte) 22));
        this.N1 = agc.G(this, sre0.f32672a.b(dk5.class), new qw4(a8zVarA, (byte) 10), new qw4(a8zVarA, (byte) 11), zo4Var);
        this.O1 = ltt0.o(this, dl5.f6262a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-911513943, true, new fa2((Object) this, (byte) 20)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ti5.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ti5)) {
                ze3Var = null;
            }
            ti5 ti5Var = (ti5) ze3Var;
            if (ti5Var != null) {
                n9i n9iVarA = ti5.a(ti5Var, null, false, this.M1, 3);
                this.K1 = (l9i) n9iVarA.J.get();
                x1x.x(((yzn0) n9iVarA.H.b).i());
                this.L1 = n9iVarA.G;
                return;
            }
        }
        jf4.n(b1j.i(ti5.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.N1;
        ol60 ol60Var = ((dk5) kiu0Var.getValue()).b0;
        yje yjeVar = null;
        el5 el5Var = new el5(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(ol60Var, clzVarW, el5Var, (yje) null), 3);
        xae0 xae0VarN = vtb.N(((dk5) kiu0Var.getValue()).a0);
        el5 el5Var2 = new el5(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new me5(xae0VarN, clzVarW2, el5Var2, (yje) null), 3);
    }
}
