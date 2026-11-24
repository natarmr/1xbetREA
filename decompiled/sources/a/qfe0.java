package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qfe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wfe0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qfe0(wfe0 wfe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wfe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wfe0 wfe0Var = this.k;
        switch (b) {
            case 0:
                qfe0 qfe0Var = new qfe0(wfe0Var, yjeVar, (byte) 0);
                qfe0Var.j = obj;
                return qfe0Var;
            case 1:
                qfe0 qfe0Var2 = new qfe0(wfe0Var, yjeVar, (byte) 1);
                qfe0Var2.j = obj;
                return qfe0Var2;
            case 2:
                qfe0 qfe0Var3 = new qfe0(wfe0Var, yjeVar, (byte) 2);
                qfe0Var3.j = obj;
                return qfe0Var3;
            default:
                qfe0 qfe0Var4 = new qfe0(wfe0Var, yjeVar, (byte) 3);
                qfe0Var4.j = obj;
                return qfe0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qfe0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qfe0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qfe0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((qfe0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        wfe0 wfe0Var = this.k;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = wfe0.L;
                p7m0 p7m0Var = wfe0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, nfe0.a((nfe0) value, fhe.f9537a, false, null, null, 510)));
                wfe0Var.t.b(th, new k8e0((byte) 7));
                break;
            case 1:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (((nfe0) wfe0Var.D()).d != sw00Var.f32897a) {
                    p7m0 p7m0Var2 = wfe0Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, nfe0.a((nfe0) value2, null, sw00Var.f32897a, null, null, Response.SERVICE_UNAVAILABLE)));
                    if (sw00Var.f32897a) {
                        wfe0Var.o.b();
                        wfe0Var.P();
                    }
                    wfe0Var.O();
                }
                break;
            case 2:
                sw00 sw00Var2 = (sw00) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var2.f32897a && !sw00Var2.b) {
                    wfe0 wfe0Var2 = this.k;
                    i3t0.A(wfe0Var2, wfe0Var2.w, eb0.f7494a, null, null, 6);
                }
                break;
            default:
                List list = (List) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    axq.t(((mlr) it.next()).f22006a, arrayList);
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                String str2 = wfe0.L;
                p7m0 p7m0Var3 = wfe0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, nfe0.a((nfe0) value3, null, false, setP0, null, 383)));
                break;
        }
        return Unit.f46060a;
    }
}
