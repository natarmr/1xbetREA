package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y5t0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a6t0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5t0(a6t0 a6t0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a6t0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a6t0 a6t0Var = this.k;
        switch (b) {
            case 0:
                y5t0 y5t0Var = new y5t0(a6t0Var, yjeVar, (byte) 0);
                y5t0Var.j = obj;
                return y5t0Var;
            case 1:
                y5t0 y5t0Var2 = new y5t0(a6t0Var, yjeVar, (byte) 1);
                y5t0Var2.j = obj;
                return y5t0Var2;
            default:
                y5t0 y5t0Var3 = new y5t0(a6t0Var, yjeVar, (byte) 2);
                y5t0Var3.j = obj;
                return y5t0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((y5t0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((y5t0) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((y5t0) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        s5t0 s5t0Var;
        ArrayList arrayList;
        byte b = this.i;
        a6t0 a6t0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = a6t0.K;
                p7m0 p7m0Var = a6t0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, s5t0.a((s5t0) value, null, null, null, null, null, list, null, null, null, false, 0L, 0L, 0L, 0L, 131007)));
                break;
            case 1:
                bqr bqrVar = (bqr) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = a6t0.K;
                p7m0 p7m0Var2 = a6t0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, s5t0.a((s5t0) value2, null, null, null, null, null, null, null, null, bqrVar, false, 0L, 0L, 0L, 0L, 130047)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = a6t0.K;
                p7m0 p7m0Var3 = a6t0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    s5t0Var = (s5t0) value3;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var3.m(value3, s5t0.a(s5t0Var, null, null, null, null, null, null, arrayList, null, null, !Intrinsics.d(s5t0Var.h, arrayList), 0L, 0L, 0L, 0L, 128895)));
                break;
        }
        return Unit.f46060a;
    }
}
