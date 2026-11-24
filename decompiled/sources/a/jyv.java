package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jyv;", "La/yx5;", "<init>", "()V", "a/gst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jyv extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final yzn0 N1;
    public final Bundle O1;
    public final n0o0 P1;
    public final n0o0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(jyv.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/FragmentAggregatorFilterNewBinding;", 0), new ez40(jyv.class, "typeHistoryScreen", "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;", 0)};
    public static final gst R1 = new gst();

    public jyv() {
        super(R.layout.fragment_aggregator_filter_new);
        this.K1 = ltt0.o(this, hyv.f13878a);
        fyv fyvVar = new fyv(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 18), (byte) 19));
        this.M1 = agc.G(this, sre0.f32672a.b(vyv.class), new qwv(a8zVarA, (byte) 2), new qwv(a8zVarA, (byte) 3), fyvVar);
        this.N1 = new yzn0("TYPE_HISTORY_SCREEN");
        this.O1 = new Bundle();
        this.P1 = maz.b(new fyv(this, (byte) 2));
        this.Q1 = maz.b(new fyv(this, (byte) 3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        mc50.a(G0().h, new fyv(this, (byte) 0));
        dyb.c0(G0().d, new Function1(this) { // from class: a.gyv
            public final /* synthetic */ jyv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                jyv jyvVar = this.b;
                yje yjeVar = null;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        gst gstVar = jyv.R1;
                        view.getClass();
                        vyv vyvVarH0 = jyvVar.H0();
                        p7m0 p7m0Var = vyvVarH0.i;
                        oyv oyvVar = new oyv(v21.ALL);
                        p7m0Var.getClass();
                        p7m0Var.o(null, oyvVar);
                        p7m0 p7m0Var2 = vyvVarH0.j;
                        nyv nyvVar = new nyv(r21.ALL);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, nyvVar);
                        vyvVarH0.x();
                        vyvVarH0.w();
                        break;
                    default:
                        gst gstVar2 = jyv.R1;
                        view.getClass();
                        vyv vyvVarH1 = jyvVar.H0();
                        qjj.W(jiu0.a(vyvVarH1), null, null, new u5u(vyvVarH1, vyvVarH1.b == sys0.c ? ((tnm0) vyvVarH1.c.f16892a.f35622a).d.f34924a : iun.f15405a, yjeVar, (byte) 13), 3);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.c0(G0().c, new Function1(this) { // from class: a.gyv
            public final /* synthetic */ jyv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                jyv jyvVar = this.b;
                yje yjeVar = null;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        gst gstVar = jyv.R1;
                        view.getClass();
                        vyv vyvVarH0 = jyvVar.H0();
                        p7m0 p7m0Var = vyvVarH0.i;
                        oyv oyvVar = new oyv(v21.ALL);
                        p7m0Var.getClass();
                        p7m0Var.o(null, oyvVar);
                        p7m0 p7m0Var2 = vyvVarH0.j;
                        nyv nyvVar = new nyv(r21.ALL);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, nyvVar);
                        vyvVarH0.x();
                        vyvVarH0.w();
                        break;
                    default:
                        gst gstVar2 = jyv.R1;
                        view.getClass();
                        vyv vyvVarH1 = jyvVar.H0();
                        qjj.W(jiu0.a(vyvVarH1), null, null, new u5u(vyvVarH1, vyvVarH1.b == sys0.c ? ((tnm0) vyvVarH1.c.f16892a.f35622a).d.f34924a : iun.f15405a, yjeVar, (byte) 13), 3);
                        break;
                }
                return Unit.f46060a;
            }
        });
        G0().f.setAdapter((eyv) this.Q1.getValue());
        G0().g.setAdapter((eyv) this.P1.getValue());
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rnm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rnm0 rnm0Var = (rnm0) (ze3Var instanceof rnm0 ? ze3Var : null);
            if (rnm0Var != null) {
                this.L1 = rnm0Var.a(s77.AGGREGATOR, a4n0.f(this), (sys0) this.N1.n(this, S1[1])).y();
                return;
            }
        }
        jf4.n(b1j.i(rnm0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(H0().g);
        iyv iyvVar = new iyv(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hgv(xae0VarN, clzVarW, iyvVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().h);
        iyv iyvVar2 = new iyv(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hgv(xae0VarN2, clzVarW2, iyvVar2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(H0().j);
        iyv iyvVar3 = new iyv(this, null, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new hgv(xae0VarN3, clzVarW3, iyvVar3, (yje) null, (char) 0), 3);
        xae0 xae0VarN4 = vtb.N(H0().i);
        iyv iyvVar4 = new iyv(this, null, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new hgv(xae0VarN4, clzVarW4, iyvVar4, (yje) null, 0), 3);
        xae0 xae0VarN5 = vtb.N(H0().k);
        iyv iyvVar5 = new iyv(this, null, (byte) 4);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new hgv(xae0VarN5, clzVarW5, iyvVar5, (yje) null, (short) 0), 3);
        xae0 xae0VarN6 = vtb.N(H0().l);
        iyv iyvVar6 = new iyv(this, null, (byte) 5);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new hgv(xae0VarN6, clzVarW6, iyvVar6, null, (byte) 0, false), 3);
    }

    public final rxq G0() {
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        return (rxq) objN;
    }

    public final vyv H0() {
        return (vyv) this.M1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putAll(this.O1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0(Bundle bundle) {
        this.j1 = true;
        if (bundle != null) {
            vyv vyvVarH0 = H0();
            Serializable serializable = bundle.getSerializable("selected_bet_type_bundle_key");
            serializable.getClass();
            Serializable serializable2 = bundle.getSerializable("selected_game_type_bundle_key");
            serializable2.getClass();
            p7m0 p7m0Var = vyvVarH0.i;
            oyv oyvVar = new oyv((v21) serializable2);
            p7m0Var.getClass();
            p7m0Var.o(null, oyvVar);
            p7m0 p7m0Var2 = vyvVarH0.j;
            nyv nyvVar = new nyv((r21) serializable);
            p7m0Var2.getClass();
            p7m0Var2.o(null, nyvVar);
            vyvVarH0.x();
            vyvVarH0.w();
        }
    }
}
