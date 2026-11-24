package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/h6c0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h6c0 extends yx5 {
    public final i9o0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public ii N1;
    public lgn0 O1;
    public iw20 P1;
    public final yzn0 Q1;
    public final yzn0 R1;
    public final kiu0 S1;
    public final s0r U1;
    public final n0o0 V1;
    public static final /* synthetic */ iiy[] X1 = {new ez40(h6c0.class, "entryPointType", "getEntryPointType()Lorg/xplatform/analytics/domain/AnalyticsEventModel$EntryPointType;", 0), new ez40(h6c0.class, "singleBetGame", "getSingleBetGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;", 0), new j0d0(h6c0.class, "binding", "getBinding()Lorg/xplatform/make_bet/impl/databinding/MakeBetPromoFragmentBinding;", 0)};
    public static final nh70 W1 = new nh70();

    public h6c0() {
        super(R.layout.make_bet_promo_fragment);
        this.K1 = i9o0.f14396a;
        this.Q1 = new yzn0("ANALYTICS_ENTRY_POINT_TYPE_BUNDLE_KEY");
        this.R1 = new yzn0("SINGLE_BET_GAME_BUNDLE_KEY");
        e6c0 e6c0Var = new e6c0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 7), (byte) 8));
        this.S1 = agc.G(this, sre0.f32672a.b(g7c0.class), new x6b0(a8zVarA, (byte) 10), new x6b0(a8zVarA, (byte) 11), e6c0Var);
        this.U1 = ltt0.o(this, f6c0.f9002a);
        this.V1 = maz.b(new e6c0(this, (byte) 3));
    }

    public static a720 G0(Fragment fragment) {
        Fragment fragmentP0 = fragment.p0();
        a720 a720Var = fragmentP0 instanceof a720 ? (a720) fragmentP0 : null;
        return a720Var == null ? G0(fragment.p0()) : a720Var;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        H0().b.setEnabled(false);
        dyb.O(H0().b, new Function1(this) { // from class: a.d6c0
            public final /* synthetic */ h6c0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                h6c0 h6c0Var = this.b;
                switch (b2) {
                    case 0:
                        nh70 nh70Var = h6c0.W1;
                        ((View) obj).getClass();
                        h6c0Var.H0().c.clearFocus();
                        j120.Y(h6c0Var);
                        h6c0Var.I0().y(String.valueOf(h6c0Var.H0().c.getText()), kpb.v0((ms2) h6c0Var.Q1.n(h6c0Var, h6c0.X1[0])), false);
                        break;
                    default:
                        PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
                        nh70 nh70Var2 = h6c0.W1;
                        promoCodeInfoUiModel.getClass();
                        h6c0Var.H0().c.setText(promoCodeInfoUiModel.f46775a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        H0().c.setEndIconClickListener(new e6c0(this, b));
        final byte b2 = 1;
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new e6c0(this, b2));
        sj3.t0(this, "REQUEST_SELECT_PROMO_CODE", new Function1(this) { // from class: a.d6c0
            public final /* synthetic */ h6c0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                h6c0 h6c0Var = this.b;
                switch (b3) {
                    case 0:
                        nh70 nh70Var = h6c0.W1;
                        ((View) obj).getClass();
                        h6c0Var.H0().c.clearFocus();
                        j120.Y(h6c0Var);
                        h6c0Var.I0().y(String.valueOf(h6c0Var.H0().c.getText()), kpb.v0((ms2) h6c0Var.Q1.n(h6c0Var, h6c0.X1[0])), false);
                        break;
                    default:
                        PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
                        nh70 nh70Var2 = h6c0.W1;
                        promoCodeInfoUiModel.getClass();
                        h6c0Var.H0().c.setText(promoCodeInfoUiModel.f46775a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        H0().c.a((TextWatcher) this.V1.getValue());
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(c920.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            c920 c920Var = (c920) (ze3Var instanceof c920 ? ze3Var : null);
            if (c920Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = X1;
                mki mkiVarA = c920Var.a(i1w0VarF, (ms2) this.Q1.n(this, iiyVarArr[0]), (m0k0) this.R1.n(this, iiyVarArr[1]));
                this.L1 = new fiu0(Collections.singletonMap(g7c0.class, (rii) mkiVarA.R));
                this.M1 = (wdk0) mkiVarA.M;
                this.N1 = (ii) mkiVarA.N;
                this.O1 = (lgn0) mkiVarA.P;
                this.P1 = ((clc) ((nr00) mkiVarA.Q).f23980a).f();
                return;
            }
        }
        jf4.n(b1j.i(c920.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = I0().z;
        yje yjeVar = null;
        g6c0 g6c0Var = new g6c0(this, yjeVar, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new f8b0(ol60Var, clzVarW, g6c0Var, (yje) null, (byte) 0), 3);
        xae0 xae0VarN = vtb.N(I0().C);
        c670 c670Var = new c670(this, yjeVar, (byte) 24);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new f8b0(xae0VarN, clzVarW2, c670Var, (yje) null), 3);
        gmq gmqVarS = sj3.S(I0().A, 100L);
        g6c0 g6c0Var2 = new g6c0(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new f8b0(gmqVarS, clzVarW3, g6c0Var2, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(I0().D);
        g6c0 g6c0Var3 = new g6c0(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new f8b0(xae0VarN2, clzVarW4, g6c0Var3, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(I0().B);
        g6c0 g6c0Var4 = new g6c0(this, yjeVar, (byte) 0);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new f8b0(xae0VarN3, clzVarW5, g6c0Var4, (yje) null), 3);
    }

    public final h920 H0() {
        Object objN = this.U1.n(X1[2], this);
        objN.getClass();
        return (h920) objN;
    }

    public final g7c0 I0() {
        return (g7c0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        E0(true);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
