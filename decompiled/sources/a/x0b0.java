package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x0b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f1b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0b0(f1b0 f1b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f1b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f1b0 f1b0Var = this.k;
        switch (b) {
            case 0:
                x0b0 x0b0Var = new x0b0(f1b0Var, yjeVar, (byte) 0);
                x0b0Var.j = obj;
                return x0b0Var;
            case 1:
                x0b0 x0b0Var2 = new x0b0(f1b0Var, yjeVar, (byte) 1);
                x0b0Var2.j = obj;
                return x0b0Var2;
            case 2:
                x0b0 x0b0Var3 = new x0b0(f1b0Var, yjeVar, (byte) 2);
                x0b0Var3.j = obj;
                return x0b0Var3;
            case 3:
                x0b0 x0b0Var4 = new x0b0(f1b0Var, yjeVar, (byte) 3);
                x0b0Var4.j = obj;
                return x0b0Var4;
            case 4:
                x0b0 x0b0Var5 = new x0b0(f1b0Var, yjeVar, (byte) 4);
                x0b0Var5.j = obj;
                return x0b0Var5;
            default:
                x0b0 x0b0Var6 = new x0b0(f1b0Var, yjeVar, (byte) 5);
                x0b0Var6.j = obj;
                return x0b0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((x0b0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((x0b0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((x0b0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((x0b0) create((x1j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((x0b0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((x0b0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        f1b0 f1b0Var = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = f1b0.w0;
                p7m0 p7m0Var = f1b0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, h8x.y((d0b0) value, false, false, list)));
                break;
            case 1:
                Throwable th = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jfa0 jfa0Var = new jfa0((byte) 20);
                int i2 = f1b0.w0;
                f1b0Var.H(jfa0Var);
                f1b0Var.Q(th);
                break;
            case 2:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!sw00Var.b && sw00Var.f32897a) {
                    int i3 = f1b0.w0;
                    f1b0 f1b0Var2 = this.k;
                    p7m0 p7m0Var2 = f1b0Var2.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, d0b0.a((d0b0) value2, null, null, null, null, null, false, false, false, false, null, true, 2047)));
                    bby bbyVar = f1b0Var2.o0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = f1b0Var2.t0;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    f1b0Var2.t0 = sac.f0(jiu0.a(f1b0Var2), 10L, TimeUnit.SECONDS, f1b0Var2.x.b, new wma0(1, f1b0Var2, f1b0.class, "handleBasicThrowable", "handleBasicThrowable(Ljava/lang/Throwable;)V", 0, (byte) 6), new w0b0(f1b0Var2, null, (byte) 1), 32);
                }
                break;
            case 3:
                x1j x1jVar = (x1j) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                v1j v1jVar = x1jVar instanceof v1j ? (v1j) x1jVar : null;
                if (v1jVar != null && v1jVar.f36633a) {
                    int i4 = f1b0.w0;
                    f1b0Var.G(sza0.f33063a);
                    b4j b4jVar = f1b0Var.w;
                    usd usdVar = a4j.c;
                    b4jVar.k("popular_new_aggregator");
                    f1b0Var.E.k("popular_new_aggregator");
                }
                break;
            case 4:
                List list2 = (List) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    axq.t(((mlr) it.next()).f22006a, arrayList);
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                int i5 = f1b0.w0;
                p7m0 p7m0Var3 = f1b0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, d0b0.a((d0b0) value3, null, null, null, null, setP0, false, false, false, false, null, false, 4079)));
                break;
            default:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                int i6 = f1b0.w0;
                p7m0 p7m0Var4 = f1b0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var4.m(value4, d0b0.a((d0b0) value4, null, null, null, null, null, false, false, false, s9m0.l(uaq0Var), null, false, 3583)));
                break;
        }
        return Unit.f46060a;
    }
}
