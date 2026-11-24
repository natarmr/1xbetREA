package a;

import android.javax.sip.message.Response;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h29 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s29 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h29(s29 s29Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s29Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s29 s29Var = this.k;
        switch (b) {
            case 0:
                h29 h29Var = new h29(s29Var, yjeVar, (byte) 0);
                h29Var.j = obj;
                return h29Var;
            case 1:
                h29 h29Var2 = new h29(s29Var, yjeVar, (byte) 1);
                h29Var2.j = obj;
                return h29Var2;
            case 2:
                h29 h29Var3 = new h29(s29Var, yjeVar, (byte) 2);
                h29Var3.j = obj;
                return h29Var3;
            case 3:
                h29 h29Var4 = new h29(s29Var, yjeVar, (byte) 3);
                h29Var4.j = obj;
                return h29Var4;
            default:
                h29 h29Var5 = new h29(s29Var, yjeVar, (byte) 4);
                h29Var5.j = obj;
                return h29Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((h29) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((h29) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((h29) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((h29) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h29) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        x19 x19Var;
        List list;
        th1 th1Var;
        Object value4;
        Object value5;
        byte b = this.i;
        s29 s29Var = this.k;
        switch (b) {
            case 0:
                List list2 = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = s29.Y;
                p7m0 p7m0Var = s29Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ay3.M((x19) value, false, false, list2, 16)));
                break;
            case 1:
                Throwable th = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                String str2 = s29.Y;
                p7m0 p7m0Var2 = s29Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ay3.M((x19) value2, false, true, null, 24)));
                s29Var.r.b(th, new im8((byte) 5));
                break;
            case 2:
                Throwable th2 = (Throwable) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                String str3 = s29.Y;
                p7m0 p7m0Var3 = s29Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    x19Var = (x19) value3;
                    v19 v19Var = x19Var.c;
                    list = v19Var.d;
                    th1Var = v19Var.e;
                    list.getClass();
                    th1Var.getClass();
                } while (!p7m0Var3.m(value3, x19.a(x19Var, null, null, new v19(false, true, true, list, th1Var), false, null, null, 507)));
                s29Var.r.b(th2, new im8((byte) 6));
                break;
            case 3:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                String str4 = s29.Y;
                p7m0 p7m0Var4 = s29Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, x19.a((x19) value4, null, null, null, sw00Var.f32897a, null, null, Response.SERVICE_UNAVAILABLE)));
                if (sw00Var.f32897a && !sw00Var.b) {
                    s29Var.P(true, true);
                }
                break;
            default:
                vzg0 vzg0Var = s29Var.o;
                String str5 = (String) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                String str6 = StringsKt.u0(str5).toString().length() >= 3 ? str5 : "";
                boolean zEquals = str6.equals(((x19) s29Var.D()).f40110a.c);
                p7m0 p7m0Var5 = s29Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, ay3.N((x19) value5, false, str5, str6, 1)));
                if (!zEquals) {
                    s29Var.t.h(wgh0.AGGREGATOR_BRANDS, str5, new Integer(3));
                    s29Var.u.D(new Integer(3), "providers_page", str5);
                    s29Var.O();
                }
                vzg0Var.e("SEARCH_QUERY_KEY", str5);
                vzg0Var.e("FILTER_QUERY_KEY", str6);
                break;
        }
        return Unit.f46060a;
    }
}
