package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/je1;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class je1 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public ii M1;
    public wdk0 N1;
    public final boolean O1;
    public ynb P1;
    public final yzn0 Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(je1.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorPromoBinding;", 0), new ez40(je1.class, "promoTypeToOpen", "getPromoTypeToOpen()Lorg/xplatform/aggregator/api/navigation/PromoTypeToOpen;", 0)};
    public static final hfk0 S1 = new hfk0((byte) 17);
    public static final String V1 = je1.class.getSimpleName();

    public je1() {
        super(R.layout.fragment_aggregator_promo);
        this.K1 = ltt0.o(this, ie1.f14610a);
        this.O1 = true;
        this.Q1 = new yzn0("PROMO_TYPE_ITEM");
        this.R1 = xbc.b0(this, sre0.f32672a.b(mh1.class), new nc(this, (byte) 18));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = U1;
        iiy iiyVar = iiyVarArr[1];
        yzn0 yzn0Var = this.Q1;
        fvc0 fvc0Var = (fvc0) yzn0Var.n(this, iiyVar);
        bvc0 bvc0Var = bvc0.f3273a;
        if (!fvc0Var.equals(bvc0Var)) {
            G0().x(new id1((fvc0) yzn0Var.n(this, iiyVarArr[1])));
            yzn0Var.u(this, iiyVarArr[1], bvc0Var);
        }
        Object objN = this.K1.n(iiyVarArr[0], this);
        objN.getClass();
        pkd.h(((txq) objN).b, new owp0(K()), null, new ugd(587613735, true, new tx(this, (byte) 3)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fe1.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fe1 fe1Var = (fe1) (ze3Var instanceof fe1 ? ze3Var : null);
            if (fe1Var != null) {
                mr1 mr1Var = mr1.f22247a;
                new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511);
                cad cadVar = fe1Var.b;
                oeg0 oeg0Var = fe1Var.p;
                wsf0 wsf0Var = fe1Var.F;
                uzc0 uzc0Var = fe1Var.c;
                kt2 kt2Var = fe1Var.d;
                s31 s31Var = fe1Var.e;
                nv20 nv20Var = fe1Var.h;
                xk0 xk0Var = fe1Var.g;
                duj dujVar = fe1Var.i;
                o91 o91Var = fe1Var.j;
                s91 s91Var = fe1Var.k;
                ii iiVar = fe1Var.C;
                gii0 gii0Var = fe1Var.m;
                m1e m1eVar = fe1Var.n;
                v88 v88Var = fe1Var.o;
                ehf0 ehf0Var = fe1Var.f9381a;
                r9u r9uVar = fe1Var.l;
                h03 h03Var = fe1Var.f;
                pru pruVar = fe1Var.q;
                btt0 btt0Var = fe1Var.r;
                peg0 peg0Var = fe1Var.H;
                ctf0 ctf0Var = fe1Var.s;
                xmt xmtVar = fe1Var.t;
                zr1 zr1Var = fe1Var.u;
                ix0 ix0Var = fe1Var.v;
                s64 s64Var = fe1Var.w;
                ntu ntuVar = fe1Var.x;
                fsd fsdVar = fe1Var.y;
                l7k l7kVar = fe1Var.z;
                gg5 gg5Var = fe1Var.N;
                zx10 zx10Var = fe1Var.A;
                kc60 kc60Var = fe1Var.B;
                gst0 gst0Var = fe1Var.D;
                wdk0 wdk0Var = fe1Var.E;
                dmt dmtVar = fe1Var.I;
                poq0 poq0Var = fe1Var.J;
                b3c0 b3c0Var = fe1Var.K;
                nr00 nr00Var = fe1Var.L;
                lrc lrcVar = fe1Var.M;
                grj grjVar = fe1Var.O;
                jlx jlxVar = fe1Var.P;
                pyt pytVar = fe1Var.Q;
                qyg0 qyg0Var = fe1Var.R;
                pyg0 pyg0Var = fe1Var.S;
                r9s0 r9s0Var = fe1Var.T;
                wiu wiuVar = fe1Var.G;
                cyu cyuVar = fe1Var.U;
                peg0 peg0Var2 = fe1Var.V;
                ytt yttVar = fe1Var.W;
                yfu yfuVar = fe1Var.X;
                cmt cmtVar = fe1Var.Y;
                iiVar.getClass();
                oeg0Var.getClass();
                kt2Var.getClass();
                xk0Var.getClass();
                o91Var.getClass();
                s91Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                fsdVar.getClass();
                gst0Var.getClass();
                wdk0Var.getClass();
                b3c0Var.getClass();
                r9s0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(mh1.class, new u7i(cadVar, ehf0Var, zx10Var, nv20Var, poq0Var, peg0Var, wsf0Var, nr00Var, lrcVar, peg0Var2, iiVar, oeg0Var, uzc0Var, kt2Var, s31Var, dujVar, s91Var, h03Var, m1eVar, v88Var, pruVar, ctf0Var, xmtVar, zr1Var, ix0Var, s64Var, ntuVar, fsdVar, l7kVar, kc60Var, gst0Var, wiuVar, dmtVar, wdk0Var, gg5Var, grjVar, jlxVar, pytVar, qyg0Var, pyg0Var, cyuVar, yttVar, yfuVar, cmtVar).O));
                this.M1 = iiVar;
                this.N1 = wdk0Var;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.P1 = ynbVarI;
                return;
            }
        }
        jf4.n(b1j.i(fe1.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.R1.getValue();
    }

    public final void H0(String str) {
        Object g0g0Var;
        Context contextO0 = o0();
        str.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(268435456);
            intent.setData(Uri.parse(str));
            contextO0.startActivity(intent);
            g0g0Var = Unit.f46060a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            wdk0 wdk0Var = this.N1;
            if (wdk0Var == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            rek0 rek0Var = rek0.b;
            String strH = H(R.string.open_browser_error_message);
            strH.getClass();
            wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), this, null, null, false, null, 1020);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        G0().x(od1.f25055a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(pd1.f26784a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getK1() {
        return this.O1;
    }
}
