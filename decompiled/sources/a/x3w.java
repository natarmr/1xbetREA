package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x3w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y3w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3w(y3w y3wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = y3wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        y3w y3wVar = this.k;
        switch (b) {
            case 0:
                x3w x3wVar = new x3w(y3wVar, yjeVar, (byte) 0);
                x3wVar.j = obj;
                return x3wVar;
            default:
                x3w x3wVar2 = new x3w(y3wVar, yjeVar, (byte) 1);
                x3wVar2.j = obj;
                return x3wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x3w) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x3w) create((a4w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        y3w y3wVar = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sqt sqtVar = y3w.n2;
                a8z a8zVar = y3wVar.m2;
                ((z3w) a8zVar.getValue()).f = list;
                ((z3w) a8zVar.getValue()).g();
                return Unit.f46060a;
            default:
                phf0 phf0Var = y3wVar.e2;
                a4w a4wVar = (a4w) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (a4wVar == null) {
                    t9f.b();
                    return null;
                }
                sqt sqtVar2 = y3w.n2;
                iiy[] iiyVarArr = y3w.o2;
                vcc.f0(i120.V(new Pair(phf0Var.n(y3wVar, iiyVarArr[0]), a4wVar.f242a)), y3wVar, phf0Var.n(y3wVar, iiyVarArr[0]));
                y3wVar.x0();
                return Unit.f46060a;
        }
    }
}
