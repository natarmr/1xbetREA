package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class do60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eo60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do60(eo60 eo60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eo60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eo60 eo60Var = this.k;
        switch (b) {
            case 0:
                do60 do60Var = new do60(eo60Var, yjeVar, (byte) 0);
                do60Var.j = obj;
                return do60Var;
            default:
                do60 do60Var2 = new do60(eo60Var, yjeVar, (byte) 1);
                do60Var2.j = obj;
                return do60Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((do60) create((xo70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((do60) create((wo70) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        eo60 eo60Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                xo70 xo70Var = (xo70) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (xo70Var == null) {
                    t9f.b();
                    return null;
                }
                atz atzVar = eo60.O1;
                eo60Var.G0().b.setText(xo70Var.f41202a);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((wo70) obj2) instanceof vo70) {
                    atz atzVar2 = eo60.O1;
                    eo60Var.G0().c.c();
                    eo60Var.G0().c.setVisibility(8);
                    eo60Var.G0().b.setVisibility(0);
                }
                return Unit.f46060a;
        }
    }
}
