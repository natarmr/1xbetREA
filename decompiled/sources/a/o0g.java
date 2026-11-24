package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/o0g;", "La/nw5;", "La/xlg;", "<init>", "()V", "a/usd", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o0g extends nw5<xlg> {
    public final nae0 e2 = ltt0.p(this, l0g.f19199a);
    public fiu0 f2;
    public wsz g2;
    public wdk0 h2;
    public final kiu0 i2;
    public final khf0 j2;
    public static final /* synthetic */ iiy[] l2 = {new j0d0(o0g.class, "binding", "getBinding()Lorg/xplatform/cyber/game/core/databinding/CyberDialogActionBinding;", 0), new ez40(o0g.class, "params", "getParams()Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;", 0)};
    public static final usd k2 = new usd();
    public static final String m2 = o0g.class.getSimpleName();

    public o0g() {
        jwd jwdVar = new jwd(this, (byte) 24);
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 20), (byte) 21));
        this.i2 = agc.G(this, sre0.f32672a.b(g1g.class), new cce(a8zVarA, (byte) 20), new cce(a8zVarA, (byte) 21), jwdVar);
        this.j2 = new khf0("params_key");
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ylg.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ylg ylgVar = (ylg) (ze3Var instanceof ylg ? ze3Var : null);
            if (ylgVar != null) {
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof drs) {
                        CyberActionDialogParams cyberActionDialogParams = (CyberActionDialogParams) this.j2.n(this, l2[1]);
                        clc clcVar = ylgVar.f42839a;
                        cad cadVar = ylgVar.b;
                        oeg0 oeg0Var = ylgVar.d;
                        atz atzVar = ylgVar.e;
                        uf3 uf3Var = ylgVar.f;
                        duj dujVar = ylgVar.c;
                        q7d0 q7d0Var = ylgVar.g;
                        wsz wszVar = ylgVar.h;
                        xhi xhiVarQ = ((drs) fragment).q();
                        lbu lbuVar = ylgVar.i;
                        rrc rrcVar = ylgVar.l;
                        a1d a1dVar = ylgVar.j;
                        iip iipVar = ylgVar.k;
                        rmd0 rmd0Var = ylgVar.m;
                        wdk0 wdk0Var = ylgVar.n;
                        je jeVar = ylgVar.o;
                        ih5 ih5Var = ylgVar.p;
                        ogh oghVar = ylgVar.q;
                        kys0 kys0Var = ylgVar.r;
                        iipVar.getClass();
                        rmd0Var.getClass();
                        oghVar.getClass();
                        oeg0Var.getClass();
                        q7d0Var.getClass();
                        wdk0Var.getClass();
                        this.f2 = new fiu0(Collections.singletonMap(g1g.class, (uci) new cr(clcVar, cadVar, xhiVarQ, a1dVar, iipVar, rrcVar, oghVar, cyberActionDialogParams, oeg0Var, atzVar, uf3Var, dujVar, wszVar, lbuVar, wdk0Var, jeVar, ih5Var, kys0Var).r));
                        this.g2 = wszVar;
                        this.h2 = wdk0Var;
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(ylg.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parentBetFilterDialog;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.settings);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final xlg L0() {
        Object objN = this.e2.n(l2[0], this);
        objN.getClass();
        return (xlg) objN;
    }

    public final g1g U0() {
        return (g1g) this.i2.getValue();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        LinearLayout linearLayout = L0().s;
        ymx ymxVar = ymx.INTERVAL_1000;
        final byte b = 0;
        dyb.b0(linearLayout, ymxVar, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.b0(L0().h, ymxVar, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.b0(L0().c, ymxVar, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.b0(L0().i, ymxVar, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b5) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b5 = 4;
        dyb.b0(L0().j, ymxVar, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b6) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b6 = 5;
        dyb.c0(L0().b, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b7 = b6;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b7) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b7 = 6;
        dyb.c0(L0().r, new Function1(this) { // from class: a.k0g
            public final /* synthetic */ o0g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b8 = b7;
                o0g o0gVar = this.b;
                View view2 = (View) obj;
                switch (b8) {
                    case 0:
                        usd usdVar = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(ph.f26973a);
                        break;
                    case 1:
                        usd usdVar2 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(nh.f23508a);
                        break;
                    case 2:
                        usd usdVar3 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(lh.f20030a);
                        break;
                    case 3:
                        usd usdVar4 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(mh.f21766a);
                        break;
                    case 4:
                        usd usdVar5 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(oh.f25240a);
                        break;
                    case 5:
                        usd usdVar6 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(kh.f18264a);
                        break;
                    default:
                        usd usdVar7 = o0g.k2;
                        view2.getClass();
                        o0gVar.U0().y(qh.f28711a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        L0().v.setOnCheckedChangeListener(new oac(this, (byte) 1));
        g1g g1gVarU0 = U0();
        vae0 vae0VarM = vtb.M(g1gVarU0.A);
        yje yjeVar = null;
        sac.V(jiu0.a(g1gVarU0), new x6f(1, g1gVarU0.e, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, g1gVarU0.v.f22085a, new x0g(g1gVarU0, yjeVar, b5), 10);
        n0g n0gVar = new n0g(this, yjeVar, b2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fze(vae0VarM, clzVarW, n0gVar, (yje) null), 3);
        ol60 ol60Var = U0().z;
        n0g n0gVar2 = new n0g(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(ol60Var, clzVarW2, n0gVar2, (yje) null), 3);
    }
}
