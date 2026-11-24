package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kl40 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nl40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl40(nl40 nl40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nl40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nl40 nl40Var = this.k;
        switch (b) {
            case 0:
                kl40 kl40Var = new kl40(nl40Var, yjeVar, (byte) 0);
                kl40Var.j = obj;
                return kl40Var;
            case 1:
                kl40 kl40Var2 = new kl40(nl40Var, yjeVar, (byte) 1);
                kl40Var2.j = obj;
                return kl40Var2;
            case 2:
                kl40 kl40Var3 = new kl40(nl40Var, yjeVar, (byte) 2);
                kl40Var3.j = obj;
                return kl40Var3;
            default:
                kl40 kl40Var4 = new kl40(nl40Var, yjeVar, (byte) 3);
                kl40Var4.j = obj;
                return kl40Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kl40) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kl40) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kl40) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kl40) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        dl40 dl40Var;
        ArrayList arrayList;
        byte b = this.i;
        nl40 nl40Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                nl40Var.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = nl40Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, dl40.a((dl40) value, null, null, null, null, null, false, null, false, z, null, null, null, false, null, 0L, 16744447)));
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = nl40.a0;
                p7m0 p7m0Var2 = nl40Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, dl40.a((dl40) value2, null, null, null, null, null, false, list, false, false, null, null, null, false, null, 0L, 16775167)));
                break;
            case 2:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = nl40.a0;
                p7m0 p7m0Var3 = nl40Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, dl40.a((dl40) value3, null, null, null, null, bqrVar, false, null, false, false, null, null, null, false, null, 0L, 16777183)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = nl40.a0;
                p7m0 p7m0Var4 = nl40Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    dl40Var = (dl40) value4;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var4.m(value4, dl40.a(dl40Var, null, null, null, null, null, false, null, false, false, null, null, null, !Intrinsics.d(dl40Var.v, arrayList), arrayList, 0L, 13631487)));
                break;
        }
        return Unit.f46060a;
    }
}
