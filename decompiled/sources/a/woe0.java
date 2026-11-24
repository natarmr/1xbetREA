package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/woe0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class woe0 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public fiu0 M1;
    public xsu N1;
    public ii O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final o470 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(woe0.class, "viewBinding", "getViewBinding()Lorg/xplatform/referral/impl/databinding/FragmentReferralTakePartBinding;", 0)};
    public static final gne0 S1 = new gne0((byte) 1);

    public woe0() {
        super(R.layout.fragment_referral_take_part);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        ooe0 ooe0Var = new ooe0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 5), (byte) 6));
        this.P1 = agc.G(this, sre0.f32672a.b(zoe0.class), new wbe0(a8zVarA, (byte) 8), new wbe0(a8zVarA, (byte) 9), ooe0Var);
        this.Q1 = ltt0.o(this, voe0.f37762a);
        this.R1 = new o470(this);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        xsu xsuVar = this.N1;
        if (xsuVar == null) {
            Intrinsics.h("levelsRecyclerFragmentDelegate");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) G0().c.c;
        recyclerView.setAdapter((gkz) xsuVar.f41434a);
        recyclerView.setItemAnimator(null);
        final byte b = 0;
        qcc.X(this, new ooe0(this, b));
        knm0.i(G0().g, false);
        dyb.O(G0().f, new Function1(this) { // from class: a.poe0
            public final /* synthetic */ woe0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                woe0 woe0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        gne0 gne0Var = woe0.S1;
                        view.getClass();
                        zoe0 zoe0VarH0 = woe0Var.H0();
                        bby bbyVar = zoe0VarH0.o;
                        byte b3 = 1;
                        if ((bbyVar == null || !bbyVar.isActive()) && ((Boolean) zoe0VarH0.u.getValue()).booleanValue()) {
                            zoe0VarH0.j.f42966a.c("promo_referal_join_call");
                            zoe0VarH0.f.f44833a.a(xun.f41520a, 3325L);
                            p7m0 p7m0Var = zoe0VarH0.s;
                            Boolean bool = Boolean.TRUE;
                            p7m0Var.getClass();
                            p7m0Var.o(null, bool);
                            zoe0VarH0.o = sac.V(jiu0.a(zoe0VarH0), new eme0(zoe0VarH0, (byte) 3), null, null, new yoe0(zoe0VarH0, null, b3), 14);
                        }
                        break;
                    case 1:
                        gne0 gne0Var2 = woe0.S1;
                        view.getClass();
                        pzu pzuVar = woe0Var.H0().e;
                        i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                        k0w0VarI.c(jh70.i((jh70) pzuVar.e, ((pru) pzuVar.f).a().V0));
                        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var3 = woe0.S1;
                        view.getClass();
                        woe0Var.H0().w("rules_top");
                        break;
                }
                return Unit.f46060a;
            }
        });
        vd7 vd7Var = G0().d;
        final byte b2 = 1;
        dyb.O((ImageButton) vd7Var.c, new Function1(this) { // from class: a.poe0
            public final /* synthetic */ woe0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                woe0 woe0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = woe0.S1;
                        view.getClass();
                        zoe0 zoe0VarH0 = woe0Var.H0();
                        bby bbyVar = zoe0VarH0.o;
                        byte b4 = 1;
                        if ((bbyVar == null || !bbyVar.isActive()) && ((Boolean) zoe0VarH0.u.getValue()).booleanValue()) {
                            zoe0VarH0.j.f42966a.c("promo_referal_join_call");
                            zoe0VarH0.f.f44833a.a(xun.f41520a, 3325L);
                            p7m0 p7m0Var = zoe0VarH0.s;
                            Boolean bool = Boolean.TRUE;
                            p7m0Var.getClass();
                            p7m0Var.o(null, bool);
                            zoe0VarH0.o = sac.V(jiu0.a(zoe0VarH0), new eme0(zoe0VarH0, (byte) 3), null, null, new yoe0(zoe0VarH0, null, b4), 14);
                        }
                        break;
                    case 1:
                        gne0 gne0Var2 = woe0.S1;
                        view.getClass();
                        pzu pzuVar = woe0Var.H0().e;
                        i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                        k0w0VarI.c(jh70.i((jh70) pzuVar.e, ((pru) pzuVar.f).a().V0));
                        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var3 = woe0.S1;
                        view.getClass();
                        woe0Var.H0().w("rules_top");
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.O((ImageButton) vd7Var.d, new Function1(this) { // from class: a.poe0
            public final /* synthetic */ woe0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                woe0 woe0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        gne0 gne0Var = woe0.S1;
                        view.getClass();
                        zoe0 zoe0VarH0 = woe0Var.H0();
                        bby bbyVar = zoe0VarH0.o;
                        byte b5 = 1;
                        if ((bbyVar == null || !bbyVar.isActive()) && ((Boolean) zoe0VarH0.u.getValue()).booleanValue()) {
                            zoe0VarH0.j.f42966a.c("promo_referal_join_call");
                            zoe0VarH0.f.f44833a.a(xun.f41520a, 3325L);
                            p7m0 p7m0Var = zoe0VarH0.s;
                            Boolean bool = Boolean.TRUE;
                            p7m0Var.getClass();
                            p7m0Var.o(null, bool);
                            zoe0VarH0.o = sac.V(jiu0.a(zoe0VarH0), new eme0(zoe0VarH0, (byte) 3), null, null, new yoe0(zoe0VarH0, null, b5), 14);
                        }
                        break;
                    case 1:
                        gne0 gne0Var2 = woe0.S1;
                        view.getClass();
                        pzu pzuVar = woe0Var.H0().e;
                        i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                        k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                        k0w0VarI.c(jh70.i((jh70) pzuVar.e, ((pru) pzuVar.f).a().V0));
                        ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0VarC.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var3 = woe0.S1;
                        view.getClass();
                        woe0Var.H0().w("rules_top");
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "fillPersonalData", new ooe0(this, (byte) 5));
        ccq0.T(this, "fillPersonalData", new ooe0(this, b2));
        ccq0.V(this, "payment", new ooe0(this, (byte) 3));
        ccq0.T(this, "payment", new ooe0(this, (byte) 4));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(xoe0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            xoe0 xoe0Var = (xoe0) (ze3Var instanceof xoe0 ? ze3Var : null);
            if (xoe0Var != null) {
                o470 o470Var = this.R1;
                o470Var.getClass();
                d1p d1pVar = xoe0Var.f41214a;
                pzu pzuVar = xoe0Var.b;
                btt0 btt0Var = xoe0Var.c;
                gst0 gst0Var = xoe0Var.d;
                gii0 gii0Var = xoe0Var.e;
                ii iiVar = xoe0Var.i;
                ih5 ih5Var = xoe0Var.f;
                yo4 yo4Var = xoe0Var.g;
                m1e m1eVar = xoe0Var.h;
                duj dujVar = xoe0Var.j;
                ioe0 ioe0Var = xoe0Var.k;
                d1pVar.getClass();
                iiVar.getClass();
                btt0Var.getClass();
                gst0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                ioe0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(zoe0.class, (ppi) new o3c(d1pVar, iiVar, pzuVar, btt0Var, gst0Var, gii0Var, o470Var, ih5Var, yo4Var, m1eVar, ioe0Var, dujVar).k));
                gkz gkzVar = new gkz(gkz.f);
                gbn gbnVar = new gbn(new hvy((byte) 19), new tvx(3, (byte) 5), new z8z((byte) 14), gvy.d);
                dp dpVar = gkzVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new vtf0((byte) 21), new o5c0(3, (byte) 24), new eme0(o470Var, (byte) 26), x4c0.A));
                this.N1 = new xsu(gkzVar);
                this.O1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(xoe0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        zoe0 zoe0VarH0 = H0();
        p7m0 p7m0Var = zoe0VarH0.q;
        soe0 soe0Var = new soe0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0(p7m0Var, clzVarW, soe0Var, (yje) null), 3);
        p7m0 p7m0Var2 = zoe0VarH0.r;
        toe0 toe0Var = new toe0(this, null, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g4e0(p7m0Var2, clzVarW2, toe0Var, (yje) null), 3);
        qoj0 qoj0Var = zoe0VarH0.t;
        soe0 soe0Var2 = new soe0(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g4e0(qoj0Var, clzVarW3, soe0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = zoe0VarH0.s;
        toe0 toe0Var2 = new toe0(this, null, (byte) 1);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new g4e0(p7m0Var3, clzVarW4, toe0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var4 = zoe0VarH0.u;
        toe0 toe0Var3 = new toe0(this, null, (byte) 2);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new g4e0((gmq) p7m0Var4, clzVarW5, toe0Var3, (yje) null, (char) 0), 3);
    }

    public final y3r G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (y3r) objN;
    }

    public final zoe0 H0() {
        return (zoe0) this.P1.getValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
