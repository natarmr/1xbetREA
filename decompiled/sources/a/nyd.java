package a;

import android.widget.TextView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class nyd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ oyd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nyd(oyd oydVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = oydVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        oyd oydVar = this.k;
        switch (b) {
            case 0:
                nyd nydVar = new nyd(oydVar, yjeVar, (byte) 0);
                nydVar.j = obj;
                return nydVar;
            default:
                nyd nydVar2 = new nyd(oydVar, yjeVar, (byte) 1);
                nydVar2.j = obj;
                return nydVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nyd) create((ryd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nyd) create((qyd) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        oyd oydVar = this.k;
        switch (b) {
            case 0:
                ryd rydVar = (ryd) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (rydVar == null) {
                    t9f.b();
                    return null;
                }
                lzd lzdVar = rydVar.f31309a;
                std stdVar = oyd.k2;
                TextView textView = oydVar.L0().f;
                rdj rdjVar = rdj.f30294a;
                boolean z = lzdVar.j;
                long j = lzdVar.f20899a;
                textView.setText(rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                oydVar.L0().j.setText(lzdVar.b);
                oydVar.L0().g.setText(lzdVar.c);
                oydVar.L0().e.setText(lzdVar.d);
                oydVar.L0().d.setText(lzdVar.f);
                oydVar.L0().h.setText(lzdVar.h);
                oydVar.L0().i.setText(lzdVar.g);
                oydVar.L0().b.setText(lzdVar.i);
                oydVar.L0().c.setText(lzdVar.e);
                return Unit.f46060a;
            default:
                phf0 phf0Var = oydVar.g2;
                qyd qydVar = (qyd) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (qydVar == null) {
                    t9f.b();
                    return null;
                }
                std stdVar2 = oyd.k2;
                iiy[] iiyVarArr = oyd.l2;
                vcc.f0(i120.V(new Pair(phf0Var.n(oydVar, iiyVarArr[2]), qydVar.f29526a)), oydVar, phf0Var.n(oydVar, iiyVarArr[2]));
                oydVar.x0();
                return Unit.f46060a;
        }
    }
}
