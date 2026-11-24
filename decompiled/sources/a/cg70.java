package a;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cg70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dg70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg70(dg70 dg70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dg70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dg70 dg70Var = this.k;
        switch (b) {
            case 0:
                cg70 cg70Var = new cg70(dg70Var, yjeVar, (byte) 0);
                cg70Var.j = obj;
                return cg70Var;
            default:
                cg70 cg70Var2 = new cg70(dg70Var, yjeVar, (byte) 1);
                cg70Var2.j = obj;
                return cg70Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cg70) create((tg70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cg70) create((sg70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strH;
        byte b = this.i;
        dg70 dg70Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                tg70 tg70Var = (tg70) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = tg70Var.f33896a;
                String str = tg70Var.d;
                xuz xuzVar = dg70.Q1;
                dg70Var.I0().c.setAlpha(z ? 1.0f : 0.5f);
                dg70Var.I0().p.setClickable(z);
                dg70Var.I0().n.setClickable(z);
                dg70Var.I0().s.setClickable(z);
                dg70Var.I0().j.setClickable(z);
                dg70Var.I0().f.setEnabled(z);
                boolean z2 = tg70Var.f;
                boolean z3 = !z2;
                dg70Var.I0().p.setAlpha(!z2 ? 1.0f : 0.5f);
                dg70Var.I0().p.setEnabled(z3);
                boolean z4 = tg70Var.i;
                boolean z5 = !z4;
                dg70Var.I0().j.setAlpha(!z4 ? 1.0f : 0.5f);
                dg70Var.I0().j.setEnabled(z5);
                boolean z6 = tg70Var.h;
                boolean z7 = !z6;
                dg70Var.I0().s.setAlpha(!z6 ? 1.0f : 0.5f);
                dg70Var.I0().s.setEnabled(z7);
                boolean z8 = tg70Var.g;
                boolean z9 = !z8;
                dg70Var.I0().n.setAlpha(z8 ? 0.5f : 1.0f);
                dg70Var.I0().n.setEnabled(z9);
                boolean z10 = tg70Var.j;
                int i = 8;
                dg70Var.I0().m.setVisibility(z10 ? 0 : 8);
                dg70Var.I0().l.setVisibility(!z10 ? 0 : 8);
                dg70Var.I0().r.setTextColor(dg70Var.I0().r.getContext().getColor(z10 ? R.color.static_gray : R.color.static_red));
                double d = tg70Var.e;
                boolean z11 = tg70Var.k;
                p3u0 p3u0Var = kotlin.text.c.n(String.valueOf(dg70Var.I0().f.getText()), ".0", false) ? p3u0.h : p3u0.g;
                if (d == eh70.D) {
                    strH = "";
                } else {
                    pn40 pn40Var = pn40.f27267a;
                    strH = pn40.h(d, p3u0Var, z11);
                }
                if (!String.valueOf(dg70Var.I0().f.getText()).equals(strH)) {
                    dg70Var.I0().f.setText(strH);
                    dg70Var.I0().f.setSelection(dg70Var.I0().f.length());
                }
                dg70Var.I0().b.setText(str);
                dg70Var.J0().y = d;
                double d2 = tg70Var.c;
                double d3 = tg70Var.b;
                pn40 pn40Var2 = pn40.f27267a;
                p3u0 p3u0Var2 = p3u0.g;
                dg70Var.I0().r.setText(dg70Var.I(R.string.xgames_bet_min_max, pn40.d(d3, str, p3u0Var2), pn40.d(d2, str, p3u0Var2)));
                boolean z12 = tg70Var.l;
                boolean z13 = tg70Var.m;
                if (z12) {
                    dg70Var.I0().q.b();
                    dg70Var.I0().t.b();
                    dg70Var.I0().k.b();
                    dg70Var.I0().o.b();
                    dg70Var.I0().d.b();
                } else {
                    dg70Var.I0().q.c();
                    dg70Var.I0().t.c();
                    dg70Var.I0().k.c();
                    dg70Var.I0().o.c();
                    dg70Var.I0().d.c();
                }
                dg70Var.I0().e.setVisibility(z12 ? 0 : 8);
                dg70Var.I0().i.setVisibility((z12 || !z13) ? 8 : 0);
                ConstraintLayout constraintLayout = dg70Var.I0().h;
                if (!z12 && z13) {
                    i = 0;
                }
                constraintLayout.setVisibility(i);
                return Unit.f46060a;
            default:
                sg70 sg70Var = (sg70) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(sg70Var, sg70.f32147a)) {
                    xuz xuzVar2 = dg70.Q1;
                    dg70Var.G0(new al70());
                } else if (Intrinsics.d(sg70Var, sg70.b)) {
                    xuz xuzVar3 = dg70.Q1;
                    dg70Var.G0(new vf70());
                } else {
                    if (!Intrinsics.d(sg70Var, sg70.c)) {
                        t9f.b();
                        return null;
                    }
                    xuz xuzVar4 = dg70.Q1;
                    dg70Var.G0(new om70());
                }
                return Unit.f46060a;
        }
    }
}
