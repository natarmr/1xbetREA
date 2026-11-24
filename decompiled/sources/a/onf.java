package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class onf extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rnf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onf(rnf rnfVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rnfVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rnf rnfVar = this.k;
        switch (b) {
            case 0:
                onf onfVar = new onf(rnfVar, yjeVar, (byte) 0);
                onfVar.j = obj;
                return onfVar;
            case 1:
                onf onfVar2 = new onf(rnfVar, yjeVar, (byte) 1);
                onfVar2.j = obj;
                return onfVar2;
            case 2:
                onf onfVar3 = new onf(rnfVar, yjeVar, (byte) 2);
                onfVar3.j = obj;
                return onfVar3;
            default:
                onf onfVar4 = new onf(rnfVar, yjeVar, (byte) 3);
                onfVar4.j = obj;
                return onfVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((onf) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((onf) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((onf) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((onf) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        wmf wmfVar;
        ArrayList arrayList;
        byte b = this.i;
        rnf rnfVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                rnfVar.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = rnfVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, wmf.a((wmf) value, null, null, false, null, null, null, false, z, null, false, null, null, null, null, null, 16775167)));
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = rnf.e0;
                p7m0 p7m0Var2 = rnfVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, wmf.a((wmf) value2, null, null, false, null, list, null, false, false, null, false, null, null, null, null, null, 16777087)));
                break;
            case 2:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = rnf.e0;
                p7m0 p7m0Var3 = rnfVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, wmf.a((wmf) value3, null, bqrVar, false, null, null, null, false, false, null, false, null, null, null, null, null, 16777211)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = rnf.e0;
                p7m0 p7m0Var4 = rnfVar.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    wmfVar = (wmf) value4;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var4.m(value4, wmf.a(wmfVar, null, null, false, null, null, null, false, false, arrayList, !Intrinsics.d(wmfVar.n, arrayList), null, null, null, null, null, 16736255)));
                break;
        }
        return Unit.f46060a;
    }
}
