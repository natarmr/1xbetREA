package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s730;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s730 extends yx5 {
    public static final List S1;
    public final hnm0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;
    public final khf0 O1;
    public final bg5 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(s730.class, "binding", "getBinding()Lorg/xplatform/market_statistic/impl/databinding/FragmentMarketsStatisticBinding;", 0), new ez40(s730.class, "params", "getParams()Lorg/xplatform/market_statistic/api/presentation/MarketStatisticParams;", 0)};
    public static final atz Q1 = new atz();

    static {
        Integer numValueOf = Integer.valueOf(R.color.static_teal);
        Integer numValueOf2 = Integer.valueOf(R.color.static_light_brown);
        Integer numValueOf3 = Integer.valueOf(R.color.static_orange);
        Integer numValueOf4 = Integer.valueOf(R.color.static_yellow);
        Integer numValueOf5 = Integer.valueOf(R.color.static_dark_orange);
        Integer numValueOf6 = Integer.valueOf(R.color.static_blue);
        Integer numValueOf7 = Integer.valueOf(R.color.static_violet);
        Integer numValueOf8 = Integer.valueOf(R.color.static_pink);
        S1 = q3d.j(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, Integer.valueOf(R.color.static_dark_pink), numValueOf8);
    }

    public s730() {
        super(R.layout.fragment_markets_statistic);
        this.K1 = hnm0.f13359a;
        byte b = 0;
        o730 o730Var = new o730(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 17), (byte) 18));
        this.M1 = agc.G(this, sre0.f32672a.b(dy20.class), new y620(a8zVarA, (byte) 8), new y620(a8zVarA, (byte) 9), o730Var);
        this.N1 = ltt0.o(this, q730.f28230a);
        this.O1 = new khf0("PARAMS");
        p730 p730Var = new p730(this, b);
        bg5 bg5Var = new bg5();
        bg5Var.d.b(new gbn(new ei20((byte) 16), new tvx(3, (byte) 22), new b530(p730Var, b), gvy.x));
        this.P1 = bg5Var;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().i.setNavigationOnClickListener(new l910(this, (byte) 4));
        knm0.h(G0().c, false);
        G0().d.setAdapter(this.P1);
        kq8 kq8Var = new kq8();
        kq8Var.b = -1;
        G0().d.m(kq8Var);
        G0().b.setOnTouchListener(new jw5(this, (byte) 10));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ix20.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ix20 ix20Var = (ix20) (ze3Var instanceof ix20 ? ze3Var : null);
            if (ix20Var != null) {
                MarketStatisticParams marketStatisticParams = (MarketStatisticParams) this.O1.n(this, R1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = ix20Var.f15520a;
                knf0 knf0Var = ix20Var.b;
                zfo zfoVar = ix20Var.c;
                gii0 gii0Var = ix20Var.d;
                kt2 kt2Var = ix20Var.e;
                vqc vqcVar = ix20Var.f;
                g2v g2vVar = ix20Var.g;
                m1e m1eVar = ix20Var.h;
                ctf0 ctf0Var = ix20Var.i;
                rou rouVar = ix20Var.j;
                ieu ieuVar = ix20Var.k;
                pru pruVar = ix20Var.l;
                gst0 gst0Var = ix20Var.m;
                x0u x0uVar = ix20Var.o;
                nx20 nx20Var = ix20Var.n;
                j1q0 j1q0Var = ix20Var.p;
                ctf0Var.getClass();
                knf0Var.getClass();
                zfoVar.getClass();
                gii0Var.getClass();
                kt2Var.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                nx20Var.getClass();
                j1q0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(dy20.class, (rki) new mci(cadVar, vqcVar, i1w0VarF, ctf0Var, knf0Var, marketStatisticParams, zfoVar, gii0Var, g2vVar, m1eVar, rouVar, ieuVar, pruVar, gst0Var, x0uVar, nx20Var, j1q0Var).r));
                return;
            }
        }
        jf4.n(b1j.i(ix20.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        p7m0 p7m0Var = ((dy20) kiu0Var.getValue()).t;
        yje yjeVar = null;
        byte b = 0;
        r730 r730Var = new r730(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new mw20(p7m0Var, clzVarW, r730Var, (yje) null), 3);
        dy20 dy20Var = (dy20) kiu0Var.getValue();
        dnq dnqVar = new dnq(new u6n0(dy20Var.s, new zx20(dy20Var, yjeVar, b)), new gbv(dy20Var, yjeVar, (byte) 8), (byte) 0);
        r730 r730Var2 = new r730(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new mw20(dnqVar, clzVarW2, r730Var2, (yje) null), 3);
    }

    public final z1r G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (z1r) objN;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        LineChartView lineChartView = G0().b;
        lineChartView.c();
        lineChartView.v = false;
        lineChartView.B.invoke();
        lineChartView.x = -1.0f;
        lineChartView.postInvalidate();
        this.j1 = true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
