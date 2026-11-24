package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class abl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ebl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abl(ebl eblVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eblVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ebl eblVar = this.k;
        switch (b) {
            case 0:
                abl ablVar = new abl(eblVar, yjeVar, (byte) 0);
                ablVar.j = obj;
                return ablVar;
            case 1:
                abl ablVar2 = new abl(eblVar, yjeVar, (byte) 1);
                ablVar2.j = obj;
                return ablVar2;
            case 2:
                abl ablVar3 = new abl(eblVar, yjeVar, (byte) 2);
                ablVar3.j = obj;
                return ablVar3;
            default:
                abl ablVar4 = new abl(eblVar, yjeVar, (byte) 3);
                ablVar4.j = obj;
                return ablVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((abl) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((abl) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((abl) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((abl) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        f9l f9lVar;
        ArrayList arrayList;
        byte b = this.i;
        ebl eblVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                eblVar.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = eblVar.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    boolean z2 = z;
                    if (!p7m0Var.m(value4, f9l.a((f9l) value4, null, null, null, null, null, null, false, null, null, false, null, false, z2, null, 0, 0, null, 66060287))) {
                        z = z2;
                    }
                    break;
                }
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = ebl.g0;
                p7m0 p7m0Var2 = eblVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, f9l.a((f9l) value, null, null, null, null, null, null, false, null, null, false, list, false, false, null, 0, 0, null, 67076095)));
                break;
            case 2:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = ebl.g0;
                p7m0 p7m0Var3 = eblVar.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, f9l.a((f9l) value2, null, null, null, null, bqrVar, null, false, null, null, false, null, false, false, null, 0, 0, null, 67108831)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = ebl.g0;
                p7m0 p7m0Var4 = eblVar.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    f9lVar = (f9l) value3;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var4.m(value3, f9l.a(f9lVar, null, null, null, null, null, null, !Intrinsics.d(f9lVar.l, arrayList), null, arrayList, false, null, false, false, null, 0, 0, null, 67106559)));
                break;
        }
        return Unit.f46060a;
    }
}
