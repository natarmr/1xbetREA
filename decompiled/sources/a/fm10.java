package a;

import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/fm10;", "La/yx5;", "<init>", "()V", "lucky_wheel"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fm10 extends yx5 {
    public static final /* synthetic */ iiy[] S1 = {new j0d0(fm10.class, "viewBinding", "getViewBinding()Lorg/xplatform/lucky_wheel/databinding/FragmentLuckyWheelBinding;", 0)};
    public final e9o0 K1;
    public nki L1;
    public mj8 M1;
    public sxs0 N1;
    public uxs0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final n0o0 R1;

    public fm10() {
        super(R.layout.fragment_lucky_wheel);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        bm10 bm10Var = new bm10(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 20), (byte) 21));
        this.P1 = agc.G(this, sre0.f32672a.b(bo10.class), new j210(a8zVarA, (byte) 12), new j210(a8zVarA, (byte) 13), bm10Var);
        this.Q1 = ltt0.o(this, em10.f8027a);
        this.R1 = maz.b(new bm10(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        if (this.N1 == null) {
            Intrinsics.h("wildFreeBetResultListener");
            throw null;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        sxs0.d(eVarC, this, new pf10(1, H0(), bo10.class, "onWildFreeBetGameSelect", "onWildFreeBetGameSelect(J)V", 0, (byte) 7));
        G0().m.setLayoutManager(new LinearLayoutManager(o0(), 1, false));
        G0().m.m(new eyb0(o0()));
        G0().m.setAdapter((dyb0) this.R1.getValue());
        Button button = G0().g;
        ymx ymxVar = ymx.INTERVAL_500;
        dyb.b0(button, ymxVar, new am10(this, (byte) 0));
        dyb.b0(G0().f, ymxVar, new am10(this, (byte) 1));
        byte b = 2;
        dyb.b0(G0().h, ymxVar, new am10(this, b));
        byte b2 = 3;
        dyb.b0(G0().e, ymxVar, new am10(this, b2));
        dyb.b0(G0().b, ymxVar, new am10(this, (byte) 4));
        dyb.b0(G0().d, ymxVar, new am10(this, (byte) 5));
        dyb.b0(G0().c, ymxVar, new am10(this, (byte) 6));
        G0().t.s = new bm10(this, b);
        G0().t.t = new bm10(this, b2);
        G0().t.u = new am10(this, (byte) 7);
    }

    @Override // a.yx5
    public final void C0() {
        pki pkiVar;
        Fragment fragment = this.y;
        al10 al10Var = fragment instanceof al10 ? (al10) fragment : null;
        if (al10Var == null || (pkiVar = (pki) al10Var.Y1.getValue()) == null) {
            return;
        }
        this.L1 = (nki) pkiVar.k0.get();
        r9u r9uVar = (r9u) pkiVar.f27135a.Q1.get();
        r9uVar.getClass();
        this.M1 = new mj8(r9uVar, (byte) 0);
        this.N1 = new sxs0((byte) 15);
        this.O1 = new uxs0((byte) 15);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().u);
        Class<fm10> cls = fm10.class;
        dm10 dm10Var = new dm10(2, this, cls, "updateResources", "updateResources(Z)V", 4, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00(xae0VarN, clzVarW, dm10Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN2 = vtb.N(H0().v);
        int i = 4;
        dm10 dm10Var2 = new dm10(2, this, cls, "handleWheelState", "handleWheelState(Lorg/xplatform/lucky_wheel/presentation/game/WheelState;)V", i, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zd00(xae0VarN2, clzVarW2, dm10Var2, (yje) null, (char) 0), 3);
        xae0 xae0VarN3 = vtb.N(H0().w);
        dm10 dm10Var3 = new dm10(2, this, cls, "handleSpinButtonState", "handleSpinButtonState(Lorg/xplatform/lucky_wheel/presentation/game/SpinButtonState;)V", i, (byte) 4);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zd00(xae0VarN3, clzVarW3, dm10Var3, (yje) null, 0), 3);
        xae0 xae0VarN4 = vtb.N(H0().x);
        dm10 dm10Var4 = new dm10(2, this, cls, "handleSpinAllButtonState", "handleSpinAllButtonState(Lorg/xplatform/lucky_wheel/presentation/game/SpinAllButtonState;)V", i, (byte) 5);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zd00(xae0VarN4, clzVarW4, dm10Var4, (yje) null, (short) 0), 3);
        xae0 xae0VarN5 = vtb.N(H0().y);
        dm10 dm10Var5 = new dm10(2, this, cls, "handleTimerState", "handleTimerState(Lorg/xplatform/lucky_wheel/presentation/game/TimerState;)V", i, (byte) 6);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new zd00(xae0VarN5, clzVarW5, dm10Var5, (yje) null, (byte) 0, false), 3);
        xae0 xae0VarN6 = vtb.N(H0().z);
        int i2 = 2;
        dm10 dm10Var6 = new dm10(i2, this, cls, "handleGameResult", "handleGameResult(Lorg/xplatform/lucky_wheel/presentation/game/GameResultState;)V", i, (byte) 7);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new cm10(xae0VarN6, clzVarW6, dm10Var6, (yje) null), 3);
        xae0 xae0VarN7 = vtb.N(H0().A);
        dm10 dm10Var7 = new dm10(i2, this, cls, "handlePrizes", "handlePrizes(Lorg/xplatform/lucky_wheel/presentation/game/prizes/PrizesState;)V", i, (byte) 8);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new cm10(xae0VarN7, clzVarW7, dm10Var7, (yje) null, (byte) 0), 3);
        xae0 xae0VarN8 = vtb.N(H0().C);
        dm10 dm10Var8 = new dm10(2, this, cls, "handleMainBonusesInfoButtonState", "handleMainBonusesInfoButtonState(Z)V", i, (byte) 9);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new cm10(xae0VarN8, clzVarW8, dm10Var8, (yje) null, (char) 0), 3);
        xae0 xae0VarN9 = vtb.N(H0().D);
        dm10 dm10Var9 = new dm10(2, this, cls, "handleResultActivateButtonState", "handleResultActivateButtonState(Z)V", i, (byte) 10);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new cm10(xae0VarN9, clzVarW9, dm10Var9, (yje) null, 0), 3);
        xae0 xae0VarN10 = vtb.N(H0().E);
        int i3 = 2;
        dm10 dm10Var10 = new dm10(i3, this, cls, "handleResultContinueButtonState", "handleResultContinueButtonState(Z)V", i, (byte) 0);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new zd00(xae0VarN10, clzVarW10, dm10Var10, (yje) null), 3);
        xae0 xae0VarN11 = vtb.N(H0().B);
        o2d o2dVar = new o2d(this, null);
        clz clzVarW11 = aac.W(this);
        qjj.W(x0x.Q(clzVarW11.x()), null, null, new zd00(xae0VarN11, clzVarW11, o2dVar, (yje) null), 3);
        vsg0 vsg0Var = new vsg0(new v6d(H0().F, null, (byte) 3));
        dm10 dm10Var11 = new dm10(i3, this, cls, "handleOneExecutionState", "handleOneExecutionState(Lorg/xplatform/lucky_wheel/presentation/game/LuckyWheelGameViewModelOld$OneExecuteAction;)V", i, (byte) 1);
        clz clzVarW12 = aac.W(this);
        qjj.W(x0x.Q(clzVarW12.x()), null, null, new zd00(vsg0Var, clzVarW12, dm10Var11, (yje) null), 3);
    }

    public final g1r G0() {
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        return (g1r) objN;
    }

    public final bo10 H0() {
        return (bo10) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().m.setAdapter(null);
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
