package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ffp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gfp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffp(gfp gfpVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gfpVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gfp gfpVar = this.k;
        switch (b) {
            case 0:
                ffp ffpVar = new ffp(gfpVar, yjeVar, (byte) 0);
                ffpVar.j = obj;
                return ffpVar;
            default:
                ffp ffpVar2 = new ffp(gfpVar, yjeVar, (byte) 1);
                ffpVar2.j = obj;
                return ffpVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ffp) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ffp) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        gfp gfpVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Pair pair = (Pair) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = (List) pair.f46059a;
                List list2 = (List) pair.b;
                nn60 nn60Var = gfpVar.r;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    axq.t(((i8p) it.next()).f14350a, arrayList);
                }
                i3t0.B(gfpVar, nn60Var, new en60[]{new xm60(arrayList)});
                p7m0 p7m0Var = gfpVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, i9p.a((i9p) value, false, list.isEmpty(), false, false, false, null, null, list2, false, 7880)));
                break;
            default:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = gfp.B;
                p7m0 p7m0Var2 = gfpVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, i9p.a((i9p) value2, false, false, sw00Var.f32897a, false, false, null, null, null, false, 8183)));
                break;
        }
        return Unit.f46060a;
    }
}
