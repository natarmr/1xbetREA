package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b1e0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d1e0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1e0(d1e0 d1e0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d1e0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d1e0 d1e0Var = this.k;
        switch (b) {
            case 0:
                b1e0 b1e0Var = new b1e0(d1e0Var, yjeVar, (byte) 0);
                b1e0Var.j = obj;
                return b1e0Var;
            case 1:
                b1e0 b1e0Var2 = new b1e0(d1e0Var, yjeVar, (byte) 1);
                b1e0Var2.j = obj;
                return b1e0Var2;
            case 2:
                b1e0 b1e0Var3 = new b1e0(d1e0Var, yjeVar, (byte) 2);
                b1e0Var3.j = obj;
                return b1e0Var3;
            default:
                b1e0 b1e0Var4 = new b1e0(d1e0Var, yjeVar, (byte) 3);
                b1e0Var4.j = obj;
                return b1e0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((b1e0) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((b1e0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((b1e0) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((b1e0) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        qyd0 qyd0Var;
        ArrayList arrayList;
        byte b = this.i;
        d1e0 d1e0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                d1e0Var.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = d1e0Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    boolean z2 = z;
                    if (!p7m0Var.m(value4, qyd0.a((qyd0) value4, null, null, null, null, null, null, false, null, null, null, false, null, false, z2, null, null, 125829119))) {
                        z = z2;
                    }
                    break;
                }
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = d1e0.e0;
                p7m0 p7m0Var2 = d1e0Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, qyd0.a((qyd0) value, null, null, null, null, null, null, false, null, null, null, false, list, false, false, null, null, 134152191)));
                break;
            case 2:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = d1e0.e0;
                p7m0 p7m0Var3 = d1e0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, qyd0.a((qyd0) value2, null, null, null, null, bqrVar, null, false, null, null, null, false, null, false, false, null, null, 134217695)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = d1e0.e0;
                p7m0 p7m0Var4 = d1e0Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    qyd0Var = (qyd0) value3;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var4.m(value3, qyd0.a(qyd0Var, null, null, null, null, null, null, !Intrinsics.d(qyd0Var.m, arrayList), null, null, arrayList, false, null, false, false, null, null, 134213375)));
                break;
        }
        return Unit.f46060a;
    }
}
