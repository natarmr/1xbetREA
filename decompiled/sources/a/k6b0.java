package a;

import android.content.ComponentCallbacks2;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k6b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17760a;
    public final /* synthetic */ u6b0 b;

    public /* synthetic */ k6b0(u6b0 u6b0Var, byte b) {
        this.f17760a = b;
        this.b = u6b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        byte b = this.f17760a;
        yje yjeVar = null;
        byte b2 = 3;
        final u6b0 u6b0Var = this.b;
        switch (b) {
            case 0:
                xi70 xi70Var = u6b0.e2;
                sbb0 sbb0VarJ0 = u6b0Var.J0();
                sbb0VarJ0.h.d(new gab0(sbb0VarJ0, (byte) 3));
                return Unit.f46060a;
            case 1:
                xi70 xi70Var2 = u6b0.e2;
                final kie0 kie0Var = new kie0();
                return new ub3() { // from class: a.n6b0
                    @Override // a.ub3
                    public final void a(AppBarLayout appBarLayout, int i) {
                        xi70 xi70Var3 = u6b0.e2;
                        int totalScrollRange = appBarLayout.getTotalScrollRange();
                        if (totalScrollRange <= 0) {
                            return;
                        }
                        int i2 = i / (totalScrollRange / 10);
                        kie0 kie0Var2 = kie0Var;
                        if (i2 != kie0Var2.f18333a) {
                            sbb0 sbb0VarJ1 = u6b0Var.J0();
                            sac.V(jiu0.a(sbb0VarJ1), null, null, sbb0VarJ1.q.c, new mab0(sbb0VarJ1, null, (byte) 4), 11);
                            kie0Var2.f18333a = i2;
                        }
                    }
                };
            case 2:
                xi70 xi70Var3 = u6b0.e2;
                wma0 wma0Var = new wma0(1, u6b0Var.J0(), sbb0.class, "onSpecialEventClick", "onSpecialEventClick(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/adapters/special_events/models/SpecialEventUiModel;)V", 0, (byte) 25);
                rwk0 rwk0Var = new rwk0();
                gbn gbnVar = new gbn(new jak0((byte) 7), new asj0(3, (byte) 3), new ejk0((byte) 6), wjj0.j);
                dp dpVar = rwk0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new jak0((byte) 15), new asj0(3, (byte) 4), new rai0(wma0Var, (byte) 28), wjj0.k));
                return rwk0Var;
            case 3:
                xi70 xi70Var4 = u6b0.e2;
                sbb0 sbb0VarJ1 = u6b0Var.J0();
                sbb0VarJ1.h.d(new gab0(sbb0VarJ1, (byte) 3));
                return Unit.f46060a;
            case 4:
                xi70 xi70Var5 = u6b0.e2;
                sbb0 sbb0VarJ2 = u6b0Var.J0();
                v88.b(sbb0VarJ2.i, sbb0VarJ2.h, 0L, 6);
                return Unit.f46060a;
            case 5:
                xi70 xi70Var6 = u6b0.e2;
                sbb0 sbb0VarJ3 = u6b0Var.J0();
                v88.b(sbb0VarJ3.i, sbb0VarJ3.h, 0L, 6);
                return Unit.f46060a;
            case 6:
                xi70 xi70Var7 = u6b0.e2;
                u6b0 u6b0Var2 = this.b;
                Bundle bundle = u6b0Var2.g;
                if (bundle == null || (string = bundle.getString("RESET_AUTHENTICATOR_SECRET_HASH_KEY", "")) == null) {
                    return Unit.f46060a;
                }
                wdk0 wdk0VarH0 = u6b0Var2.H0();
                String strH = u6b0Var2.H(R.string.data_copied_to_clipboard);
                strH.getClass();
                j120.M(u6b0Var2, wdk0VarH0, string, string, strH, null, Integer.valueOf(R.drawable.data_copy_icon), u6b0Var2.I0().f21401a, 16);
                return Unit.f46060a;
            case 7:
                xi70 xi70Var8 = u6b0.e2;
                sbb0 sbb0VarJ4 = u6b0Var.J0();
                sac.V(jiu0.a(sbb0VarJ4), new gab0(sbb0VarJ4, (byte) 7), null, sbb0VarJ4.q.f22085a, new mab0(sbb0VarJ4, yjeVar, b2), 10);
                return Unit.f46060a;
            case 8:
                xi70 xi70Var9 = u6b0.e2;
                ((qe50) u6b0Var.J0().A.b).a(new za50(0, 7, 0L, 0L), false);
                return Unit.f46060a;
            case 9:
                xi70 xi70Var10 = u6b0.e2;
                ComponentCallbacks2 application = u6b0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(l9b0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof l9b0)) {
                        ze3Var = null;
                    }
                    l9b0 l9b0Var = (l9b0) ze3Var;
                    if (l9b0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(u6b0Var);
                        i1w0VarF.getClass();
                        y3v y3vVar = l9b0Var.Z;
                        fvt0 fvt0Var = l9b0Var.c;
                        nv20 nv20Var = l9b0Var.e;
                        pmi0 pmi0Var = l9b0Var.R;
                        ugf0 ugf0Var = l9b0Var.b;
                        jw20 jw20Var = l9b0Var.d;
                        iw20 iw20Var = l9b0Var.f;
                        hfk0 hfk0Var = l9b0Var.g;
                        cad cadVar = l9b0Var.f19642a;
                        wsf0 wsf0Var = l9b0Var.S;
                        nr00 nr00Var = l9b0Var.h;
                        mct mctVar = l9b0Var.l;
                        ii iiVar = l9b0Var.M;
                        pyg pygVar = l9b0Var.i;
                        zx10 zx10Var = l9b0Var.j;
                        ljf0 ljf0Var = l9b0Var.k;
                        m1e m1eVar = l9b0Var.m;
                        pru pruVar = l9b0Var.n;
                        ctf0 ctf0Var = l9b0Var.p;
                        vqc vqcVar = l9b0Var.q;
                        uyu uyuVar = l9b0Var.r;
                        wyu wyuVar = l9b0Var.s;
                        lbu lbuVar = l9b0Var.t;
                        v88 v88Var = l9b0Var.u;
                        duj dujVar = l9b0Var.w;
                        lbu lbuVar2 = l9b0Var.x;
                        ani0 ani0Var = l9b0Var.y;
                        poq0 poq0Var = l9b0Var.z;
                        std stdVar = l9b0Var.A;
                        sd60 sd60Var = l9b0Var.v;
                        qe50 qe50Var = l9b0Var.B;
                        btt0 btt0Var = l9b0Var.I;
                        b3c0 b3c0Var = l9b0Var.H;
                        ouu ouuVar = l9b0Var.C;
                        s31 s31Var = l9b0Var.D;
                        zg zgVar = l9b0Var.E;
                        yo4 yo4Var = l9b0Var.F;
                        ntu ntuVar = l9b0Var.K;
                        rrc rrcVar = l9b0Var.L;
                        gst0 gst0Var = l9b0Var.G;
                        ljf0 ljf0Var2 = l9b0Var.N;
                        xri xriVar = l9b0Var.O;
                        itr itrVar = l9b0Var.P;
                        j1q0 j1q0Var = l9b0Var.Q;
                        hzu hzuVar = l9b0Var.T;
                        lyt lytVar = l9b0Var.U;
                        lbu lbuVar3 = l9b0Var.W;
                        kl5 kl5Var = l9b0Var.X;
                        uzc0 uzc0Var = l9b0Var.V;
                        wdk0 wdk0Var = l9b0Var.Y;
                        n4u n4uVar = l9b0Var.p0;
                        hn4 hn4Var = l9b0Var.a0;
                        kib0 kib0Var = l9b0Var.o;
                        d1p d1pVar = l9b0Var.b0;
                        wdd0 wdd0Var = l9b0Var.c0;
                        grj grjVar = l9b0Var.d0;
                        jlx jlxVar = l9b0Var.e0;
                        qho qhoVar = l9b0Var.f0;
                        qyg0 qyg0Var = l9b0Var.g0;
                        pyg0 pyg0Var = l9b0Var.h0;
                        vwb0 vwb0Var = l9b0Var.i0;
                        svs0 svs0Var = l9b0Var.j0;
                        pbt pbtVar = l9b0Var.k0;
                        l570 l570Var = l9b0Var.l0;
                        n4u n4uVar2 = l9b0Var.m0;
                        o3c o3cVar = l9b0Var.n0;
                        ytt yttVar = l9b0Var.o0;
                        onv onvVar = l9b0Var.J;
                        c8c c8cVar = l9b0Var.q0;
                        mctVar.getClass();
                        pygVar.getClass();
                        xriVar.getClass();
                        itrVar.getClass();
                        hn4Var.getClass();
                        kib0Var.getClass();
                        d1pVar.getClass();
                        wdd0Var.getClass();
                        iiVar.getClass();
                        gst0Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        btt0Var.getClass();
                        b3c0Var.getClass();
                        wyuVar.getClass();
                        qe50Var.getClass();
                        j1q0Var.getClass();
                        wdk0Var.getClass();
                        vwb0Var.getClass();
                        pbtVar.getClass();
                        c8cVar.getClass();
                        return new cpi(fvt0Var, jw20Var, hfk0Var, cadVar, zx10Var, nr00Var, pygVar, hn4Var, ljf0Var, wsf0Var, ljf0Var2, xriVar, itrVar, iw20Var, ugf0Var, nv20Var, mctVar, kib0Var, d1pVar, wdd0Var, onvVar, iiVar, pmi0Var, i1w0VarF, uzc0Var, lbuVar3, gst0Var, sd60Var, pruVar, ctf0Var, vqcVar, b3c0Var, y3vVar, hzuVar, lytVar, uyuVar, wyuVar, lbuVar, v88Var, dujVar, lbuVar2, ani0Var, poq0Var, stdVar, ouuVar, s31Var, zgVar, yo4Var, ntuVar, rrcVar, kl5Var, wdk0Var, n4uVar, grjVar, jlxVar, qhoVar, qyg0Var, pyg0Var, vwb0Var, svs0Var, l570Var, n4uVar2, o3cVar, yttVar, c8cVar);
                    }
                }
                jf4.n(b1j.i(l9b0.class, "Cannot create dependency "));
                return null;
            case 10:
                xi70 xi70Var11 = u6b0.e2;
                return new q0h0((bpi) ((cpi) u6b0Var.W1.getValue()).l0.get());
            case 11:
                xi70 xi70Var12 = u6b0.e2;
                return new gkv(new cz60(0, u6b0Var.J0(), sbb0.class, "onShake", "onShake()V", 0, (byte) 24));
            default:
                xi70 xi70Var13 = u6b0.e2;
                kxq kxqVarB = u6b0Var.B();
                Object systemService = kxqVarB != null ? kxqVarB.getSystemService("sensor") : null;
                if (systemService instanceof SensorManager) {
                    return (SensorManager) systemService;
                }
                return null;
        }
    }
}
