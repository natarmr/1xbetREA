package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.dialogs.change_bet_sum.SwipexChangeBetValueViewModel$UiState;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/bun0;", "La/qw5;", "La/cun0;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bun0 extends qw5<cun0> {
    public final nae0 b2 = ltt0.p(this, ztn0.f44969a);
    public wdk0 c2;
    public tvi d2;
    public ynb e2;
    public final kiu0 f2;
    public static final /* synthetic */ iiy[] h2 = {new j0d0(bun0.class, "binding", "getBinding()Lorg/xplatform/swipex/impl/databinding/SwipexChangeBetValueDialogBinding;", 0)};
    public static final s2m0 g2 = new s2m0();

    public bun0() {
        fyk0 fyk0Var = new fyk0(new xtn0(this, (byte) 0), (byte) 27);
        a8z a8zVarA = maz.a(wez.b, new fyk0(new fyk0(this, (byte) 28), (byte) 29));
        this.f2 = agc.G(this, sre0.f32672a.b(pun0.class), new cdl0(a8zVarA, (byte) 22), new cdl0(a8zVarA, (byte) 23), fyk0Var);
    }

    @Override // a.qw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.qw5
    public final void N0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wtn0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wtn0 wtn0Var = (wtn0) (ze3Var instanceof wtn0 ? ze3Var : null);
            if (wtn0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                roi0 roi0Var = wtn0Var.f39751a;
                rqt rqtVar = wtn0Var.b;
                mne mneVar = wtn0Var.c;
                eqx eqxVar = wtn0Var.d;
                v88 v88Var = wtn0Var.e;
                duj dujVar = wtn0Var.f;
                wsf0 wsf0Var = wtn0Var.g;
                vby vbyVar = wtn0Var.i;
                s31 s31Var = wtn0Var.j;
                ih5 ih5Var = wtn0Var.k;
                gg5 gg5Var = wtn0Var.l;
                e41 e41Var = wtn0Var.m;
                peg0 peg0Var = wtn0Var.h;
                wdk0 wdk0Var = wtn0Var.n;
                ctf0 ctf0Var = wtn0Var.o;
                cmt cmtVar = wtn0Var.p;
                vbyVar.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                v7i v7iVar = new v7i(roi0Var, peg0Var, wsf0Var, e41Var, s31Var, ih5Var, gg5Var, i1w0VarF, rqtVar, mneVar, eqxVar, v88Var, dujVar, wdk0Var, ctf0Var, cmtVar);
                this.c2 = wdk0Var;
                this.d2 = (tvi) ((n5d0) v7iVar.o).get();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.e2 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(wtn0.class, "Cannot create dependency "));
    }

    @Override // a.qw5
    public final int O0() {
        return R.id.parent;
    }

    @Override // a.qw5
    public final String P0() {
        String strH = H(R.string.change_bet_sum_title);
        strH.getClass();
        return strH;
    }

    @Override // a.qw5
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final cun0 J0() {
        Object objN = this.b2.n(h2[0], this);
        objN.getClass();
        return (cun0) objN;
    }

    public final pun0 R0() {
        return (pun0) this.f2.getValue();
    }

    @Override // a.qw5, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        C().u0("CHANGE_BALANCE_REQUEST_KEY", this, new b0l0(this, (byte) 11));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        j120.Y(this);
    }

    @Override // a.qw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        J0().h.setFilters(new InputFilter[]{new tjj(13, 2)});
        J0().h.a(new da0(new ttn0(this, (byte) 1)));
        final byte b4 = 4;
        J0().h.setEndStepperMinusClickListener(new xtn0(this, (byte) 4));
        J0().h.setEndStepperPlusClickListener(new xtn0(this, (byte) 5));
        TextView textView = J0().h.getTextView();
        if (textView != null) {
            textView.setOnFocusChangeListener(new qd7(this, (byte) 5));
        }
        J0().d.setOnClickListener(new View.OnClickListener(this) { // from class: a.ytn0
            public final /* synthetic */ bun0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b3;
                bun0 bun0Var = this.b;
                switch (b5) {
                    case 0:
                        s2m0 s2m0Var = bun0.g2;
                        bun0Var.R0().x(1);
                        break;
                    case 1:
                        s2m0 s2m0Var2 = bun0.g2;
                        bun0Var.R0().x(2);
                        break;
                    case 2:
                        s2m0 s2m0Var3 = bun0.g2;
                        bun0Var.R0().x(5);
                        break;
                    case 3:
                        s2m0 s2m0Var4 = bun0.g2;
                        bun0Var.R0().x(10);
                        break;
                    default:
                        s2m0 s2m0Var5 = bun0.g2;
                        pun0 pun0VarR0 = bun0Var.R0();
                        epi0 epi0Var = pun0VarR0.j;
                        xae0 xae0Var = pun0VarR0.v;
                        double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).b.b;
                        n7m0 n7m0Var = xae0Var.f40549a;
                        ((xxn0) ((dpi0) epi0Var.b).f6468a).f41667a.o(null, new jsn0(d, ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).f47115a));
                        pun0VarR0.p.f31532a.a("swipex_change_bet_call", wp20.b(new Pair("option", Double.valueOf(((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b))));
                        pun0VarR0.s.f7161a.a(cui0.b(new h1p((float) ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b, (byte) 0)), 3125L);
                        sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, pun0VarR0.d.f22085a, new oun0(pun0VarR0, null, (byte) 1), 10);
                        break;
                }
            }
        });
        J0().e.setOnClickListener(new View.OnClickListener(this) { // from class: a.ytn0
            public final /* synthetic */ bun0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b2;
                bun0 bun0Var = this.b;
                switch (b5) {
                    case 0:
                        s2m0 s2m0Var = bun0.g2;
                        bun0Var.R0().x(1);
                        break;
                    case 1:
                        s2m0 s2m0Var2 = bun0.g2;
                        bun0Var.R0().x(2);
                        break;
                    case 2:
                        s2m0 s2m0Var3 = bun0.g2;
                        bun0Var.R0().x(5);
                        break;
                    case 3:
                        s2m0 s2m0Var4 = bun0.g2;
                        bun0Var.R0().x(10);
                        break;
                    default:
                        s2m0 s2m0Var5 = bun0.g2;
                        pun0 pun0VarR0 = bun0Var.R0();
                        epi0 epi0Var = pun0VarR0.j;
                        xae0 xae0Var = pun0VarR0.v;
                        double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).b.b;
                        n7m0 n7m0Var = xae0Var.f40549a;
                        ((xxn0) ((dpi0) epi0Var.b).f6468a).f41667a.o(null, new jsn0(d, ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).f47115a));
                        pun0VarR0.p.f31532a.a("swipex_change_bet_call", wp20.b(new Pair("option", Double.valueOf(((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b))));
                        pun0VarR0.s.f7161a.a(cui0.b(new h1p((float) ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b, (byte) 0)), 3125L);
                        sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, pun0VarR0.d.f22085a, new oun0(pun0VarR0, null, (byte) 1), 10);
                        break;
                }
            }
        });
        J0().f.setOnClickListener(new View.OnClickListener(this) { // from class: a.ytn0
            public final /* synthetic */ bun0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b5 = b;
                bun0 bun0Var = this.b;
                switch (b5) {
                    case 0:
                        s2m0 s2m0Var = bun0.g2;
                        bun0Var.R0().x(1);
                        break;
                    case 1:
                        s2m0 s2m0Var2 = bun0.g2;
                        bun0Var.R0().x(2);
                        break;
                    case 2:
                        s2m0 s2m0Var3 = bun0.g2;
                        bun0Var.R0().x(5);
                        break;
                    case 3:
                        s2m0 s2m0Var4 = bun0.g2;
                        bun0Var.R0().x(10);
                        break;
                    default:
                        s2m0 s2m0Var5 = bun0.g2;
                        pun0 pun0VarR0 = bun0Var.R0();
                        epi0 epi0Var = pun0VarR0.j;
                        xae0 xae0Var = pun0VarR0.v;
                        double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).b.b;
                        n7m0 n7m0Var = xae0Var.f40549a;
                        ((xxn0) ((dpi0) epi0Var.b).f6468a).f41667a.o(null, new jsn0(d, ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).f47115a));
                        pun0VarR0.p.f31532a.a("swipex_change_bet_call", wp20.b(new Pair("option", Double.valueOf(((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b))));
                        pun0VarR0.s.f7161a.a(cui0.b(new h1p((float) ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b, (byte) 0)), 3125L);
                        sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, pun0VarR0.d.f22085a, new oun0(pun0VarR0, null, (byte) 1), 10);
                        break;
                }
            }
        });
        final byte b5 = 3;
        J0().g.setOnClickListener(new View.OnClickListener(this) { // from class: a.ytn0
            public final /* synthetic */ bun0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b6 = b5;
                bun0 bun0Var = this.b;
                switch (b6) {
                    case 0:
                        s2m0 s2m0Var = bun0.g2;
                        bun0Var.R0().x(1);
                        break;
                    case 1:
                        s2m0 s2m0Var2 = bun0.g2;
                        bun0Var.R0().x(2);
                        break;
                    case 2:
                        s2m0 s2m0Var3 = bun0.g2;
                        bun0Var.R0().x(5);
                        break;
                    case 3:
                        s2m0 s2m0Var4 = bun0.g2;
                        bun0Var.R0().x(10);
                        break;
                    default:
                        s2m0 s2m0Var5 = bun0.g2;
                        pun0 pun0VarR0 = bun0Var.R0();
                        epi0 epi0Var = pun0VarR0.j;
                        xae0 xae0Var = pun0VarR0.v;
                        double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).b.b;
                        n7m0 n7m0Var = xae0Var.f40549a;
                        ((xxn0) ((dpi0) epi0Var.b).f6468a).f41667a.o(null, new jsn0(d, ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).f47115a));
                        pun0VarR0.p.f31532a.a("swipex_change_bet_call", wp20.b(new Pair("option", Double.valueOf(((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b))));
                        pun0VarR0.s.f7161a.a(cui0.b(new h1p((float) ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b, (byte) 0)), 3125L);
                        sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, pun0VarR0.d.f22085a, new oun0(pun0VarR0, null, (byte) 1), 10);
                        break;
                }
            }
        });
        DsAccountSelection.v(J0().c, new xtn0(this, (byte) 1), 3);
        J0().c.A(ivb0.b, new xtn0(this, (byte) 2));
        DsAccountSelection.z(J0().c, new xtn0(this, (byte) 3));
        J0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.ytn0
            public final /* synthetic */ bun0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b6 = b4;
                bun0 bun0Var = this.b;
                switch (b6) {
                    case 0:
                        s2m0 s2m0Var = bun0.g2;
                        bun0Var.R0().x(1);
                        break;
                    case 1:
                        s2m0 s2m0Var2 = bun0.g2;
                        bun0Var.R0().x(2);
                        break;
                    case 2:
                        s2m0 s2m0Var3 = bun0.g2;
                        bun0Var.R0().x(5);
                        break;
                    case 3:
                        s2m0 s2m0Var4 = bun0.g2;
                        bun0Var.R0().x(10);
                        break;
                    default:
                        s2m0 s2m0Var5 = bun0.g2;
                        pun0 pun0VarR0 = bun0Var.R0();
                        epi0 epi0Var = pun0VarR0.j;
                        xae0 xae0Var = pun0VarR0.v;
                        double d = ((SwipexChangeBetValueViewModel$UiState) xae0Var.f40549a.getValue()).b.b;
                        n7m0 n7m0Var = xae0Var.f40549a;
                        ((xxn0) ((dpi0) epi0Var.b).f6468a).f41667a.o(null, new jsn0(d, ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).f47115a));
                        pun0VarR0.p.f31532a.a("swipex_change_bet_call", wp20.b(new Pair("option", Double.valueOf(((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b))));
                        pun0VarR0.s.f7161a.a(cui0.b(new h1p((float) ((SwipexChangeBetValueViewModel$UiState) n7m0Var.getValue()).b.b, (byte) 0)), 3125L);
                        sac.V(jiu0.a(pun0VarR0), new ndn0(1, pun0VarR0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, pun0VarR0.d.f22085a, new oun0(pun0VarR0, null, (byte) 1), 10);
                        break;
                }
            }
        });
        p7m0 p7m0Var = R0().x;
        aun0 aun0Var = new aun0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(p7m0Var, clzVarW, aun0Var, (yje) null), 3);
        pun0 pun0VarR0 = R0();
        s6n0 s6n0Var = new s6n0(pun0VarR0.v, new oun0(pun0VarR0, null, (byte) 0));
        aun0 aun0Var2 = new aun0(this, null, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0(s6n0Var, clzVarW2, aun0Var2, (yje) null), 3);
        ol60 ol60Var = R0().w;
        aun0 aun0Var3 = new aun0(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new agn0(ol60Var, clzVarW3, aun0Var3, (yje) null, (byte) 0), 3);
    }
}
