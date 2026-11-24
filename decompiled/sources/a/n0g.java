package a;

import android.app.Dialog;
import android.view.Window;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class n0g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o0g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0g(o0g o0gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o0gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o0g o0gVar = this.k;
        switch (b) {
            case 0:
                n0g n0gVar = new n0g(o0gVar, yjeVar, (byte) 0);
                n0gVar.j = obj;
                return n0gVar;
            default:
                n0g n0gVar2 = new n0g(o0gVar, yjeVar, (byte) 1);
                n0gVar2.j = obj;
                return n0gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((n0g) create((z9o) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((n0g) create((q0g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Window window;
        Window window2;
        switch (this.i) {
            case 0:
                z9o z9oVar = (z9o) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z9oVar != null) {
                    boolean z = z9oVar instanceof x9o;
                    o0g o0gVar = this.k;
                    if (z) {
                        o0gVar.x0();
                        if (o0gVar.g2 == null) {
                            Intrinsics.h("marketsSettingsScreenFactory");
                            throw null;
                        }
                        wsz.i(o0gVar.F());
                    } else if (z9oVar instanceof u9o) {
                        Dialog dialog = o0gVar.S1;
                        if (dialog != null && (window2 = dialog.getWindow()) != null) {
                            wdk0 wdk0Var = o0gVar.h2;
                            if (wdk0Var == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            rek0 rek0Var = rek0.b;
                            String strH = o0gVar.H(((u9o) z9oVar).f35293a);
                            strH.getClass();
                            wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), o0gVar, null, window2.getDecorView(), false, null, 1012);
                        }
                    } else if (z9oVar instanceof v9o) {
                        Dialog dialog2 = o0gVar.S1;
                        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                            wdk0 wdk0Var2 = o0gVar.h2;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            qek0 qek0Var = qek0.f28589a;
                            String strH2 = o0gVar.H(R.string.favorites_subscribe_snackbar);
                            strH2.getClass();
                            wdk0.k(wdk0Var2, new xdk0(qek0Var, strH2, null, null, null, new Integer(R.drawable.ic_glyph_favourite_active), 92), o0gVar, null, window.getDecorView(), false, null, 1012);
                        }
                    } else if (z9oVar instanceof q9o) {
                        o0gVar.x0();
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                q0g q0gVar = (q0g) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                usd usdVar = o0g.k2;
                o0g o0gVar2 = this.k;
                LinearLayout linearLayout = o0gVar2.L0().s;
                boolean z2 = q0gVar.i;
                boolean z3 = q0gVar.j;
                boolean z4 = q0gVar.k;
                boolean z5 = q0gVar.p;
                boolean z6 = q0gVar.o;
                boolean z7 = q0gVar.n;
                linearLayout.setVisibility(z2 ? 0 : 8);
                o0gVar2.L0().q.setVisibility(q0gVar.i ? 0 : 8);
                o0gVar2.L0().t.setImageResource(q0gVar.f27895a);
                o0gVar2.L0().h.setVisibility(z7 ? 0 : 8);
                o0gVar2.L0().m.setVisibility(z7 ? 0 : 8);
                o0gVar2.L0().i.setVisibility(z6 ? 0 : 8);
                o0gVar2.L0().n.setVisibility(z6 ? 0 : 8);
                o0gVar2.L0().g.setImageResource(q0gVar.e);
                o0gVar2.L0().f.setImageResource(q0gVar.d);
                o0gVar2.L0().w.setText(q0gVar.g);
                o0gVar2.L0().r.setVisibility(z5 ? 0 : 8);
                o0gVar2.L0().p.setVisibility(z5 ? 0 : 8);
                o0gVar2.L0().c.setVisibility(z4 ? 0 : 8);
                o0gVar2.L0().l.setVisibility(z4 ? 0 : 8);
                o0gVar2.L0().d.setImageResource(q0gVar.c);
                o0gVar2.L0().e.setText(q0gVar.f);
                o0gVar2.L0().j.setVisibility(z3 ? 0 : 8);
                o0gVar2.L0().o.setVisibility(z3 ? 0 : 8);
                o0gVar2.L0().k.setImageResource(q0gVar.b);
                o0gVar2.L0().v.setChecked(q0gVar.h);
                o0gVar2.L0().v.jumpDrawablesToCurrentState();
                o0gVar2.L0().u.setVisibility(q0gVar.m ? 0 : 8);
                return Unit.f46060a;
        }
    }
}
