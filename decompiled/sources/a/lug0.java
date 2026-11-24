package a;

import android.widget.TextView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lug0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mug0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lug0(mug0 mug0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mug0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mug0 mug0Var = this.k;
        switch (b) {
            case 0:
                lug0 lug0Var = new lug0(mug0Var, yjeVar, (byte) 0);
                lug0Var.j = obj;
                return lug0Var;
            default:
                lug0 lug0Var2 = new lug0(mug0Var, yjeVar, (byte) 1);
                lug0Var2.j = obj;
                return lug0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lug0) create((qug0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lug0) create((pug0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        mug0 mug0Var = this.k;
        switch (b) {
            case 0:
                qug0 qug0Var = (qug0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (qug0Var == null) {
                    t9f.b();
                    return null;
                }
                xvg0 xvg0Var = qug0Var.f29343a;
                boolean z = xvg0Var.b;
                lme0 lme0Var = mug0.m2;
                mug0Var.T0().c.setVisibility(z ? 0 : 8);
                mug0Var.T0().d.setVisibility(z ? 0 : 8);
                TextView textView = mug0Var.T0().i;
                rdj rdjVar = rdj.f30294a;
                boolean z2 = xvg0Var.m;
                textView.setText(rdj.g(new znq0(xvg0Var.f41558a), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56));
                mug0Var.T0().m.setText(xvg0Var.c);
                mug0Var.T0().j.setText(xvg0Var.d);
                mug0Var.T0().g.setText(xvg0Var.e);
                mug0Var.T0().h.setText(xvg0Var.h);
                mug0Var.T0().d.setText(xvg0Var.i);
                mug0Var.T0().f.setText(xvg0Var.g);
                mug0Var.T0().k.setText(xvg0Var.k);
                mug0Var.T0().l.setText(xvg0Var.j);
                mug0Var.T0().b.setText(xvg0Var.l);
                mug0Var.T0().e.setText(xvg0Var.f);
                return Unit.f46060a;
            default:
                phf0 phf0Var = mug0Var.i2;
                pug0 pug0Var = (pug0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (pug0Var == null) {
                    t9f.b();
                    return null;
                }
                lme0 lme0Var2 = mug0.m2;
                iiy[] iiyVarArr = mug0.n2;
                vcc.f0(i120.V(new Pair(phf0Var.n(mug0Var, iiyVarArr[4]), pug0Var.f27616a)), mug0Var, phf0Var.n(mug0Var, iiyVarArr[4]));
                mug0Var.x0();
                return Unit.f46060a;
        }
    }
}
