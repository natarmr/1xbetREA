package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class hy8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ty8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy8(ty8 ty8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ty8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ty8 ty8Var = this.k;
        switch (b) {
            case 0:
                hy8 hy8Var = new hy8(ty8Var, yjeVar, (byte) 0);
                hy8Var.j = obj;
                return hy8Var;
            case 1:
                hy8 hy8Var2 = new hy8(ty8Var, yjeVar, (byte) 1);
                hy8Var2.j = obj;
                return hy8Var2;
            case 2:
                hy8 hy8Var3 = new hy8(ty8Var, yjeVar, (byte) 2);
                hy8Var3.j = obj;
                return hy8Var3;
            case 3:
                hy8 hy8Var4 = new hy8(ty8Var, yjeVar, (byte) 3);
                hy8Var4.j = obj;
                return hy8Var4;
            default:
                hy8 hy8Var5 = new hy8(ty8Var, yjeVar, (byte) 4);
                hy8Var5.j = obj;
                return hy8Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hy8) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hy8) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hy8) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hy8) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hy8) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        yx8 yx8Var;
        Object value2;
        byte b = this.i;
        yje yjeVar = null;
        byte b2 = 0;
        ty8 ty8Var = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0(list, (byte) 9);
                String str = ty8.X;
                ty8Var.H(bo0Var);
                break;
            case 1:
                Throwable th = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                String str2 = ty8.X;
                p7m0 p7m0Var = ty8Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    yx8Var = (yx8) value;
                } while (!p7m0Var.m(value, yx8.a(yx8Var, wx8.a(yx8Var.f43408a, true, false, null, 12), vx8.a(yx8Var.b, false, 6), null, false, null, null, null, null, false, 1048572)));
                ty8Var.q.b(th, new im8((byte) 2));
                break;
            case 2:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.f32897a) {
                    ty8Var.F.b();
                    sac.T(new fnq(ty8Var.E.o(), new hy8(ty8Var, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(ty8Var), ty8Var.v.b), iy8.h);
                }
                String str3 = ty8.X;
                p7m0 p7m0Var2 = ty8Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, yx8.a((yx8) value2, null, null, null, sw00Var.f32897a, null, null, null, null, false, 1048567)));
                break;
            case 3:
                sw00 sw00Var2 = (sw00) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var2.f32897a && !sw00Var2.b) {
                    ty8 ty8Var2 = this.k;
                    i3t0.A(ty8Var2, ty8Var2.y, eb0.f7494a, null, null, 6);
                    ty8Var2.O();
                }
                break;
            default:
                vzg0 vzg0Var = ty8Var.o;
                String str4 = (String) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                boolean z = StringsKt.u0(str4).toString().length() >= 3;
                if (z) {
                    u58 u58Var = ty8Var.w;
                    u58Var.getClass();
                    i8i.D("search", str4, u58Var.f35083a, "provbrand_prov_search");
                    au0 au0Var = ty8Var.z;
                    au0Var.getClass();
                    b1j.v(str4, au0Var.f1455a, 10960L);
                }
                String str5 = z ? str4 : "";
                boolean zEquals = str5.equals(((yx8) ty8Var.D()).c.d);
                ty8Var.H(new sw(str4, str5, !zEquals));
                vzg0Var.e("SEARCH_QUERY_KEY", ((yx8) ty8Var.D()).c.c);
                vzg0Var.e("FILTER_QUERY_KEY", ((yx8) ty8Var.D()).c.d);
                vzg0Var.e("SELECTED_PARTITION_KEY", new Long(((yx8) ty8Var.D()).b.c));
                if (!zEquals) {
                    ty8Var.O();
                }
                break;
        }
        return Unit.f46060a;
    }
}
