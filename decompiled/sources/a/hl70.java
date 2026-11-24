package a;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hl70;", "La/yx5;", "<init>", "()V", "a/fl70", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class hl70 extends yx5 {
    public final i9o0 K1;
    public x6i L1;
    public ii M1;
    public final s0r N1;
    public final kiu0 O1;
    public final cgx0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(hl70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesInstantBetBinding;", 0), new ez40(hl70.class, "raiseGame", "getRaiseGame()Z", 0)};
    public static final fl70 Q1 = new fl70();

    public hl70() {
        super(R.layout.fragment_games_instant_bet);
        this.K1 = i9o0.f14396a;
        this.N1 = ltt0.o(this, gl70.f11477a);
        el70 el70Var = new el70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 16), (byte) 17));
        this.O1 = agc.G(this, sre0.f32672a.b(ol70.class), new ph70(a8zVarA, (byte) 12), new ph70(a8zVarA, (byte) 13), el70Var);
        this.P1 = new cgx0("RAISE_GAME_BUNDLE");
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        Fragment fragment2 = fragment != null ? fragment.y : null;
        bn70 bn70Var = fragment2 instanceof bn70 ? (bn70) fragment2 : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.d(this);
    }

    public final l0r G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (l0r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        AppCompatButton appCompatButton = G0().e;
        ymx ymxVar = ymx.INTERVAL_500;
        final byte b = 0;
        dyb.b0(appCompatButton, ymxVar, new Function1(this) { // from class: a.dl70
            public final /* synthetic */ hl70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                hl70 hl70Var = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        fl70 fl70Var = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.f12086a);
                        break;
                    case 1:
                        fl70 fl70Var2 = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.b);
                        break;
                    default:
                        fl70 fl70Var3 = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.c);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.b0(G0().d, ymxVar, new Function1(this) { // from class: a.dl70
            public final /* synthetic */ hl70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                hl70 hl70Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        fl70 fl70Var = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.f12086a);
                        break;
                    case 1:
                        fl70 fl70Var2 = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.b);
                        break;
                    default:
                        fl70 fl70Var3 = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.c);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.b0(G0().c, ymxVar, new Function1(this) { // from class: a.dl70
            public final /* synthetic */ hl70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                hl70 hl70Var = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        fl70 fl70Var = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.f12086a);
                        break;
                    case 1:
                        fl70 fl70Var2 = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.b);
                        break;
                    default:
                        fl70 fl70Var3 = hl70.Q1;
                        view2.getClass();
                        ((ol70) hl70Var.O1.getValue()).y(gxo.c);
                        break;
                }
                return Unit.f46060a;
            }
        });
        itb itbVarV = xkb.V(((ol70) this.O1.getValue()).o);
        nf60 nf60Var = new nf60(this, null, (byte) 24);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(itbVarV, clzVarW, nf60Var, (yje) null, 0), 3);
        ccq0.V(this, "REQUEST_OPEN_BET_SETTINGS_DIALOG_KEY", new el70(this, b2));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
