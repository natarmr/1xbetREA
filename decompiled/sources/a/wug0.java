package a;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class wug0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zug0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wug0(zug0 zug0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zug0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zug0 zug0Var = this.k;
        switch (b) {
            case 0:
                wug0 wug0Var = new wug0(zug0Var, yjeVar, (byte) 0);
                wug0Var.j = obj;
                return wug0Var;
            case 1:
                wug0 wug0Var2 = new wug0(zug0Var, yjeVar, (byte) 1);
                wug0Var2.j = obj;
                return wug0Var2;
            default:
                wug0 wug0Var3 = new wug0(zug0Var, yjeVar, (byte) 2);
                wug0Var3.j = obj;
                return wug0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wug0) create((owg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wug0) create((m9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wug0) create((rwg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zug0 zug0Var = this.k;
        switch (b) {
            case 0:
                qek0 qek0Var = qek0.f28589a;
                owg0 owg0Var = (owg0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (owg0Var != null) {
                    boolean z = owg0Var instanceof nwg0;
                    zug0 zug0Var2 = this.k;
                    if (z) {
                        wdk0 wdk0Var = zug0Var2.R1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH = zug0Var2.H(R.string.coupon_success_auto_sell);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), zug0Var2, null, null, true, null, 1004);
                        zug0Var2.G0(((nwg0) owg0Var).f24232a, false);
                    } else if (owg0Var instanceof lwg0) {
                        lme0 lme0Var = mug0.m2;
                        androidx.fragment.app.e eVarF = zug0Var2.F();
                        lwg0 lwg0Var = (lwg0) owg0Var;
                        n3w n3wVar = lwg0Var.f20763a;
                        boolean z2 = lwg0Var.c;
                        SaleDataModel saleDataModel = lwg0Var.b;
                        double d = lwg0Var.d;
                        lme0Var.getClass();
                        n3wVar.getClass();
                        saleDataModel.getClass();
                        mug0 mug0Var = new mug0();
                        iiy[] iiyVarArr = mug0.n2;
                        mug0Var.i2.x(mug0Var, iiyVarArr[4], "REQUEST_SALE_DIALOG_KEY");
                        mug0Var.e2.v(mug0Var, iiyVarArr[0], z2);
                        mug0Var.f2.u(mug0Var, iiyVarArr[1], n3wVar);
                        mug0Var.g2.J(mug0Var, iiyVarArr[2], saleDataModel);
                        mug0Var.h2.f0(mug0Var, iiyVarArr[3], d);
                        mug0Var.H0(eVarF, "SaleDialog");
                    } else if (owg0Var instanceof kwg0) {
                        std stdVar = oyd.k2;
                        androidx.fragment.app.e eVarF2 = zug0Var2.F();
                        kwg0 kwg0Var = (kwg0) owg0Var;
                        n3w n3wVar2 = kwg0Var.f19001a;
                        double d2 = kwg0Var.b;
                        stdVar.getClass();
                        std.h(eVarF2, n3wVar2, d2);
                    } else if (owg0Var instanceof jwg0) {
                        wdk0 wdk0Var2 = zug0Var2.R1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var2, new xdk0(rek0.b, ((jwg0) owg0Var).f17249a, null, null, null, null, 124), zug0Var2, null, null, true, null, 1004);
                    } else if (owg0Var instanceof mwg0) {
                        wdk0 wdk0Var3 = zug0Var2.R1;
                        if (wdk0Var3 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        mwg0 mwg0Var = (mwg0) owg0Var;
                        wdk0.k(wdk0Var3, new xdk0(qek0Var, mwg0Var.f22501a, mwg0Var.b, null, null, null, 120), zug0Var2, null, null, true, null, 1004);
                        zug0Var2.G0(mwg0Var.c, mwg0Var.d);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                m9h0 m9h0Var = (m9h0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                msv msvVar = m9h0Var.b;
                hje hjeVar = m9h0Var.l;
                jug0 jug0Var = m9h0Var.f21410a;
                gne0 gne0Var = zug0.V1;
                zug0Var.H0().d.setVisibility(0);
                zug0Var.H0().b.setVisibility(msvVar.f22341a ? 0 : 8);
                zug0Var.H0().w.setVisibility(msvVar.b ? 0 : 8);
                zug0Var.H0().v.setText(msvVar.c);
                zug0Var.H0().E.setText(msvVar.d);
                zug0Var.H0().A.setText(msvVar.e.a(zug0Var.o0()));
                zug0Var.H0().u.setText(msvVar.f);
                zug0Var.H0().s.setText(msvVar.g);
                if (!Intrinsics.d(jug0Var, jug0.k)) {
                    if (jug0Var.f17152a) {
                        zug0Var.H0().r.setText(jug0Var.b);
                        zug0Var.H0().q.setText(jug0Var.c);
                        zug0Var.H0().p.setText(jug0Var.d);
                    }
                    zug0Var.H0().z.setText(jug0Var.e);
                    zug0Var.H0().y.setText(jug0Var.f);
                    zug0Var.H0().x.setText(jug0Var.g);
                    zug0Var.H0().D.setText(jug0Var.h);
                    zug0Var.H0().C.setText(jug0Var.i);
                    zug0Var.H0().B.setText(jug0Var.j);
                }
                zug0Var.H0().t.setText(m9h0Var.k);
                zug0Var.H0().m.setProgress(m9h0Var.c);
                zug0Var.H0().n.setProgress(m9h0Var.d);
                zug0Var.H0().l.setProgress(m9h0Var.e);
                zug0Var.H0().h.setVisibility(m9h0Var.j ? 0 : 8);
                if (m9h0Var.f) {
                    zug0Var.H0().b.setVisibility(8);
                    zug0Var.H0().j.setVisibility(8);
                    zug0Var.H0().k.setVisibility(8);
                    zug0Var.H0().i.setVisibility(0);
                    zug0Var.J0(false);
                } else if (m9h0Var.g) {
                    zug0Var.H0().b.setVisibility(0);
                    zug0Var.H0().j.setVisibility(8);
                    zug0Var.H0().k.setVisibility(8);
                    zug0Var.H0().i.setVisibility(0);
                    zug0Var.J0(false);
                } else if (m9h0Var.h) {
                    zug0Var.H0().b.setVisibility(8);
                    zug0Var.H0().j.setVisibility(0);
                    zug0Var.H0().k.setVisibility(0);
                    zug0Var.H0().i.setVisibility(8);
                    zug0Var.J0(false);
                } else if (m9h0Var.i) {
                    zug0Var.H0().b.setVisibility(0);
                    zug0Var.H0().j.setVisibility(0);
                    zug0Var.H0().k.setVisibility(0);
                    zug0Var.H0().i.setVisibility(8);
                    zug0Var.J0(false);
                }
                if (hjeVar.equals(m2a.i)) {
                    zug0Var.K0(false);
                } else if (hjeVar.equals(bje.f2702a)) {
                    zug0Var.K0(true);
                } else {
                    if (!(hjeVar instanceof wie)) {
                        t9f.b();
                        return null;
                    }
                    zug0Var.H0().f.v(((wie) hjeVar).f39210a);
                    zug0Var.H0().g.setVisibility(8);
                    zug0Var.J0(true);
                }
                return Unit.f46060a;
            default:
                rwg0 rwg0Var = (rwg0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = rwg0Var instanceof qwg0;
                Map map = zug0Var.U1;
                if (z3) {
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            ((View) entry.getValue()).setEnabled(entry.getKey() == ((qwg0) rwg0Var).f29435a);
                        }
                    }
                } else if (map != null) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        ((View) ((Map.Entry) it.next()).getValue()).setEnabled(true);
                    }
                }
                return Unit.f46060a;
        }
    }
}
