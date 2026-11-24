package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.widget.SeekBar;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/zug0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zug0 extends yx5 {
    public final hnm0 K1;
    public final yzn0 L1;
    public final cgx0 M1;
    public final r34 N1;
    public final cgx0 O1;
    public final s0r P1;
    public fiu0 Q1;
    public wdk0 R1;
    public final kiu0 S1;
    public Map U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(zug0.class, "bundleItem", "getBundleItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;", 0), new ez40(zug0.class, "bundleAutoSale", "getBundleAutoSale()Z", 0), new ez40(zug0.class, "bundleBalanceId", "getBundleBalanceId()J", 0), new ez40(zug0.class, "bundleUpdateHistoryOnExit", "getBundleUpdateHistoryOnExit()Z", 0), new j0d0(zug0.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/SaleFragmentBinding;", 0)};
    public static final gne0 V1 = new gne0((byte) 11);

    public zug0() {
        super(R.layout.sale_fragment);
        this.K1 = hnm0.f13359a;
        this.L1 = new yzn0("BUNDLE_BET_HISTORY_ITEM");
        this.M1 = new cgx0("BUNDLE_AUTO_SALE");
        this.N1 = new r34("BUNDLE_BALANCE_ID");
        this.O1 = new cgx0("BUNDLE_UPDATE_ON_EXIT");
        this.P1 = ltt0.o(this, vug0.f38047a);
        sug0 sug0Var = new sug0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 11), (byte) 12));
        this.S1 = agc.G(this, sre0.f32672a.b(cxg0.class), new fxf0(a8zVarA, (byte) 14), new fxf0(a8zVarA, (byte) 15), sug0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().d.setVisibility(8);
        DsNavigationBar dsNavigationBar = H0().o;
        final byte b = 1;
        String strH = H(this.M1.n(this, W1[1]).booleanValue() ? R.string.auto_sale_coupon_title : R.string.sale_coupon_title);
        strH.getClass();
        dsNavigationBar.setTitle(strH);
        final byte b2 = 0;
        mc50.a(H0().o, new sug0(this, (byte) 0));
        SeekBar seekBar = H0().m;
        dvh0 dvh0Var = dvh0.b;
        seekBar.setOnSeekBarChangeListener(new xug0(this, dvh0Var));
        SeekBar seekBar2 = H0().l;
        dvh0 dvh0Var2 = dvh0.f6743a;
        seekBar2.setOnSeekBarChangeListener(new xug0(this, dvh0Var2));
        SeekBar seekBar3 = H0().n;
        dvh0 dvh0Var3 = dvh0.c;
        seekBar3.setOnSeekBarChangeListener(new xug0(this, dvh0Var3));
        dyb.O(H0().c, new eme0(this, (byte) 29));
        vcc.g0(this, "REQUEST_CONFIRM_SALE_DIALOG_KEY", new Function2(this) { // from class: a.uug0
            public final /* synthetic */ zug0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                zug0 zug0Var = this.b;
                yje yjeVar = null;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = zug0.V1;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        cxg0 cxg0VarI0 = zug0Var.I0();
                        String str2 = ((n3w) obj3).f22868a;
                        str2.getClass();
                        nj7 nj7Var = cxg0VarI0.k;
                        b4j b4jVar = nj7Var.f23620a;
                        a1w a1wVar = a1w.l;
                        r6w r6wVar = r6w.j;
                        b4j.h(b4jVar, a1wVar, r6wVar);
                        nj7Var.b.j(r6wVar.a());
                        uwg0 uwg0Var = new uwg0(cxg0VarI0, (byte) 0);
                        cxg0VarI0.F(true);
                        qjj.W(jiu0.a(cxg0VarI0), kotlin.coroutines.e.c(uwg0Var, cxg0VarI0.g.b), null, new zye0(cxg0VarI0, str2, yjeVar, (byte) 14), 2);
                        break;
                    default:
                        gne0 gne0Var2 = zug0.V1;
                        str.getClass();
                        bundle2.getClass();
                        Object obj4 = bundle2.get(str);
                        obj4.getClass();
                        SaleDataModel saleDataModel = (SaleDataModel) obj4;
                        cxg0 cxg0VarI1 = zug0Var.I0();
                        boolean z = cxg0VarI1.m;
                        b4j b4jVar2 = cxg0VarI1.e;
                        a1w a1wVar2 = z ? a1w.p : a1w.o;
                        kt2 kt2Var = b4jVar2.f1961a;
                        kt2 kt2Var2 = b4jVar2.f1961a;
                        kt2Var.c(a1wVar2.a());
                        if (z) {
                            kt2Var2.c((cxg0VarI1.u > 0 ? a1w.s : a1w.t).a());
                            kt2Var2.c((cxg0VarI1.s < 100 ? a1w.u : a1w.v).a());
                        } else {
                            kt2Var2.c((cxg0VarI1.t > 0 ? a1w.q : a1w.r).a());
                        }
                        uwg0 uwg0Var2 = new uwg0(cxg0VarI1, (byte) 1);
                        cxg0VarI1.F(true);
                        qjj.W(jiu0.a(cxg0VarI1), kotlin.coroutines.e.c(uwg0Var2, cxg0VarI1.g.b), null, new zye0(cxg0VarI1, saleDataModel, yjeVar, (byte) 15), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        vcc.g0(this, "REQUEST_SALE_DIALOG_KEY", new Function2(this) { // from class: a.uug0
            public final /* synthetic */ zug0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                zug0 zug0Var = this.b;
                yje yjeVar = null;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        gne0 gne0Var = zug0.V1;
                        str.getClass();
                        bundle2.getClass();
                        Object obj3 = bundle2.get(str);
                        obj3.getClass();
                        cxg0 cxg0VarI0 = zug0Var.I0();
                        String str2 = ((n3w) obj3).f22868a;
                        str2.getClass();
                        nj7 nj7Var = cxg0VarI0.k;
                        b4j b4jVar = nj7Var.f23620a;
                        a1w a1wVar = a1w.l;
                        r6w r6wVar = r6w.j;
                        b4j.h(b4jVar, a1wVar, r6wVar);
                        nj7Var.b.j(r6wVar.a());
                        uwg0 uwg0Var = new uwg0(cxg0VarI0, (byte) 0);
                        cxg0VarI0.F(true);
                        qjj.W(jiu0.a(cxg0VarI0), kotlin.coroutines.e.c(uwg0Var, cxg0VarI0.g.b), null, new zye0(cxg0VarI0, str2, yjeVar, (byte) 14), 2);
                        break;
                    default:
                        gne0 gne0Var2 = zug0.V1;
                        str.getClass();
                        bundle2.getClass();
                        Object obj4 = bundle2.get(str);
                        obj4.getClass();
                        SaleDataModel saleDataModel = (SaleDataModel) obj4;
                        cxg0 cxg0VarI1 = zug0Var.I0();
                        boolean z = cxg0VarI1.m;
                        b4j b4jVar2 = cxg0VarI1.e;
                        a1w a1wVar2 = z ? a1w.p : a1w.o;
                        kt2 kt2Var = b4jVar2.f1961a;
                        kt2 kt2Var2 = b4jVar2.f1961a;
                        kt2Var.c(a1wVar2.a());
                        if (z) {
                            kt2Var2.c((cxg0VarI1.u > 0 ? a1w.s : a1w.t).a());
                            kt2Var2.c((cxg0VarI1.s < 100 ? a1w.u : a1w.v).a());
                        } else {
                            kt2Var2.c((cxg0VarI1.t > 0 ? a1w.q : a1w.r).a());
                        }
                        uwg0 uwg0Var2 = new uwg0(cxg0VarI1, (byte) 1);
                        cxg0VarI1.F(true);
                        qjj.W(jiu0.a(cxg0VarI1), kotlin.coroutines.e.c(uwg0Var2, cxg0VarI1.g.b), null, new zye0(cxg0VarI1, saleDataModel, yjeVar, (byte) 15), 2);
                        break;
                }
                return Unit.f46060a;
            }
        });
        this.U1 = xp20.f(new Pair(dvh0Var, H0().m), new Pair(dvh0Var2, H0().l), new Pair(dvh0Var3, H0().n));
        qcc.X(this, new sug0(this, (byte) 1));
        knm0.h(H0().h, false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(gug0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            gug0 gug0Var = (gug0) (ze3Var instanceof gug0 ? ze3Var : null);
            if (gug0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = W1;
                n3w n3wVar = (n3w) this.L1.n(this, iiyVarArr[0]);
                Boolean boolN = this.M1.n(this, iiyVarArr[1]);
                Long lN = this.N1.n(this, iiyVarArr[2]);
                String simpleName = zug0.class.getSimpleName();
                i1w0VarF.getClass();
                cad cadVar = gug0Var.f11927a;
                btt0 btt0Var = gug0Var.b;
                knf0 knf0Var = gug0Var.c;
                gst0 gst0Var = gug0Var.d;
                kt2 kt2Var = gug0Var.e;
                gii0 gii0Var = gug0Var.f;
                duj dujVar = gug0Var.g;
                m1e m1eVar = gug0Var.h;
                sa10 sa10Var = gug0Var.i;
                wsf0 wsf0Var = gug0Var.m;
                ctf0 ctf0Var = gug0Var.l;
                iw20 iw20Var = gug0Var.j;
                tnm0 tnm0Var = gug0Var.k;
                m0w m0wVar = gug0Var.n;
                wdk0 wdk0Var = gug0Var.o;
                au0 au0Var = gug0Var.p;
                r9u r9uVar = gug0Var.q;
                ctf0Var.getClass();
                btt0Var.getClass();
                knf0Var.getClass();
                gst0Var.getClass();
                kt2Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                tnm0Var.getClass();
                m0wVar.getClass();
                wdk0Var.getClass();
                r9uVar.getClass();
                this.Q1 = new fiu0(Collections.singletonMap(cxg0.class, (fri) new v5i(cadVar, iw20Var, wsf0Var, ctf0Var, btt0Var, knf0Var, gst0Var, kt2Var, gii0Var, i1w0VarF, dujVar, m1eVar, sa10Var, n3wVar, boolN, lN, tnm0Var, m0wVar, wdk0Var, simpleName, au0Var).v));
                this.R1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(gug0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        xae0 xae0VarN = vtb.N(I0().y);
        yje yjeVar = null;
        wug0 wug0Var = new wug0(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new kmg0(xae0VarN, clzVarW, wug0Var, (yje) null), 3);
        vae0 vae0VarM = vtb.M(I0().A);
        wug0 wug0Var2 = new wug0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new kmg0(vae0VarM, clzVarW2, wug0Var2, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(I0().z);
        wug0 wug0Var3 = new wug0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new kmg0(xae0VarN2, clzVarW3, wug0Var3, (yje) null, (byte) 0), 3);
    }

    public final void G0(String str, boolean z) {
        vcc.f0(i120.V(new Pair("BUNDLE_BET_ID", str), new Pair("REQUEST_KEY_HIDE_COUPON", Boolean.valueOf(z))), this, "REQUEST_KEY_SUCCESS_SALE");
    }

    public final bvg0 H0() {
        Object objN = this.P1.n(W1[4], this);
        objN.getClass();
        return (bvg0) objN;
    }

    public final cxg0 I0() {
        return (cxg0) this.S1.getValue();
    }

    public final void J0(boolean z) {
        H0().f.setVisibility(z ? 0 : 8);
        H0().e.setVisibility(z ? 8 : 0);
    }

    public final void K0(boolean z) {
        H0().f.setVisibility(8);
        H0().g.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        iiy[] iiyVarArr = W1;
        if (this.O1.n(this, iiyVarArr[3]).booleanValue()) {
            G0(((n3w) this.L1.n(this, iiyVarArr[0])).f22868a, false);
        }
        this.j1 = true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
