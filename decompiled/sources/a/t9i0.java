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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/t9i0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t9i0 extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(t9i0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsSelfBinding;", 0)};
    public kti K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;

    public t9i0() {
        super(R.layout.fragment_limits_self);
        f9i0[] f9i0VarArr = f9i0.b;
        o9i0 o9i0Var = new o9i0(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 1), (byte) 2));
        this.N1 = agc.G(this, sre0.f32672a.b(cai0.class), new s9i0(a8zVarA, (byte) 0), new s9i0(a8zVarA, (byte) 1), o9i0Var);
        this.O1 = ltt0.o(this, q9i0.f28349a);
        this.P1 = maz.b(new o9i0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        b1r b1rVarG0 = G0();
        b1rVarG0.c.c.setText(H(R.string.limit_for_24h));
        b1rVarG0.d.c.setText(H(R.string.limit_for_30d));
        b1rVarG0.h.c.setText(H(R.string.limit_for_90d));
        b1rVarG0.g.c.setText(H(R.string.limit_for_180d));
        b1rVarG0.e.c.setText(H(R.string.limit_for_1y));
        Button button = b1rVarG0.b;
        final byte b = 0;
        button.setEnabled(false);
        dyb.c0(button, new gwg0(this, (byte) 28));
        final int i = 0;
        for (Object obj : (List) this.P1.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            cxx cxxVar = (cxx) obj;
            FrameLayout frameLayout = cxxVar.f5146a;
            frameLayout.getClass();
            dyb.O(frameLayout, new Function1(this) { // from class: a.p9i0
                public final /* synthetic */ t9i0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b2 = b;
                    int i3 = i;
                    t9i0 t9i0Var = this.b;
                    View view = (View) obj2;
                    switch (b2) {
                        case 0:
                            iiy[] iiyVarArr = t9i0.Q1;
                            view.getClass();
                            t9i0Var.H0().x(f9i0.values()[i3]);
                            break;
                        default:
                            iiy[] iiyVarArr2 = t9i0.Q1;
                            view.getClass();
                            t9i0Var.H0().x(f9i0.values()[i3]);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            final byte b2 = 1;
            dyb.O(cxxVar.b, new Function1(this) { // from class: a.p9i0
                public final /* synthetic */ t9i0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    t9i0 t9i0Var = this.b;
                    View view = (View) obj2;
                    switch (b3) {
                        case 0:
                            iiy[] iiyVarArr = t9i0.Q1;
                            view.getClass();
                            t9i0Var.H0().x(f9i0.values()[i3]);
                            break;
                        default:
                            iiy[] iiyVarArr2 = t9i0.Q1;
                            view.getClass();
                            t9i0Var.H0().x(f9i0.values()[i3]);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
            i = i2;
        }
        G0().i.setNavigationOnClickListener(new jpe0(this, (byte) 7));
        FrameLayout frameLayout2 = G0().j.f5146a;
        frameLayout2.getClass();
        frameLayout2.setVisibility(8);
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new o9i0(this, b));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u9i0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u9i0 u9i0Var = (u9i0) (ze3Var instanceof u9i0 ? ze3Var : null);
            if (u9i0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                xio xioVar = u9i0Var.f35286a;
                czz czzVar = u9i0Var.b;
                duj dujVar = u9i0Var.c;
                vd1 vd1Var = u9i0Var.d;
                btt0 btt0Var = u9i0Var.e;
                ii iiVar = u9i0Var.g;
                dzz dzzVar = u9i0Var.f;
                gii0 gii0Var = u9i0Var.h;
                knf0 knf0Var = u9i0Var.i;
                wdk0 wdk0Var = u9i0Var.j;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                btt0Var.getClass();
                dzzVar.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                this.K1 = (kti) new jti(iiVar, xioVar, czzVar, i1w0VarF, dujVar, vd1Var, btt0Var, dzzVar, gii0Var, knf0Var, wdk0Var, (byte) 1).j.get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(u9i0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().h);
        yje yjeVar = null;
        r9i0 r9i0Var = new r9i0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(xae0VarN, clzVarW, r9i0Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().g);
        yng0 yng0Var = new yng0(this, yjeVar, (byte) 10);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(xae0VarN2, clzVarW2, yng0Var, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().i;
        r9i0 r9i0Var2 = new r9i0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new r7i0(ol60Var, clzVarW3, r9i0Var2, (yje) null), 3);
    }

    public final b1r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (b1r) objN;
    }

    public final cai0 H0() {
        return (cai0) this.N1.getValue();
    }

    public final void I0(RadioButton radioButton) {
        G0();
        Iterator it = ((List) this.P1.getValue()).iterator();
        while (it.hasNext()) {
            ((cxx) it.next()).b.setChecked(false);
        }
        radioButton.setChecked(true);
    }
}
