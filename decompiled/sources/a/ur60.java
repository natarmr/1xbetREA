package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ur60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ bs60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur60(bs60 bs60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bs60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bs60 bs60Var = this.k;
        switch (b) {
            case 0:
                ur60 ur60Var = new ur60(bs60Var, yjeVar, (byte) 0);
                ur60Var.j = obj;
                return ur60Var;
            default:
                ur60 ur60Var2 = new ur60(bs60Var, yjeVar, (byte) 1);
                ur60Var2.j = obj;
                return ur60Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ur60) create(pair, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        w370 w370Var;
        byte b = this.i;
        bs60 bs60Var = this.k;
        Pair pair = (Pair) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = (List) pair.f46059a;
                int i = bs60.h0;
                p7m0 p7m0Var = bs60Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    w370Var = (w370) value;
                } while (!p7m0Var.m(value, w370.a(w370Var, false, false, null, null, null, tdt.a(w370Var.f, null, null, list, 0, 0, 27), null, false, false, false, false, 16351)));
                nn60 nn60Var = bs60Var.x;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    axq.t(((i8p) it.next()).f14350a, arrayList);
                }
                i3t0.B(bs60Var, nn60Var, new en60[]{new xm60(arrayList)});
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jt50 jt50Var = new jt50((pat) pair.f46059a, (pat) pair.b, (byte) 13);
                int i2 = bs60.h0;
                bs60Var.H(jt50Var);
                break;
        }
        return Unit.f46060a;
    }
}
