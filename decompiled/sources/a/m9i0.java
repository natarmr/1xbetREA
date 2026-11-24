package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m9i0;", "La/yx5;", "<init>", "()V", "a/eke0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m9i0 extends yx5 {
    public g9i0 K1;
    public boolean L1;
    public iti M1;
    public ii N1;
    public wdk0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(m9i0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsSelfBinding;", 0)};
    public static final eke0 S1 = new eke0();

    public m9i0() {
        super(R.layout.fragment_limits_self);
        this.K1 = g9i0.DAY;
        h9i0 h9i0Var = new h9i0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new yxf0(this, (byte) 29), (byte) 0));
        this.P1 = agc.G(this, sre0.f32672a.b(jai0.class), new fxf0(a8zVarA, (byte) 28), new fxf0(a8zVarA, (byte) 29), h9i0Var);
        this.Q1 = ltt0.o(this, j9i0.f16140a);
        this.R1 = maz.b(new h9i0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        b1r b1rVarG0 = G0();
        FrameLayout frameLayout = b1rVarG0.g.f5146a;
        frameLayout.getClass();
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = b1rVarG0.e.f5146a;
        frameLayout2.getClass();
        frameLayout2.setVisibility(8);
        b1rVarG0.c.c.setText(H(R.string.limit_for_24h));
        b1rVarG0.j.c.setText(H(R.string.limit_for_7d));
        b1rVarG0.d.c.setText(H(R.string.limit_for_30d));
        b1rVarG0.h.c.setText(H(R.string.limit_for_90d));
        Button button = b1rVarG0.b;
        final byte b = 1;
        button.setEnabled(true);
        dyb.c0(button, new gwg0(this, (byte) 27));
        final byte b2 = 0;
        final int i = 0;
        for (Object obj : (List) this.R1.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            cxx cxxVar = (cxx) obj;
            FrameLayout frameLayout3 = cxxVar.f5146a;
            frameLayout3.getClass();
            dyb.O(frameLayout3, new Function1(this) { // from class: a.i9i0
                public final /* synthetic */ m9i0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    m9i0 m9i0Var = this.b;
                    View view = (View) obj2;
                    switch (b3) {
                        case 0:
                            eke0 eke0Var = m9i0.S1;
                            view.getClass();
                            m9i0Var.H0().x(g9i0.values()[i3]);
                            break;
                        default:
                            eke0 eke0Var2 = m9i0.S1;
                            view.getClass();
                            m9i0Var.H0().x(g9i0.values()[i3]);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            dyb.O(cxxVar.b, new Function1(this) { // from class: a.i9i0
                public final /* synthetic */ m9i0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b;
                    int i3 = i;
                    m9i0 m9i0Var = this.b;
                    View view = (View) obj2;
                    switch (b3) {
                        case 0:
                            eke0 eke0Var = m9i0.S1;
                            view.getClass();
                            m9i0Var.H0().x(g9i0.values()[i3]);
                            break;
                        default:
                            eke0 eke0Var2 = m9i0.S1;
                            view.getClass();
                            m9i0Var.H0().x(g9i0.values()[i3]);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            i = i2;
        }
        G0().i.setNavigationOnClickListener(new jpe0(this, (byte) 6));
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new h9i0(this, b2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(n9i0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            n9i0 n9i0Var = (n9i0) (ze3Var instanceof n9i0 ? ze3Var : null);
            if (n9i0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                xio xioVar = n9i0Var.f23141a;
                czz czzVar = n9i0Var.b;
                duj dujVar = n9i0Var.c;
                vd1 vd1Var = n9i0Var.d;
                btt0 btt0Var = n9i0Var.e;
                ii iiVar = n9i0Var.f;
                dzz dzzVar = n9i0Var.g;
                gii0 gii0Var = n9i0Var.h;
                knf0 knf0Var = n9i0Var.i;
                wdk0 wdk0Var = n9i0Var.j;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                btt0Var.getClass();
                dzzVar.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                this.M1 = (iti) new jti(iiVar, xioVar, czzVar, i1w0VarF, dujVar, vd1Var, btt0Var, dzzVar, gii0Var, knf0Var, wdk0Var, (byte) 0).j.get();
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(n9i0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().i);
        yje yjeVar = null;
        k9i0 k9i0Var = new k9i0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(xae0VarN, clzVarW, k9i0Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().h);
        yng0 yng0Var = new yng0(this, yjeVar, (byte) 9);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(xae0VarN2, clzVarW2, yng0Var, (yje) null), 3);
        ol60 ol60Var = H0().j;
        k9i0 k9i0Var2 = new k9i0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new r7i0(ol60Var, clzVarW3, k9i0Var2, (yje) null), 3);
    }

    public final b1r G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (b1r) objN;
    }

    public final jai0 H0() {
        return (jai0) this.P1.getValue();
    }

    public final void I0(RadioButton radioButton) {
        G0();
        Iterator it = ((List) this.R1.getValue()).iterator();
        while (it.hasNext()) {
            ((cxx) it.next()).b.setChecked(false);
        }
        radioButton.setChecked(true);
    }
}
