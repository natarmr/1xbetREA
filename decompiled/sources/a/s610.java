package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s610 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ u610 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s610(u610 u610Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = u610Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u610 u610Var = this.k;
        switch (b) {
            case 0:
                s610 s610Var = new s610(u610Var, yjeVar, (byte) 0);
                s610Var.j = obj;
                return s610Var;
            case 1:
                s610 s610Var2 = new s610(u610Var, yjeVar, (byte) 1);
                s610Var2.j = obj;
                return s610Var2;
            case 2:
                s610 s610Var3 = new s610(u610Var, yjeVar, (byte) 2);
                s610Var3.j = obj;
                return s610Var3;
            default:
                s610 s610Var4 = new s610(u610Var, yjeVar, (byte) 3);
                s610Var4.j = obj;
                return s610Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s610) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s610) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((s610) create((bqr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((s610) create((kam0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        m310 m310Var;
        ArrayList arrayList;
        byte b = this.i;
        u610 u610Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((xsr) obj2) instanceof usr;
                u610Var.o.e("auto_start_stream_enabled_key", Boolean.valueOf(z));
                p7m0 p7m0Var = u610Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    boolean z2 = z;
                    if (!p7m0Var.m(value4, m310.a((m310) value4, null, null, null, null, null, null, false, null, null, null, false, null, false, z2, null, null, 31457279))) {
                        z = z2;
                    }
                    break;
                }
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = u610.e0;
                p7m0 p7m0Var2 = u610Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, m310.a((m310) value, null, null, null, null, null, null, false, null, null, null, false, list, false, false, null, null, 33488895)));
                break;
            case 2:
                bqr bqrVar = (bqr) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = u610.e0;
                p7m0 p7m0Var3 = u610Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, m310.a((m310) value2, null, null, null, null, bqrVar, null, false, null, null, null, false, null, false, false, null, null, 33554399)));
                break;
            default:
                kam0 kam0Var = (kam0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = u610.e0;
                p7m0 p7m0Var4 = u610Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    m310Var = (m310) value3;
                    arrayList = kam0Var.f17972a;
                } while (!p7m0Var4.m(value3, m310.a(m310Var, null, null, null, null, null, null, !Intrinsics.d(m310Var.m, arrayList), null, null, arrayList, false, null, false, false, null, null, 33550079)));
                break;
        }
        return Unit.f46060a;
    }
}
