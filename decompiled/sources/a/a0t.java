package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ c0t k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0t(c0t c0tVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = c0tVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c0t c0tVar = this.k;
        switch (b) {
            case 0:
                a0t a0tVar = new a0t(c0tVar, yjeVar, (byte) 0);
                a0tVar.j = obj;
                return a0tVar;
            case 1:
                a0t a0tVar2 = new a0t(c0tVar, yjeVar, (byte) 1);
                a0tVar2.j = obj;
                return a0tVar2;
            case 2:
                a0t a0tVar3 = new a0t(c0tVar, yjeVar, (byte) 2);
                a0tVar3.j = obj;
                return a0tVar3;
            default:
                a0t a0tVar4 = new a0t(c0tVar, yjeVar, (byte) 3);
                a0tVar4.j = obj;
                return a0tVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a0t) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a0t) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a0t) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a0t) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        wrs wrsVar;
        ArrayList arrayList;
        byte b = this.i;
        c0t c0tVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                c0tVar.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = c0tVar.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    boolean z2 = z;
                    if (!p7m0Var.m(value4, wrs.a((wrs) value4, null, null, null, null, null, null, null, null, null, null, null, false, false, z2, null, false, 0L, 0L, 66977791))) {
                        z = z2;
                    }
                    break;
                }
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = c0t.b0;
                p7m0 p7m0Var2 = c0tVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, wrs.a((wrs) value, null, null, null, null, null, null, null, null, null, list, null, false, false, false, null, false, 0L, 0L, 67106815)));
                break;
            case 2:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = c0t.b0;
                p7m0 p7m0Var3 = c0tVar.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, wrs.a((wrs) value2, null, null, null, bqrVar, null, null, null, null, null, null, null, false, false, false, null, false, 0L, 0L, 67108847)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = c0t.b0;
                p7m0 p7m0Var4 = c0tVar.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    wrsVar = (wrs) value3;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var4.m(value3, wrs.a(wrsVar, null, null, null, null, null, null, null, null, null, null, null, false, false, false, arrayList, !Intrinsics.d(wrsVar.u, arrayList), 0L, 0L, 61865983)));
                break;
        }
        return Unit.f46060a;
    }
}
