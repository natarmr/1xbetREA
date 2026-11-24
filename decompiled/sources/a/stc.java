package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/stc;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class stc extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(stc.class, "binding", "getBinding()Lorg/xplatform/feature/office/test_section/impl/databinding/FragmentClientConfigBinding;", 0)};
    public final hnm0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public final s0r N1;
    public final kiu0 O1;
    public final a8z P1;

    public stc() {
        super(R.layout.fragment_client_config);
        this.K1 = hnm0.f13359a;
        this.N1 = ltt0.o(this, rtc.f31071a);
        qtc qtcVar = new qtc(this, (byte) 0);
        h79 h79Var = new h79(this, (byte) 27);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new h79(h79Var, (byte) 28));
        this.O1 = agc.G(this, sre0.f32672a.b(wtc.class), new wpb(a8zVarA, (byte) 8), new wpb(a8zVarA, (byte) 9), qtcVar);
        this.P1 = maz.a(wezVar, new qtc(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        int dimensionPixelOffset = G().getDimensionPixelOffset(o0().getResources().getBoolean(R.bool.isTablet) ? R.dimen.space_64 : R.dimen.space_12);
        sj3.L0(G0().c, dimensionPixelOffset, 0, dimensionPixelOffset, 0, 10);
        G0().c.setAdapter((k1q0) this.P1.getValue());
        vvw.o(G0().c, false, 3);
        G0().b.b(new qtc(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ttc.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ttc ttcVar = (ttc) (ze3Var instanceof ttc ? ze3Var : null);
            if (ttcVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                fhj fhjVar = ttcVar.f34504a;
                ctf0 ctf0Var = ttcVar.b;
                wdk0 wdk0Var = ttcVar.c;
                ctf0Var.getClass();
                wdk0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(wtc.class, (pai) new nhf0(fhjVar, ctf0Var, i1w0VarF, wdk0Var).d));
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(ttc.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.O1;
        p7m0 p7m0Var = ((wtc) kiu0Var.getValue()).d;
        c48 c48Var = new c48(2, (k1q0) this.P1.getValue(), k1q0.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 24);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new vxb(p7m0Var, clzVarW, c48Var, (yje) null), 3);
        ol60 ol60Var = ((wtc) kiu0Var.getValue()).e;
        c48 c48Var2 = new c48(2, this, stc.class, "handleCopyAction", "handleCopyAction(Lorg/xplatform/feature/office/test_section/impl/presentation/ClientConfigViewModel$CopyUiAction;)V", 4, (byte) 25);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new vxb(ol60Var, clzVarW2, c48Var2, (yje) null, (byte) 0), 3);
    }

    public final czq G0() {
        Object objN = this.N1.n(Q1[0], this);
        objN.getClass();
        return (czq) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().c.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
