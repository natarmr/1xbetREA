package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m19;", "La/yx5;", "<init>", "()V", "a/kj5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m19 extends yx5 {
    public final e9o0 K1;
    public qai L1;
    public ynb M1;
    public ii N1;
    public final a8z O1;
    public final boolean P1;
    public final s0r Q1;
    public final r34 R1;
    public final cgx0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(m19.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorBrandsListBinding;", 0), new ez40(m19.class, "brandId", "getBrandId()J", 0), new ez40(m19.class, "fromDeeplink", "getFromDeeplink()Z", 0)};
    public static final kj5 U1 = new kj5();

    public m19() {
        super(R.layout.fragment_aggregator_brands_list);
        this.K1 = new e9o0(R.attr.uikitBackgroundContent, R.attr.uikitBackgroundContent, 12);
        this.O1 = xbc.a0(this, sre0.f32672a.b(s29.class), null, new i19(this, (byte) 0), 14);
        this.P1 = true;
        this.Q1 = ltt0.o(this, j19.f15722a);
        this.R1 = new r34("BRAND_ID_KEY");
        this.S1 = new cgx0("FROM_DEEPLINK_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        vcc.g0(this, "SELECT_SORT_TYPE_REQUEST_KEY", new Function2(this) { // from class: a.h19
            public final /* synthetic */ m19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object serializable;
                switch (b) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kj5 kj5Var = m19.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (objP == cl5Var) {
                                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                                fetVar.o0(objP);
                            }
                            vne vneVar = (vne) objP;
                            d9z d9zVarA = f9z.a(fetVar);
                            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
                            boolean zG = fetVar.g(d9zVarA);
                            m19 m19Var = this.b;
                            boolean zI = fetVar.i(m19Var) | zG;
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == cl5Var) {
                                objP2 = new d09(d9zVarA, m19Var, (yje) null, (byte) 1);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, d9zVarA, (Function2) objP2);
                            k3t0 k3t0VarG0 = m19Var.G0();
                            boolean zI2 = fetVar.i(vneVar) | fetVar.g(d9zVarA) | fetVar.g(cloVarB) | fetVar.i(m19Var);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == cl5Var) {
                                dc0 dc0Var = new dc0(vneVar, m19Var, d9zVarA, cloVarB, (byte) 16);
                                fetVar.o0(dc0Var);
                                objP3 = dc0Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP3, fetVar);
                            boolean zI3 = fetVar.i(k3t0VarG0) | fetVar.i(m19Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == cl5Var) {
                                ua7 ua7Var = new ua7(k3t0VarG0, m19Var, pz40VarF, null, (byte) 9);
                                fetVar.o0(ua7Var);
                                objP4 = ua7Var;
                            }
                            m0x0.t(fetVar, m19Var, (Function2) objP4);
                            pz40 pz40VarY = ((i3t0) m19Var.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = m19Var.G0();
                            boolean zI4 = fetVar.i(k3t0VarG1);
                            Object objP5 = fetVar.P();
                            if (zI4 || objP5 == cl5Var) {
                                li8 li8Var = new li8(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                                fetVar.o0(li8Var);
                                objP5 = li8Var;
                            }
                            s5x0.k(null, pz40VarY, d9zVarA, cloVarB, (Function1) ((jhy) objP5), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        kj5 kj5Var2 = m19.U1;
                        if (h97.B(bundle2, (String) obj, "SELECT_SORT_TYPE_REQUEST_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("SELECT_SORT_TYPE_REQUEST_KEY", uzb0.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("SELECT_SORT_TYPE_REQUEST_KEY");
                                if (!(serializable2 instanceof uzb0)) {
                                    serializable2 = null;
                                }
                                serializable = (uzb0) serializable2;
                            }
                            uzb0 uzb0Var = (uzb0) serializable;
                            if (uzb0Var != null) {
                                this.b.G0().x(new v09(uzb0Var));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new i19(this, b));
        final byte b2 = 0;
        Object objN = this.Q1.n(V1[0], this);
        objN.getClass();
        pkd.h(((pxq) objN).b, new owp0(this), null, new ugd(-587342950, true, new Function2(this) { // from class: a.h19
            public final /* synthetic */ m19 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object serializable;
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        kj5 kj5Var = m19.U1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (objP == cl5Var) {
                                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                                fetVar.o0(objP);
                            }
                            vne vneVar = (vne) objP;
                            d9z d9zVarA = f9z.a(fetVar);
                            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
                            boolean zG = fetVar.g(d9zVarA);
                            m19 m19Var = this.b;
                            boolean zI = fetVar.i(m19Var) | zG;
                            Object objP2 = fetVar.P();
                            if (zI || objP2 == cl5Var) {
                                objP2 = new d09(d9zVarA, m19Var, (yje) null, (byte) 1);
                                fetVar.o0(objP2);
                            }
                            m0x0.t(fetVar, d9zVarA, (Function2) objP2);
                            k3t0 k3t0VarG0 = m19Var.G0();
                            boolean zI2 = fetVar.i(vneVar) | fetVar.g(d9zVarA) | fetVar.g(cloVarB) | fetVar.i(m19Var);
                            Object objP3 = fetVar.P();
                            if (zI2 || objP3 == cl5Var) {
                                dc0 dc0Var = new dc0(vneVar, m19Var, d9zVarA, cloVarB, (byte) 16);
                                fetVar.o0(dc0Var);
                                objP3 = dc0Var;
                            }
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP3, fetVar);
                            boolean zI3 = fetVar.i(k3t0VarG0) | fetVar.i(m19Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP4 = fetVar.P();
                            if (zI3 || objP4 == cl5Var) {
                                ua7 ua7Var = new ua7(k3t0VarG0, m19Var, pz40VarF, null, (byte) 9);
                                fetVar.o0(ua7Var);
                                objP4 = ua7Var;
                            }
                            m0x0.t(fetVar, m19Var, (Function2) objP4);
                            pz40 pz40VarY = ((i3t0) m19Var.G0()).y(fetVar);
                            k3t0 k3t0VarG1 = m19Var.G0();
                            boolean zI4 = fetVar.i(k3t0VarG1);
                            Object objP5 = fetVar.P();
                            if (zI4 || objP5 == cl5Var) {
                                li8 li8Var = new li8(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                                fetVar.o0(li8Var);
                                objP5 = li8Var;
                            }
                            s5x0.k(null, pz40VarY, d9zVarA, cloVarB, (Function1) ((jhy) objP5), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        kj5 kj5Var2 = m19.U1;
                        if (h97.B(bundle2, (String) obj, "SELECT_SORT_TYPE_REQUEST_KEY")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializable = bundle2.getSerializable("SELECT_SORT_TYPE_REQUEST_KEY", uzb0.class);
                            } else {
                                Object serializable2 = bundle2.getSerializable("SELECT_SORT_TYPE_REQUEST_KEY");
                                if (!(serializable2 instanceof uzb0)) {
                                    serializable2 = null;
                                }
                                serializable = (uzb0) serializable2;
                            }
                            uzb0 uzb0Var = (uzb0) serializable;
                            if (uzb0Var != null) {
                                this.b.G0().x(new v09(uzb0Var));
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(d19.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            d19 d19Var = (d19) (ze3Var instanceof d19 ? ze3Var : null);
            if (d19Var != null) {
                iiy[] iiyVarArr = V1;
                Long lN = this.R1.n(this, iiyVarArr[1]);
                Boolean boolN = this.S1.n(this, iiyVarArr[2]);
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                ehf0 ehf0Var = d19Var.f5301a;
                cad cadVar = d19Var.b;
                peg0 peg0Var = d19Var.c;
                wsf0 wsf0Var = d19Var.d;
                nr00 nr00Var = d19Var.e;
                nr00 nr00Var2 = d19Var.f;
                u58 u58Var = d19Var.g;
                ih5 ih5Var = d19Var.h;
                s31 s31Var = d19Var.i;
                ih5 ih5Var2 = d19Var.j;
                l7k l7kVar = d19Var.k;
                cyu cyuVar = d19Var.l;
                gg5 gg5Var = d19Var.m;
                au0 au0Var = d19Var.n;
                cmt cmtVar = d19Var.o;
                gg5 gg5Var2 = d19Var.p;
                ii iiVar = d19Var.q;
                wdk0 wdk0Var = d19Var.r;
                oeg0 oeg0Var = d19Var.s;
                s91 s91Var = d19Var.t;
                v88 v88Var = d19Var.u;
                h03 h03Var = d19Var.v;
                uzc0 uzc0Var = d19Var.w;
                ctf0 ctf0Var = d19Var.x;
                duj dujVar = d19Var.y;
                gii0 gii0Var = d19Var.z;
                m1e m1eVar = d19Var.A;
                dmt dmtVar = d19Var.B;
                xmt xmtVar = d19Var.C;
                pru pruVar = d19Var.D;
                uyu uyuVar = d19Var.E;
                wyu wyuVar = d19Var.F;
                gst0 gst0Var = d19Var.G;
                grj grjVar = d19Var.H;
                jlx jlxVar = d19Var.I;
                pyt pytVar = d19Var.J;
                qyg0 qyg0Var = d19Var.K;
                pyg0 pyg0Var = d19Var.L;
                r9u r9uVar = d19Var.M;
                j1q0 j1q0Var = d19Var.N;
                bzt bztVar = d19Var.O;
                peg0 peg0Var2 = d19Var.P;
                peg0 peg0Var3 = d19Var.Q;
                iiVar.getClass();
                wdk0Var.getClass();
                oeg0Var.getClass();
                s91Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                gst0Var.getClass();
                r9uVar.getClass();
                j1q0Var.getClass();
                this.L1 = (qai) new rai(cadVar, ehf0Var, peg0Var, wsf0Var, nr00Var, nr00Var2, peg0Var2, lN, boolN, i1w0VarF, u58Var, ih5Var, s31Var, ih5Var2, l7kVar, cyuVar, gg5Var, au0Var, cmtVar, gg5Var2, iiVar, wdk0Var, oeg0Var, s91Var, v88Var, h03Var, uzc0Var, ctf0Var, dujVar, m1eVar, dmtVar, xmtVar, pruVar, uyuVar, wyuVar, gst0Var, grjVar, jlxVar, pytVar, qyg0Var, pyg0Var, j1q0Var, bztVar, peg0Var3).P.get();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.M1 = ynbVarI;
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(d19.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        G0().x(g09.f10447a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
        G0().x(h09.f12222a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.P1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
