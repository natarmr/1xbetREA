package a;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oi70;", "La/yx5;", "<init>", "()V", "a/mi70", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class oi70 extends yx5 {
    public final i9o0 K1;
    public p6i L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(oi70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesInstantBetBinding;", 0)};
    public static final mi70 P1 = new mi70();

    public oi70() {
        super(R.layout.fragment_games_instant_bet);
        this.K1 = i9o0.f14396a;
        ki70 ki70Var = new ki70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 6), (byte) 7));
        this.N1 = agc.G(this, sre0.f32672a.b(vi70.class), new ph70(a8zVarA, (byte) 2), new ph70(a8zVarA, (byte) 3), ki70Var);
        this.O1 = ltt0.o(this, ni70.f23570a);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVarO = sac.O(this);
        if (h5tVarO != null) {
            h5tVarO.l(this);
        }
    }

    public final l0r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (l0r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        l0r l0rVarG0 = G0();
        AppCompatButton appCompatButton = l0rVarG0.e;
        ymx ymxVar = ymx.INTERVAL_500;
        final byte b = 0;
        dyb.b0(appCompatButton, ymxVar, new Function1(this) { // from class: a.li70
            public final /* synthetic */ oi70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                oi70 oi70Var = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        mi70 mi70Var = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.f12086a);
                        break;
                    case 1:
                        mi70 mi70Var2 = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.b);
                        break;
                    default:
                        mi70 mi70Var3 = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.c);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.b0(l0rVarG0.d, ymxVar, new Function1(this) { // from class: a.li70
            public final /* synthetic */ oi70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                oi70 oi70Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        mi70 mi70Var = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.f12086a);
                        break;
                    case 1:
                        mi70 mi70Var2 = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.b);
                        break;
                    default:
                        mi70 mi70Var3 = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.c);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.b0(l0rVarG0.c, ymxVar, new Function1(this) { // from class: a.li70
            public final /* synthetic */ oi70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                oi70 oi70Var = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        mi70 mi70Var = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.f12086a);
                        break;
                    case 1:
                        mi70 mi70Var2 = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.b);
                        break;
                    default:
                        mi70 mi70Var3 = oi70.P1;
                        view2.getClass();
                        ((vi70) oi70Var.N1.getValue()).w(gxo.c);
                        break;
                }
                return Unit.f46060a;
            }
        });
        itb itbVarV = xkb.V(((vi70) this.N1.getValue()).l);
        nf60 nf60Var = new nf60(this, null, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(itbVarV, clzVarW, nf60Var, (yje) null, (char) 0), 3);
        ccq0.V(this, "REQUEST_OPEN_BET_SETTINGS_DIALOG_KEY", new ki70(this, b2));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
