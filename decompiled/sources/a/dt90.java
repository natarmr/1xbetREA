package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class dt90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ et90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt90(et90 et90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = et90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        et90 et90Var = this.k;
        switch (b) {
            case 0:
                dt90 dt90Var = new dt90(et90Var, yjeVar, (byte) 0);
                dt90Var.j = obj;
                return dt90Var;
            case 1:
                dt90 dt90Var2 = new dt90(et90Var, yjeVar, (byte) 1);
                dt90Var2.j = obj;
                return dt90Var2;
            default:
                dt90 dt90Var3 = new dt90(et90Var, yjeVar, (byte) 2);
                dt90Var3.j = obj;
                return dt90Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dt90) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dt90) create((it90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dt90) create((lt90) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        et90 et90Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                String str = (String) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mi70 mi70Var = et90.j2;
                yzn0 yzn0Var = et90Var.g2;
                iiy[] iiyVarArr = et90.k2;
                i7a i7aVar = (i7a) yzn0Var.n(et90Var, iiyVarArr[0]);
                str.getClass();
                iqt0 iqt0Var = new iqt0(str, i7aVar, false);
                phf0 phf0Var = et90Var.h2;
                vcc.f0(i120.V(new Pair(phf0Var.n(et90Var, iiyVarArr[1]), iqt0Var)), et90Var, phf0Var.n(et90Var, iiyVarArr[1]));
                et90Var.x0();
                return Unit.f46060a;
            case 1:
                it90 it90Var = (it90) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (it90Var != null) {
                    if (it90Var instanceof gt90) {
                        et90Var.L0().e.setImageBitmap(((gt90) it90Var).f11869a);
                    } else if (it90Var instanceof ht90) {
                        et90Var.L0().e.setContentDescription("Error");
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                et90Var.L0().d.setErrorText(((lt90) obj2).f20622a);
                return Unit.f46060a;
        }
    }
}
